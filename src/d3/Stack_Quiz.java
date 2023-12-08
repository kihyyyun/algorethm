package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack_Quiz {

    public static boolean isVPS(String line) {
        // 각 글자 중 열린 괄호를 담을 스택을 만든다.
        Stack<Character> charStack = new Stack<>();

        // 입력받은 문자열의 각 글자를 순회한다.
        for (int i = 0; i < line.length(); i++) {
            char letter = line.charAt(i);
            // 만약 글자가 열린 괄호('(')라면 스택에 푸시
            if(letter== '('){
                charStack.push(letter);
            }
            // 아니라면 닫힌 괄호(')')이다.
            else {
                // 스택이 비었다면 false 반환한다.
                if(charStack.empty()){
                    return false;
                }// 비지 않았다면 pop
                else {
                    charStack.pop();
                }
            }
        }

        // 순회 종료
        // 스택이 비었는지 확인하고 반환한다.
        return charStack.empty();
    }

    public static void main(String[] args) throws IOException {
//        System.out.println(isVPS("(())())"));
//        System.out.println(isVPS("(((()())()"));
//        System.out.println(isVPS("(()())((()))"));


        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        int tests =Integer.parseInt(reader.readLine());


        //테스트 케이스의 갯수만큼 반복
        for(int i = 0; i <tests; i++){
            if(isVPS(reader.readLine())){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
