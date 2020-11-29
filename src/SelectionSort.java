public class SelectionSort {
    public static void testSelection() {
        int[] array = new int[]{10, 2, 10, 3, 1, 2, 5};

        System.out.println(">>> Before Sorting <<<");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {    // i - номер текущего шага
            int pos = i;
            int min = array[i];

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }

            array[pos] = array[i];
            array[i] = min;
        }

        System.out.println(">>> After Sorting <<<");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }
}
