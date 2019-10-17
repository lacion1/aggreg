package aggregate;

public class SumAggregator <T1> implements Aggregator<Integer, Integer> {

    @Override
    public Integer aggregate(Integer[] items) {
        int sum = 0;
        for (int i = 0;i < items.length;i++){
            sum += items[i];
        }
        return sum;
    }
}
