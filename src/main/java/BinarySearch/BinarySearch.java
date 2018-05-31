package BinarySearch;

public class BinarySearch {

    public int search(int target, int[] array) {
        int leftBorder = -1;
        int rightBorder = array.length;
        int lastElement = array[array.length - 1];

        if (array[0] < lastElement) {
            return recursion(target, array, leftBorder, rightBorder);
        }

        int boundaryIndex = recursionShifted(
                lastElement, array, leftBorder, rightBorder);

        if (target >= array[0]) {
            leftBorder = -1;
            rightBorder = boundaryIndex + 1;
        }

        if (target <= lastElement) {
            leftBorder = boundaryIndex;
            rightBorder = array.length;
        }

        return recursion(target, array, leftBorder, rightBorder);
    }

    private int recursion(int target, int[] array,
                          int leftBorder, int rightBorder) {

        if (leftBorder >= rightBorder - 1) {
            return -1;
        }

        int middle = leftBorder + (rightBorder - leftBorder) / 2;

        if (target == array[middle]) {
            return middle;
        } else if (target < array[middle]) {
            rightBorder = middle;
        } else {
            leftBorder = middle;
        }

        return recursion(target, array, leftBorder, rightBorder);
    }

    private int recursionShifted(int target, int[] array,
                                 int leftBorder, int rightBorder) {

        if (leftBorder >= rightBorder - 1) {
            return -1;
        }

        int middle = leftBorder + (rightBorder - leftBorder) / 2;

        if (target < array[middle]) {
            leftBorder = middle;
        } else {
            return leftBorder;
        }

        return recursionShifted(target, array, leftBorder, rightBorder);
    }
}
