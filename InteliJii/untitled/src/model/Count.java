package model;

public class Count {

    // TODO to do diagram e.g.
    // TODO null checker, and exception handling

    // count how many of the items are equals or bigger than 2
    public int countElement(int[] array) {
        int counter = 0;
        // index starts with 0!!!
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 2) {
                counter = counter + 1;
            }
        }
        return counter;
    }

    public int countElementForEach(int[] array) {
        int counter = 0;
        // index starts with 0!!!
        for (int j : array) {
            if (j >= 2) {
                counter = counter + 1; // 0 + 1 as first iteration!
            }
        }
        return counter;
    }

    public int countElementForEachSecond(int[] array) {
        int counter = 0;
        // index starts with 0!!!
        for (int j : array) {
            if (j >= 2) {
                counter += 1; // 0 + 1 // 0 + 1 as first iteration!
            }
        }
        return counter;
    }

    public int countElementForEachThird(int[] array) {
        int counter = 0;
        // index starts with 0!!!
        for (int j : array) {
            if (j >= 2) {
                counter++; // 0 + 1 as first iteration!
            }
        }
        return counter;
    }

    public int countElementForEachCanItBe(int[] array) {
        int counter = 0;
        // index starts with 0!!!
        for (int j : array) {
            if (j >= 2) {
                ++counter;
            }
        }
        return counter;
    }
}
