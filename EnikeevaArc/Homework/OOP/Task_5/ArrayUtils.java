package Task_5;

public class ArrayUtils {
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int num: arr) {
            sum += num;
        }
        return sum;
    }

    public static double average(int[] arr) {
        int sum = getSum(arr);
        int len = arr.length;
        return (double) sum / len;
    }

    public static int max_value(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public static int min_value(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int mode(int[] arr) {
        int maxCount = 0;
        int mode = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = arr[i];
            }
        }

        return mode;
    }

    public static int[] sort_ascending(int[] arr) {
        int[] sortedArr = arr.clone();

        for (int i = 0; i < sortedArr.length - 1; i++) {
            for (int j = 0; j < sortedArr.length - 1; j++) {
                if (sortedArr[j] > sortedArr[j+1]) {
                    int base = sortedArr[j];
                    sortedArr[j] = sortedArr[j + 1];
                    sortedArr[j + 1] = base;
                }
            }
        }

        return sortedArr;
    }
}
