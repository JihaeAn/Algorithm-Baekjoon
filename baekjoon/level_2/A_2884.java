package baekjoon.level_2;

import java.util.Scanner;

public class A_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        if (M < 45) {
            if (H == 0) H = 24;
            System.out.println(H - 1 + " " + (60 - 45 + M));
        } else {
            System.out.println(H + " " + (M - 45));
        }
    }
}
