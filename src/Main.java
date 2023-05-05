public class Main {
    public static void main(String[] args) {
        double[] numbers = {3.1,-6.2, 9.3, -12.4, 15.5, -18.6, 21.7, -24.8, 27.9, -30.1, 33.2, -36.3, 39.4, -42.5, 45.6};
        double sum = 0;
        int amount = 0;
        boolean isNegative = false;
        for (double num:numbers
             ) {
            if (num < 0){
            isNegative = true;
            continue;
            }
            else if (!(num > 0 && isNegative));{
                sum += num;
                amount ++;
            }
        }
        System.out.println(sum);
        System.out.println(amount);
        System.out.println(sum/amount);
    }
}

