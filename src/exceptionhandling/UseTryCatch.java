package exceptionhandling;

public class UseTryCatch {

    // Exception Handling:
    // Try Catch
    // Try this if not catch it

    public static void main(String[] args) {

        try {
            double number1=10;
            double number2=3;
            double division=number1/number2;
            System.out.println(division);
        } catch (Exception e){
          e.printStackTrace();
            System.out.println("This is Arithmetic Exception ");
        }








    }




}
