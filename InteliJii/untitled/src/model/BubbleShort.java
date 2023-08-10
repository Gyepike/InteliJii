package model;


//    https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html
public class BubbleShort {


    public void bubbleShort(int[] array) {
        int swap=0;
        for(int i= 0; i < array.length; i++) {
            for(int j= 0; j < array.length-1; j++) {
                if (array[j] < array[j+1]) {
                   swap = array[j+1];    // swap 
                    array[j+1] = array[j];
                    array[j] = swap;
                }
            }
        }


        for(int i= 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
