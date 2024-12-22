package baekjoon.level_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 두 번째 도전 - 메모리 초과
public class A_1157_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] ch = new char[str.length()];

        // 카운트 배열
        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.toUpperCase().charAt(i);
            arr[ch[i] - 65] += 1;
        }

        int max = 0;
        char cha = '?';

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
                cha = (char) (max + 65);
            }
        }

        System.out.println(cha);
    }
}
