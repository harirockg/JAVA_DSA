public class Shortest_path {
    public static float shortest_path(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            //North
            if(str.charAt(i)=='N'){
                y+=1;
            }
            //South
            else if(str.charAt(i)=='S'){
                y-=1;
            }
            //West
            else if(str.charAt(i)=='W'){
                x-=1;
            }
            //East
            else{
                x+=1;
            }
        }
        //shortest path ka formula hai ye
        return (float)Math.sqrt((x*x)+(y*y));

    }
    public static void main(String[] args) {
        String str="WNEENESENNN";
        System.out.println(shortest_path(str));
    }
    
}
