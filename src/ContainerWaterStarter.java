package src;

class ContainerWaterStarter {
	
	public static void main(String[] args) {
		
		maxArea(new int[] {1,8,6,2,5,4,8,3,7});
	}
	
	 public static int maxArea(int[] height) {
	        int startIndex=0;
	        int endIndex=height.length-1;
	        int maxValue=1;
	        while(startIndex<endIndex) {
	        	int currValue=(endIndex-startIndex) * Math.min(height[startIndex], height[endIndex]);
	        	maxValue=Math.max(maxValue, currValue);
	        	if(height[startIndex]<=height[endIndex]) {
	        		startIndex++;
	        	}
	        	else {
	        		endIndex--;
	        	}
	        	
	        }
	        return maxValue;
	    }

}

 