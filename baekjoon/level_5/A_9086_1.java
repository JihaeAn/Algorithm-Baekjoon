package baekjoon.level_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_9086_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            System.out.print(s.charAt(0));
            System.out.println(s.charAt(s.length() - 1));
        }
    }
}
