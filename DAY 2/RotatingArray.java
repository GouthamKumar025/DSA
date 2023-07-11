package dsa;
import java.util.*;
//In this question we have to rotate an array upto a fixed position
public class RotatingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
        int[]arr= {1,2,3,4,5};
        int n=arr.length;
        System.out.println("Enter the position of the element to be rotated to the left side of the array ");
        int position=in.nextInt();
        rotate(arr,position,n);
        System.out.println(Arrays.toString(arr));
	}
	static void rotate(int[]arr,int position,int n) {
		for(int i=0;i<position;i++) {
			rotateArray(arr,n);
		}
	}
	static void rotateArray(int[]arr,int n) {
		int temp=arr[0];
		for(int i=0;i<n-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[n-1]=temp;
	}

}
