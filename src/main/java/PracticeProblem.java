public class PracticeProblem {

	public static String pyramid(int num){
		String astrix = "";
		if (num==1){
			astrix = astrix+"*";
		}
		else {
		for (int row = 1; row<=num; row++){
			for (int star = (0); star < row; star++){
				if (row == 1){
					astrix = astrix + " ";
					astrix = astrix +" *";
				}
				else if (row==num&&star==0){
					astrix = astrix + "*";
				}
				else {
				astrix= (astrix+" *");
				}
			}
			if (row!=num){
			astrix = (astrix+"\n");
			}
		}
	}
		return astrix;
	}


	public static String square(int num){
		String astrix = "";
		for (int row = num; row<=num&&row>=0; row--){
			for (int star = 0; star < row; star++){
				if (row == num){
					astrix = astrix +"*";
				}
			}
		}
		return astrix;
	}

	public static boolean hasLowercase(String word){
		return true;
	}
}
