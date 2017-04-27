package section06.ShellSort;

public class Sort {
	public void intervalSort(int a[], int begin, int end, int interval) {
		int i, j, item;
		
		for(i=begin+interval; i<=end; i=i+interval) {
			item = a[i];
			
			for(j=i-interval; j>=begin && item<a[j]; j-=interval) {
				a[j+interval] = a[j];
			}
			a[j+interval] = item;
		}
	}
	
	public void shellSort(int a[], int size) {
		int i, j, interval, t=0;
		interval = size/2;
		
		while(interval >= 1) {
			for(i=0; i<interval; i++) {
				intervalSort(a, i, size-1, interval);
			}
			
			System.out.print("\n셀정렬 " + ++t + "단계 : interval = " + interval + " >> ");
			
			for(j=0; j<size; j++) {
				System.out.print(a[j] + " ");
			}
			System.out.println();
			interval /= 2;
		}
	}
}
