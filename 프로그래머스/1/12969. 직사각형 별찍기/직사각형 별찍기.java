import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String star = "*";
        String stars = star.repeat(a);
        for (int i = 0; i < b; i++) {
			System.out.println(stars);
		}
    }
}