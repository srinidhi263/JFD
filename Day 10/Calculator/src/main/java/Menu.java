import org.springframework.stereotype.Component;

@Component
public class Menu {
    public void displayMenu() {
        System.out.println("1.Add,2.sub,3.mul,4.div");
    }
}
