	/* Factorial */

	int factorial(int i) {
		// Base case: 
		// Problem that is small enough to solve right away.
		if(i == 0) {
			return 1;
		}
		// Recursive case:
		// Problem that is too big to be solved right away.
		else { // i > 0
			return i * factorial(i - 1);
		}
	}
	/* Fibonacci */

	public int fibonacci(int n) {
  		if(n == 0){
   		 	return 0;
  		}
 		 else if(n == 1 || n == 2){
    		 	return 1;
  		}
  		else{
    			return fibonacci(n-1) + fibonacci(n-2);
  	   	}
  
	}

	/* Palindrome */

	boolean isPalindrome(String word) { 
		if(word.length() == 0 || word.length() == 1) { 
			/* base case */
			return true;
		} 
		else { 
			/* recursive case */
			char firstChar = word.charAt(0);
			char lastChar = word.charAt(word.length() - 1); 
			String middle = word.substring(1, word.length() - 1);
			return
					firstChar == lastChar 
					/* See the API of java.lang.String.substring. */
					&& isPalindrome(middle);
		}
	}

	/* Reverse of a String */

	String reverseOf (String s) { 
		if(s.isEmpty()) { /* base case 1 */  
			return "";
		} 
		else if(s.length() == 1) { /* base case */ 
			return s;
		} 
		else { /* recursive case */
			String tail = s.substring(1, s.length()); 
			String reverseOfTail = reverseOf(tail);  
			char head = s.charAt(0);  
			return reverseOfTail + head;
		}
	}
	
	/* Occurences of a char in a String */

	int occurrencesOf(String s, char c) {
		if(s.isEmpty()) {
			/* Base Case */
			return 0;
		}
		else {
			/* Recursive Case */
			char head = s.charAt(0);
			String tail = s.substring(1, s.length());
			if(head == c) {
				return 1 + occurrencesOf(tail, c);
			}
			else {
				return 0 + occurrencesOf(tail, c);
			}
		}
	}

	/* Positive int */

	boolean allPositive(int[] a) { 
		return allPositiveHelper(a, 0, a.length - 1);
	}

	boolean allPositiveHelper(int[] a, int from, int to) { 
		if(from > to) { /* base case 1: empty range */
			return true;
		} 
		else if(from == to) { /* base case 2: range of one element */
			return true;
		}
		else { /* recursive case */
			return a[from] > 0 && allPositiveHelper(a, from + 1, to);
		}
	}

	/* Sort */

	boolean isSorted(int[] a) {
		return isSortedHelper(a, 0, a.length - 1);
	}

	boolean isSortedHelper(int[] a, int from, int to) {
		if(from > to) { /* base case 1: empty range */
			return true;
		} 
		else if(from == to) { /* base case 2: range of one element */
			return true;
		}
		else {
			return a[from] <= a[from + 1] 
					&& isSortedHelper(a, from + 1, to);
		}
	}

	/* Binary Search */

	boolean binarySearch(int[] sorted, int key) { 
		return binarySearchHelper(sorted, 0, sorted.length - 1, key);
	} 
	
	boolean binarySearchHelper(int[] sorted, int from, int to, int key) { 
		if(from > to) { /* base case 1: empty range */
			return false;
		} 
		else if(from == to) { /* base case 2: range of one element */
			return sorted[from] == key;
		} 
		else {
			int middle = (from + to) / 2;
			int middleValue = sorted[middle];
			
			if(key < middleValue) { 
				return binarySearchHelper(sorted, from, middle - 1, key);
			} 
			else if (key > middleValue) { 
				return binarySearchHelper(sorted, middle + 1, to, key);
			} 
			else  { 
				return true; 
			}
		}
	}

	/* Selection Sort */
	
	public static void selectionSort(int[] a) {
		if(a.length == 0 || a.length == 1) {
			/* already sorted, do nothing */
		}
		else {
			for(int i = 0; i < a.length; i ++) {
				/* recursively figure out the index of min value 
				 * from a[i] to a[a.length - 1] 
				 */
				int minIndex = getMinIndex(a, i, a.length - 1);
				/* swap a[i] and a[minIndex] */
				int temp = a[i];
				a[i] = a[minIndex];
				a[minIndex] = temp;
			}
		}
	}
	
	
