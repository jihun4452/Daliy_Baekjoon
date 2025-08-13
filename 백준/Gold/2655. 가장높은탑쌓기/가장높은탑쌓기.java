import java.io.*;
import java.util.*;

class Brick implements Comparable<Brick> {
	int s, h, w, id;
	Brick(int s, int h, int w, int id) {
		this.s = s; this.h = h; this.w = w; this.id = id;
	}
	@Override
	public int compareTo(Brick o) {
		return Integer.compare(o.s, this.s);
	}
}

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());

		List<Brick> arr = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			arr.add(new Brick(s, h, w, i)); 
		}

		Collections.sort(arr);

		int[] dp = new int[n];
		int[] prev = new int[n];
		Arrays.fill(prev, -1);

		int best = 0, bestIdx = 0;

		for (int i = 0; i < n; i++) {
			dp[i] = arr.get(i).h; 
			for (int j = 0; j < i; j++) {
				if (arr.get(j).w > arr.get(i).w) {
					if (dp[j] + arr.get(i).h > dp[i]) {
						dp[i] = dp[j] + arr.get(i).h;
						prev[i] = j;
					}
				}
			}
			if (dp[i] > best) {
				best = dp[i];
				bestIdx = i;
			}
		}

		List<Integer> order = new ArrayList<>();
		for (int cur = bestIdx; cur != -1; cur = prev[cur]) {
			order.add(arr.get(cur).id);
		}

		StringBuilder sb = new StringBuilder();
		sb.append(order.size()).append('\n');
		for (int id : order) sb.append(id).append('\n');
		System.out.print(sb);
	}
}
