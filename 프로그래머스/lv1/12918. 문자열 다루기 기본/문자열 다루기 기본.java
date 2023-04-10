class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        String[] strArray = s.split("");
        if (s.length() == 4 || s.length() == 6) {
            Loop1 : for (int i = 0; i < strArray.length; i++) {
                switch (strArray[i]) {
                    case "0":
                    case "1":
                    case "2":
                    case "3":
                    case "4":
                    case "5":
                    case "6":
                    case "7":
                    case "8":
                    case "9":
                        answer = true;
                        break;
                    default:
                        answer = false;
                        break Loop1;
                }
            }
        }
        return answer;
    }
}