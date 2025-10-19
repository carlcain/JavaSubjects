package advanced_java_features;
public class advanceJavaFeatures 
{
   public static void main(String[]args)
   {
      functionalInterface1();
      functionalInterface2(); 
      functionalInterface3(); 
   }

   // TODO: 
   // note in a Interface you need to apply every method that you created in the interface 
   // when instantiating a new anonymouse class

   // anonymous inner class 1
   // note: 
   // this is a class that good for Good Quick one time use
   public static void functionalInterface1()
   {
      new SampleInterface()
      {
         @Override
         public void message(String message)
         {
            System.out.println(message);
         }
      }.message("This is a anonymouse inner class");
   }

   // anonymous inner class 2
   // note:
   // just the same as the functionalInterface1 that 
   // but it instatiating the object and what is the class name  
   public static void functionalInterface2()
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

   // anonymous inner class 2
   // note:
   // 
   public static void functionalInterface3()
   {
      SampleInterface si= (x) -> { // the message here is a parameter name
         System.out.println(x);
      };

      si.message("This is a Lambda inner class");

   // SampleInterface si = (a, b) -> { a + b;};
   }
   
}
