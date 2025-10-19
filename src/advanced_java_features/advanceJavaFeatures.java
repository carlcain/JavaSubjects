package advanced_java_features;
public class advanceJavaFeatures 
{
   public static void main(String[]args)
   {
      functionalInterface();
       
   }

   // anonymous inner class
   public static void functionalInterface()
   {
      SampleInterface si = new SampleInterface()
      {
         @Override
         public void message(String message)
         {
            System.out.println(message);
         }
      };
      
      si.message("This is a anonymouse inner class");

   }
   
}
