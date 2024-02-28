import java.util.*;

class Solution {
   public int solution(int[] citations) {
       int answer = 0;
       int length = citations.length;
       citations = mergeSort(citations, 0, length - 1);
       
       int index = citations.length - 1;
       while(answer != length) {
       	if(citations[index] >= length) {
       		answer++;
       		index--;
       		continue;
       	} else {
       		answer = 0;
       		length--;
       		index = citations.length - 1;
       	}
       }
       
       return answer;
   }

	private int[] mergeSort(int[] citations, int i, int j) {
		if(i < j) {
			int mid = (i + j) / 2;
			
			mergeSort(citations, i, mid);
			mergeSort(citations, mid + 1, j);
			merge(citations, i, mid, j);
		}
		return citations;
	}

	private void merge(int[] citations, int start, int mid, int end) {
		int leftSize = mid - start + 1;
		int rightSize = end - mid;
		
		int[] leftArray = new int[leftSize];
		int[] rightArray = new int[rightSize];
		
		for (int i = 0; i < leftArray.length; i++) {
			leftArray[i] = citations[start + i];
		}
		for (int i = 0; i < rightArray.length; i++) {
			rightArray[i] = citations[mid + 1 + i];
		}
		
		int s = 0, e = 0, k = start;
		while(s < leftSize
				&& e < rightSize) {
			if(leftArray[s] <= rightArray[e]) {
				citations[k] = leftArray[s];
				s++;
			} else {
				citations[k] = rightArray[e];
				e++;
			}
			k++;
		}
		
		while(s < leftSize) {
			citations[k] = leftArray[s];
			s++;
			k++;
		}
		while(e < rightSize) {
			citations[k] = rightArray[e];
			e++;
			k++;
		}
	}
}