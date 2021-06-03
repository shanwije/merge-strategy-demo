import com.google.gson.JsonObject;

public class Main {
    public static void main(String[] args) {

        JsonObject leftJsonObj = new JsonObject();
        JsonObject rightJsonObj = new JsonObject();

        MergeInput mergeInput = new MergeInput(leftJsonObj, rightJsonObj);

        Attribute attribute = new Attribute("array", null, "append_start");
        attribute.mergeAttribute(mergeInput);
    }
}
