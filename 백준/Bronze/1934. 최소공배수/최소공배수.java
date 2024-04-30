import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < count; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int max = Math.max(a, b);
			int min = Math.min(a, b);
			
			int gcd = gcd(max, min);
			System.out.println(max * min / gcd);
		}
	}

	private static int gcd(int max, int min) {
		int temp = max % min;
		if(temp == 0) {
			return min;
		}
		return gcd(min, temp);
	}
}
