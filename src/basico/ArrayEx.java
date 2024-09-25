package basico;

public class ArrayEx {
    public static void main(String[] args) {

        // An array storing different ages
        int ages[] = {20, 30, 40, 50, 46, 87, 70};

        float avg, sum = 0;

        // Get the length of the array
        int length = ages.length;

        // loop through the elements of the array
        for (int age : ages) {
            sum += age;
        }

        // Calculate the average by dividing the sum by the length
        avg = sum / length;

        // Print the average
        System.out.println("The average age is: " + avg);

        // An array storing different ages
        int ages2[] = {20, 22, 18, 35, 48, 26, 87, 70};

        float avg2, sum2 = 0;

        // Get the length of the array
        int length2 = ages2.length;

        // Create a lowest age variable and assign the first array element of ages to it
        int lowestAge = ages2[0];

        // Loop through the elements of the ages array to find the lowest age
        for (int age : ages2) {
            // Check if the current age is smaller than the current 'lowest age'
            if(lowestAge > age) {
                // if smaller age is found, update 'lowest age' with that element
                lowestAge = age;
            }
        }

        System.out.println("The lowest age in the array is: " + lowestAge);

    }
}
