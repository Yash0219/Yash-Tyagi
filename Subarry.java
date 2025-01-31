public class Subarry{
    public static void printsubarray(int number[]){
        int i; int j;
    
        for( i =0;i< number.length;i++)
        {
          for(j =i ;j < number.length;j++)
          {
              for(int k=i; k<= j;k++)
              {
              System.out.print(number[k]+" ");
            } 
             System.out.println();
             }System.out.println();
        }
    }

    public static void main(String[] args) {
        int number[]={2,3,4,5,7};
        printsubarray(number);
    }
 }
