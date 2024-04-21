package ushtrimi7;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(13));
    }

    static int fibo(int index){
        int first = 0;
        int second = 1;
        int third = 0;
        for (int i = 0 ; i < index ; i++){
            third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
}
