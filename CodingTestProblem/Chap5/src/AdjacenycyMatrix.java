
public class AdjacenycyMatrix {
	public static final int INF = 9999;
	public static int[][] graph = {
			{0,7,5},
			{7,0,INF},
			{5,INF,0}
	};
	
	public static void main(String[] args) {
		// 그래프를 표현하기 위한 인접행렬 방식
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(graph[i][j] + " ");
			}
			System.out.println();
		}
	}

}
