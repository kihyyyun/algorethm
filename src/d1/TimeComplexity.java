package d1;

public class TimeComplexity {

    public  static  int sumUntiln(int n){
        int sum = 0;
        //1부터 n 까지 모든 자연수를 확인하며

        for (int i = 1; i < n + 1; i++) {
                sum+=1;
        }
        return sum;
    }


    //n * (n +1 ) // 2를 하면 1 부터 n 까지의 자연수를
    //합한것과 동일하다!


    public static int sumUntiln2(int n){
        return  n * (n+1)/2;
    }


    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println(sumUntiln(10));
        System.out.println(sumUntiln2(1000));
        long entime = System.nanoTime();
        System.out.println("총 걸린 시간(ns):" +(entime - startTime));
    }


}


