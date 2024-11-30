package baekjoon.level_4;

import java.util.Scanner;

// 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
public class A_10807 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int [] list = new int[count];

        for (int i = 0; i < count; i++) {
            list[i] = sc.nextInt();
        }
        
        int find = sc.nextInt();
        
        int result = 0;
        for(int j = 0; j < list.length; j++) {
            if( list[j] == find) {
                result += 1;
            }
        }
        System.out.println("result = " + result);
    }
}
