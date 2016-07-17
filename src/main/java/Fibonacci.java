public class Fibonacci {
    private int number;

    public Fibonacci(int number) {
        this.number = number;
    }

    public int getNumber() {
        int fibo[] = new int[number+2];
        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i <= number; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        return fibo[number];

    }
}
