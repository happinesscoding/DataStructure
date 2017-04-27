package section05.InsertSort;

public class Sort {
	public void insertionSort(int a[], int size) {
		int i, j, t, temp;
		
		for(i=1; i<size; i++) {
			temp = a[i];
			j = i;
			
			while((j>0) && (a[j-1]>temp)) {
				a[j] = a[j-1];
				j--;
			}
			
			a[j] = temp;
			System.out.print("\n삽입정렬 " + i + "단계 : ");
			for(t=0; t<size; t++) {
				System.out.print(a[t] + " ");
			}
		}
		System.out.println();
	}
}
