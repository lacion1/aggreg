package aggregate;

public class CountAggregator<T1>implements Aggregator<Integer,T1> {
    @Override
    public Integer aggregate(T1[] items) {
        return items.length;
    }
}
