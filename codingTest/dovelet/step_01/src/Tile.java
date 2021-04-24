/*
 * ===문제 출처===
 * tiles, <http://220.89.64.243/30stair/tiles/tiles.php?pname=tiles>.
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

// 		System.out.println(new Tile(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())).getResult());
// 	}
// }

class Tile {
	int x, y;

	final int TILE_SIZE = 8;

	public Tile() {}

	public Tile(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String getResult() {
		int tileCount = 0,
			restTileCount = 0,
			xTileCount = x / TILE_SIZE,
			yTileCount = y / TILE_SIZE;

		boolean xHasRest = x % TILE_SIZE > 0,
				yHasRest = y % TILE_SIZE > 0;

		tileCount = xTileCount * yTileCount;
		restTileCount = (xHasRest ? yTileCount : 0) + (yHasRest ? xTileCount : 0) + (xHasRest && yHasRest ? 1 : 0);

		return "The number of whole tiles is " + tileCount + " part tiles is " + restTileCount;
	}
}