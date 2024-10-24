package baekjoon.level_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        // 세 변수 모두 같을 때
        if (a == b && a == c) {
            System.out.println(10000 + a * 1000);

        // 두 변수가 같을 떄
        } else if (a == b || b == c) {
            System.out.println(1000 + b * 100);

        // 두 변수가 같을 떄
        } else if (a == c) {
            System.out.println(1000 + a * 100);

        // 세 변수 모두 다를 때
        } else {
            int max = Math.max(Math.max(a, b), c);
            System.out.println(max * 100);
        }
    }
}