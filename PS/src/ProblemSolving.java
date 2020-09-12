import util.IndexFinder;
import util.NumberExtractor;

import java.util.List;

public class ProblemSolving {
    public static void main(String[] args) {
        NumberExtractor numberExtractor = new NumberExtractor("ab23c4d56e78f9g12h34i5j12k45l67n89m99o1k123p456q567r768s890t67u456v345w234x23y239z");
        List<Integer> integers = numberExtractor.getNumbers();

        IndexFinder indexFinder = new IndexFinder(integers);
        System.out.println("maxIndex : "+indexFinder.getMaxIndex());
        System.out.println("minIndex : "+indexFinder.getMinIndex());
        System.out.println("addIndexes : "+indexFinder.addIndex());
    }
}
