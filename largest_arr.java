public class largest_arr {
    public static int largestnum(int number[]) {
        int largest=Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i =0;i<number.length;i++){
            if(number[i]>largest){
                largest= number[i];
            } 
            if( number[i]<smallest){
                smallest= number[i];
            }
        } System.out.print("Smallest no is "+smallest);
        System.out.println();
        return largest;
    }
    public static void main(String[] args) {
        int number[]={21,56,78,56,99,123,657,9,234,356};
        System.out.print("largest number is  "+largestnum(number));
    }
}
