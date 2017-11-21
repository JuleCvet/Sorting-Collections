
package collectionssortbinary;

import java.util.*;

public class Main {
    
    static List<String> binaryNumbers = new ArrayList<String>();
    
    public static void main(String[] args) {
    
      Collections.sort(binaryNumbers, new CollectionsSortBinary ());

      binaryNumbers.add("11");
      binaryNumbers.add("101");
      binaryNumbers.add("11111");
      binaryNumbers.add("1110");
      binaryNumbers.add("111101");
      
      System.out.println("Shuffle numbers in list:" );
        for (int i = 0; i < binaryNumbers.size(); i++) {
            Collections.shuffle(binaryNumbers); 
        }
        System.out.println(binaryNumbers);
        
      
        for (int i = binaryNumbers.size()-1; i >= 0; i--) {
            Collections.sort(binaryNumbers);//samo vo main se povikuva so importot
        }
        System.out.println("Reverse Array: " + "\n" + binaryNumbers);
    }
}

