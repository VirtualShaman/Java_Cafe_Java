public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffePrice = 3.5;
        double lattePrice = 3.5;
        double cappuccinoPrice = 3.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;

        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here **
        if( isReadyOrder1 ){
            System.out.println(generalGreeting + customer1 + readyMessage);
        } else {
            System.out.println(generalGreeting + customer1 + pendingMessage);
        }

        if( isReadyOrder1 ){
            System.out.println(generalGreeting + customer4 + readyMessage + ", " + displayTotalMessage + cappuccinoPrice);
        } else {
            System.out.println(generalGreeting + customer4 + pendingMessage);
        }

        if( isReadyOrder1 ){
            System.out.println(generalGreeting + customer2 + ", " + displayTotalMessage + (lattePrice + lattePrice) + readyMessage);
        } else {
            System.out.println(generalGreeting + customer2 + ", " + displayTotalMessage + (lattePrice + lattePrice) + pendingMessage);
        }

        System.out.println(customer3 + ", " + displayTotalMessage + (lattePrice - dripCoffePrice));
    }
}
