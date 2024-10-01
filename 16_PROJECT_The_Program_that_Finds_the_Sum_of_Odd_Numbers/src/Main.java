import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number;
        int total = 0 ;

        while (true) {
            System.out.print("Please, enter any number: ");
            number = scan.nextInt();

            if (number > 0 && number % 2 != 0 ) {
                total += number ;

            } else if (number < 0){
                System.out.println("you have finished the cycle , the result is "+ total);
                break;
            }
        }

    }
}