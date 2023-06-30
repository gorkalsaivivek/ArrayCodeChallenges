package src;

public class Exercise {
	 
public static int[] middle(int[] array) {
        
	int[] arrayResult = new int[array.length-2];
	
        if(array.length-2>0){
          
           int k=0;
        for(int i=1;i<=array.length-2;i++){
            
            arrayResult[k]=array[i];
            k++;
        } 
        }
        
       return arrayResult;
    }


}
