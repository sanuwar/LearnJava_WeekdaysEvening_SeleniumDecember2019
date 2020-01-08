package datastructureandalgorithom.array;

public class Use3DArray {
    public static void main(String[] args) {
        // DataType[Size][Row][Column]=new DataType[Size][Row][Column]
        String[][][] studentName = new String[4][4][6];

        studentName[0][0][0] = "Sl";
        studentName[0][0][1] = "Kazi";
        studentName[0][0][2] = "Matin";
        studentName[0][0][3] = "4535";
        studentName[0][0][4] = "4535";
        studentName[0][0][5] = "4535";

        studentName[1][1][0] = "4535";
        studentName[1][1][1] = "4535";
        studentName[1][1][2] = "4535";
        studentName[1][1][3] = "4535";
        studentName[1][1][4] = "4535";
        studentName[1][1][5] = "4535";

        studentName[2][2][0] = "4535";
        studentName[2][2][1] = "4535";
        studentName[2][2][2] = "4535";
        studentName[2][2][3] = "4535";
        studentName[2][2][4] = "4535";
        studentName[2][2][5] = "4535";

        studentName[3][3][5]="Jonny";

//		studentName[14][14][10] = "4535";

        System.out.println(studentName[2][2][1]);
        System.out.println(studentName[3][3][5]);
        System.out.println(studentName.length);
    }
}
