public interface MergeStrategy {


    public String merge();

    MergeStrategy arrayAppendStart = () -> "array append start merge logic here";
    MergeStrategy arrayAppendEnd = () -> "array append end merge logic here";
}
