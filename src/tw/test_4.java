package tw;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/6/11 1:59 下午
 */
public class test_4 {
    public static void main(String[] args) {
        Book windows2009Book = new Book("9781838550912", "Windows Server 2019 Administration Fundamentals", 40);
        Book problemManagementBook = new Book("9781780172415", "Problem Management", 45);
        Book groupsBook = new Book("9781305865709", "Groups: Process and Practice", 173);

        windows2009Book.addTags("business", "computer", "technology", "network", "cloud");
        problemManagementBook.addTags("business", "money", "management", "leadership");
        groupsBook.addTags("social", "psychology");
        Library library = new Library();
        library.addAll(windows2009Book, problemManagementBook, groupsBook);
//        List<Book> books = library.findBooksCheaperThan(45);
        List<Book> books = library.findBooksByTag("computer", "technology", "psychology");
        System.out.println(books.size());
        for (Book book : books) {
            System.out.println(book.getPrice());
        }

//        System.out.println(Collections.singletonList(windows2009Book));

    }
}
