import java.util.Scanner;
import java.util.Arrays;
public class Array_Merging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          int size1,size2;
          System.out.println("Enter the number of elements of array 1:");
          size1=sc.nextInt();
          System.out.println("Enter the number of elements of array 2:");
          size2=sc.nextInt();
          int array1[]=new int[size1];
          int array2[]=new int[size2];
          int array3[]=new int[size1+size2];
          System.out.println("Input the array 1 elements:");
          for(int i=0;i<size1;i++) {
        	  array1[i]=sc.nextInt();
          }
          System.out.println("Input the array 2 elements:");
          for(int i=0;i<size1;i++) {
        	  array2[i]=sc.nextInt();
          }
          Arrays.sort(array1);
          Arrays.sort(array2);
          for(int i=0;i<size1;i++) {
        	  array3[i]=array1[i];
          }
          for(int j=0;j<size2;j++) {
        	  array3[j+size1]=array2[j];
          }
          System.out.println("The merged sorted array:");
          for(int i=0;i<array3.length;i++) {
        	  System.out.print(array3[i]+" ");
          }
	}

}
