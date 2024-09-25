package basico;

public class StringEx {

    public static void main(String[] args) {
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("Length of the txt String: " + txt.length());

        String helloWorld = "Hello, World!";
        System.out.println(helloWorld.toLowerCase());
        System.out.println(helloWorld.toUpperCase());

        // indexOf return the position of a specific text in a string
        String stringIndexOf = "Please locate where 'locate' occurs!";
        System.out.println(stringIndexOf.indexOf("locate"));
        
        // Concat
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));

        // Special Character
        String specialString = "We are the so-Called \"Vikinks\" form north";
        System.out.println(specialString);
        String special2String = "It\'s alright.";
        System.out.println(special2String);
        String special3String = "The Character \\ is called backslash.";
        System.out.println(special3String);

    }
}
