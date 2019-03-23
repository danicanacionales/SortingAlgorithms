import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int [] A){
        int mid = A.length / 2;
        if(A.length < 2)
            return A;

        int [] left = Arrays.copyOfRange(A, 0, mid);
//        Main.printArray(A);
        int [] right = Arrays.copyOfRange(A, mid, A.length);
//        Main.printArray(A);

        mergeSort(left);
        mergeSort(right);
        A = merge(A, left, right);
        return A;
    }

    public static int[] merge(int [] A, int [] left, int [] right){
        int i = 0, j = 0, k = 0;

        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                A[k] = left[i];
                i++;
            }else{
                A[k] = right[j];
                j++;
            }
            k++;
//            Main.printArray(A);
        }

        while(i < left.length){
            A[k++] = left[i++];
        }

        while(j < right.length){
            A[k++] = right[j++];
        }

        return A;
    }
}
