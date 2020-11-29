public class InsertionSort {
    public static void testInsertion() {
        int[] array = {10, 2, 10, 3, 1, 2, 5};

        System.out.println(">>> Before Sorting <<<");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();

        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;

            for (; i >= 0; i--) {
                if (value < array[i]) array[i+1] = array[i];
                else break;
            }
            array[i+1] = value;
        }

        System.out.println(">>> After Sorting <<<");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }
}
