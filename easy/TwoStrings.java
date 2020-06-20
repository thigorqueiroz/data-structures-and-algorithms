import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoStrings {
	
	
	// Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
    	char[] s1Char = s1.toCharArray();
    	char[] s2Char = s2.toCharArray();
    	boolean contains = false;
    	Map<Character, Integer> dic1 = new HashMap<Character,Integer>();
    	
    	for (int i = 0; i < s1Char.length; i++) {
    		Integer qtdLetr = dic1.get(s1Char[i]);
    		
    		if(qtdLetr != null && qtdLetr >= 1) {
    			dic1.put(s1Char[i],qtdLetr+1 );
    		}else {
    			dic1.put(s1Char[i],1);
    		}
		}
    	
    	for (int i = 0; i < s2Char.length; i++) {
			Integer qtdLtr = dic1.get(s2Char[i]);
			
			if(qtdLtr == null) {
				continue;
			}
			
			if(qtdLtr >= 1) {
				contains = true;
				break;
			}
		}
    	
    	
    	
    	return contains ? "YES": "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }

}
