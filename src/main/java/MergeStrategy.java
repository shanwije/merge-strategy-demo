import com.google.gson.JsonObject;

public interface MergeStrategy {


    public String merge(JsonObject leftJsonObj, JsonObject rightJsonObj);

    MergeStrategy arrayAppendStart = (JsonObject leftJsonObj, JsonObject rightJsonObj) -> "array append start merge logic here";
    MergeStrategy arrayAppendEnd = (JsonObject leftJsonObj, JsonObject rightJsonObj) -> "array append end merge logic here";
}
