package interviewQuestion;

public class TwoNumbersInArray {
	private int [] arrA;
	private int number;
	
	public TwoNumbersInArray(int [] arrA,int number){
		this.arrA = arrA;		
		this.number = number;
	}
	
	public void usingBinarySearch(){
		//1. First sort the array
		MergeSort m = new MergeSort(arrA);
		int [] arrSorted = m.mergeSorting();
		//2. now do the linear scan to the from the left array , say starting index i=0
		//3. Calculate Rem_Sum = number - a[i]
		//4. if Rem_Sum<0, move to the next element
		//5. if Rem_Sum>0, Perform Binary Search on the remaining elements on the right side.
	}
	public Boolean usingBothEnds(){
		//1. First sort the array
		MergeSort m = new MergeSort(arrA);
		int [] arrSorted = m.mergeSorting();
		//2. Start from the both ends of the array
		//3. add first (say 'a') and last element(say 'b') of the array say S
		//4. if S > number , S = S-(last_element) + (element before that)
		//5. if S < number , S = S - (first element) + (next element)
		//6. if S=number, return true
		//7. if 
		//7. Repeat step 
		
		int i =0;
		int j = arrSorted.length-1;
		int Sum = 0;
		while (i!=j){
			Sum = arrSorted[i]+ arrSorted[j];
			if(Sum==number)return true;			
			else if (Sum<number)i++;
			else if (Sum>number)j--;		
		}
		return false;
		
	}
	
	public static void main(String[] args){
		int a [] = { 1,2,3,4,5,16,17,18,19,249};
		int number = 250;
		TwoNumbersInArray tn = new TwoNumbersInArray(a, number);
		System.out.println("Sum of two numbers in array A is "+ number + " ??? :" + tn.usingBothEnds());
	}

}