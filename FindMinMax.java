public class FindMinMax {
    public static void main(String[] args){
        int[] numbers={88,22,-88,-100,55,234,0,99,-1000,1};
        int min=numbers[0];
        int max=numbers[0];
        for(int n=0; n<numbers.length; n++){
            if(numbers[n]<min){
                min=numbers[n];
            }
            if(numbers[n]>max){
                max=numbers[n];
            }
        }
        System.out.println("Small Number in the Array :" + min);
        System.out.println("Large Number in the Array :" + max);
    }
}
