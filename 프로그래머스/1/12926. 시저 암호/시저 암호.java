class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append(c);
            } else if (Character.isUpperCase(c)) {
                // 대문자 처리
                char shifted = (char) ('A' + (c - 'A' + n) % 26);
                sb.append(shifted);
            } else if (Character.isLowerCase(c)) {
                // 소문자 처리
                char shifted = (char) ('a' + (c - 'a' + n) % 26);
                sb.append(shifted);
            }
        }
        
        return sb.toString();
    }
}
