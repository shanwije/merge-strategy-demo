import com.google.gson.JsonObject;

public interface MergeStrategy {


    public String merge(MergeInput mergeInput);

    MergeStrategy arrayAppendStart = (MergeInput) -> "array append start merge logic here";
    MergeStrategy arrayAppendEnd = (MergeInput) -> "array append end merge logic here";
}
