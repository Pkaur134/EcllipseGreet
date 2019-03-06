package questionClass;
public abstract class Question {
private int questionId;
private String questionText;
protected QuestionType questionType;
Question() {
this.questionText = "TBD";
this.questionId = 1;
}
Question(int id, String text) {
this.questionText = text;
this.questionId = id;
}
public int getQuetionId() {
return questionId;
}
public void setQuetionId(int quetionId) throws IllegalArgumentException {
if(quetionId<=0){
throw new IllegalArgumentException(" Question id is Invalid, must be greater than 0");
}
this.questionId= quetionId;
}
public String getQuestionText() {
return questionText;
}
public void setQuestionText(String questionText)
throws IllegalArgumentException {
if(questionText== null || questionText.length()!=0){
throw new IllegalArgumentException("Question text is invalid, cannot be empty");
}
this.questionText= questionText;
}
public abstract boolean isCorrect(Object object);
public String toString() {
if(this.questionText.equals("TBD")){
return "#" + this.questionId+": No question text entered";
}
return "#" + this.questionId+": "+ this.questionText +".";
}
}