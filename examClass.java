public class examClass{//Start of class

private String[] correctAnswers = {"B","D","A","A","C",
						   "A","B","A","C","D",
						   "B","C","D","A","D",
						   "C","C","B","D","A"};
private String[] userAnswers;

int[] missed = new int[correctAnswers.length];

public  String driverExam(String[] Answers){

	userAnswers = new String[Answers.length];

	for(int index=0;index<Answers.length;index++){
	userAnswers[index]=Answers[index];
}//end of for
return;// MISSING RETURN HERE?
}


public boolean passed(){
if(totalCorrect()>=15)
return true;

else
return false;
}

public int totalCorrect(){
	int correctCount = 0;
	for(int index=0;index<correctAnswers.length;index++){
		if(userAnswers[index].equalsIgnoreCase(correctAnswers[index])){
			correctCount++;
}
}
     return correctCount;

}
	public int totalIncorrect(){
		int incorrectCount = 0;

		for(int index=0;index<correctAnswers.length;index++){
			if(!userAnswers[index].equalsIgnoreCase(correctAnswers[index])){

				missed[incorrectCount] = index;
				incorrectCount++;
}
}
		return incorrectCount;
}
public int[] questionsMissed(){
	return missed;
}

}

