package Advance_java_features_HashAndMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

public class HashAndMap 
{
   public static void main(String[]args)
   {
      MapSample1();
      //MapSample2();
      LinkedHashedMap1();
      TreeHashMap1();
   }


    // HashSample1
    // note:
    // this Hashmap uses the key value to search and get a specific value
   public static void MapSample1()
   {
      // HashMap <key, Value>
      HashMap<Integer, String> sampleMap = new HashMap<>();
      sampleMap.put(1, "user1");
      sampleMap.put(2, "user2");
      sampleMap.put(3, "user3");

      // this will loop to the map 
      for(Integer names: sampleMap.keySet())
      {
          // this will search for a key and get the values of that key
          String name = sampleMap.get(names); 
          System.out.println("HashSample1: "+name);
      }
   }  

   
   // HashSample1
   // note:
   // this will put a user on the HashMap and find a slot that is not occupied
   public static void MapSample2()
   {
      HashMap<Integer, String> Users = new HashMap<>();

      Scanner sc = new Scanner(System.in);
      Random r = new Random();

      // loop while it contains key
      int key = 0; // default
      while(true)
      {
         System.out.print("Insert Name: ");
         String name = sc.nextLine();

         key = r.nextInt(10);

        // Note:
        // Once if or else if is true, the rest are skipped.
        // use a simple if outside the main condition.
         if(name.equalsIgnoreCase("Exit")) // end loop and allow the user to type "exit" in any letter case
         {
            System.out.println("e");
            break; // exit the loop even if its true
         }

         if(Users.containsKey(key)) // it finds a similar key
         {
            System.out.println("slot taken: find slot");
            continue;
         }
         else if(!Users.containsKey(key)) // it didnt find a similar key 
         {
            System.out.println("slot is free: insert User");
            Users.put(key, name);
         }
      }

      // see all of the inserted user
      for(Integer i: Users.keySet())
      {
         System.out.println("key: "+i+" ,user: "+Users.get(i));
      }
   }


   // HashSample1
   // note:
   // example of the linked HashMap 
   public static void LinkedHashedMap1()
   {
      LinkedHashMap<Integer, String> lh = new LinkedHashMap<>();
      lh.put(1, "user1");
      lh.put(2, "user2");
      lh.put(3, "user3");

      // this will iterate all of the values inside of the LikedHashMap
      // the parameters needed to be the same on the Map.Entry<Integer, String> 
      for(Map.Entry<Integer, String> map: lh.entrySet())
      {
         System.out.println("Linked Hash Map = Key: "+map.getKey()+", User: "+ map.getValue());
      }
   }


   // TreeHashMap1
   // note:
   public static void TreeHashMap1()
   {
      HashMap<Integer, String> lh = new HashMap<>();
      lh.put(2, "user2");
      lh.put(1, "user1");
      lh.put(3, "user3");

      TreeMap<Integer, String> t = new TreeMap<>(lh);

      for(Map.Entry<Integer, String> map: t.entrySet())
      {
         System.out.println("Tree Hash Map = Key: "+map.getKey()+", User: "+ map.getValue());
      }
   }
}
