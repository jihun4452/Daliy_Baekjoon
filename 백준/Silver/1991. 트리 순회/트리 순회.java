import java.io.*;
import java.util.*;

public class Main{
    static int[] L=new int[26], R=new int[26];
    static StringBuilder pre=new StringBuilder(), in=new StringBuilder(), post=new StringBuilder();
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        Arrays.fill(L,-1); Arrays.fill(R,-1);
        for(int i=0;i<N;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int v=st.nextToken().charAt(0)-'A';
            char l=st.nextToken().charAt(0), r=st.nextToken().charAt(0);
            if(l!='.') L[v]=l-'A';
            if(r!='.') R[v]=r-'A';
        }
        dfs(0);
        System.out.println(pre);
        System.out.println(in);
        System.out.println(post);
    }
    static void dfs(int v){
        if(v<0) return;
        pre.append((char)(v+'A'));
        dfs(L[v]);
        in.append((char)(v+'A'));
        dfs(R[v]);
        post.append((char)(v+'A'));
    }
}
