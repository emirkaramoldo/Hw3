public class Main {
    public static void main(String[] args) {
        double[] numbers = {3,-6, 9, -12, 15, -18, 21, -24, 27, -30, 33, -36, 39, -42, 45};
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
        System.out.println(amount/sum);
    }
}

