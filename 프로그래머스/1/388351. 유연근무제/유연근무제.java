class Solution {
    private int timeToMinute(int time) {
        int hour = time / 100;
        int minute = time % 100;
        return hour * 60 + minute;
    }

    private int minuteToTime(int minute, int addMinute) {
        int totalMinute = minute + addMinute;
        int hour = totalMinute / 60;
        int min = totalMinute % 60;
        return hour * 100 + min;
    }

    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int n = schedules.length;
        int awardCount = 0;

        int startIndex = startday - 1;

        for (int i = 0; i < n; i++) {
            int desiredTime = schedules[i];
            int minuteDesired = timeToMinute(desiredTime);
            
            int acceptableTime = minuteToTime(minuteDesired, 10); 
            
            boolean isLate = false;

            for (int j = 0; j < 7; j++) {
                int currentDayOfWeek = (startIndex + j) % 7; 
                // 평일 월=0, 화=1, 수=2, 목=3, 금=4
                if (currentDayOfWeek >= 0 && currentDayOfWeek <= 4) {
                    int actualTime = timelogs[i][j]; 

                    if (actualTime > acceptableTime) {
                        isLate = true;
                        break;
                    }
                }
            }

            if (!isLate) {
                awardCount++;
            }
        }

        return awardCount;
    }
}