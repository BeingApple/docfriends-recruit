package util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberExtractor {
    private static final Pattern pattern = Pattern.compile("[0-9]+");
    private final Matcher matcher;

    public NumberExtractor(String inputString) {
        this.matcher = pattern.matcher(inputString);
    }

    public List<Integer> getNumbers() {
        List<Integer> integerList = new ArrayList<>();

        while (this.matcher.find()) {
            integerList.add(Integer.parseInt(this.matcher.group()));
        }

        return integerList;
    }
}
