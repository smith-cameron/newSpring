public class AlfredQuotes {
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        // String output = String.format("Hello, %s it's lovely to see you. How are you?", name);
        // System.out.println(output);
        // System.out.printf("Hello, %s it's lovely to see you. How are you?\n", name);
        return String.format("Hello, %s it's lovely to see you. How are you?", name);
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        return "placeholder for date announcement return string";
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        return "for snarky response return string";
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}
