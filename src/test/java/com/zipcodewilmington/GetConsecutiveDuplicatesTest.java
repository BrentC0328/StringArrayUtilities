package com.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

public class GetConsecutiveDuplicatesTest {



    @Test
    public void testRemoveConsecutiveDuplicates1() {
        //                  a     a       b       c     d      d     d       d      e      e
        //                     a          b       c     d                            e
        String[] array = {"aba", "aba", "baa", "bab", "bba", "bba", "bba", "bba", "bbb", "bbb"};
        String[] actual = StringArrayUtils.removeConsecutiveDuplicates(array);
        String[] expected = {"aba", "baa", "bab", "bba", "bbb"};
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void testRemoveConsecutiveDuplicates2() {
        String[] array = {"aba", "aba", "baa", "bab", "bba", "zzz", "bba", "bba", "bba", "bbb", "bbb"};
        String[] actual = StringArrayUtils.removeConsecutiveDuplicates(array);
        String[] expected = {"aba", "baa", "bab", "bba", "zzz", "bba", "bbb"};
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testRemoveConsecutiveDuplicates3() {
        String[] array = {"aba", "aba", "baa", "bab", "bba", "zzz", "bba", "bba", "bba", "aba", "bbb"};
        String[] actual = StringArrayUtils.removeConsecutiveDuplicates(array);
        String[] expected = {"aba", "baa", "bab", "bba", "zzz", "bba", "aba", "bbb"};
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveConsecutiveDuplicates4() {
        String[] array = {"aba", "aba"};
        String[] actual = StringArrayUtils.removeConsecutiveDuplicates(array);
        String[] expected = {"aba"};
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testRemoveConsecutiveDuplicates5() {
        String[] array = {"aba", "aba", "a"};
        String[] actual = StringArrayUtils.removeConsecutiveDuplicates(array);
        String[] expected = {"aba", "a"};
        Assert.assertEquals(expected, actual);
    }

}
