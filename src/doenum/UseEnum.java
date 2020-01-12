package doenum;

import basic.Burger;

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
        RED_COLOR, GREEN_COLOR, BLUE_COLOR, YELLOW_COLOR, BLACK

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
        Color cl = Color.BLUE_COLOR;
        System.out.println(cl);

        Level le=Level.HIGH;
        System.out.println(le);

        MobileBrand mb=MobileBrand.APPLE;
        System.out.println(mb);


        for (Level lv:Level.values()) {
            System.out.println(lv);

        }

        Burger br=Burger.CHEESE_BURGER;
        System.out.println(br);



    }



}
