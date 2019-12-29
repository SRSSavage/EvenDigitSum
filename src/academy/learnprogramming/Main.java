package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumEvenDigits(23222));
    }

    public static int sumEvenDigits(int number){
        if(number < 0){
            return -1;
        }

        int x;
        int y = 0;

        while (number > 0){
            x = number % 10;
            if(x % 2 == 0){
                y = x + y;
            }
            number /= 10;
        }
        return y;
    }
}
