//  ジャンケンの手を表示

import java.util.Random;

class rock {
    public static void main (String[] args) {
        Random rand = new Random();
        
        int hand = rand.nextInt(3); //  0~2の値をランダムで生成
        
        if (hand == 0) {
            System.out.println("グー");
        } else if (hand == 1) {
            System.out.println("チョキ");
        } else if (hand == 2) {
            System.out.println("パー");
        }
    }
}