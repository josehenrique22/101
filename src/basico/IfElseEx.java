package basico;

public class IfElseEx {
    
    public static void main(String[] args) {
        
        int time = 22;
        if (time < 10) {
            // block of code to be executed if condition1 is true
            System.out.println("Good Morning");
        } else if (time < 18) {
            // block of code to be executed if the condition1 is false and condition2 is true
            System.out.println("Good Day");
        } else {
            // block of code to be executed if the condition1 is false and condition2 is false
            System.out.println("Good evening");
        }

        // Ternary (ShortHand)
        // variable = (condition) ? expressionTrue :  expressionFalse;
        // Simpy version

        int time2 = 20;
        String result = (time2 < 18) ? "Good Day" : "Good Evening";
        System.out.println(result);

        int doorCase = 1337;
        if (doorCase == 1337) {
            System.out.println("Correct code. The door is now open.");
        } else {
            System.out.println("Wrong code. The door remains closed.");
        }

        int myNum = 10;
        if (myNum > 0) {
            System.out.println("myNum is a positive Number");
        } else if (myNum < 0) {
            System.out.println("My num is a negative Number");
        } else {
            System.out.println("myNum is 0");
        }
        
        int myAge = 25;
        int votingAge = 18;
        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enougt to vote!");
        }

        int myNumExponential = 5;
        if (myNumExponential % 2 == 0){
            System.out.println(myNumExponential + " is even");
        } else {
            System.out.println(myNumExponential + " is odd");
        }
    }
}
