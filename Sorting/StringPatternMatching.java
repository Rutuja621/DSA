

class StringPatternMatching { 
 
    public static void main(String[] args) { 
 
        String s = "abcabcbb"; 
 
        int max = 0; 
 
        for(int i=0;i<s.length();i++) { 
 
            for(int j=i+1;j<=s.length();j++) { 
 
                String sub = s.substring(i,j); 
 
                boolean flag = true; 
 
                for(int k=0;k<sub.length();k++) { 
 
                    for(int l=k+1;l<sub.length();l++) { 
 
                        if(sub.charAt(k)==sub.charAt(l)) 
                            flag = false; 
                    } 
                } 
 
                if(flag && sub.length()>max) 
                    max=sub.length(); 
            } 
        } 
 
        System.out.println(max); 
    } 
}