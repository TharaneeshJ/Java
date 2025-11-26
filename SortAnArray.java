public class SortAnArray {
    public static void main(String[] args) {
        int [] numbers ={8,9,5,6,4,3,5,1,2,0};
        System.out.println("Original Array:");
        for(int n=0;n<numbers.length;n++){ //printing original array
            System.out.print(numbers[n]+" ");
        }
        System.err.println();  //new line
    
        //Sorting Logic - Bubble Sort
        for(int i=0;i<numbers.length;i++){ //outer loop to select an element 
            for(int j=i+1;j<numbers.length;j++){  //inner loop to compare the selected element with rest of the elements
                if(numbers[i]>numbers[j]){ //if selected element is greater than the compared element
                    //swap
                    int temp=numbers[i]; //store the selected element in a temporary variable
                    numbers[i]=numbers[j];  //replace the selected element with the compared element
                    numbers[j]=temp;  //replace the compared element with the selected element stored in temporary variable
                }
            }
        }
        System.out.println("Sorted Array using Bubble Sort :");
        for(int n=0;n<numbers.length;n++){
            System.out.print(numbers[n]+" ");
        }
    }
}
