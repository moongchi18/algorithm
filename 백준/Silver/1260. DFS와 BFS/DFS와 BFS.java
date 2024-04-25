import java.io.BufferedReader;
import java.util.*;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static ArrayList<Integer>[] list;
	public static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		int edgeCount = Integer.parseInt(st.nextToken());
		int startPoint = Integer.parseInt(st.nextToken());

		list = new ArrayList[num + 1];
		visited = new boolean[num + 1];

		for (int i = 1; i < num + 1; i++) {
			list[i] = new ArrayList<>();
		}
		
		for (int i = 0; i < edgeCount; i++) {
			st = new StringTokenizer(br.readLine());

			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
	
			list[start].add(end);
			list[end].add(start);
		}
		for (int i = 1; i < list.length; i++) {
			if(list[i] != null) {
				list[i].sort(Comparator.naturalOrder());
			}
		}
		
			DFS(startPoint);
		System.out.println("");
//		BFS
		visited = new boolean[num + 1];
		Queue<Integer> que = new LinkedList<>();
		que.add(startPoint);
		visited[startPoint] = true;
		while(!que.isEmpty()) {
			int n = que.poll();
			for (int k : list[n]) {
				if(!visited[k]) {
					visited[k] = true;
					que.add(k);
				}
			}
			System.out.print(n + " ");
		}
		
	}

	private static void DFS(int i) {
		if(visited[i]) {
			return;
		}
		System.out.print(i + " ");
		visited[i] = true;
		for (int k : list[i]) {
			DFS(k);
		}
	}
}
