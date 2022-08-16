import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.displayMenu();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice: ");
        int choice = sc.nextInt();

        Calculator calculator = new Calculator();
        if (choice > 0 && choice < 5) {
            switch (choice) {
                case 0:
                    int addResult = calculator.add();
                    break;
                case 1:
                    int subResult = calculator.sub();
                    break;
                case 2:
                    int mulResult = calculator.mul();
                    break;
                case 3:
                    int divResult = calculator.div();
                    break;
                case 4:

                    int modResult = calculator.mod();
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("Error");
        }
    }
}
