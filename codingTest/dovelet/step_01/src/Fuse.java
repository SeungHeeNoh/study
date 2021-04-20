/*
 * ===문제 출처===
 * fuse, <http://220.89.64.243/30stair/fuse/fuse.php?pname=fuse&stair=1>.
 * */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringTokenizer st = new StringTokenizer(br.readLine());
// 		br.close();

// 		Fuse run = new Fuse(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
// 		System.out.println(run.getFuseVolumne() + " amperes");
// 	}
// }

class Fuse {
	int computerCount, printCount, routerCount;

	final float COMUTER_ELECTRIC = 2.5f;
	final float PRINT_ELECTRIC = 2.0f;
	final float ROUTER_ELECTRIC = 0.5f;

	Fuse() {}

	Fuse(int computerCount, int printCount, int routerCount) {
		this.computerCount = computerCount;
		this.printCount = printCount;
		this.routerCount = routerCount;
	}

	int getFuseVolumne() {
		return (int)((computerCount*COMUTER_ELECTRIC + printCount*PRINT_ELECTRIC + routerCount*ROUTER_ELECTRIC)*2 + 9)/10*10;
	}
}