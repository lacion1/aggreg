package aggregate;

public class AvgAggregator <T1> implements Aggregator<Double, Double> {

    @Override
    public Double aggregate(Double[] items) {
        double sum = 0;
       for(int i = 0;i < items.length;i++){
           sum += items[i];
       }sum = sum / items.length;
        return sum;
    }


}
