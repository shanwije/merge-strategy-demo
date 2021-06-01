public class MergeStrategyFactory {
    public static MergeStrategy getStrategy(String type, String format, String strategy) {

        // long switch statement here
        // default throw an exception when, not any of the switch cases matches received combination of type, format and strategy;
        return MergeStrategy.arrayAppendStart;
    }
}
