package graphbfs;

//Time: O(V+E)
//Space:O(V)  when a linkedlist biggest, the graph is like a sun. 
// each node is connected to a same node
import java.util.List;

//Two main problems
//1.we have to consider the single node
//2.endless loop. when there are circles like 1¡ú2 2¡ú1
   //Solution: add the colored function.give each node a mark that has visited
public class Solution {
	public void bfs(List<GraphNode> graph) {
		for (GraphNode node : graph) {
			if (!node.visited) {
				Queue<GraphNode> q = new LinkedList<>();
				graph.get(0).visited = true;// before get(0) we note the 0 as
											// visited
				q.offer(graph.get(0));
				while (!q.isEmpty()) {                 // O(v) traverse each node
					GraphNode cur = q.poll();
					System.out.println(cur.value);
					for (GraphNode x : cur.nei) {       //O(E) traverse a node's neibors, = every pair
						// before offer, we should know it is not visited
						if (!x.visited) {
							// before offer, it is marked as visited;
							x.visited = true;
							q.offer(x);
						}

					}
				}

			}
		}
		
	}

}

class GraphNode{
	public int value;
	public List<GraphNode> nei = new ArrayList<>();
	public boolean visited = false; // this is a mark
	public GraphNode(int v){
		value = v;
	}
}