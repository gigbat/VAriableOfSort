public class Demo {
    public static void main(String[] args) {
        System.out.println("----- Bubble Sort -----");
        BubbleSort.testBubble(new int[]{7, 1, 5, 3, 2, 9, 4, 6, 8, 10});

        System.out.println("----- Merge Sort -----");
        MergeSort.printMerge();

        System.out.println("----- Insertion Sort -----");
        InsertionSort.testInsertion();

        System.out.println("----- Selection Sort -----");
        SelectionSort.testSelection();

        System.out.println("----- Quick Sort -----");
        QuickSort.testQuick();
    }
}
