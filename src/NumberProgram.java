public class NumberProgram { //Iteration 3

    public static void main(String[] args) {
        int[] values = {3, 7, 2, 9, 4};

        int result = findResult(values);

        System.out.println("Result: " + result);
    }

    public static int findResult(int[] values) {
        if (values.length == 0) { //Test for empty arrays
            return Integer.MIN_VALUE;
        }

        int max = values[0]; //Assigns first value from array.

        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }

        return max;
    }
}