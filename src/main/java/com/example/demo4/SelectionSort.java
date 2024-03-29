package com.example.demo4;
import java.util.Scanner;


    public class SelectionSort {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o número de elementos:");
            int n = scanner.nextInt();
            int[] array = new int[n];
            System.out.println("Digite os elementos:");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            selectionSort(array);
            scanner.close();
        }

        public static void selectionSort(int[] arr) {
            int comp = 0;
            int swap = 0;

            long startTime = System.nanoTime();

            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                int min_idx = i;
                for (int j = i + 1; j < n; j++) {
                    comp++;
                    if (arr[j] < arr[min_idx]) {
                        min_idx = j;
                    }
                }
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
                swap++;
            }

            long endTime = System.nanoTime();
            long duration = (endTime - startTime) / 1000000; // milliseconds

            System.out.println("Selection Sort:");
            System.out.println("Número de trocas: " + swap);
            System.out.println("Número de comparações: " + comp);
            System.out.println("Tempo de execução: " + duration + "ms");
        }
    }



