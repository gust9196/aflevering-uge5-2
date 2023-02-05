public class WhatNumberIsLargest {
    public class Main {
        public static int findMax(int a, int b, int c) {
            int max = a;
            if (b > max) {
                max = b;
            }
            if (c > max) {
                max = c;
            }
            return max;
        }

        public static int findMin(int a, int b, int c) {
            int min = a;
            if (b < min) {
                min = b;
            }
            if (c < min) {
                min = c;
            }
            return min;
        }

        public static void main(String[] args) {
            int a = 10, b = 20, c = 30;
            System.out.println("Max: " + findMax(a, b, c));
            System.out.println("Min: " + findMin(a, b, c));
        }
    }

}
