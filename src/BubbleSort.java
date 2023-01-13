public class BubbleSort {
    //debug instrumentation
    public static void print(int[] data){
        int n = data.length;
        for (int i = 0; i < n; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println(" ");
    }

    public static void selectionSort(){
        int[] data = {5, 3, 2, 4, 1, 6, 0};
        int n = data.length;
        for (int i = 0; i < n - 1; i++){
            int position = i;
            int smallest = data[position];
            for (int j = i + 1; j < n; j++){
                if (data[j] < smallest){
                    position = j;
                    smallest = data[j];
                }
            }
            data[position] = data[i];
            data[i] = smallest;
        }
        print(data);
    }
    public static void bubbleSort() {
        int[] data = {5, 3, 2, 4, 1, 6, 0};
         int n = data.length;
         for (int j = 0; j < n - 1; j++){
             for (int i = 0; i < n - 1; i++){
                 if (data[i] > data [i + 1]){
                     int temp = data[i];
                     data[i] = data[i + 1];
                     data[i + 1] = temp;
                 }
             }
         }
        print(data);
    }

    public static void insertionSort(){
        int[] data = {5, 3, 2, 4, 1, 6, 0};
        int n = data.length;
        for (int i = 0; i < n - 1; i++){
            int j = i + 1;
            int temp = data[j];
            while (j > 0 && data[j-1] > temp){
                data[j] = data[j - 1];
                j--;
            }
            data[j] = temp;
        }
        print(data);
    }

    public static int partition(int[] data, int left, int right){
        int temp;
        int pivot = data[(left + right) / 2];
        int i = left;
        int j = right;
        while (i <= j){
            while (data[i] < pivot){
                i++;
            }
            while (data[j] > pivot){
                j--;
            }
            if (i <= j){
                temp = data[i];
                data[i] = data[j];
                data[j] = temp;
                i++;
                j--;
            }
        }
        return i;
    }
    public static void quickSort(int[] data, int left, int right){
        int index = partition(data, left, right);
        if (left < index - 1)
            quickSort(data, left, index - 1);
        if (index < right)
            quickSort(data, index, right);
        print(data);
    }

    public static void quickSort(){
        int[] data = {5, 3, 2, 4, 1, 6, 0, 9, 8, 7, 10};
        int n = data.length;
        quickSort(data, 0, data.length - 1);
    }
    public static void main(String[] args) {
        //selectionSort();
        //bubbleSort();
        //insertionSort();
        quickSort();
    }
}
