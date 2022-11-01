package org.lms;

import java.util.Arrays;

public class Utility {
    public static int[] addElement(int[] a, int e) {
        a = Arrays.copyOf(a, a.length + 1);
        a[a.length - 1] = e;
        return a;
    }
    public static int[] removeElement(int[] a, int e) {
        a = Arrays.copyOf(a, a.length - 1);
        a[a.length - 1] = e;
        return a;
    }
}
