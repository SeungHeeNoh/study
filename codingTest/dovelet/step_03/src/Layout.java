/*
 * ===문제 출처===
 * layout, <http://220.89.64.243/30stair/layout/layout.php?pname=layout>.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;

// public class Main {
// 	public static void main(String[] args) {
// 		new Layout().getLayoutArea();
// 	}
// }

class Layout {
	public Layout() {}

	public void getLayoutArea() {
		try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
			int layoutWidth = parseInt(input.readLine());
			int lineWidth = 0, lineHeight = 0, width = 0, height = 0;
			int w = 0, h = 0;

			while(true) {
				StringTokenizer st = new StringTokenizer(input.readLine());
				w = parseInt(st.nextToken());
				h = parseInt(st.nextToken());

				if(w == -1 && h == -1) break;

				if(lineWidth + w > layoutWidth) {
					width = width < lineWidth ? lineWidth : width;
					lineWidth = w;
					height += lineHeight;
					lineHeight = h;
				}else {
					lineWidth += w;
					lineHeight = lineHeight < h ? h : lineHeight;
				}
			}

			System.out.printf("%d x %d%n", width < lineWidth ? lineWidth : width, height + lineHeight);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}