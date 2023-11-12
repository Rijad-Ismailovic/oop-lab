public class BinarySearch {
    public static boolean search(int[] array, int searchedValue){
        int start = 0;
        int end = array.length - 1;
        while(start <= end){
            int middle = start + ((end - start) / 2);
            if (searchedValue == array[middle]){
                return true;
            }
            if (searchedValue < array[middle]){
                end = middle - 1;
            }
            else if (searchedValue > array[middle]){
                start = middle + 1;
            }
        }
        return false;
    }
}
