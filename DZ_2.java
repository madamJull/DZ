public class DZ_2 {
    public void sort(int array[]){
        int = array.length;
        for (int i = n / 2 - 1; i >=0; i--)
            heap(array, n, i);
        for (int i = n - 1; i >= 0; i--)
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heap(array, i, 0)
    }
}
