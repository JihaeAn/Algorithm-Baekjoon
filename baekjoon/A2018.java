package baekjoon;

import java.util.Scanner;

public class A2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int sum = 1;
        int count = 1;
        int startIndex = 1;
        int endIndex = 1;

        while (endIndex != N) {
            if(sum == N) {
                count++; endIndex++; sum = sum + endIndex;
            } else if (sum > N) {
                sum = sum - startIndex; startIndex++;
            } else {
                endIndex++; sum = sum + endIndex;
            }
        }
        System.out.println(count);
    }
}
