package demo3;

public class ReferenceTypes {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		num1 = num2; //num1 points num2/num1 become 20
		num2 = 100;
		
		System.out.println(num1);
		
		

		int[] nums1 = new int [] {1,2,3};
		int[] nums2 = new int [] {10, 20, 30};
		nums1 = nums2; // nums1 points nums2
		
		nums2[0] = 1000; //nums2 index 0 value changed to 1000 that makes num1[0]=1000
		
		System.out.println(nums1[0]); 
		
		
	}

}
