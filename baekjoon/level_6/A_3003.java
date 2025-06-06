package baekjoon.level_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] origin = new int[]{1, 1, 2, 2, 2, 8};
        int[] newbie = new int[6];

        for (int i = 0; i < 6; i++) {
            int gap = 0;
            newbie[i] = Integer.parseInt(st.nextToken());

            if (origin[i] != newbie[i]) {
                gap = origin[i] - newbie[i];
            }
            System.out.print(gap + " ");
        }
    }
}
