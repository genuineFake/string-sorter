import java.util.Comparator;
import java.util.List;

/**
 * Sorts a collection.
 */
public class StringSorter {
    private Comparator<String> stringComparator;

    public StringSorter() {
        stringComparator = new StringComparator();
    }

    public List<String> sortStrings(List<String> list) {
        list.sort(stringComparator);
        return list;
    }
}
