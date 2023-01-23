// Fib using recursion


public class Main {

    static int fib(int n) {
        // Function calls on itself until n is less than 2 and adds up answers
        if (n < 2)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
       // Calls fib recursive funtion and returns 10th Fibbonacci sequence which should be: 55
        System.out.printf("The 10th term of the Fibonacci sequence is %d", fib(10));
    }
}