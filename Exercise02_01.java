public class Exercise02_01 {
    // Main Method
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        // Enter a miles
        System.out.println("Enter a miles: ");
        double miles = input.nextDouble();

        // Convert it to kilometers
        double kilometers = miles * 1.6;

        System.out.println(miles + " miles is " + kilometers + " kilometers ");
    }
}
