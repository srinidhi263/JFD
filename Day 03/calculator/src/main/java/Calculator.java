import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {

    public int add() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int addResult = a + b;
        System.out.println("addition result =" + addResult);

        return 0;
    }


    public int sub() {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int subResult = a - b;
        System.out.println("sub result = " + subResult);
        return 0;

    }


    public int mul() {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int mulResult = a * b;
        System.out.println("multiplication result = " + mulResult);

        return 0;
    }


    public int div() {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int divResult = a / b;
        System.out.println(" division result = " + divResult);

        return 0;
    }


    public int mod() {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int modResult = a % b;
        System.out.println("modulus result = " + modResult);

        return 0;
    }
}



