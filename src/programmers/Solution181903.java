package programmers;

public class Solution181903 {
    public String solution(int q, int r, String code) {
        String answer = "";

        for (int i = 0; i <code.length(); i++) {
            if( i % q == r){
                answer = answer + code.charAt(i);
            }
        }

        return answer;
    }
}