public class TwoDimensarr {
    public static void diagonalsum(int matrix[][]){
        int sum=0;
        /*for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                //primary diagnol
                if(i==j){
                    sum+=matrix[i][j];
                    //secondary diagonal
                    }
                     else if(i+j ==matrix.length-1){
                        sum +=matrix[i][j];
                    } 
            }
        }*/
        for(int i=0;i<matrix.length;i++){
            //primary sum
            sum+=matrix[i][i];
            //secondary matrix
            if(i !=matrix.length-1-i){
                sum+= matrix[i][matrix.length-1-i];
            }  
        }
        System.out.println(sum);
    }
    //staircase search in 2d array
    public static boolean staircasesearch(int sormatrix[][],int key){
        int row= sormatrix.length-1;  int col =0;

       while( row >= 0 && col < sormatrix[0].length) {
         if(sormatrix[row][col]==key){
            System.out.println("found key at ("+ row+","+col+")");
            return true;
         }
         else if(key< sormatrix[row][col]){
             row--;
         }
         else{
            col++;
         }
         } 
         System.out.println("key not found");
         return false; 
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};  
                        diagonalsum(matrix); 
    int sormatrix[][]= {{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,50},
                        {32,33,39,50}};
                    staircasesearch(sormatrix, 100);            
    }
}
