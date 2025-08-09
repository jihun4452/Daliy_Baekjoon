import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());

		String[] names = br.readLine().trim().split("\\s+");
		Map<String, Integer> cnt = new HashMap<>();
		for (String name : names) cnt.put(name, 0);

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				String liked = st.nextToken();
				cnt.put(liked, cnt.get(liked) + 1);
			}
		}

		List<String> list = new ArrayList<>(cnt.keySet());
		list.sort((a, b) -> {
			int c = Integer.compare(cnt.get(b), cnt.get(a)); 
			return c != 0 ? c : a.compareTo(b);
		});

		StringBuilder sb = new StringBuilder();
		for (String name : list) {
			int c = cnt.get(name);
			sb.append(name).append(' ').append(c).append('\n');
		}
		System.out.print(sb.toString());
	}
}
