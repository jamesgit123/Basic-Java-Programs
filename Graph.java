import java.util.Iterator;
import java.util.LinkedList;

public class Graph {

	private int V;  // number of vertices
	private LinkedList<Integer> adjacency[];
	static boolean[] visited;
	public void addEdge(int v, int w) {
		adjacency[v].add(w);
	}
	
	public Graph(int v) {
		V = v;
		visited = new boolean[V];
		adjacency = new LinkedList[v];
		for (int i = 0; i < V; i++) {
		adjacency[i] = new LinkedList();
		}
	}
	
	void DFS(int v,boolean visited[]) {
		
		visited[v] = true;
		
		System.out.print(v + " ");
		
		 Iterator<Integer> i = adjacency[v].listIterator();
		 while(i.hasNext()) {
			 int n = i.next();
			 if (!visited[n]) {
				 DFS(n,visited);
			 }
		 }
		
		
	}
	
	void BFS(int v) {
		boolean[] visited = new boolean[V];
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		visited[v] = true;
		queue.add(v);
		
		while (queue.size() != 0) {
			v = queue.poll();
			System.out.print(v + " ");
			
			Iterator<Integer> i = adjacency[v].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				if (!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}
	public static void main(String[] args) {
		Graph g = new Graph(5);
		 
		  g.addEdge(1, 0);
		  g.addEdge(0, 4);
		  g.addEdge(1, 2);
		  g.addEdge(2, 4);
		  g.addEdge(4, 3);
		  g.addEdge(3, 1);
        System.out.println("Following is Depth First Traversal "+
                "(starting from vertex 2)");
        
        g.DFS(2,visited);
        
        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        g.BFS(2);
	}

}
