import java.util.*;
class testclass{
   public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        for(int f =0;f<t;f++){
          String s = in.nextLine();
          boolean arr[]= new boolean [s.length()];
          permu(s,arr,"");
        }
   }
   public static void permu(String s , boolean arr[], String rs){
   	    boolean check =true;
        for(int i =0;i<arr.length;i++){ 
        	if(!arr[i])
        	{
        		check=false;
        		break;
        	}
        }
        if(check)
        {
        	System.out.println(rs);
        }
        for(int i =0;i<arr.length;i++)
        {
             if(!arr[i]){
             	arr[i]=true;
               permu(s,arr,rs+s.charAt(i));
                arr[i]=false;
             }
        }
   }
}