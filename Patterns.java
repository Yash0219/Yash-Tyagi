/*
1
10
101
1010
 */
public class Patterns{
    public static void main(String[] args) {
        for(int i = 1;i <= 5;i++){
            for (int j= 1;j<= i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }System.out.println();
        }  
      }
}























  /* public static void hollowrec(int r,int c) 
    {
        for (int i=1; i<=r; i++)
        {
            for (int j=1; j<=c; j++)
            {
                if (i== 1 || i== r ||  j== 1 || j== c)  
                {          
                    System.out.print("*");            
                     } else{
                    System.out.print(" ");   
                }         
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        hollowrec(5, 6);
        
    }

    
}
 
 */ 