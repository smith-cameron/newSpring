
public class Test {
	public static void main(String[] args) {
        // < sysout & primitive varaibles
        // System.out.println("Hello world!");
        // System.out.println("My name is Cameron");
        // System.out.println("I am 35 years old");
        // System.out.println("My hometown is Julian, CA.");
        int ourInt;
        ourInt = 400;
        // <>Comparisson Operators
        // System.out.println(ourInt == 45);
        // System.out.println(ourInt != 2);
        // System.out.println(ourInt > 6);
        // System.out.println(ourInt < 600);
        // System.out.println(ourInt >= 396);
        // System.out.println(ourInt >= 401);
        // System.out.println(ourInt == 400);
        double pi = 3.14159265; 
        boolean myBool = true;
        char singleCharacter = 'A';
        String multipleCharacters = "ABC";
        // ? .printf() example
            String name = "Cameron";
            double age = 35.5;
            String state = "CA";
            String city = "Julian";
            System.out.printf("Hello world! My name is %s. I am %.1f years old \nMy hometown is %s, %s.", name, age, city, myBool);
            // TODO Logical Operators
        // < Strings
        // String ninja = "Coding Dojo is Awesome!";
        // int length = ninja.length();
        // System.out.println( "String Length is : " + length );
        // String string1 = "My name is ";
        // String string2 = "Michael";
        // String string3 = string1.concat(string2);
        // System.out.println(string3);
        // String ninja = String.format("Hi %s, you owe me $%.2f !", "Jack", 25.0);
        // System.out.println(ninja);  
        // String ninja = "Welcome to Coding Dojo!";
        // int a = ninja.indexOf("Coding"); // a is 11
        // int b = ninja.indexOf("co"); // b is 3
        // int c = ninja.indexOf("pizza"); // c is -1, "pizza" is not found
        // String a = "HELLO";
        // String b = "world";
        // System.out.println(a.toLowerCase()); // hello
        // System.out.println(b.toUpperCase()); // WORLD
        // // Normal string assignment
        // String a = "same string";
        // String b = "same string";
        // System.out.println(a == b); // true
        // // Creating new strings as separate objects (another way to create a String)
        // a = new String("same letters");
        // b = new String("same letters");
        // System.out.println(a == b); // false. Not the same object in memory.
        // System.out.println(a.equals(b)); // true. same exact characters.
        // String a = new String( "Dojo" );
        // System.out.println( a == "Dojo" );
        // // surprisingly this will print out `false`
        // String a = new String( "Dojo" );
        // System.out.println( a.equals("Dojo") );
        // // this actually will print out `true`


        // boolean isRaining = false;
        // boolean isCold = true;
        // if(isRaining) {
        //     System.out.println("Bring an umbrella.");
        // }
        // else if(isCold) {
        //     System.out.println("Wear a coat.");
        // }
        // else {
        //     System.out.println("Have fun!");
        // }

        // int temperature = 85;
        // boolean isCloudy = true;

        // if(temperature < 40 && isCloudy){
        //     System.out.println("It might snow.");
        // }else if(isCloudy){
        //     System.out.println("It might rain.");
        // }else{
        //     System.out.println("We should have nice weather today.");
        // }

        // int day = 12;
        // switch(day){
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default:
        //         System.out.println("There are only seven days in a week...");
        // }

        // System.out.println(isRaining ? "Bring an umbrella" : "Have fun!");
        // int goals = 3;
        // boolean watchReplay = false;
    
        // System.out.println("Are we watching this?");
    
        // System.out.println(watchReplay ? "I'll see you in a bit." : "I'll pass.");
        // switch(goals){
        //     case 0:
        //     System.out.println("Sounds like a boring game.");
        //         break;
        //     case 1:
        //     System.out.println("Was it a good goal?");
        //     watchReplay = true;
        //         break;
        //     case 2:
        //     System.out.println("Was it a tie?");
        //     watchReplay = true;
        //         break;
        //     case 3:
        //     System.out.println("I can't wait to see it!");
        //     watchReplay = true;
        //         break;
        //     default:
        //     System.out.println("More than 3 goals? I'm in!");
        //     watchReplay = true;
        // }
    
	}
}