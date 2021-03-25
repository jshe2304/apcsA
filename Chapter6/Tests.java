package Chapter6;

public class Tests {
    
    private int test1, test2, test3;
    
    public Tests (int test1, int test2, int test3) {
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
    }
    
    public String toString() {
        String result;
        result = "Grades : \n";
        result += "Test 1 : " + test1 + "\n";
        result += "Test 2 : " + test2 + "\n";
        result += "Test 3 : " + test3 + "\n";
        result += "Average : " + (test1 + test2 + test3)/3;
        return result;
    }
}