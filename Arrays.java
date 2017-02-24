/*
Jemma Tiongson
Section #16031
App: Arrays
Purpose: Demonstrate declaration and initilization of Java Arrays
-------------------------------------------------------------------------
An Array is a form of data structure (a place in memory) that stores data.
It's size is always fixed.
_________________________________________________________________________
*/

class Arrays{
   public static void main (String [] args){
      
      /*
      String Array
      Initialization Method #1:
      
      Manual method: Stores each string into its own index
      Printing Manually
      */
      
      String [] strArray = new String [4];
   
      strArray[0] = "Java";
      strArray[1] = " was ";
      strArray[2] = "so ";
      strArray[3] = "difficult.";

      //replacing some values
      strArray[1] = " is ";
      strArray[3] = "much fun!";
      System.out.println(strArray[0]+strArray[1]+strArray[2]+strArray[3]);
      
      /*
      Char Array
      Initialization Method #2: Manual method similar to #1
      Printing with loop
      */
      char [] charArray = {'!', '@', '#', '$', '%', '^', '&'};
      
      for(int i = 0; i < charArray.length; i++){
         System.out.println(charArray[i]);
      }
      
      /*
      Int Array
      Initialization Method #3: valid/practical way of initializing large arrays
      If the index is odd, the value is replaced by its original value times 10.
      */
      
      int[] intArray = new int[15];
      
      for(int i = 0; i < intArray.length; i++){
         
         if(i%2 == 0)
            intArray[i] = i;
         else
            intArray[i] = i*10;
         
         System.out.print(intArray[i] + " ");
      }

   }
}