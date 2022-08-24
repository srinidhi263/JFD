import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component 
public class Calculation {

    @Autowired
    private Menu menu;
    Scanner sc = new Scanner(System.in);

    public int add() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println( "Addition result" + c);
        return 0;

    }

    public int sub() {
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int g = e - d;
        System.out.println("Subtraction result " + g);
        return 0;
    }

    public int mul() {
        int h = sc.nextInt();
        int i = sc.nextInt();
        int j = h * i;
        System.out.println("Multiplication result " + j);
        return 0;
    }

    public int div() {
        int k = sc.nextInt();
        int l = sc.nextInt();
        int m = k/l;
        System.out.println("Division result " + m);
        return 0;

    }

}
