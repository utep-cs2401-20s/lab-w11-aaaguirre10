public class newSorting {
    //Partition method
    //The pivot for this would be the first digit.
    private int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int partition = start + 1;
        int temp;
        while(partition <= end) {
            while(partition < arr.length && arr[partition] < pivot)
                partition++;
            while(arr[end] > pivot)
                end--;
            if(partition <= end) {
                temp = arr[partition];
                arr[partition] = arr[end];
                arr[end] = temp;
                partition++;
                end--;
            }
        }
        temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
        return end;
    }

    //Uses quickSort method to sort an array but does it recursively
    private void quickSort(int[] arr, int start, int end) {
        int sort = partition(arr, start, end);
        if(sort - 1 > start)
            quickSort(arr, start, sort - 1);
        if(sort + 1 < end)
            quickSort(arr, sort + 1, end);
    }

    //Uses quickSort method to sort an array.
    private void quickSort(int[] arr){
        quickSort(arr,0,arr.length - 1);
    }

    // Sorts the divided array in nums
    private void mergeSortedHalves(int[] arr, int[] LH, int[] RH) {
        int left = 0;
        int right = 0;
        int index = 0;
        while(index < arr.length) {                 //compares between both
            if(left < LH.length) {
                if(right < RH.length) {
                    if(LH[left] < RH[right]) {
                        arr[index] = LH[left];
                        index++;
                        left++;
                    }
                    else {
                        arr[index] = RH[right];
                        index++;
                        right++;
                    }
                }
                else {
                    arr[index] = LH[left];
                    index++;
                    left++;
                }
            }
            else if(right < RH.length) {
                arr[index] = RH[right];
                index++;
                right++;
            }
        }
    }

    public void newSorting(int[] arr, int size) {
        //base case
        if(arr.length <= size) {
            quickSort(arr);
        }
        else {
            int mid = arr.length/2;                 //find mid-point of array
            int[] LH = new int[mid];
            int[] RH = new int[arr.length - mid];
            populate(arr,LH,RH);                    //populate method for Left Half and Right Half
            newSorting(RH,size);
            newSorting(LH,size);
            mergeSortedHalves(arr,LH,RH);           //merge sorted both halves
        }
    }
    //helper method for the recursive of newSorting
    private void populate(int[] arr, int[] LH, int[] RH) {
        int index = arr.length/2;                   //find mid-point of array
        for(int i = 0; i < LH.length; i++)
            LH[i] = arr[i];
        for(int j = 0; j < RH.length; j++,index++)
            RH[j] = arr[index];
    }
}