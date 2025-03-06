public class SimpleCal {
    // Addition.java

        // Function to add two numbers
        public static int addNumbers(int a, int b) {
            return a + b;
        }

    // Function to substract two numbers
    public static int subNumbers(int a, int b) {
        return a - b;
    }

        public static void main(String[] args) {
            int num1 = 5;
            int num2 = 3;

            // Call the addNumbers function and print the result
            int result = addNumbers(num1, num2);
            System.out.println("The sum of " + num1 + " and " + num2 + " is " + result);
        }

}
