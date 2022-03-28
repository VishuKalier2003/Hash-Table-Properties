/*Properties and UIDefaults extends to HashTable which further extends to Dictionaries, created as a Class.
The HashTable implements HaspMap, it is serializable and cloneable.*/
import java.util.*;
public class TableProperties 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = "Recent Hashtable is:";
        Hashtable<Integer, String> Ht = new Hashtable<>();  // It extents dictionary of (K,V) and Implements Map (K,V)
        Ht.put(10, "Dog");
        Ht.put(-13, "Cat");   // Adding Values in Table based on Key-Value pairs
        Ht.put(340, "Bear");
        System.out.println(str+" "+Ht);
        Ht.remove(-13);                   // Removing Values from Table based on Key
        System.out.println(str+" "+Ht);
        Ht.put(-13, "Lion");              // Removing Values from Table based on Key-Value pairs
        System.out.println(str+" "+Ht);
        Ht.remove(-13, "Lion");
        System.out.println(str+" "+Ht);    // If the Value mapped given Key is present return it, else return the 
        System.out.println(Ht.getOrDefault(-13, "Not Found in Hash table !!"));  // default value set to the function
        Ht.putIfAbsent(-13, "Tiger");   // If the Value with the given Key is not present in Hash Table add the Key-Value pair
        Hashtable<Integer, String> Ht1 = new Hashtable<>(10, 0.75f);
        Ht1.put(12, "name");
        sc.close();
    }
}