package baekjoon.level_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A_5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] list = new int[3];

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            list[0] = Integer.parseInt(st.nextToken());
            list[1] = Integer.parseInt(st.nextToken());
            list[2] = Integer.parseInt(st.nextToken());

            Arrays.sort(list);

            int n = list[0];
            int m = list[1];
            int k = list[2];

            if (n == 0 && m == 0 && k == 0) {
                break;
            }

            if (k >= n + m) {
                System.out.println("Invalid");
            } else if (n == m && m == k) {
                System.out.println("Equilateral");
            } else if (n == m || m == k || n == k) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}
