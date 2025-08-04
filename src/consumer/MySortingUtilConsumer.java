package consumer;

import sorting.MySortingUtil;

import java.util.List;
import java.util.logging.Logger;

public class MySortingUtilConsumer {
    private static Logger logger = Logger.getLogger(MySortingUtilConsumer.class.getName());

    public static void main(String[] args) {
        MySortingUtil mySortingUtil = new MySortingUtil();
        List<String> sorted = mySortingUtil.sort(List.of("louise", "pepsi"));

        logger.info(sorted.toString());
    }
}
