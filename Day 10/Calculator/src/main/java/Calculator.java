import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class Calculator {


    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(Calculation.class, args);
        Menu menu = applicationContext.getBean(Menu.class);

        menu.displayMenu();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();
        Calculation calculation = applicationContext.getBean(Calculation.class);
        if (choice == 1) {
            int addResult = calculation.add();
            System.out.println(addResult);
        } else if (choice == 2) {

            int subResult = calculation.sub();
            System.out.println(subResult);
        } else if (choice == 3) {

            int mulResult = calculation.mul();
            System.out.println(mulResult);
        } else if (choice == 4) {

            int divResult = calculation.div();
            System.out.println(divResult);
        } else {
            System.out.println("Invalid choice");
        }
    }
}