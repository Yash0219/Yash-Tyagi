public class stringss {
    public static boolean ispalindrome( String str){
        for(int i=0 ;i<=str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;

            }
        }
        return true; 
    }
    public static float getShortestpath(String path){
        int x=0; int y=0;
        for(int i =0;i< path.length();i++){
            char dir=path.charAt(i);
            if(dir=='N'){
                x++;
            }
            else if(dir=='S'){
                x--;
            }
            else if(dir=='W'){
                y--;
            }
            else {
                y++;
            }
        }
        //DISPLACEMANT IS THE SHORTEST PATH
         int X2=x*x;
         int Y2=y*y;
         return (float)Math.sqrt(X2+Y2);
        
    }
    public static void main(String[] args) {
         String path ="NSEWNSEEEWE";
         System.out.print(getShortestpath(path));
    }
    
}
