package baekjoon;

import java.util.Scanner;

public class A_11659 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] sumArr = new int[n + 1];

        for(int i = 1; i <= n; i++) {
            sumArr[i] = sumArr[i-1] + sc.nextInt();
        }

        int answer = 0;

        for(int t = 0; t < m; t++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            answer = sumArr[j] - sumArr[i - 1];
            System.out.println(answer);
        }
    }
}
