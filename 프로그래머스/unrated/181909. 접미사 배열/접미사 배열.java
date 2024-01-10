import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        int length = my_string.length();
        String[] s = new String[length];

        for (int i = 0; i < length; i++) {
            s[i] = my_string.substring(i);
        }

        Arrays.sort(s);

        return s;
    }
}