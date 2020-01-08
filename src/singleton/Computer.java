package singleton;

public class Computer {

    int id=50;

    private Computer(){

    }

    private static Computer obj=new Computer();

    public static Computer getObj(){
        return obj;
    }




}
