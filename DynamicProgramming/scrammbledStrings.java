package DP;

import java.util.HashMap;

public class scrammbledStrings {
    public static HashMap<String, Boolean> map = new HashMap<>();

	
			public static boolean scrambledstring(String s1 , String s2) {
		        if(map.containsKey(s1 +" "+s2)){
		            return map.get(s1+" "+s2);
		        }
		        if(s1.length() != s2.length()){
		            return false;
		        }
		        if(s1.length() ==0 && s2.length() == 0){
		            return true;
		        }
		        if(s1.equals(s2)){
		            return true;
		        }
		        int n = s1.length();
		        for( int i = 1;i<n;i++){
		            boolean one = (scrambledstring(s1.substring(0,i) , s2.substring(0,i))) && (scrambledstring(s1.substring(i, n), s2.substring(i , n))) ;
		            boolean two = (scrambledstring(s1.substring(0,i), s2.substring(n-i))) && (scrambledstring(s1.substring(i), s2.substring(0,n-i)));
		            
		            if(one||two){
		                
		                 map.put((s1+" "+s2), true) ;
		                return true;
		            }
		        }
		        map.put((s1+" "+s2), false);
		            return false;
		    }
		    
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "great";
		String b = "rgate";
		boolean res = scrambledstring(a,b);
		System.out.println(res);
		
	}

}
