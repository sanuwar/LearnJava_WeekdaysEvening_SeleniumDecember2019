package loop;

public class UseWhileLoop {

    /**
     * A while loop is a controlflow flow statement that allows code to be executed repeatedly based on a given Boolean condition.
     * The while loop can be thought of as a repeating if statement.
     */


    public static void main(String[] args) {


// ---------------------------------------- While ----------------------------------------------------------

        // How does while loops work?
        // The while statement continually executes a block of statements while a particular condition is true.


        //while (expression) {
        //     statement(s)
        //}

        int numberOfContestants = 0;

        while (numberOfContestants < 5) {
            System.out.println("The total number of contestants in this raffle are: " + numberOfContestants);
            numberOfContestants++;
        }


    }
}
