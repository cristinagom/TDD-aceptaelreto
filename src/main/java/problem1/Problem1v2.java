package problem1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Problem1v2 {
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        Scanner keyboard = new Scanner(System.in);
        String nameIn, nameOut;
        System.out.println("Write the input filename:");
        nameIn=keyboard.nextLine();
        System.out.println("Write the output filename:");
        nameOut=keyboard.nextLine();

        Scanner fileIn=new Scanner(new File(nameIn));
        FileWriter fileOut=new FileWriter(nameOut);

        int year;
        while (fileIn.hasNextLine()) {
            year=Integer.parseInt(fileIn.nextLine());
            if (((year%100==0) && ((year/100)%4==0)) || (year%4==0))
                fileOut.write("YES"+"\n");
            else
                fileOut.write("NO"+"\n");
        }
    }
}
