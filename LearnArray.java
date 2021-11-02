package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {

		int arr[] = { 100, 49, 398, 34, 1, 267 };
		int len = arr.length;
		Arrays.sort(arr);
		System.out.println("The second largest number " + arr[len - 2]);
		System.out.println("The second smallest number " + arr[1]);

	}

}
