package sort;


public class BubbleSort {
    static void bubble_sort(int[] unsorted) {
        System.out.println("bubble : time+O(n^2), spaceO(1)");
        if(unsorted == null || unsorted.length <2 ){
        return;
        }
        for (int i = 0; i < unsorted.length; i++) {
            //unsorted.length - i-1 不然j<unsorted.length - 0， j+1=unsorted.length - 0+1+1指针越界
            for (int j = 0; j < unsorted.length - i-1; j++) {
                if (unsorted[j] > unsorted[j+1]) {
//                    int temp =unsorted[j];
//                    unsorted[j] = unsorted[j+1];
//                    unsorted[j+1] = temp;
                    swap(j,unsorted);
                }
            }
        }
    }
    static void swap(int a, int [] arr  ) {
        int temp = arr[a];
        arr[a] = arr[a+1];
        arr[a+1] = temp;
    }

    public static void print(int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+",");
        }
    }

    public static void main(String[] args) {

        int [] arr = new int[]{6,5,1,2,4,3};
        print(arr);
        bubble_sort(arr);
        System.out.println();
        print(arr);
        System.out.println();
        }
}

