
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayController nums = new ArrayController();
		nums.display("All elements:");
		
		int[] new_num = new int[nums.getSize() +1];
		
		for (int i=0; i<nums.getSize(); i++) {
			new_num[i] = nums.getNums()[i];
		}
		
		nums.setNums(new_num);
		nums.display("\n\nAfter add size:");
		
		nums.getNums()[nums.getSize()-1] = 15;
		nums.display("\n\nAfter added the last element:");
	}

}
