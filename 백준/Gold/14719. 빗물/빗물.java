import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	// static int dx[] = {1,-1,0,0};
	// static int dy[] = {0,0,1,-1};
	//
	// //처음 나온 수 3 0 1 4 라면 차례대로 [1][0], [2][0], [3][0] , 두번째 0 세번째 [1][0]
	// static boolean visit[][];

	public static void main(String[] args) throws IOException {
		/**
		 * 2차원 세계 블록, 비가오면고인다.
		 * 세로 H, 가로 W ,
		 * 1. 0 이상이고 H이하여야 한다. 이외이면 처리 X
		 * 2. 맨 왼쪽부터 차례대로 W개가 주어진다.
		 * 3. 빗물이 안고였을 경우 0 출력
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());

		int[] wallHeight = new int[W]; //가로의 크기만큼 값을 받아야함
		st = new StringTokenizer(br.readLine());
		for(int i= 0; i<W; i++){
			wallHeight[i] = Integer.parseInt(st.nextToken());
		} //3, 0, 1, 4
		/**
		 * 1. 0,0부터 H,W 까지 순회해야함
		 * 2. if문 조건,, 양옆에 하나라도 있는지 X
		 * 3. 밑에가 있고, 양옆이 있어야함, 그런데 두칸이 파여져있으면, 한번 더 건너뛰고,
		 * 최종적으로 가로가 막혀있는지 봐야함, 물로 채웠다면 true로 변경?
		 * 4. 왼쪽과 오른쪽의 높이를 구하는 방식,
		 */
		int[] leftWallMax = new int[W];
		leftWallMax[0] = wallHeight[0]; // 3
		for(int i = 1; i<W; i++){ //W는 4라고 가정함 1-3
			leftWallMax[i] = leftWallMax[i - 1];
			if (wallHeight[i] > leftWallMax[i]) {
				leftWallMax[i] = wallHeight[i];
			}// 전에 벽이 더 크면 그 해당것까지 가장 큰걸로 덮음, 아니면, 새로 갱신
		} // 3, 3, 3, 4

		int[] rightWallMax = new int[W];
		rightWallMax[W - 1] = wallHeight[W - 1];

		for (int i = W - 2; i >= 0; i--) {
			rightWallMax[i] = rightWallMax[i + 1];
			if (wallHeight[i] > rightWallMax[i]) {
				rightWallMax[i] = wallHeight[i];
			}
		}//위에 물과 같음 4 , 4 , 4 , 4

		int waterTotal = 0; // 물의 최종 3 0 1 4 기준 왼 3, 3, 3, 4  오 4,4,4,4
 		//더 작은 기준으로 다 찰 수 없다, 3 3 3 4 임 그럼 5

		for(int i = 0; i<W; i++){
			int water = Math.min(leftWallMax[i], rightWallMax[i]) - wallHeight[i];
			if(water>0){
				waterTotal +=water;
			}
		}
		System.out.println(waterTotal);
	}
}
