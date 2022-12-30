//  変数aに値を入力して表示

import java.util.Scanner;

class variable {
    public static void main (String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("変数a:");
        int a = stdIn.nextInt();
        
        System.out.println("変数aは" + a + "です。");
    }
}