import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static class Truck {
        int weight;
        int enterTime;
        Truck(int weight, int enterTime) {
            this.weight = weight;
            this.enterTime = enterTime;
        }
    }

    public int solution(int bridge_length, int weight, int[] truck_weights) {

        Queue<Truck> bridge = new LinkedList<>();

        int time = 0;
        int idx = 0;
        int currentWeight = 0; 

        while (true) {
            time++;

            // 맨 앞 트럭이 다리를 다 건넜는지 확인하고 내린다
            // 다리 위에서 bridge_length초가 지나면 내려간 것
            if (!bridge.isEmpty()) {
                Truck first = bridge.peek();
                if (time - first.enterTime >= bridge_length) {
                    currentWeight -= first.weight;
                    bridge.poll();
                }
            }

            // 다음 트럭을 올릴 수 있으면 올린다
            if (idx < truck_weights.length) {
                int next = truck_weights[idx];
                if (currentWeight + next <= weight && bridge.size() < bridge_length) {
                    // 지금 시간에 다리에 오른다
                    bridge.add(new Truck(next, time));
                    currentWeight += next;
                    idx++;
                }
            }

            // 모든 트럭이 올라갔고, 다리 위에도 없으면 끝
            if (idx == truck_weights.length && bridge.isEmpty()) {
                break;
            }
        }

        return time;
    }
}
