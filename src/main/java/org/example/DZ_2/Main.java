package org.example.DZ_2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void heapSort(int[] array, int length) {
        int temp;
        int size = array.length - 1;
        for (int i = length / 2; i >= 0; i--) {
            heap(array, i, size);
        }
        for (int i = size; i >= 0; i--){
            temp = array[0];
            array[0] = array[size];
            array[size] = temp;
            heap(array, 0, size);
        }
        System.out.println(Arrays.toString(array));
    }

    public static void heap(int[] array, int i, int heapSize) {
        int a = 2*i;
        int b = 2*i+1;
        int maxEl;
        if (a <= heapSize && array[a] > array[i]) {
            maxEl = a;
        } else {
            maxEl = i;
        }
        if (b <= heapSize && array[b] > array[maxEl]) {
            maxEl = b;
        }
        if (maxEl != i) {
            int temp = array[i];
            array[i] = array[maxEl];
            array[maxEl] = temp;
            heap(array, maxEl, heapSize);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:  ");
        int size = scanner.nextInt();
        System.out.println("Введите элементы массива: ");
        int[] array = new int [size];
        for (int i = 0; i < size; i ++){
            array[i] = scanner.nextInt();
        }
        heapSort(array, size);
    }
}