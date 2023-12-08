package d4;

public class MyCyQueue {
    // 크기를 4로 먼저 만들어보자.
    private int size = 4;
    // 실제로 만들 배열의 크기는 size + 1
    private int offset = size + 1;
    // 데이터를 담기위한 배열
    private int[] arr = new int[offset];
    // 앞쪽과 뒤쪽 데이터를 구분하기 위한 front와 rear
    private int front = 0;
    private int rear = 0;

    //데이터를 넣기 위한 enqueque

    public  void enQueue(int x) {
        arr[rear] = x;
        //위치 재설정
        rear = (rear+1) % offset;
    }

    //데이터를 빼기 위한 deQueue

    public int deQueue(){
        //현재 위치의 값을 회수
        int value = arr[front];
        //위치 재설정
        front = (front +1) % offset;
        return value;
    }

    //큐가 비어있는지 확인하기 위한 isEmpty()
    public boolean isEmpty(){
        return this.rear == this.front;
    }

}
