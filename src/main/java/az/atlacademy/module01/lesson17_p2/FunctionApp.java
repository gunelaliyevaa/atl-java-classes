package az.atlacademy.module01.lesson17_p2;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Function;

public class FunctionApp {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        Function<List<Integer>, IntSummaryStatistics> statisticsFunction = new Function<List<Integer>, IntSummaryStatistics>() {
            @Override
            public IntSummaryStatistics apply(List<Integer> list) {
                IntSummaryStatistics statistics = new IntSummaryStatistics();

                for (Integer number : list) {
                    statistics.accept(number);
                }
                return statistics;
            }
        };

        integerList.add(23);
        integerList.add(3);
        integerList.add(100);
        System.out.println(statisticsFunction.apply(integerList));
    }

}
