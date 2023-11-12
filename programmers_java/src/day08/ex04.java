package day08;
import java.util.*;

public class ex04 {
	class Solution{
		public int solution(int a, int b, int c, int d) {
			int[] dice = {a, b, c, d};
			Arrays.sort(dice);
			
			if (dice[0] == dice[3]) {
				return 1111 * dice[0];
			}else if (dice[0] == dice[2]) {
				return (int) Math.pow((10 * dice[0] + dice[3]),2);
			}else if (dice[1] == dice[3]) {
				return (int) Math.pow((10 * dice[1] + dice[0]),2);
			}else if (dice[0] == dice[1] && dice[2] == dice[3]) {
				return (dice[0] + dice[2]) * Math.abs(dice[0] - dice[2]);
			}else if (dice[0] == dice[1] || dice[1] == dice[2] || dice[2] == dice[3]) {
            if (dice[0] == dice[1]) {
                return dice[2] * dice[3];
            }else if (dice[1] == dice[2]) {
                return dice[0] * dice[3];
            }else {
                return dice[0] * dice[1];
            }
			}
			else {
            return dice[0];
			}
		}
	}
}
	

/*import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {

        int[] dice = { a, b, c, d };
        Arrays.sort(dice);

        int ans = 0;

        if (dice[0] == dice[3]) {
            ans = 1111 * dice[3];
        } else if (dice[0] == dice[2] || dice[1] == dice[3]) {
            ans = (int) Math.pow(dice[1] * 10 + (dice[0] + dice[3] - dice[1]), 2);
        } else if (dice[0] == dice[1] && dice[2] == dice[3]) {
            ans = (dice[0] + dice[3]) * (dice[3] - dice[0]);
        } else if (dice[0] == dice[1]) {
            ans = dice[2] * dice[3];
        } else if (dice[1] == dice[2]) {
            ans = dice[0] * dice[3];
        } else if (dice[2] == dice[3]) {
            ans = dice[0] * dice[1];
        } else {
            ans = dice[0];
        }

        return ans;
    }
}*/