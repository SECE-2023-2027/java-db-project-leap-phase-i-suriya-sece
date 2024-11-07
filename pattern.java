import java.util.Scanner;

public class pattern {
    public static void main(String args[])
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = reader.nextInt();
        for(int i =1;i<=n;i++)
        {
            for(int j =0;j<n;j++)
            {
            System.out.print(i+j + " ");
            }
            System.out.println();
        }

    }
}
