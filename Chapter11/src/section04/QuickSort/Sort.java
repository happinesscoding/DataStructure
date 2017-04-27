package section04.QuickSort;

public class Sort {
	int i=0;
	
	public int partition(int a[], int begin, int end) {
		int pivot, temp, L, R, t;
		
		L = begin;
		R = end;
		pivot = (begin+end) / 2;
		System.out.print("\n[퀵정렬 " + (++i) + "단계 : pivot = " + (a[pivot]) + "]\n");
		
		while(L < R) {
			while((a[L] < a[pivot]) && (L<R)) {
				L++;
			}
			while((a[R] >= a[pivot]) && (L<R)) {
				R--;
			}
			
			if(L<R) {
				temp = a[L];
				a[L] = a[R];
				a[R] = temp;
				
				if(L==pivot)
					pivot = R;
			}
		}
		
		//
		temp = a[pivot];
		a[pivot] = a[R];
		a[R] = temp;
		for(t=0; t<a.length; t++) {
			System.out.print(a[t] + "  ");
		}
		System.out.println();
		return R;
	}
	
	public void quickSort(int a[], int begin, int end) {
		if(begin < end) {
			int p;
			p = partition(a, begin, end);
			quickSort(a, begin, p-1);
			quickSort(a, p+1, end);
		}
	}
}
