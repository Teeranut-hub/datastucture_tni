
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int[] nums = {23, 67, 8, 91, 45, 12, 78};
        
        System.out.println("Length = " + nums.length);
        System.out.println("The first element = " + nums[0]);
        System.out.println("The last element = " + nums[nums.length-1]);
        System.out.println("The last element = " + nums[nums.length/2]);
        
        System.out.println("Display all elements:");
        boolean first_element = true;
        
        //for(int i=0; i<nums.length i++)
        for(int num : nums) {
        	//if (!first_element) {         //if (i ==0){
        	                              //System.out.print(", ")
        	//	System.out.print(", ");   //}
        	//}                             //System.out.print(", " + nums[i])
        	System.out.print((!first_element ? ", " : "") + num);
        	//System.out.print((i==0 ? ", " : "") + nums[i]);
        	first_element = false;
        }
	}
	

}
