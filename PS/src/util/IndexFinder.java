package util;

import java.util.List;

public class IndexFinder {
    private final List<Integer> integers;

    private int maxIndex;
    private int minIndex;

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

    public int getMaxIndex() {
        return maxIndex;
    }

    public int getMinIndex() {
        return minIndex;
    }

    public int addIndex() {
        return maxIndex + minIndex;
    }
}
