package baekjoon.level_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A_1546 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 과목 수
        int N = Integer.parseInt(br.readLine());
        // 점수들
        StringTokenizer st = new StringTokenizer(br.readLine());

        double[] arr = new double[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
        }

        // 최댓값 구하기 (배열 정렬한 후 맨 마지막 인덱스 꺼내기)
        Arrays.sort(arr);

        double sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i] / arr[arr.length - 1] * 100;
        }

        System.out.println(sum / N);
    }
}
