//package tw;
//
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.zijie_07_23.Test;
//
//import java.util.Arrays;
//import java.util.Collections;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertIterableEquals;
//
//class LibraryFindBooksByTagTest {
//    private Library library;
//    private static final Book windows2009Book =
//        new Book("9781838550912", "Windows Server 2019 Administration Fundamentals", 40);
//    private static final Book problemManagementBook =
//        new Book("9781780172415", "Problem Management", 45);
//    private static final Book groupsBook =
//        new Book("9781305865709", "Groups: Process and Practice", 173);
//
//    @BeforeAll
//    static void initializeTags() {
//        windows2009Book.addTags("business", "computer", "technology", "network", "cloud");
//        problemManagementBook.addTags("business", "money", "management", "leadership");
//        groupsBook.addTags("social", "psychology");
//    }
//
//    @BeforeEach
//    void initializeLibrary() {
//        library = new Library();
//    }
//
//    @zijie_07_23.Test
//    void should_find_nothing_if_no_tag_is_input() {
//        library.addAll(windows2009Book, problemManagementBook, groupsBook);
//        assertEquals(0, library.findBooksByTag().size());
//    }
//
//    @zijie_07_23.Test
//    void should_find_books_for_given_tag() {
//        library.addAll(windows2009Book, problemManagementBook, groupsBook);
//        assertIterableEquals(
//            Collections.singleton(windows2009Book),
//            library.findBooksByTag("computer"));
//    }
//
//    @zijie_07_23.Test
//    void should_find_all_books_for_given_tag_ordered_by_isbn() {
//        library.addAll(windows2009Book, problemManagementBook, groupsBook);
//        assertIterableEquals(
//            Arrays.asList(problemManagementBook, windows2009Book),
//            library.findBooksByTag("business"));
//    }
//
//    @zijie_07_23.Test
//    void should_remove_duplication_in_tags() {
//        library.addAll(windows2009Book, problemManagementBook, groupsBook);
//        assertIterableEquals(
//            Collections.singletonList(windows2009Book),
//            library.findBooksByTag("computer", "computer"));
//    }
//
//    @zijie_07_23.Test
//    void should_remove_result_duplication() {
//        library.addAll(windows2009Book, problemManagementBook, groupsBook);
//        assertIterableEquals(
//            Collections.singletonList(windows2009Book),
//            library.findBooksByTag("computer", "technology"));
//    }
//
//    @zijie_07_23.Test
//    void should_find_multiple_books_by_multiple_tags() {
//        library.addAll(windows2009Book, problemManagementBook, groupsBook);
//        assertIterableEquals(
//            Arrays.asList(groupsBook, windows2009Book),
//            library.findBooksByTag("computer", "technology", "psychology"));
//    }
//}
