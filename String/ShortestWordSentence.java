//Find the shortest word in a sentence.

public class ShortestWordSentence{
	
	public static void main(String [] arg){
		String s="Isddff love java";
		
		String []arr=s.split(" ");
		
		String shortest=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i].length()<shortest.length()){
				shortest=arr[i];
				
			}
			
		}
		
		System.out.println("shortest word is : "+shortest);
		
		
	}



}