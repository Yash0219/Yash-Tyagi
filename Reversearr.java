public class Reversearr {
    public static void reverse(int number[]) {
        int start=0; int last= number.length-1;
        while (start < last) 
        {
            //swaping 1st with last
            int temp =number[last];
            number[last]=number[start];
            number[start]=temp;
            
            start++;
            last--;
        }
    }
    public static void main(String[] args) {
        int number[] ={12,23,32,44,45,55,49};
      reverse(number);
      for(int i=0;i<number.length;i++){
        System.out.print(number[i] +" ");
      }
    }
    
}
