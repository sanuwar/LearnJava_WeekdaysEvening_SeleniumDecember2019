package reviewjava;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnitTesting {


    public static String stInfo(String fName, String lName){
        String fullName=fName+" "+lName;
        return fullName;
    }

//    public static void main(String[] args) {
//
//        String actualResult=stInfo("Fahim","Zaman");
//        String expectedResult="Fahim Zaman1";
//
//        Assert.assertEquals(expectedResult,actualResult);
//
//
//
////        if (expectedResult.equalsIgnoreCase(actualResult)){
////
////            System.out.println("Test is Pass");
////        }
////        else {
////            System.out.println("Test is Fail");
////        }
//
//        //System.out.println(actualResult);
//
//
//    }

    @Test
    public void testSt(){

        String actualResult=stInfo("Fahim","Zaman");
        String expectedResult="Fahim Zaman";

        //Assert.assertEquals(expectedResult,actualResult);
        assertEquals("Test is Fail",expectedResult,actualResult);

    }







}
