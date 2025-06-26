package baekjoon.level_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A_14215 {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[3];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());
        arr[0] = Integer.parseInt(s.nextToken());
        arr[1] = Integer.parseInt(s.nextToken());
        arr[2] = Integer.parseInt(s.nextToken());

        Arrays.sort(arr);

        if (arr[0] + arr[1] <= arr[2]) {
            System.out.println((arr[0] + arr[1]) * 2  - 1);
        } else {
            System.out.println(arr[0] + arr[1] + arr[2]);
        }
    }
}
