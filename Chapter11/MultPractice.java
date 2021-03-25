package Chapter11;

public class MultPractice implements StudyPractice {
    public int int1;
    public int int2;
    public MultPractice (int int1, int int2) {
        this.int1 = int1;
        this.int2 = int2;
    }
    
    public String getProblem() {
        String result = int1 + " x " + int2 + " = _____";
        return result;
    }
    
    public void nextProblem() {
        int2 ++;
    }
}

