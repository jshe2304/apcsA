package Chapter10;

public class ArrayOfObject {

    public static void main (String[] args) {
        Contact_List[] friends = new Contact_List[7];
        //String [] friends = {"jim " , "mike" }
        friends[0] = new Contact_List ("Jason" ,"Lee", "610-555-7384", 123);
        friends[1] = new Contact_List ("Nicholas","Entin", "215-555-3827", 456);
        friends[2] = new Contact_List ("Elizabeth","Lee", "733-555-2969", 789);
        friends[3] = new Contact_List ("Patrick","Lowe", "663-555-3984", 1112);
        friends[4] = new Contact_List ("Kai", "Sun", "464-555-3489", 1213);
        friends[5] = new Contact_List ("Ching", "Lee", "322-555-2284", 1415);
        friends[6] = new Contact_List ("Wesley", "Ho", "243-555-2837", 1617);



        for (int i = 0; i <= friends.length-1 ; i++) {
            System.out.println (friends[i]);
            System.out.println ("--------------------------------");
        }
        
        for (Contact_List index: friends) {
            System.out.println (index);
        }
    }
}