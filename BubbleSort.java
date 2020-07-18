public class BubbleSort {


    public void sort(int[] array){
        int n = array.length;
        boolean flag;
        for (int i = 0; i < n; i++) {
            flag = false;
            for (int j = 0; j < n-i-1; j++) {

                if(array[j+1] < array[j]){
                    int next = array[j+1];
                    array[j+1] = array[j];
                    array[j] = next;
                    flag = true;
                }
            }

            if(!flag)
                break;
        }
    }
}

*************test my git***********
