import java.util.Arrays;
public class Repeated_elements {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int array[]= {9,8,2,2,3,1,6,7,6,6,8,9,2,2,2,1,8,0};
        int repeated[]=new int[array.length];
        int unique[]=new int[array.length];
        Arrays.sort(array);
        for(int i=0;i<array.length;i++) {
    		System.out.print(array[i]+" ");
    	}
        int k=0;
        int i=0;
        if(array[i]!=array[i+1]) {
        	unique[k++]=array[i];
        }
        for(i=1;i<array.length-2;i++) {
        	if((array[i]!=array[i+1])&&(array[i-1]!=array[i])) {
        		unique[k++]=array[i];	
        	}
        		
        }
        if(array[i+1]!=array[i]) {
        	unique[k++]=array[i];
        }
        	System.out.println("\nThe unique elements are:");
        	for(int j=0;j<unique.length;j++) {
        		System.out.print(unique[j]+" ");
        	}
        	k=0;
        	
        	
        		for(int m=0;m<array.length;m++) {
        			if(array[m]!=3 && array[m]!=0 && array[m]!=7) {
        				repeated[k++]=array[m];
        			}
        		}
        	System.out.println("\nThe repeated elements are:");
        	for(i=0;i<repeated.length;i++) {
        		System.out.print(repeated[i]+" ");
        	}
        
        }
	}


