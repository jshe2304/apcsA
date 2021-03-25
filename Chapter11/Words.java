package Chapter11;

public class Words {
    public static void main (String[] args) {
        Dictionary webster = new Dictionary (3000, 6000, 100);
        Dictionary oxford = new Dictionary (1000, 6000, 200);
        
        webster.pageMessage();
        webster.pictureMessage();
        webster.definitionMessage();
        
        oxford.pageMessage();
        oxford.pictureMessage();
        oxford.definitionMessage();
    }
}