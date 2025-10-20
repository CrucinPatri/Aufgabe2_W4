public class TotalMaxSum {
    public int do_maxsum(int[] numbers) {
        TotalSum TotalSum = new TotalSum();
        FindMinimum FindMinimum = new FindMinimum();

        int totalSum = TotalSum.do_sum(numbers);
        int min = FindMinimum.findMinimum(numbers);

        return totalSum - min;
    }
}
