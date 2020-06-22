import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CalculateArraysThatLeftIsGreaterThanTheRight {

	 // Complete the getSequenceSum function below.
  public static int splitIntoTwo(List<Integer> arr) {
		  
		  int rightSum = 0;
		  int leftSum = 0;
		  int possiblesArray = 0;
		  for (int i = 0; i < arr.size(); i++) {
			  rightSum += arr.get(i);
		  }
		  
		  for (int i = 0; i < arr.size() -1; i++) {
			  Integer currentValue = arr.get(i);
			  
			  leftSum += currentValue;
			  rightSum -= currentValue;
			  if(leftSum > rightSum) {
				  possiblesArray++;
			  }
		  }
		  return possiblesArray;
	   }

	public static void main(String[] args) throws IOException {
		List<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(-5);
		arr.add(6);
		int res = splitIntoTwo(arr);
		System.out.println(res);
	}
}
