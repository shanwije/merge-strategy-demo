import com.google.gson.JsonObject;
import lombok.*;

@Data
public class MergeInput {
    private JsonObject leftJsonObj;
    private JsonObject rightJsonObj;
    private String format;

    public MergeInput(JsonObject leftJsonObj, JsonObject rightJsonObj) {
        this.leftJsonObj = leftJsonObj;
        this.rightJsonObj = rightJsonObj;
    }
}
