package Chapter10;

public class ArrayEx2 {
    public static void main(String[] args) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        String[] str = {"Adam", "Susan", "Jim", "D"};
        int[] num = {1, 2 ,3 ,4 ,5 ,6 ,7 ,8 ,9};
        double[] numD = {11.5, 11, 0.25, 5.5};
        
//        for (int i = 0; i < num.length; i++) {
//            System.out.println(num[i]);
//        }
        
        for ( char i : vowels) {
            System.out.print(i + "\t");
        }
        
        System.out.println();
        
        for ( String i : str) {
            System.out.print(i + "\t");
        }
        
        System.out.println();
        
        for ( int i : num) {
            System.out.print(i + "\t");
        }
        
        System.out.println();
        
        for ( double i : numD) {
            System.out.print(i + "\t");
        }
    }
}
