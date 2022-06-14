package Main.Extras;

public class BacteriaData implements Comparable {
    String code;
    String Type;
    String description;
    int size;

    public BacteriaData(String code, String type, String description, int size) {
        this.code = code;
        Type = type;
        this.description = description;
        this.size = size;
    }

    @Override
    public int compareTo(Object o) {
        BacteriaData a = (BacteriaData) o;
        return code.compareTo(a.code);
    }
}
