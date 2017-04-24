package section06.heap;

/*
 * 순차 자료구조를 이용한 최대 힙 프로그램
 */

public class Ex9_3 {
	public static void main(String[] args) {
		int n, item;
		Heap h = new Heap();
		
		h.insertHeap(13);
		h.insertHeap(8);
		h.insertHeap(10);
		h.insertHeap(15);
		h.insertHeap(20);
		h.insertHeap(19);
		
		h.printHeap();
		
		n = h.getHeapSize();
		
		for(int i=1; i<=n; i++) {
			item = h.deleteHeap();
			System.out.print("\ndeleted Item : " + item);
		}
	}
}
