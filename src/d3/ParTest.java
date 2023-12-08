package d3;

import java.util.Stack;

public class ParTest {
    // 메서드 추출 형태
    public static boolean test(String target) {
        Stack<Character> charStack = new Stack<>();
        // 1. target의 각 글자를 확인한다.
        for (int i = 0; i < target.length(); i++) {
            char next = target.charAt(i);
            // 2. 여는 괄호를 만나면 push
            if (next == '(') {
                charStack.push(next);
            }
            // 3. 닫는 괄호를 만나면, 상황에 따라 pop을 하는데,
            else {
                // 3-1. stack이 비어있다 == 정당한 괄호가 아니다.
                if (charStack.empty()) {
                    // 결과는 false다
                    return false;
                }
                // 3-2. stack이 비어있지 않으면 pop
                else charStack.pop();
            }
        }
        // 4. 문자열 내부 글자를 다 확인했으면, 스택이 비어있는지가 답이다.
        return charStack.empty();
    }

}
