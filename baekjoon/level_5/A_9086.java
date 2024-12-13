package baekjoon.level_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i].charAt(0));
            System.out.println(arr[i].charAt(arr[i].length() - 1));
        }
    }
}
