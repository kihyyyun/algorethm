package d5;

import java.io.BufferedReader;


import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //질문 횟수 받기
        int tries = Integer.parseInt(reader.readLine());
        // 각 질문에 재한 답변을 저장하는 2차원 배열
        // countInfo[i][0] == i 번째 질문의 숫자
        // countInfo[i][1] == i 번째 질문의 스트라이크
        // countInfo[i][2] == i 번째 질문의 볼
        int[][] countInfo = new int[tries][3];
        //입력을 받는다.
        for (int i = 0; i < tries; i++) {
          String[] info =reader.readLine().split(" ");
            countInfo[i][0] =Integer.parseInt(info[0]);
            countInfo[i][1] =Integer.parseInt(info[1]);
            countInfo[i][2] =Integer.parseInt(info[2]);
        }

        //만들 수 있는 모든 숫자의 순열을 만든다.
        //1~9 숫자 중 3개를 골라 나열한다 (중복없이)
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(i==j)continue;
                for (int k = 0; k < 10; k++) {
                    if(i==k ||j==k){
                        continue;
                    }
                    System.out.println(i+ " " +j +" " + k);
                }
            }
        }

    }
}
