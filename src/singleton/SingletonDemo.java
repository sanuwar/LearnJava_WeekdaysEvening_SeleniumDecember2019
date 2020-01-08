package singleton;

public class SingletonDemo {

    //    - A singleton class is a class that can have only one object (an instance of the class) at a time.
    //     - The Singleton's purpose is to control object creation,
    //    limiting the number of objects to only one.
    //    - Since there is only one Singleton instance, any instance fields
    //    of a Singleton will occur only once per class, just like static fields.

    private int number=10;
    private String name;

    // Private constructor
    // This prevents other classes from instantiating this class
    // It can only be instantiated within this class
    private SingletonDemo(){
        this.number=15;
        this.name="James";

    }

    private static SingletonDemo instance=new SingletonDemo();
    // SingletonDemo obj=new SingletonDemo();

    public static SingletonDemo getInstance(){

        return instance;
    }


    public void doSomething(){
        System.out.println("We are doing Something");
    }

    // Getter and Setter


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
