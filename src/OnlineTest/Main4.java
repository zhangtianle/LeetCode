package OnlineTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4 {


	static List<String> res = new ArrayList<>();

	public static List<String> addOperators(String num, int target) {
		helper(num, target, "", 0, 0);
		return res;
	}

	private static void helper(String num, int target, String tmp, long currRes, long prevNum){
		if(currRes == target && num.length() == 0){
			String exp = new String(tmp);
			res.add(exp);
			return;
		}
		for(int i = 1; i <= num.length(); i++){
			String currStr = num.substring(0, i);
			if(currStr.length() > 1 && currStr.charAt(0) == '0'){
				return;
			}
			long currNum = Long.parseLong(currStr);
			String next = num.substring(i);
			if(tmp.length() != 0){

				helper(next, target, tmp+"+"+currNum, currRes + currNum, currNum);
				helper(next, target, tmp+"-"+currNum, currRes - currNum, -currNum);
			} else {
				helper(next, target, currStr, currNum, currNum);
			}

		}
	}
//	}

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		while(scanner.hasNext()) {
			int N = scanner.nextInt();
			int M = scanner.nextInt();
			StringBuilder num = new StringBuilder();
			for (int i = 1; i <= N; i++)
				num.append(i);

			List<String> re = addOperators(num.toString(), M);
			System.out.println(re.size());
		}

	}

}

