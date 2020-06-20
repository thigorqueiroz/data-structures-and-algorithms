import java.io.IOException;

public class HourGlasses {
	


    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
    	int bigSum = Integer.MIN_VALUE;
    	for(int i =0;i<arr.length;i++) {
    		for (int j = 0; j < arr[i].length; j++) {
				if (i <= 3 && j <= 3 ) {
    				
    				int sum = sum(arr,i,j);
    				if(sum > bigSum) {
    					bigSum = sum;
    				}
    				
    			}else {
    				break;
    			}
			}
    		
    	}
    	return bigSum;
    }
 
	static int sum(int[][] arr, int i, int j) {
		return (arr[i][j])+ (arr[i][j+1]) + (arr[i][j+2]) +
							(arr[i+1][j+1]) + 
			   (arr[i+2][j]) + (arr[i+2][j+1]) + (arr[i+2][j+2]);
	}

	public static void main(String[] args) throws IOException {
        int[][] arr = new int[][]{
        	  {1,1,1,0,0,0},
        	  {0,1,0,0,0,0},
        	  {1,1,1,0,0,0},
        	  {0,0,2,4,4,0},
        	  {0,0,0,2,0,0},
        	  {0,0,1,2,4,0}
        	};
        	
            int[][] arr1 = new int[][]{
          	  {-9,-9,-9,1,1,1},
          	  {0,-9,0,4,3,2},
          	  {-9,-9,-9,1,2,3},
          	  {0,0,8,6,6,0},
          	  {0,0,0,-2,0,0},
          	  {0,0,1,2,4,0}
          	};

       

        int result = hourglassSum(arr1);
       System.out.println(result);
    }
}
