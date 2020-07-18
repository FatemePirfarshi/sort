public class SelectionSort {
    public void sort(int[] array) {

        for (int j = 0; j < array.length-1; j++) {
            int min = array[j];
            int index = j;

            for (int i = j+1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                    index = i;
                }
            }
            int temp = array[j];
            array[j] = min;
            array[index] = temp;
        }
    }
}
