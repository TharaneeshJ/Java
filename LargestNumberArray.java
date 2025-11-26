public class LargestNumberArray {
    public static void main(String[] args) {
        int a[] = {11, 44, 33, 22, 55};
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
            
        }
        System.out.println("Largest number in the array is: " + largest);

        int secondlargest = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > secondlargest &&  a[i] != largest) {
                secondlargest = a[i];
            }
        }
        System.out.println("Second largest number in the array is: " + secondlargest);
    }
}
