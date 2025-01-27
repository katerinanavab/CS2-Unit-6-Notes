public class Main {

   public static void main(String []args) {
      
      // ARRAY (list) is a DATA STRUCTURE (collection) 
      // stores multiple values in one named variable

      // DECLARE arrays using square brackets
      // one array can hold items of ONE DATA TYPE
      int[] luckyNumbers; // just creates a named REFERENCE, no values yet
      double[] mileTimes; 
      boolean[] trueOrFalse;
      // Arrays can also store OBJECTS (reference types)
      String[] spiritAnimals;

      // TWO OPTIONS to CREATE the array in memory
      // 1. Use the keyword NEW to set up an empty array
      // Need to tell Java HOW MANY SPACES to allocate!!!
      luckyNumbers = new int[6]; // already declared earlier
      int[] moreLuckyNumbers = new int[8]; // DECLARE + CREATE in one line
      double[] movieRatings = new double[10]; 
      String[] faveAnimals = new String[8]; 
      System.out.println(moreLuckyNumbers); // just prints location in memory

      // 2. Use an INITIALIZER LIST to set array values
      int[] luckiestNumbers = { 13, 13, 10, 9, 5, 20, 37, 7}; 
      double[] currentCash = { 1.0, 5.25, 15.0, 21.0 };

      // HOW TO ACCESS ARRAY ELEMENTS (items)
      // arrayName[index] --> gets item at that position
      System.out.println(luckiestNumbers[0]); // first item is at index 0

      // HOW TO MODIFY ARRAY ELEMENTS
      // arrayName[index] = newValue
      faveAnimals[0] = "dolphin";
      faveAnimals[1] = "dog";
      // NOTE that the other 6 indices hold NULL
      System.out.println(faveAnimals[2]);

      String[] bestClass = { "Maia", "Alex", "Zoie", "Paige", "Natalie", "Bryce", "Finny", "Jackson"};
      // LENGTH is an Array ATTRIBUTE/PROPERTY
      int numStudents = bestClass.length;
      System.out.println(numStudents); // 8
      // FINAL INDEX is always [length - 1] !!!
      int lastStudentIndex = bestClass.length - 1; // 7
      System.out.println(bestClass[lastStudentIndex]); 

      // PARALLEL ARRAY to hold info associated with another array
      String[] faveFoods = { "Pasta", "", "Sushi", "Caesar Salad", "Sushi", "Burritos", "I don't know", "Lasagna" };
      // With parallel arrays, ORDER MATTERS! 
      // So we can use the same index for multiple lists 
      System.out.println( bestClass[0] + "'s favorite food is " + faveFoods[0] );
      System.out.println( bestClass[3] + "'s favorite food is " + faveFoods[3] );

      // STANDARD FOR LOOP to traverse arrays
      // Example: START at first index, STOP at final index, CHANGE by 1
      // WATCH OUT for the bounds with the STOP condition! 
      // Can use i < array.length OR i <= (array.length - 1)
      for (int i = 0; i < bestClass.length; i++) {
         System.out.println( bestClass[i] + "'s favorite food is " + faveFoods[i] );
      }

      // With STANDARD FOR LOOPS, you have flexibility over 
      // the ORDER and WAY you traverse through the array!
      // Example: START at final index, STOP at first index, CHANGE by -1
      int[] countdown = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      for (int i = countdown.length - 1 ; i >= 0; i--) {
         System.out.println(countdown[i]); // VALUE at index i

         // CONDITIONAL inside the loop!
         if (i == 0) {
            System.out.println("HAPPY NEW YEAR!!! 🎉🎉🎉");
         }
      }

      // Example: CHANGE by 2 instead (visit every OTHER item)
      for (int i = 0; i < countdown.length; i+=2) {
         System.out.println("Current index: " + i);
         System.out.println("Item at index: " + countdown[i]);
      }

      // STANDARD FOR LOOPS allow you to modify values
      // because during iteration, we are keeping track of INDEX
      // Example: Fill in values for empty array
      int[] tens = new int[10]; 
      for (int i = 0; i < tens.length; i++) {
         // Assign value to tens[i]
         tens[i] = i * 10;
         System.out.print(tens[i] + " ");
      }
      // Example: Modify existing array values
      for (int i = 0; i < bestClass.length; i++) {
         bestClass[i] = bestClass[i] + "yay";
         System.out.print(bestClass[i] + " ");
      }

      // ENHANCED FOR LOOPS ("For-Each")
      // Shortcut to iterate through EACH item 
      // in a collection (from start -> end)
      // for (type variable : arrayname)

      System.out.println("FOR-EACH LOOP: ");
      // "for each student in the class array"
      for (String student : bestClass) {
         // student represents CURRENT ITEM
         System.out.print(student + " ");
      }
      // LIMITATIONS:
      // can't modify values when using for-each
      // because we don't keep track of INDEX
      // For-Each loop is good for "visiting every item" in order. Otherwise, use a Standard for loop!!!

   }
}
