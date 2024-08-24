import java.util.Scanner;

public class prime_number {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The Number Of Prime Limit : ");
        int b = scanner.nextInt();
        int number = 0;
        for (int i = 1; i <= b; i++) {
            if (2 % i != 0 || 3 % i != 0 || 5 % i != 0 || 7 % i!= 0 || 9 % i != 0 || 11 % i != 0 ||
                    (i == 2 && i == 3 && i == 5 && i == 7 && i == 9 &&
                    i != 11)) {
//                System.out.println(i);
                number = number+i;
            }
            else {
            }
        }
        System.out.println(number);
    }
}
