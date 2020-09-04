import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main1260_DFS¿ÍBFS {
	static int N, M, V;
	static int line[][];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		
		line = new int[N+1][N+1];
		
		for(int m=0;m<M;m++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			line[a][b] = 1;
			line[b][a] = 1;
		}
		boolean visited[] = new boolean[N+1];
		visited[V] = true;
		System.out.print(V+" ");
		dfs(V, visited);
		System.out.println();
		
		visited = new boolean[N+1];
		bfs(visited);

	}
	private static void bfs(boolean[] visited) {
		Queue<Integer> q = new LinkedList<>();
		q.add(V);
		visited[V] = true;
		while(!q.isEmpty()) {
			int node = q.poll();
			System.out.print(node+" ");
			for(int i=1;i<=N;i++) {
				if(line[node][i]==1 && !visited[i]) {
					q.add(i);
					visited[i] = true;
				}
			}
		}
		System.out.println();
		return;
		
	}
	private static void dfs(int node, boolean[] visited) {
		for(int i=0; i<=N; i++) {
			if(line[i][node]==1 && !visited[i]) {
				visited[i] = true;
				System.out.print(i+" ");
				dfs(i, visited);
			}
		}
		return;
	}

}
