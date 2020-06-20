import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RamsomNote {

	static void checkMagazine(String[] magazine, String[] notes) {

		Map<String, Integer> magazines = new HashMap();
		
		int qtdNote = notes.length;
		
		for (int i = 0; i < magazine.length; i++) {
			 Integer qtdMagazine = magazines.get(magazine[i]);
			if (qtdMagazine != null  && qtdMagazine >= 1) {
				magazines.put(magazine[i],qtdMagazine+1);
			} else {
				magazines.put(magazine[i], 1);
			}
		}
		
		for (int i = 0; i < notes.length; i++) {
			
			if(notes[i] == null) {
				continue;
			}
			
			Integer qtdMagazine = magazines.get(notes[i]);
			if(qtdMagazine >= 1) {
				qtdNote = qtdNote -1;
				magazines.put(notes[i], qtdMagazine -1);
			}else {
				magazines.remove(notes[i]);
			}
			
		}
		

		if (qtdNote == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	public static void main(String[] args) throws FileNotFoundException {

		File f = new File("resources/input13.txt");
		Scanner scanner = new Scanner(f);

		String[] mn = scanner.nextLine().split(" ");

		int m = Integer.parseInt(mn[0]);

		int n = Integer.parseInt(mn[1]);

		String[] magazine = new String[m];

		String[] magazineItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < m; i++) {
			String magazineItem = magazineItems[i];
			magazine[i] = magazineItem;
		}

		String[] note = new String[n];

		String[] noteItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			String noteItem = noteItems[i];
			note[i] = noteItem;
		}

		checkMagazine(magazine, note);

		scanner.close();
	}
}
