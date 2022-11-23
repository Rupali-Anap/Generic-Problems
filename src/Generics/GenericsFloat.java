package Generics;
import java.util.Scanner;

public class GenericsFloat {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Finding the Maximum number from given numbers:");
        System.out.println("Enter 3 numbers: ");
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        float z = sc.nextFloat();
        Generics findMax=new Generics();
        System.out.println("float Number: " + findMax.Generics (x, y, z));

    }

}
