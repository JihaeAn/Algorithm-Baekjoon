package baekjoon.level_2;

import java.util.Scanner;

public class A_14681 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x >= 0) {
            if (y >= 0) {
                System.out.println(1);
                return;
            }
            System.out.println(4);
        } else {
            if (y >= 0) {
                System.out.println(2);
                return;
            }
            System.out.println(3);
        }
    }
}
