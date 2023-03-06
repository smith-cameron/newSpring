
public class Test {
	public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("My name is Cameron");
        System.out.println("I am 35 years old");
        System.out.println("My hometown is Julian, CA.");
        int ourInt;
        ourInt = 400;
        double pi = 3.14159265; 
        boolean myBool = true;
        char singleCharacter = 'A';
        String multipleCharacters = "ABC";

        boolean isRaining = false;
        boolean isCold = true;
        if(isRaining) {
            System.out.println("Bring an umbrella.");
        }
        else if(isCold) {
            System.out.println("Wear a coat.");
        }
        else {
            System.out.println("Have fun!");
        }

        int temperature = 85;
        boolean isCloudy = true;

        if(temperature < 40 && isCloudy){
            System.out.println("It might snow.");
        }else if(isCloudy){
            System.out.println("It might rain.");
        }else{
            System.out.println("We should have nice weather today.");
        }

        int day = 12;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("There are only seven days in a week...");
        }

        System.out.println(isRaining ? "Bring an umbrella" : "Have fun!");
        int goals = 3;
        boolean watchReplay = false;
    
        System.out.println("Are we watching this?");
    
        System.out.println(watchReplay ? "I'll see you in a bit." : "I'll pass.");
        switch(goals){
            case 0:
            System.out.println("Sounds like a boring game.");
                break;
            case 1:
            System.out.println("Was it a good goal?");
            watchReplay = true;
                break;
            case 2:
            System.out.println("Was it a tie?");
            watchReplay = true;
                break;
            case 3:
            System.out.println("I can't wait to see it!");
            watchReplay = true;
                break;
            default:
            System.out.println("More than 3 goals? I'm in!");
            watchReplay = true;
        }
    
	}
}