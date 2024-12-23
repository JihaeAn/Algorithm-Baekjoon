package baekjoon.level_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 참고용 코드
public class A_1157_3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        str = str.toUpperCase();
        char[] ch = str.toCharArray();

        Map<Character,Integer> map  = new HashMap<Character,Integer>();

        for(char c : ch){
            if(map.containsKey(c)){
                Integer value = map.get(c);
                map.remove(c);
                map.put(c, ++value);
            }else{
                map.put(c,1);
            }
        }


        int maxValue = Integer.MIN_VALUE;
        char maxKey = ' ';
        boolean isUnique = true;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (value > maxValue) {
                maxValue = value;
                maxKey = entry.getKey();
                isUnique = true;
            } else if (value == maxValue) {
                isUnique = false;
            }
        }

        // 결과 출력
        if (isUnique) {
            System.out.println(maxKey);  // 유일한 최대 값의 키 출력
        } else {
            System.out.println("?");  // 중복된 최대 값이면 '?' 출력
        }
    }
}
