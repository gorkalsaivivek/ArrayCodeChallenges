package src;

public class TrappingWater {
	public static void main(String[] args) {
		trap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1});
	}
	
	public static int trap(int[] height) {
		
		int curr=0;
		int next=curr+1;
		int sumValue=0;
		//if curr is less than next, neglect it
		while(next<height.length-1) {
			if(height[curr]<=height[next]) {
				curr++;
				
			}
			else {
				sumValue+=next-curr;
				next++;
			}
		}
		return sumValue;
        
    }

}
