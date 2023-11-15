package org.example.week7.CircleTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;
import org.w3c.dom.css.Rect;

public class MyRectangleSort {

    public static void sort(MyComparable[] comparables){
        Arrays.sort(comparables,
                new Comparator<MyComparable>() {
                    @Override
                    public int compare(MyComparable o1, MyComparable o2) {
                        return o2.compareTo(o1);
                    }
                });
    }
}
