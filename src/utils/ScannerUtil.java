package utils;

import java.util.Scanner;

public class ScannerUtil {
    static Scanner sc=new Scanner(System.in);;

   public Scanner getScannerObject() {
        return sc;
    }

    public int getAnIntegerInput() {
        System.out.println("Enter A number");
        return sc.nextInt();
    }

    public String getAStringInput() {
        System.out.println("Enter A String:\t");
        return sc.next();
    }
}
