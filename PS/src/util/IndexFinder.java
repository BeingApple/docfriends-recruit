package util;

import java.util.List;

public class IndexFinder {
    private List<Integer> integers;

    private Integer maxIndex;
    private Integer minIndex;

    public IndexFinder(List<Integer> integers) {
        this.integers = integers;
        this.setIndexes();
    }

    private void setIndexes() {
        int index = 0;

        int max = integers.get(0);
        int min = integers.get(0);;
        for(Integer number : this.integers) {
            if(number > max) {
                max = number;
                this.maxIndex = index;
            }

            if(number < min) {
                min = number;
                this.minIndex = index;
            }
            index++;
        }
    }

    public Integer getMaxIndex() {
        return maxIndex;
    }

    public Integer getMinIndex() {
        return minIndex;
    }
}
