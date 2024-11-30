package baekjoon.level_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_10807_1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 받을 정수의 크기
        int n = Integer.parseInt(br.readLine());

        // 2. 입력받은 문자열 공백으로 나누어 배열에 저장
        String[] list = br.readLine().split(" ");

        // 3. 찾을 정수
        int find = Integer.parseInt(br.readLine());

        int result = 0;
        for(int j = 0; j < n; j++) {
            if( Integer.parseInt(list[j]) == find) {
                result += 1;
            }
        }
        System.out.println("result = " + result);
    }
}
