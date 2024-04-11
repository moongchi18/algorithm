import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
    	int sum = 0;
        int count = 0;
        
        mergeSort(d, 0, d.length - 1);
        
        for (int i = 0; i < d.length; i++) {
			if(sum + d[i] <= budget) {
				sum += d[i];
				count++;
			} else {
				break;
			}
		}
        return count;
    }
	private void mergeSort(int[] d, int left, int right) {
		if(left < right) {
			int mid = (left + right) / 2;
			
			mergeSort(d, left, mid);
			mergeSort(d, mid + 1, right);
			
			merge(d, mid, left, right);
		}
	}
	private void merge(int[] d, int mid, int left, int right) {
		int leftSize = mid - left + 1;
		int rightSize = right - mid;
				
		int[] leftArray = new int[leftSize];
		int[] rightArray = new int[rightSize];
		
		for (int k = 0; k < leftSize; k++) {
			leftArray[k] = d[left + k];
		}
		for (int k =0; k < rightSize; k++) {
			rightArray[k] = d[mid + k + 1];
		}
		
		int l = 0, r = 0, index = left;
		while(l < leftSize
				&& r < rightSize) {
			if(leftArray[l] <= rightArray[r]) {
				d[index] = leftArray[l];
				l++;
				index++;
			} else {
				d[index] = rightArray[r];
				r++;
				index++;
			}
		}
		
		while(l < leftSize) {
			d[index] = leftArray[l];
			l++;
			index++;
		}
		while(r < rightSize) {
			d[index] = rightArray[r];
			r++;
			index++;
		}
	}
}