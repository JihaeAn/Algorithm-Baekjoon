package baekjoon.level_2;

import java.util.Scanner;

public class A_2525 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String origin = sc.nextLine();
//        int duringTime = sc.nextInt();
//
//        String[] split = origin.split(" ");
//        int H = Integer.parseInt(split[0]);
//        int M = Integer.parseInt(split[1]);
//
//        // 현 시간에 걸리는 시간을 더했을 때 60분이 넘는 경우를 구하기 위함
//        int mok = (M + duringTime) / 60;
//
//        if (mok >= 1) {
//            if (H + mok >= 24) {
//                int HH = H + mok - 24;
//                System.out.println(HH + " " + (M + duringTime - (mok * 60)));
//            } else {
//                System.out.println((H + mok) + " " + (M + duringTime - (mok * 60)));
//            }
//        } else {
//            System.out.println(H + " " + (M + duringTime));
//        }

        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();

        int C = in.nextInt();

        int min = 60 * A + B;   // 시 -> 분
        min += C;

        int hour = (min / 60) % 24;
        int minute = min % 60;

        System.out.println(hour + " " + minute);
    }
}
