import java.util.Scanner;

public class sum_even_number {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The Number Of Even Limit : ");
        int b = scanner.nextInt();
        int number = 0;

        for(int i=0; i<=b; i++)
        {
            if(i%2==0)
            {
                number=number+i;
            }
        }
                System.out.println("Even Number Only Add = "+number);
    }
}
//WAP TO FIND THE SUM OF EVEN NUMBERS FROM 1 TO N USING RECURSION.