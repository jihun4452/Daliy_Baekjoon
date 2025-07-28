import java.io.*;

class Node{
	int data;
	Node lt, rt;
	public Node(int val){
		data= val;
		lt= rt= null;
	}
}
public class Main {
	Node root;
	public void DFS(Node root){
		if(root == null) return;
		else{
			DFS(root.lt);
			DFS(root.rt);
			System.out.println(root.data);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		Main tree = new Main();

		if ((line = br.readLine()) != null && !line.isEmpty()) {
			tree.root = new Node(Integer.parseInt(line));
		}
		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int val = Integer.parseInt(line);
			Node cur = tree.root;
			while (true) {
				if (val < cur.data) {
					if (cur.lt == null) {
						cur.lt = new Node(val);
						break;
					}
					cur = cur.lt;
				} else {
					if (cur.rt == null) {
						cur.rt = new Node(val);
						break;
					}
					cur = cur.rt;
				}
			}
		}

		tree.DFS(tree.root);
	}
}
