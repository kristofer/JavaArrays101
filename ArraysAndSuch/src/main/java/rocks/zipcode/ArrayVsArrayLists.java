package rocks.zipcode;

import java.util.ArrayList;

public class ArrayVsArrayLists {

    private void soSomething() {

        // AUTOBOX-ing

        ArrayList<Integer> arraylistobject = new ArrayList<>();
        arraylistobject.add(23); // try to add 23 (primitive)

        // is actually
        Integer foo = new Integer(42);

        arraylistobject.add(new Integer(23));
        // Converted int primitive to Integer object and added to arraylistobject

        Integer arrayobject[] = new Integer[3];
        int arraylength = arrayobject.length; // uses arrayobject length variable
        arraylistobject.add(12);
        arraylistobject.size(); // uses arraylistobject size method

        // Adding things
        Integer addarrayobject[] = new Integer[3];

        // to Array
        addarrayobject[0] = 9; // new object is added to the array object

        // to ArryList
        arraylistobject.add(12);

        Integer twoDarray[][] = new Integer[3][2];
        twoDarray[0][0] = new Integer(8);

        // Array:
        String[] villains = new String[5];
        // ArrayList:
        ArrayList<String> heroes = new ArrayList<String>();

        // Add Items
        // Array:
        villains[0] = "Dark Pheonix";
        villains[1] = "Deadshod";
        villains[2] = "CatWoman";
        villains[3] = "Green Goblin";
        villains[4] = "Poison Ivy";

        // ArrayList:
        heroes.add("Hellboy");
        heroes.add("Storm");
        heroes.add("Spawn");
        heroes.add("Silver Surfer");
        heroes.add("Mr. Fantastic");

        // Access an Item
        // Array:
        String ss = villains[3];

        // ArrayList:
        heroes.get(3);

        // Change an Item
        // Array:
        villains[4] = "Apocalypse";

        // ArrayList:
        heroes.set(4, "The Tick");

        // Remove an Item
        // Array:

        // There is no way to remove and item from an array.
        // You will need to duplicate values into a new array without the value to
        // remove.

        // ArrayList:
        heroes.remove(0);

        // Clear an Item
        // Array:

        // There is no way to clear an array.
        // You will need to create a new array

        // ArrayList:
        heroes.clear();

        // Length of Data Structure
        // Array:

        int l = villains.length;

        // ArrayList:
        heroes.size();

    }

    public static void main(String[] args) {
        ArrayVsArrayLists demoObj = new ArrayVsArrayLists();
        demoObj.soSomething();
    }
}
