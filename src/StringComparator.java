import java.util.*;


public class StringComparator implements Comparator<String> {
    private static final String NUMBER_PATTERN = "(-?\\d+\\.\\d+)|(-?\\.\\d+)|(-?\\d+)";
    private static final String SPLITTING_PATTERN = "\\t";

    public int compare(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return 0;
        }

        List<String> split1 = split(str1);
        List<String> split2 = split(str2);
        int diff = 0;

        for (int i = 0; diff == 0 && i < split1.size() && i < split2.size(); i++) {
            String token1 = split1.get(i).trim();
            String token2 = split2.get(i).trim();

            if (token1.matches(NUMBER_PATTERN) && token2.matches(NUMBER_PATTERN)) {
                diff = (int) (Double.parseDouble(token1) - Double.parseDouble(token2));
            } else {
                diff = token1.compareToIgnoreCase(token2);
            }
        }

        return diff;
    }

    /**
     * Splits a string into tokens.
     *
     * @param s String to split.
     * @return List of tokens.
     */
    private List<String> split(String s) {
        return Arrays.asList(s.split(SPLITTING_PATTERN));
    }


}
