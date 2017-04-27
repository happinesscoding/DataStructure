package section02.SequentialSearch;

public class Search {
	public void sequentialSearch1(int a[], int size, int key) {
		int i=0;
		System.out.print("\n" + key + "를 순차검색하여라! ->> ");
		
		while(i<size && (a[i]!=key)) {
			i++;
		}
		
		if(i<size) {
			System.out.print(i+1 + "번째에 검색 성공! \n");
		} else {
			System.out.print(i+1 + "번째에 검색 실패!");
		}
	}
	
	public void sequentialSearch2(int a[], int size, int key) {
		int i=0;
		System.out.print("\n" + key + "를 순차검색하여라! ->> ");
		
		while(a[i] < key) {
			i++;
		}
		
		if(a[i] == key) {
			System.out.print(i+1 + "번째에 검색 성공! \n");
		} else {
			System.out.print(i+1 + "번째에 검색 실패!");
		}
	}
}
