package TestArray;
import java.util.*;

/*Creare una classe per il ShiftArray, che copia in un elemento quello successivo*/

public class ShiftArray {

	public static void main(String[] args) {
		
		int[] array1= {1,2,3,4};
		int temp=array1[0];
		
		/*Array originale*/
		System.out.println("Array originale");
		for(int i=0;i<array1.length;i++) {
			System.out.print(array1[i]);
			System.out.print(" ");
		}
		
		for(int j=0;j<array1.length-1;j++) {
			array1[j]=array1[j+1];
		}
		array1[array1.length-1]=temp;
		
		System.out.println();
		
		/*Array Shiftato*/
		System.out.println("Array shiftato");
		for(int i=0;i<array1.length;i++) {
			System.out.print(array1[i]);
			System.out.print(" ");
		}

	}

}
