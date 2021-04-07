package com.bruceofhz.algorithm.sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/** @Author by bruce on 2021/4/6 */
public class InsertSort {

    public static void main(String[] args) {
        int[] a = {4, 5, 6, 3, 2, 1};
        int n = a.length;

        dataSort(a, n);
    }

    private static void dataSort(int[] a, int n) {
        if (n <= 1) {
            return;
        }

        List<Integer> collect;
        for (int i = 1; i < n; i++) {
            // 有序区a[i-1]
            System.out.println("待排序元素：" + a[i]);
            int j = i - 1;
            // 待排序元素
            int value = a[i];
            for (; j >= 0; j--) {
                if (a[j] < value) {
                    // 如果待排序元素比已排序区的最大的元素大,则不用在比较
                    break;
                } else {
                    a[j + 1] = a[j];
                }
            }

            // 插入排序值
            System.out.println("j=" + j);
            a[j + 1] = value;
            collect = Arrays.stream(a).boxed().collect(Collectors.toList());
            System.out.println(collect);
        }
    }
}
