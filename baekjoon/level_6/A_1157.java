package baekjoon.level_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// 1단계 시도 - 실패
public class A_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] ch = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.toUpperCase().charAt(i);
        }

        char many = ch[0];
        Map<Character, Integer> map = new HashMap<>();
        map.put(ch[0], 0);

        for (int i = 0; i < str.length(); i++) {
            if (ch[i] == many) {
                map.put(ch[i], map.get(ch[i]) + 1);
                many = ch[i];
            } else {
                map.put(ch[i], 1);
                many = ch[i];
            }
        }

        int max;
        char maxchar;

        for (Character c : map.keySet()) {
            max = map.get(c);
            maxchar = c;
            if (c.charValue() > max) {
                maxchar = c;
            }
        }

    }
}
