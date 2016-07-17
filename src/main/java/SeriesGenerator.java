public class SeriesGenerator {
    private int[] fiboSeries;
    private int number;

    public SeriesGenerator(int number) {
        this.number = number;
        fiboSeries = new int[number];
    }

    public int[] generateSeries() {
        for (int i = 0; i < number; i++) {
            fiboSeries[i] = new Fibonacci(i).getNumber();
        }
        return fiboSeries;
    }
}
