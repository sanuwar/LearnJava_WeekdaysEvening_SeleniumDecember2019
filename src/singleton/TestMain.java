package singleton;

public class TestMain {
    public static void main(String[] args) {
        SingletonDemo sd=SingletonDemo.getInstance();
//        sd.name="Aroz";
//        sd.number=5468684;
        sd.doSomething();


       // Computer computer=new Computer();

        Computer cp= Computer.getObj();

        Mobile mobile=new Mobile();

        mobile.setMobileBrand("Apple");
        System.out.println(mobile.getMobileBrand());





    }
}
