//bruteforce
/*public class SubarrMaxsum{
  public static void printmaxsubarray(int number[]){
      int i; int j;
      int largest =Integer.MIN_VALUE;
  
      for( i =0;i< number.length;i++)
      {
        for(j =i ;j < number.length;j++)
        {int cursum=0;
            for(int k=i; k<=j;k++)
            {
            cursum = cursum+ number[k];
          } 
          System.out.println("subarray sum is "+cursum);
          if (cursum>largest) {
            largest= cursum;
          }
           
           }System.out.println();
      }System.out.println("max subarraya sum is "+largest);
  }

  public static void main(String[] args) {
      int number[]={1,-2, 6, -1, 3};
      printmaxsubarray(number);
  }
}*/

//kadane's Algorithm Tc=O(n)
public class SubarrMaxsum{
  public static void kadane(int number[]) {
    int cursum =0;
    int maxsum =Integer.MIN_VALUE;
    for(int i =0 ;i<number.length;i++){
      cursum=cursum+number[i];
      if (cursum <0) {
        cursum=0;
      }
      maxsum = Math.max(cursum, maxsum);
    } 
    System.out.println("max subarray sum is "+ maxsum);
    //for test case all negetive no smallest negetive no is maxsum
  }
  public static void negative(int numbers[]) {
    int maxsum= Integer.MAX_VALUE;
    for(int i=0; i<numbers.length;i++){
      if( numbers[i]<0){
        maxsum =Math.min(maxsum, numbers[i]);
      }
    }System.out.println("max sum"+maxsum);
    
  }
  public static void main(String[] args) {
    int number[] ={-2 ,-3, 4, -1, -2, 1, 5, -3};
    int numbers[]={-6,-3,-9,-1,-4,-5};
    kadane(number);
    negative(numbers);
  }
}

