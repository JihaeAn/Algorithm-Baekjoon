package baekjoon.level_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A_1157_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        // 카운트 배열
        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toUpperCase(str.charAt(i));
            arr[ch - 65]++;
        }

        int max = 0;
        char cha = '?';

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                cha = (char) (i + 65);
            } else if (arr[i] == max) {
                cha = '?';
            }
        }

        System.out.println(cha);
    }
}
