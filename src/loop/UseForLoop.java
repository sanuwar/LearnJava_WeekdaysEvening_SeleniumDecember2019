package loop;

public class UseForLoop {

    // Loop in Java:

    //Looping in programming languages is a feature which facilitates the execution of a set of
    // instructions/functions repeatedly while some condition evaluates to true.
    // Java provides three ways for executing the loops. ... The while loop can be thought of as a repeating if statement.

    // For Loop
    // While loop
    // Do..While Loop
    // For each loop


    //When using this version of the for statement, keep in mind that:
    //
    //1. The initialization expression initializes the loop; it's executed once, as the loop begins.
    //2. When the termination expression evaluates to false, the loop terminates.
    //3. The increment expression is invoked after each iteration through the loop.
    //  It is perfectly acceptable for this expression to increment or decrement a value.


    public static void main(String[] args) {


        //For Loop
        // for(initialization; Termination; increment/Decrement ){ // statements }

//        for(int i=10; i>0; i--){
//            // statements
//            System.out.println("The number is ="+i);
//        }

//        for (int i=0; i>5; i++){
//      System.out.println("Print out the number "+i);
//   }

//       for (int i=10; i>0; i--){
//         System.out.println("Print out the number "+i);
//   }
        // Do not try at Home:
//        for (int i = 0; i < 5; i--) {
//            System.out.println("Print out the number " + i);
//        }

//        for (int i = 0; i <= 10; i =i+ 3) {
//            System.out.println("Print out the number ... " + i);
//        }

        //Even or Odd Number
//        for (int i=0; i<10;i++){
//
//            if (i%2==0){
//                System.out.println(i+" is Even Number");
//            } else {
//                System.out.println(i+" is Odd Number");
//            }
//
//        }


        // Nested For Loop

        for (int i = 0; i < 4; i++) {
            System.out.println("Begaining of the Phase is " + i);
            for (int j = 0; j < 6; j++) {
                System.out.println("i = " + i + " j = " + j);
            }
            System.out.println("End of the Phase is " + i + "\n");
        }

    }


}






