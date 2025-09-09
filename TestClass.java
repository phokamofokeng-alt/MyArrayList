//To compile both java files use: javac MyArrayList.java TestClass.java

public class TestClass
{
        public static void main (String [] args)
        {
            // Create ArrayList composed of string values
            MyArrayList<String> namesArray = new MyArrayList<>();

            // Print out empty array since it hasn't been populated
            System.out.println("Empty Array: " +namesArray);

            // Populate array
            namesArray.add(0, new String ("David"));
            namesArray.add(1, new String("Kevin"));
            namesArray.add(2, new String("Nelson"));
            namesArray.add(3, new String("Peter"));
            namesArray.add(new String("Roger"));

            System.out.println("Populated Array: " +namesArray);

            // Is Mark in the list?
            System.out.println("Is Mark in the List? " +namesArray.contains(new String ("Mark")));
            
            // Place Mark in Kevins index
            namesArray.add(1, new String("Mark"));
            System.out.println("Updated array: " +namesArray);
            
            // remove Nelson
            namesArray.remove(3);
            System.out.println(namesArray);



        }
        

}