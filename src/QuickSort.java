public class QuickSort {
    public static int[] quickSort(int [] A, int start, int end){
//        System.out.println("Start: " + start + " End: " + end);
        if(start >= end){
            return A;
        }
        int pIndex = partition(A, start, end);
//        Main.printArray(A);
        A = quickSort(A, start, pIndex - 1);

//        Main.printArray(A);
        A = quickSort(A, pIndex + 1, end);

//        Main.printArray(A);
        return A;
    }


    public static int partition(int [] A, int start, int end){
        int pIndex = start;
        int pivot = A[end];

        for(int i = start; i < end; i++){
            if(A[i] <= pivot){
                A = swap(A, i, pIndex);
                pIndex++;
            }
//            Main.printArray(A);
        }

        A = swap(A, end, pIndex);
        return pIndex;
    }

    public static int[] swap(int [] A, int index1, int index2){
//        Main.printArray(A);
//        System.out.println("Swap: " + A[index1] + " and " + A[index2]);
        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;

        return A;
    }

}
