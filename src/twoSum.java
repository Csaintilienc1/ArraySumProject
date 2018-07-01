
public class twoSum {
	
	public static int twoSum(int[] nums, int target) {
        int Sum=0;
        		for(int n=0;n<=nums.length-1;n++){
        		  for(int k=n+1;k<=nums.length-1;k++) {
        			  	Sum=+ nums[n]+nums[k];
        			  	if(Sum==target) {
        			  		System.out.println("Sum Match with digits "+ nums[n]+ "and" +nums[k]);
        			  		return Sum ;
        			  	}
        			  	else {
        			  		System.out.println("No match. Try again ");
        	   }
       	 	}
        }
	  		return Sum;   
	}

  public static void main(String args[]) {
		int[] ar= {3,4,5,5,6,1};

		int test=twoSum(ar,100);
		System.out.println(test);
		
  }
}
