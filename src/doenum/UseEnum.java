package doenum;

enum MobileBrand{
    APPLE,SAMSUNG,LG;
}
public class UseEnum{

    // Enum: Enum declaration can be done outside of a class or inside a class but not inside a method
    // Enum vs Class
    //An Enum can just like a class have attributes and methods.
    // Enum constants are public,static,final. Unchangeable can not be override
    // An enaum can not be used to create objects and it can not extends othe classes but
    // it can implement interfaces

    // Use enums when you have values that you know are not going to change.
    // Ex: Days, Colors

    enum Color {
        RED, GREEN, BLUE, YELLOW;

//        public final String name(){
//
//            String n="Zahirul";
//            return n;
//        }
    }

    enum Level {
        LOW, MEDIUM, HIGH;
    }

    public static void main(String[] args) {
        Color cl = Color.BLUE;
        System.out.println(cl);

        Level le=Level.HIGH;
        System.out.println(le);

        MobileBrand mb=MobileBrand.APPLE;
        System.out.println(mb);


        for (Level lv:Level.values()) {
            System.out.println(lv);

        }

    }



}
