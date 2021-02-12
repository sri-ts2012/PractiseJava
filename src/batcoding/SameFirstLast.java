package batcoding;

public class SameFirstLast 
{
 
static int[] nums={1,2,1};

	public static void main(String[] args) {
	//	System.out.println(nums[0]);
//	SameFirstLast  s= new SameFirstLast();
	//s.sameFirstLast(nums);
	SameFirstLast.sameFirstLast(nums);
	
	//can also be like below
	/*int[] nums={1,2,1};
	SameFirstLast  s= new SameFirstLast();
	s.sameFirstLast(nums);*/
	}
		
	
	
		public static  boolean sameFirstLast(int[] nums2) {
			  
			  if(nums2.length>=1)
			  {
			  if(nums2[0]==nums2[nums2.length-1])
			  {
			  
			  System.out.println("yessame");
			  return true;
			  }
			  else
			  {
			  
			 System.out.println("different");
			 return false;
		}
			  }
			  
			  else
			  {
				 
			  System.out.println("length less than o");
			  return false;
		
		}
		}
}
		


			