public class Main
{
	public static void main(String[] args) {
	    String s="abcabcbb";
	    String rev="";
	    boolean flag=false;
	    for(int i=0;i<=s.length()-1;i++){
	        flag=false;
	        for(int j=0;j<=i-1;j++){
	            if(s.charAt(i)==s.charAt(j)){
	                flag=true;
	                break;
	            }
	        }
	        if(!flag){
	            rev=rev+s.charAt(i);
	        }
	    }
	    System.out.println(rev);
	    System.out.println("length:"+rev.length());
	    
	}
}
