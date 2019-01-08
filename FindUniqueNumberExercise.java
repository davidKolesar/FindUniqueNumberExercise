import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


// Make sure your class is public
public class Kata {

    public static double findUniq(double arr[]) {
    List<Double> equalComparisons = new ArrayList<>();     
    
    
    if (arr[0] == arr[1]){
      equalComparisons.add(arr[0]);
    }
    
    if (arr[1] == arr[2]){
      equalComparisons.add(arr[1]);
    }
    
    if (arr[0] == arr[2]){
      equalComparisons.add(arr[0]);
    }
    
     return compareArrays(equalComparisons, arr);
    
     }
   
   private static double compareArrays(List<Double> equalComparisons, double arr[]){
   
   Double oddNumberOut = null;
   
   for( double number : arr ) { 
     if(number != equalComparisons.get(0)) {
           oddNumberOut = number;
      }
   }
   return oddNumberOut;
}
}