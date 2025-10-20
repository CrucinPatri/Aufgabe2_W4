public class Main {
    public static void main(String[] args) {
        int[] numbers = {4, 8 , 3, 10, 17};

        FindMaximum find_maximum = new FindMaximum();
        System.out.println("Maximum: " + find_maximum.do_max(numbers));

        FindMinimum find_minimum = new FindMinimum();
        System.out.println("Minimum: " + find_minimum.findMinimum(numbers));
    }
}
