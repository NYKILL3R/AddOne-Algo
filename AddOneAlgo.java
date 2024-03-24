/*

 */
package addonealgorithm;
import java.util.*;
import java.util.stream.IntStream;
/**
 *
 * @author zachmiller
 */
public class AddOneAlgorithm {//start class

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//start main
        long startTime = System.nanoTime();
        Scanner scanner = new Scanner(System.in);
        Integer Number;
        System.out.print("Enter a number");
        String input = scanner.nextLine();
        Number = Integer.valueOf(input);
        LinkedList<Integer> digits = addOne(Number);
        System.out.println(digits);
        System.out.println(digits.size());
        
        
      
     
        
        
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Your time is "+totalTime);
    }//end main
    public static LinkedList<Integer> addOne(int Number) {// start addOne
    int size;
    int bottom;
    int i;
    LinkedList<Integer> digits = new LinkedList();

    //newdigits.push(1);
    
    size = String.valueOf(Number).length() - 1;  
    //The while loop that pushes each number into the array
    while (Number > 0) {//start while loop
    digits.push(Number % 10);
    Number /= 10;
    
                       }//end while loop
    bottom = size;
    i = digits.get(size);
    
   if(digits.get(bottom) == 9 && bottom == 0){
        digits.set(0,1);
        digits.add(0);
        return digits;
    }
   else if(digits.get(bottom) == 9 && digits.get(bottom - 1) != 9 ){
        digits.set(bottom, 0);
        bottom--; 
        digits.set(bottom, digits.get(bottom) + 1 );
        
        return digits;
   }
    
   else if(digits.get(bottom) == 9 && digits.get(bottom - 1) >= 9){//start if
       do {//start do loop
        digits.set(bottom, 0);
        bottom--;
        //iterator.nextIndex(); 
        digits.set(bottom, digits.get(bottom) + 1 );
                                           }//end do loop
        while(digits.get(bottom) > 9 && bottom > 0);
       // return digits;
        }//end if
   if(bottom == 0 && digits.get(bottom) >= 9){
      digits.set(0,1);
      digits.add(0);
       for(bottom = 1; bottom == size; bottom++){
           digits.set(bottom, 0);
           
       }
       return digits;
      }
   
   else if(digits.get(bottom) < 9 ) {//start else
        digits.set(bottom, digits.get(bottom) + 1);
        return digits;
        }//end else
   
     return digits;
        
                                                        
                                                                         
   
        
        
       
                       }//end addOne
}//end class
