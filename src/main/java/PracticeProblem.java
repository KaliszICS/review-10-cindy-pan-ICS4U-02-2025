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
		int numStars=0;
		if (num ==1){
			astrix = astrix +"*";
		}
		else {
				for (int rowsOf = 1; rowsOf<=num; rowsOf++){
					if (rowsOf==1){
					for (numStars = 0; numStars<num; numStars++){
						astrix = astrix +"*";
					}
				}
					else if ( rowsOf==num){
						astrix = astrix+"\n";
						for (numStars = 0; numStars<num; numStars++){
							astrix = astrix +"*";
					}
				}
				else {
					for (numStars = 0; numStars<num; numStars++){
					if (numStars==0){
					astrix = astrix+"\n*";
					}
					else if (numStars==num-1){
						astrix = astrix +"*";
					}
					else {
						astrix = astrix+" ";
					}
				}
			} 
		}
		}
		return astrix;
	}

	public static boolean hasLowercase(String word){
		String tester = word.toLowerCase();
		int letterAt = 0;
		boolean contains = false;
		int length = word.length();
		boolean numTest = word.contains("1");
		if (word.length()!=0){
		if (numTest==false){
		for (int lowerExist=(-1); letterAt<length; letterAt++){
			
			contains = (tester.charAt(letterAt)==word.charAt(letterAt));
	
		}
	}
}
	return contains;
	
}
}
