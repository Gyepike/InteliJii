import model.Book;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class BookStore {

    private static final String COMMA_DELIMITER = ";";
    // https://www.geeksforgeeks.org/sorting-custom-object-by-implementing-comparable-interface-in-java/
    ArrayList<Book> list;
    static String[] categories = new String[11];
    public BookStore() {
        list = new ArrayList();
    }
    public void add() {

        String line = "";
        String splitBy = ";";
        try {
            //parsing a CSV file into BufferedReader class constructor
            //BufferedReader br = new BufferedReader(new FileReader("d:\\InteliJi\\untitled\\src\\Book\\books.txt"));
            BufferedReader br = new BufferedReader(new FileReader(".\\src\\Book\\books.txt"));

            String[] book;

            while ((line = br.readLine()) != null)
            //returns a Boolean value
            {
                book = line.split(splitBy);
                //use comma as separator
                //System.out.println("BOOK[categoryNumber=" + book[0]+" "+ "Author=" + book[1] + "]");
                int categoryNumber = Integer.parseInt(book[0]);
                String Author = book[1];
                String title = book[2];
                String publisher = book[3];
                int year = Integer.parseInt(book[4]);
                String bookCode = book[5];

                Book one = new Book(categoryNumber, Author, title, year, publisher, bookCode);

                list.add(one);
            }


        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public void addCategory() {

        String line = "";
        String splitBy = ";";
        int index = 1;

        try {

            BufferedReader br = new BufferedReader(new FileReader(".\\src\\Book\\category.txt"));

            String[] categoryBook;

            while ((line = br.readLine()) != null) {

                categoryBook = line.split(splitBy);

                int categoryNumber = Integer.parseInt(categoryBook[0]);
                String category = categoryBook[1];


                categories[index] = category;
                index++;
            }

            // categories[9] = "Ures";
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    public void updateCategory() {
        for (int i = 0; i < list.size(); i++) {

            Book book = list.get(i);
            book.setCategory(categories[book.getCategoryNumber()]);
            list.set(i, book);

        }
        for (Book one : list
        ) {

            System.out.println(one);
        }
    }

    public static void main(String[] args) {

        BookStore bookStore = new BookStore();

        bookStore.add();
        bookStore.addCategory();
        bookStore.updateCategory();

    }
}

