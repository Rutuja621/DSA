class SmallestPositiveMissingInt { 
 
    public static void main(String[] args) { 
 
        int arr[] = {3,4,-1,1}; 
 
        int ans = 1; 
 
        while(true) { 
 
            boolean found = false; 
 
            for(int i=0;i<arr.length;i++) { 
 
                if(arr[i]==ans) { 
                    found = true; 
                    break; 
                } 
            } 
 
            if(!found) 
                break; 
 
            ans++; 
        } 
 
        System.out.println(ans); 
    } 
}