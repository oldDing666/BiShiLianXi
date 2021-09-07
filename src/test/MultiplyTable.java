package test;

/**
 * Please read the Javadoc as well as the test cases carefully to complete the requirement.
 */
public class MultiplyTable {
    private final int start;
    private final int end;

    /**
     * Create a {@link MultiplyTable} instance. Please note that the {@code start} and {@code end}
     * parameter should support up to {@code Integer.MAX_VALUE}.
     *
     * @param start The start number (inclusive) of the {@link MultiplyTable}.
     * @param end   The end number (inclusive) of the {@link MultiplyTable}.
     * @throws IllegalArgumentException <ul>
     *                                  <li>The <code>start</code> or <code>end</code> is less than or equal to zero.</li>
     *                                  <li>The <code>start</code> is greater than <code>end</code>.</li>
     *                                  </ul>
     */
    public MultiplyTable(int start, int end) {
        // TODO: Please implement constructor
        // <--start-
        this.start = start;
        this.end = end;
//        throw new RuntimeException("Delete me");
        // ---end-->
    }

    /**
     * <p>Return a string represents the multiply table. The returned multiply table should match
     * the following rules:</p>
     *
     * <ul>
     *     <li>The table should begin with {@code start * start}.</li>
     *     <li>The first number in each expression should be increased by 1 per row.</li>
     *     <li>The second number in each expression should be increased by 1 per column.</li>
     *     <li>Each column should be left aligned.</li>
     *     <li>Each column width should be equals to the maximum width of the expression in that column plus 2.</li>
     *     <li>The line break character should be {@code '\n'}, The whitespace character should be {@code ' '}.</li>
     * </ul>
     *
     * <p>For example, suppose that the {@code start} is {@code 2} and {@code end} is {@code 4}. The output should be</p>
     *
     * <pre>
     * 2*2=4
     * 3*2=6  3*3=9
     * 4*2=8  4*3=12  4*4=16
     * </pre>
     *
     * <p>Take another example. Suppose that the {@code start} is {@code 2} and {@code end} is 5. The output should be</p>
     *
     * <pre>
     * 2*2=4
     * 3*2=6   3*3=9
     * 4*2=8   4*3=12  4*4=16
     * 5*2=10  5*3=15  5*4=20  5*5=25
     * </pre>
     *
     * @return A {@link String} which represents the {@link MultiplyTable} instance.
     */
    public String print() {
        // TODO: Please implement toString() method according to Javadoc.
        // <--start-
        if (this.start <= 0 || this.end <= 0 || this.start > this.end)
            throw new IllegalArgumentException();
        String res = "";

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= i; j++) {
                String temp = i + "*" + j + "=" + i * j;

                String maxColLengthStr = end + "*" + j + "=" + end * j;
                int maxColLength = maxColLengthStr.length() + 2;

                while (temp.length() < maxColLength) {
                    temp += " ";
                }
                res += temp;
            }
            res += "\n";
        }
        return res;

//        throw new RuntimeException("Delete me");
        // ---end->
    }

    // TODO: You can add some additional method here if you want.
    // <--start-

    // ---end->
}
