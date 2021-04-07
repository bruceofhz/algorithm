package com.bruceofhz.algorithm.sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/** @Author by bruce on 2021/4/6 冒泡排序:4，5，6，3，2，1 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {4, 5, 6, 3, 2, 1};
        int n = a.length;

        dataSort(a, n);
    }

    private static void dataSort(int[] a, int n) {
        List<Integer> collect;
        for (int i = 0; i < n; i++) {

            // 当前比较的轮次里是否交换了
            boolean flag = false;
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    // 交换
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                    flag = true;
                }
            }

            if (!flag) {
                break;
            }
            collect = Arrays.stream(a).boxed().collect(Collectors.toList());
            System.out.println("第" + (i + 1) + "轮:" + collect);
        }
    }

    // --------------------------------最差的时间复杂度和最好的时间复杂度--------------------------------
}
