package model;

public class Sum {

    // as we want a return value, int is a better to return instead of void!!!

    // sum if it is even /páros/ (odd is páratlan)
    public void sumOfNums(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum = sum + array[i];
            }
        }
        System.out.println(sum);
    }

    public void sumOfNumsForEach(int[] array) {
        int sum = 0;

        for (int j : array) {
            if (j % 2 == 0) {
                sum = sum + j;
            }
        }
        System.out.println(sum);
    }

    public int sumOfNumsForEachExtra(int[] array) {
        int sum = 0;

        for (int j : array) {
            if (j % 2 == 0) {
                sum += j;
            }
        }
        return sum;
    }
}
