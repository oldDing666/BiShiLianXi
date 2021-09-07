//package test;
//
//import org.junit.jupiter.api.zijie_07_23.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class MultiplyTableTest {
//    @zijie_07_23.Test
//    void should_print_one_expression_table() {
//        final MultiplyTable table = new MultiplyTable(1, 1);
//
//        assertEquals("1*1=1  \n", table.print());
//    }
//
//    @zijie_07_23.Test
//    void should_print_one_expression_table_from_start_number() {
//        final MultiplyTable table = new MultiplyTable(12, 12);
//
//        assertEquals("12*12=144  \n", table.print());
//    }
//
//    @zijie_07_23.Test
//    void should_print_table_from_start_to_end() {
//        final MultiplyTable table = new MultiplyTable(2, 3);
//
//        final String expected =
//            "2*2=4  \n" +
//            "3*2=6  3*3=9  \n";
//
//        assertEquals(expected, table.print());
//    }
//
//    @zijie_07_23.Test
//    void should_print_table_from_start_to_end_aligned() {
//        final MultiplyTable table = new MultiplyTable(2, 5);
//
//        final String expected =
//            "2*2=4   \n" +
//            "3*2=6   3*3=9   \n" +
//            "4*2=8   4*3=12  4*4=16  \n" +
//            "5*2=10  5*3=15  5*4=20  5*5=25  \n";
//
//        assertEquals(expected, table.print());
//    }
//
//    @zijie_07_23.Test
//    void should_print_table_from_start_to_end_just_another_test() {
//        final MultiplyTable table = new MultiplyTable(7, 11);
//
//        final String expected =
//            "7*7=49   \n" +
//            "8*7=56   8*8=64   \n" +
//            "9*7=63   9*8=72   9*9=81   \n" +
//            "10*7=70  10*8=80  10*9=90  10*10=100  \n" +
//            "11*7=77  11*8=88  11*9=99  11*10=110  11*11=121  \n";
//
//        assertEquals(expected, table.print());
//    }
//
//    @zijie_07_23.Test
//    void should_throw_if_start_is_zero() {
//        final int notImportant = 2;
//
//        assertThrows(IllegalArgumentException.class, () -> new MultiplyTable(0, notImportant));
//    }
//
//    @zijie_07_23.Test
//    void should_throw_if_end_is_zero() {
//
//        assertThrows(IllegalArgumentException.class, () -> new MultiplyTable(0, 0));
//    }
//
//    @zijie_07_23.Test
//    void should_throw_if_start_is_negative_number() {
//        assertThrows(IllegalArgumentException.class, () -> new MultiplyTable(-1, 1));
//    }
//
//    @zijie_07_23.Test
//    void should_throw_if_end_is_negative_number() {
//        assertThrows(IllegalArgumentException.class, () -> new MultiplyTable(-2, -1));
//    }
//
//    @zijie_07_23.Test
//    void should_throw_if_start_is_larger_than_end() {
//        assertThrows(IllegalArgumentException.class, () -> new MultiplyTable(2, 1));
//    }
//}
