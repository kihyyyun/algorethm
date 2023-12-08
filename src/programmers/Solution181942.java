package programmers;

public class Solution181942 {

    public String solution(String str1, String str2) {
        // 주석으로 어떤 과정을 통해 문제를 풀지 작성해보기
        String answer = "";

        // string.charAt(int index)
        // 문자열을 구성하는 char들 중 index번째를 반환하는 메서드
        for (int i = 0; i < str1.length(); i++) {
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }

        return answer;
    }
}

