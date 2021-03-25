package Chapter8;

public class RecursiveSorts {
    public static void mergeSort (int[] numbers) {
        doMergeSort(numbers, 0, numbers.length - 1);
    }
    private static void doMergeSort (int[] numbers, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;
            doMergeSort (numbers, start, middle);
            doMergeSort (numbers, middle + 1, end);
            merge (numbers, start, middle, end);
        }
    }
    
    private static void merge (int[] numbers, int start, int middle, int end) {

        int[] tmp = new int[end - start + 1];
        int index1 = start;
        int index2 = middle + 1;
        int indexTmp = 0;
// Loop until one of the sublists is exhausted, adding the smaller
// of the first elements of each sublist to the merged list.
        while (index1 <= middle && index2 <= end) {
            if (numbers[index1] < numbers[index2]) {
                tmp[indexTmp] = numbers[index1];
                index1++;
            } else {
                tmp[indexTmp] = numbers[index2];
                index2++;
            }
            indexTmp++;
        }
        // Add to the merged list the remaining elements of whichever sublist
        // is not yet exhausted.
        while (index1 <= middle) {
            tmp[indexTmp] = numbers[index1];
            index1++;
            indexTmp++;
        }
        
        while (index2 <= end) {
            tmp[indexTmp] = numbers[index2];
            index2++;
            indexTmp++;
        }
        // Copy the merged list from tmp into numbers.
        for (indexTmp = 0; indexTmp < tmp.length; indexTmp++) {
            numbers[start + indexTmp] = tmp[indexTmp];
        }
    }
    
    public static void quickSort (int[] numbers) {
        doQuickSort(numbers, 0, numbers.length - 1);
    }

    private static void doQuickSort (int[] numbers, int start, int end) {
        if (start < end) {
            int middle = partition(numbers, start, end);
            doQuickSort(numbers, start, middle);
            doQuickSort(numbers, middle + 1, end);
        }
    }
    
    private static int partition (int[] numbers, int start, int end) {
        int pivot = numbers[start];
        int i = start - 1;
        int j = end + 1;
        
        while (true) {
            i = i + 1;
            while (numbers[i] < pivot)
                i = i + 1;
            
            j = j - 1;
            while (numbers[j] > pivot)
                j = j - 1;
                
            if (i < j) {
                int tmp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = tmp;
            }
            else return j;
        }
    }
}