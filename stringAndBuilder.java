public class stringAndBuilder {
    public static void main(String[]args){
        int []arr={2,3,4,5,6,7};
        String name = "Prathap M Eswar";
        //System.out.println(name);
        String surname = "Prathap M Eswar";

        // AFTER ADDING BELOW DATA IN HEAP MEMOMRY it CREATES NEW OBJECT "eswar prathap"
        // "prathap M eswar" Will be leaved out to Garbage collection.
        // name = "eswar prathap";
       // System.out.println(name);

        // To Avoid the Above Conflict we can be cautious as below:
         String  name1= new String("RAMA");
         String name2 = new String("RAMA");
         // HERE IN this in heap memory two different objects are created.I

        if (name == surname){
            System.out.println("TRUE");
        }

        if ( name1 == name2){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }

        System.out.println(name1.equals(name2));
        //1
        StringBuilder builder = new StringBuilder();
        for (int i=0;i<26;i++){
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder.toString());

        //2
        StringBuilder builder2 = new StringBuilder("Tony");
        System.out.println(builder2);
        builder2.setCharAt(0,'P');
        System.out.println(builder2);
        builder2.insert(0,'S');
        System.out.println(builder2);
    }
}
