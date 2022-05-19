package media_array;
import java.util.*;

public class TestArray {
		
	public double mediaArray(int[] unArray){
		
		int somma=0;
		for(int i=0;i<unArray.length;i++) {
			somma=somma+unArray[i];
		}
		return somma/unArray.length;
	
	}
	
	
	
}
