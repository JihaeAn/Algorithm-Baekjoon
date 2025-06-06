package baekjoon.level_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int max = 0;
        int n = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());

            if (arr[i] > max) {
                max = arr[i];
                n = i;
            }
        }

        System.out.println(max);
        System.out.println(n + 1);
    }
}
