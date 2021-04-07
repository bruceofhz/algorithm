package com.bruceofhz.algorithm.sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/** @Author by bruce on 2021/4/7 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] a = {4, 5, 6, 3, 2, 1};
        int n = a.length;

        dataSort(a, n);
    }

    private static void dataSort(int[] a, int n) {
        // 分已排序区和未排序区
        List<Integer> collect;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }

            // 替换
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;

            collect = Arrays.stream(a).boxed().collect(Collectors.toList());
            System.out.println(collect);
        }
    }

    // 选择排序算法的实现思路有点类似插入排序，也分已排序区间和未排序区间。
    // 但是选择排序每次会从未排序区间中找到最小的元素，将其放到已排序区间的末尾
}
