import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number to generate Series");
        try {
            int number = Integer.parseInt(bufferedReader.readLine());
            SeriesGenerator seriesGenerator = new SeriesGenerator(number);
            int[] fiboseries = fiboseries = seriesGenerator.generateSeries();
            for (int i = 0; i < fiboseries.length; i++) {
                System.out.println(i + "th fibonacci number is : " + fiboseries[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
