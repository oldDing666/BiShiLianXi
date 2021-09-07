//package tw;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.zijie_07_23.Test;
//
//import java.util.Arrays;
//import java.util.Collections;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertIterableEquals;
//
//class LibraryFindBookByPriceTest {
//    private Library library;
//    private static final Book windows2009Book =
//        new Book("9781838550912", "Windows Server 2019 Administration Fundamentals", 40);
//    private static final Book problemManagementBook =
//        new Book("9781780172415", "Problem Management", 45);
//    private static final Book groupsBook =
//        new Book("9781305865709", "Groups: Process and Practice", 173);
//
//    @BeforeEach
//    void initializeLibrary() {
//        library = new Library();
//        library.addAll(windows2009Book, problemManagementBook, groupsBook);
//    }
//
//    @zijie_07_23.Test
//    void should_find_nothing_if_no_book_is_lower_than_or_equal_to_price() {
//        assertEquals(
//            0,
//            library.findBooksCheaperThan(20).size()
//        );
//    }
//
//    @zijie_07_23.Test
//    void should_find_book_if_its_price_is_lower_than_or_equal_to_price() {
//        assertIterableEquals(
//            Collections.singletonList(windows2009Book),
//            library.findBooksCheaperThan(42)
//        );
//    }
//
//    @zijie_07_23.Test
//    void should_sort_multiple_result_by_isbn_number() {
//        assertIterableEquals(
//            Arrays.asList(problemManagementBook, windows2009Book),
//            library.findBooksCheaperThan(45)
//        );
//    }
//}
