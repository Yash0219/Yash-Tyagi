public class linearS {
    public static int linearsearch(int numbers[],int key) {
        //always less than because 0 based indexing in array
        for( int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={1,34,56,23,57,8,99,27,65}; 
        int key=6;
         int index = linearsearch(numbers, key);
         if(index ==-1){
            System.out.print("key not found");
         }else{
            System.out.println("key is at index "+index);
         }
    }
}
