//  変数aと変数bの加減剰余を表示

import java.util.Scanner;

class equal {
    public static void main (String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("変数a:"); int a = stdIn.nextInt();
        System.out.print("変数b:"); int b = stdIn.nextInt();
        
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
    }
}