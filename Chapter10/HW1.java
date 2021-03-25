package Chapter10;

public class HW1 {
    public static String concatenation(String[] array) {
        String concat = "";
        
        for (String i : array) {
            concat += i;
        }
        
        return concat;
    }
    
    public static void main(String[] args) {
        String[] array = {"Hello!", "World", "Hello?", "Java", "Hello!"};
        System.out.println(concatenation(array));
    }
}

/*
Hello!WorldHello?JavaHello!
*/