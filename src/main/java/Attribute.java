import com.google.gson.JsonObject;

public class Attribute {
    private String type;
    private String format;
    private MergeStrategy strategy;


    public Attribute( String type, String format, String strategy) {
        this.type = type;
        this.format = format;
        this.strategy = MergeStrategyFactory.getStrategy(type, format, strategy);
    }

    public String mergeAttribute(JsonObject leftJsonObj, JsonObject rightJsonObj) {
        return strategy.merge(leftJsonObj, rightJsonObj);
    }
}


//01 json, 02 json, 03 json
//
//        -> default_merge.json
//
//
//        {
//            path_1 : attribute_1,
//            path_2 : attribute_2
//        }
//
//
//
//
//apply default merge
//go one by one for each attributes
