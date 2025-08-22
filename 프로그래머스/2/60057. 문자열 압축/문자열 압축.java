class Solution {
    public static int solution(String s) {
		int answer = s.length();

		for (int step = 1; step <= s.length() / 2; step++) {
			StringBuilder compressed = new StringBuilder();

			String prev = s.substring(0, step); 
			int count = 1;

			for (int i = step; i < s.length(); i += step) {
				String sub = s.substring(i, Math.min(i + step, s.length()));

				if (prev.equals(sub)) {
					count++;
				} else {
					if (count > 1)
						compressed.append(count);
					compressed.append(prev);
					prev = sub;
					count = 1;
				}
			}

			if (count > 1)
				compressed.append(count);
			compressed.append(prev);

			answer = Math.min(answer, compressed.length());
		}

		return answer;
	}
}