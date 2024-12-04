package baekjoon.level_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_5597_1 {
    public static void main(String[] args) throws IOException {

        int[] students = new int[30];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 28; i++) {
            students[Integer.parseInt(br.readLine()) - 1] = 1;
        }

        for (int i = 0; i < 30; i++) {
            if (students[i] == 1) continue;
            System.out.println(i + 1);
        }
    }
}
