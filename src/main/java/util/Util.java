package util;

import java.util.Scanner;

public class Util {
    public static int lerInt(){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        return i;
    }
    
    public static String lerString(){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }
    
    public static float lerFloat(){
        Scanner scanner = new Scanner(System.in);
        float i = scanner.nextFloat();
        return i;
    }
    
    public static double lerDouble(){
        Scanner scanner = new Scanner(System.in);
        double i = scanner.nextDouble();
        return i;
    }
    
    public static char lerChar(){
        Scanner scanner = new Scanner(System.in);
        char i = scanner.next().charAt(0);
        return i;
    }
}