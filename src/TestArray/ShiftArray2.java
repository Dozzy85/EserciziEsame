package TestArray;
import java.util.*;
import java.io.*;

public class ShiftArray2{

	private int[] array1;
	private int dim;

	public int getDim() {
		return dim;
	}

	public void setArray1(int dim) {
		this.dim=dim;
		this.array1=new int[dim];
		Scanner scrivi=new Scanner(System.in);
		System.out.println("Popola array");
		for(int i=0;i<dim;i++) {
			System.out.print("Valore "+i+":");
			this.array1[i]=scrivi.nextInt();
		}
	}
	
	public void shift() {
		
		int temp=this.array1[0];
		for(int i=0;i<this.dim-1;i++) {
			this.array1[i]=this.array1[i+1];
			//System.out.print(this.array1[i]=this.array1[i+1]);
			//System.out.print(" ");
		}
		this.array1[this.dim-1]=temp;
		//System.out.print(this.array1[this.dim-1]);
	}

	public void stampa() {
		for(int i=0;i<this.dim;i++) {
			System.out.print(this.array1[i]);
			System.out.print(" ");
		}
	}
	
}
