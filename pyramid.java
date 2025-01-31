/*
    *
   **
  ***
 ****    
 */
/*public class pyramid {
    
    public static void main(String[] args) {
        int n = 4;
     for( int i=1;i<=n;i++){
        //j ko memory mai space sirf for loop ke excution ke liye hi mili hai
                  for(int j=1;j<=n-i;j++)
                  {
                        System.out.print(" ");
             }
             for(int j= 1;j<=i;j++)
             {
                System.out.print("*");
          }System.out.println();
      }  
  }
}*/
/*
 1
 23
 4 5 6
 7 8 9 10
 */
public class pyramid{
    public static void main(String[] args) {
        int n= 5;
        int num=1;
        for(int i = 1;i<=5;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }System.out.println();
        }
    }
}
