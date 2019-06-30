import java.util.Arrays;
import java.util.LinkedList;

public class TestCases {
    public static void main(String[] args) {
        CollectionsExamples examples = new CollectionsExamples();
        test(1, Arrays.asList("dog", "cat", "monkey").equals(CollectionsExamples.assignment1()));
        test(2, CollectionsExamples.indexOfElement(
                new LinkedList<>(Arrays.asList("dog", "cat", "kiwi")), "kiwi") == 2);
        test(3, Arrays.asList(2,3,4).equals(
                CollectionsExamples.getIntegerList(new int[]{2,3,4} )));
        test(4, Arrays.asList(21,4,3,2,-5).equals(
                CollectionsExamples.sortInTheReverseOrder(
                        new LinkedList<>(Arrays.asList(3,2,4,21,-5)))));
    }
    private static void test(int assignmentNumber, boolean result) {
        if (result)
            System.out.println("You have answered assignment number "
                + assignmentNumber + " correct. Well done!!!");
        else
            System.out.println("Please re-check assignment number " + assignmentNumber);
    }
}
