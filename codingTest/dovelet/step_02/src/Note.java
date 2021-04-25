/*
 * ===문제 출처===
 * coci_note, <http://220.89.64.243/30stair/coci_note/coci_note.php?pname=coci_note>.
 * */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws Exception {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		System.out.println(new Note(br.readLine()).getResult());
// 		br.close();
// 	}
// }

class Note {
	String input;

	public Note() {}

	public Note(String input) {
		this.input = input;
	}

	public String getResult() {
		String result;

		StringTokenizer st = new StringTokenizer(input);
		int arr[] = new int[8];
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		result = arr[0] < arr[1] ? "ascending" : "descending";
		for(int i=1; i<arr.length-1; i++) {
			if(arr[i] < arr[i+1]) {
				if(result != "ascending") {
					result = "mixed";
					break;
				}
			}else {
				if(result != "descending") {
					result = "mixed";
					break;
				}
			}
		}

		return result; 
	}
}