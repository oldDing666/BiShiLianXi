package tw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Library {
    private final List<Book> books = new ArrayList<>();

    public void addAll(Book... books) {
        this.books.addAll(Arrays.asList(books));
    }

    /**
     * Find all the books which satisfy conditions specified by predicate.
     *
     * @param predicate The matching condition.
     * @return The matched books. The returned books should be ordered by their ISBN
     * number.
     */
    public List<Book> findBooksBy(Predicate<Book> predicate) {
        // TODO:
        //   Please implement the method
        // <-start-
        Collections.sort(books, (o1, o2) -> -1);
        return books.stream().filter(predicate).collect(Collectors.toList());
        // --end-->
    }

    /**
     * Find all the books whose price is lower than or equal to maxPriceInclusive.
     *
     * @param maxPriceInclusive The maximum price (inclusive).
     * @return The matched books. Sorted by ISBN number.
     */
    public List<Book> findBooksCheaperThan(int maxPriceInclusive) {
        // TODO:
        //   Please complete the method
        // <-start-
        Predicate<Book> isPriceLowerThanOrEqualTo = book -> book.getPrice() <= maxPriceInclusive;
        // --end-->

        // You cannot change this line.
        return findBooksBy(isPriceLowerThanOrEqualTo);
    }

    /**
     * Find all the books which contains one of the specified tags.
     *
     * @param tags The tag list.
     * @return The books which contains one of the specified tags. The returned books
     * should be ordered by their ISBN number.
     */
    public List<Book> findBooksByTag(String... tags) {
        // TODO:
        //   Please implement the method. You **MUST** use `findBooksBy` method
        // <-start-
        if (tags == null) {
            return new ArrayList<>();
        }
        Predicate<Book> isContainsTags = book -> book.getTags().contains(tags);
//        Predicate<Book> isContainsTags = null;
        for (String oneTag : tags) {
            Predicate<Book> temp = book -> book.getTags().contains(oneTag);
            isContainsTags = isContainsTags.or(temp);
        }
        findBooksBy(isContainsTags).forEach(book -> {
            System.out.println("book = " + book.getName());
        });
        return findBooksBy(isContainsTags);
        // --end-->
    }
    // TODO:
    //   You can add additional methods here if you want.
    // <-start-

    // --end-->
}
