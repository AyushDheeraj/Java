public class Sorting {
    public static void print(int arr[]){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static boolean checkSorted(int arr[]){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]) return false;
        }
        return true;
    }
    // Bubble sort  == Swaping adjecent element
    public static void bubbleSort(int arr[]){
        int n = arr.length;
         for(int i=0; i<n-1; i++){  // n-1 pass
            int swaps = 0;  // boolean isSorted = true;
            for(int j=0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps ++;  // isSorted = false;
                }
            }
            if(swaps==0) break;  // if(isSorted == true) break;
        }
        print(arr);
    }
    public static void main(String[] args) {
        int arr[] = {7,2,9,4,8,6,7};
        int n = arr.length;
        System.out.println(n);
        System.out.println(checkSorted(arr));
        print(arr);
        bubbleSort(arr);
    }
}
