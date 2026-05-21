import java.util.Scanner;


public class LongestConsecutive{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a size od array: ");
		int size=sc.nextInt();
		
		int []arr= new int[size];
		System.out.println("Enter array elements: ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
			
		}
		Main solver = new Main();
        int result = solver.longestConsecutive(nums);
        
                  
		System.out.println(result);
		
	}
	
	public int longestConsecutive(int [] nums){
		  if (nums == null || nums.length == 0) return 0;

        int maxLen = 0;

        for (int num : nums) {
            // Only start counting if 'num' is the start of a sequence
            if (!contains(nums, num - 1)) {
                int currentNum = num;
                int currentLen = 1;

                // Look for consecutive numbers manually
                while (contains(nums, currentNum + 1)) {
                    currentNum++;
                    currentLen++;
                }

                // Manual replacement for Math.max()
                if (currentLen > maxLen) {
                    maxLen = currentLen;
                }
            }
        }
        return maxLen;
		
		
	}
	
	private boolean contains(int []arr,int target){
		for(int num:arr){
			if(num == target){
				return true;
			}
			return false;
		}

	}		



}