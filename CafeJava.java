
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;

public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        Scanner terminalInput = new Scanner(System.in);
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = "Your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 2;
        double latte = 5.5;
        double cappucino = 4.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindy";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
        
        // Orders?
        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        
        System.out.println("Please input your name...");
        String customerName = terminalInput.nextLine();
        System.out.println(generalGreeting + customerName); 
        boolean orderStatus = false;
        double orderTotal = 0.0;
        switch (customerName) {
            case "Cindy":
                orderStatus = isReadyOrder1;
                orderTotal = dripCoffee;
                break;
            case "Sam":
                orderStatus = isReadyOrder2;
                orderTotal = latte*2;
                break;
            case "Jimmy":
                orderStatus = isReadyOrder3;
                orderTotal = latte - dripCoffee;
                break;
            case "Noah":
                orderStatus = isReadyOrder4;
                orderTotal = cappucino;
                break;
            default:
            System.out.println("Please either be Cindy, Sam, Jimmy or Noah... we can only serve people with those names.");
                break;
        }
        
        System.out.println(orderStatus ? readyMessage + displayTotalMessage + orderTotal : pendingMessage);
        
    }
}
