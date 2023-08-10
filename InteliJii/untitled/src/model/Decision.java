package model;

/*
Az eldöntés egy egyszerű algoritmus, amellyel eldönthetjük, hogy egy véges (nem feltétlenül numerikus) sorozat –
vagy számítástechnikai szóhasználattal élve egy tömb – elemei között található-e T tulajdonságú elem.
T egy tetszőleges tulajdonságfüggvényt jelent, egy sorozatbeli elemre nézve lehet igaz vagy hamis.
    https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html
 */
public class Decision {

    public boolean decision(int[] array, int findValue) {
        int pos = 0;

        for (int j : array) {
            pos++;
            if (j == findValue) {
                System.out.println("A tomben megtalahato  az "+ findValue+ " ertek a tomb poziciojaban:" + pos );
                return true;
            }
        }
        return false;
    }
    public boolean decisionSuggestion(int[] arr, int value) {
        boolean found = false;
        for (int num : arr) {
            found = num == value || found;
        }
        return found;
    }
}