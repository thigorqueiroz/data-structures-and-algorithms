import java.util.Scanner;

public class LetsReview {
	
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

        
        int n = scanner.nextInt();
        
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String[] arr = new String[n];
        
        for (int i = 0; i < arr.length; i++) {
        	arr[i] = scanner.nextLine();
		}
        
        char[] charEmpty = new char[1];
        for (int k = 0; k < arr.length; k++) {
        	char[] charTemp = arr[k] != "" ? arr[k].toCharArray() : charEmpty;
        	for (int l = 0; l < charTemp.length; l++) {
        		if(l%2==0) {
    				System.out.print(charTemp[l]);
    			}
			}
        	System.out.print(" ");
        	
        	for (int l = 0; l < charTemp.length; l++) {
        		if(l%2>0) {
    				System.out.print(charTemp[l]);
    			}
			}
        	
        	System.out.print("\n");
		}
        scanner.close();
    
	}
}
