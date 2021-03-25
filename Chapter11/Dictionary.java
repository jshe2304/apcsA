package Chapter11;

public class Dictionary extends Book {
    
    private int definitions;
    
    public Dictionary (int pages, int definitions, int pictures) {
        super (pages, pictures);
        this.definitions = definitions;
    }
    
    public void definitionMessage () {
        System.out.println ("Number of definitions: " + definitions);
        System.out.println ("Definitions per page: " + definitions/pages);
    }
}
