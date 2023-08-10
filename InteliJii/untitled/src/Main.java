import model.*;

public class Main {
    public static void main(String[] args) {

        Sum sum = new Sum();

        int[] nums = {-100, 3, 6, 3, 1, 12, -10, 4, 8}; // index 0,1,2
        new BubbleShort().bubbleShort(nums);


       // System.out.println(new Decision().decision(nums, 3));
        System.out.println(new Decision().decisionSuggestion(nums, 14));

        // int result = new Count().countElementForEachCanItBe(nums);
         //System.out.println(result);

        //int result = sum.sumOfNumsForEachExtra(nums);
        //System.out.println(result);
       // sum.sumOfNums(nums);
        //sum.sumOfNumsForEach(nums);

    }
}