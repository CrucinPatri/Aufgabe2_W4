public class TotalMinSum {
    public int do_minsum(int[] numbers) {
        TotalSum TotalSum = new TotalSum();
        FindMaximum FindMaximum = new FindMaximum();

        int totalSum = TotalSum.do_sum(numbers);
        int max = FindMaximum.do_max(numbers);

        return totalSum - max;
    }
}
