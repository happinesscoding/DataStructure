package section02.graph;

public class AdjList {
	private GraphNode head[] = new GraphNode[10];
	private int totalV = 0;
	
	public void insertVertex(int v) {
		totalV++;
	}
	
	public void insertEdge(int v1, int v2) {
		if(v1 >= totalV || v2 >= totalV) {
			System.out.println("그래프에 없는 정점입니다!!");
		} else {
			GraphNode gNode = new GraphNode();
			gNode.vertex = v2;
			gNode.link = head[v1];
			head[v1] = gNode;
		}
	}
	
	public void printAdjList() {
		GraphNode gNode = new GraphNode();
		
		for(int i=0; i<totalV; i++) {
			System.out.print("\n정점 " + (char)(i+65) + "의 인접리스트 ");
			gNode = head[i];
			
			while(gNode != null) {
				System.out.print("-> " + (char)(gNode.vertex+65));
				gNode = gNode.link;
			}
		}
	}
}
