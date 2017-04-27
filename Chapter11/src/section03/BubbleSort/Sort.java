package section03.BubbleSort;

public class Sort {
	public void bubbleSort(int a[]) {
		int i, j, temp, size;
		size = a.length;
		
		for(i=size-1; i>0; i--) {
			System.out.print("\n버블정렬 " + (size-i) + "단계 : ");
			
			for(j=0; j<i; j++) {
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
				
				System.out.print("\n\t");
				
				for(int k=0; k<size; k++) {
					System.out.print(a[k] + " ");
				}
			}
		}
	}
}
