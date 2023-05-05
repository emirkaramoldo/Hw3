import java.util.Arrays;

public class Main {
    public static void selectionSort(double[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int pos = i;
            int min = (int) numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < min) {
                    pos = j;
                    min = (int) numbers[j];
                }
            }
            System.out.print(Arrays.toString(numbers) + "\n");
            numbers[pos] = numbers[i];
            numbers[i] = min;
        }
    }
    public static void main(String[] args) {
        double[] numbers = {3.1, -6.2, 9.3, -12.4, 15.5, -18.6, 21.7, -24.8, 27.9, -30.1, 33.2, -36.3, 39.4, -42.5, 45.6};
        double sum = 0;
        int amount = 0;
        boolean isNegative = false;
        for (double num : numbers
        ) {
            if (num < 0) {
                isNegative = true;
                continue;
            } else if (!(num > 0 && isNegative)) ;
            {
                sum += num;
                amount++;
            }
        }
        System.out.println("Сумма чисел: " + sum);
        System.out.println("Количество чисел: " + amount);
        System.out.println("Среднее арифметическое: " + sum / amount);
        //selectionSort(numbers);//
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}