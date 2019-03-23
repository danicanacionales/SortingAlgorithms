public class Main {

    public static void main(String[] args) {

        int [] A = { 7, 2, 1, 6, 8, 5, 3, 4 };
        System.out.print("Unsorted Array: ");
        printArray(A);
        System.out.println();

        A = QuickSort.quickSort(A, 0, (A.length - 1));
        System.out.print("Sorted using Quick Sort: ");
        printArray(A);

//        int [] B = { 2, 4, 1, 6, 8, 5, 3, 7 };
        int [] B = { 7, 2, 1, 6, 8, 5, 3, 4 };
        B = MergeSort.mergeSort(B);
        System.out.print("Sorted using Merge Sort: ");
        printArray(B);
    }

    public static void printArray(int [] A){
        for(int i : A){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
