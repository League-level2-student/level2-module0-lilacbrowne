package arrays;

import java.util.Random;


public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] candy = new String [5]; 	
		//2. print the third element in the array
		System.out.println(candy[3]);
		//3. set the third element to a different value
		candy[3] = "Tootsie Rolls"; 
		//4. print the third element again
		System.out.println(candy[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i < candy.length; i++) {
			System.out.println(candy[i]);
		}
		//6. make an array of 50 integers
		int[] numbers = new int[50]; 
		//7. use a for loop to make every value of the integer array a random number
for (int i = 0; i < numbers.length; i++)		{
	Random ran = new Random();
	numbers[i] = ran.nextInt(100); 
	System.out.println(numbers[i]); 
}
		//8. without printing the entire array, print only the smallest number in the array
int smallest = 100; 
for (int i = 0; i < numbers.length; i++) {
if (numbers[i] < smallest)	 {
	smallest = numbers[i]; 
}}
System.out.println(smallest);

		//9 print the entire array to see if step 8 was correct

		//10. print the largest number in the array.
int biggest = 0;
for (int i = 0; i < numbers.length; i++) {
	if(numbers[i] > biggest) {
		biggest = numbers[i]; 
	}
}
System.out.println(biggest);
	}
}
