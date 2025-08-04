package consumer;

import sorting.MySortingUtil;
import sorting.algorithm.BubbleSort;

import java.util.List;
import java.util.logging.Logger;

public class DirectConsumer {
    private static Logger logger = Logger.getLogger(DirectConsumer.class.getName());

    public static void main(String[] args) {
        BubbleSort mySortingUtil = new BubbleSort();
        List<String> sorted = mySortingUtil.sort(List.of("louise", "pepsi"));

        logger.info(sorted.toString());
    }
}
