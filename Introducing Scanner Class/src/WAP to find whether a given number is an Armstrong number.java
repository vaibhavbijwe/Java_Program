import java.util.*;
public class a4 {

    public static void main(String[] args) {

        int n, temp, rem, result = 0;
        System.out.println("Enter a No");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        

        temp = n;

        while (temp != 0)
        {
            rem = temp % 10;
            result += Math.pow(rem, 3);
            temp /= 10;
        }

        if(result == n)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    }
}