//pass array as AN function
public class arraycc {
    public static void update(int marks[],int nonchangable) {
         nonchangable= 15;
         for( int i=0;i<marks.length;i++){
            marks[i]= marks[i]+1;
         }
        
    }
    public static void main(String[] args) {
        int marks[] = {21,70,90};
        int nonchangeable=5;
        update(marks,nonchangeable );
        for (int i= 0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
           
    } System.out.println();
     System.out.println(nonchangeable);
 }
       
}
