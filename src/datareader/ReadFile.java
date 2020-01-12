package datareader;


import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {

    public static void main(String[] args) {

        FileReader fileReader=null;
        BufferedReader bufferedReader=null;

        String fileName="../LearnJava_WeekdaysEvening_SeleniumDecember2019/src/datareader/Sample.txt";

        try {

        fileReader=new FileReader(fileName);
        bufferedReader=new BufferedReader(fileReader);

        String data;
//      data=bufferedReader.readLine();

        while ( ( data=bufferedReader.readLine()) != null){
            System.out.println(data);
            }

        } catch (Exception e){
            e.printStackTrace();
            System.out.println("File not Found");
        } finally {

            try {
                fileReader.close();
                bufferedReader.close();

            }catch (Exception e){
                e.printStackTrace();
                System.out.println("File Already closed");
            }



        }


    }







}
