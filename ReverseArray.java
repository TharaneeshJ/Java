public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {9,8,7,6,5,4,3,2,1,0};
        System.out.println("Original Array:");
        for(int n=0;n<numbers.length;n++){
            System.out.print(numbers[n]+" ");
        }
        System.err.println();
        System.out.println("Reversed Array:");
        for(int n=numbers.length-1;n>=0;n--){
            System.out.print(numbers[n]+" ");
        }

    }
}
