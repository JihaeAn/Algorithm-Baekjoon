package baekjoon.level_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] n = br.readLine().split(" ");

        int N = Integer.parseInt(n[0]);
        int x = Integer.parseInt(n[1]);

        String[] list = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            if (Integer.parseInt(list[i]) < x) {
                System.out.print(Integer.parseInt(list[i]) + " ");
            }
        }
    }
}
