package aggregate;

public class MaxAggregator<T extends Comparable<? super T>> implements Aggregator<T, T> {

    @Override
    public T aggregate(T[] items) {
        T max = items[0];
        for (int i = 1; i < items.length; i++) {
            if (max.compareTo(items[i]) < 0) {
                max = items[i];
            }
        }
        return max;
    }
}
