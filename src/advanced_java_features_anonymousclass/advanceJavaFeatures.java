package advanced_java_features_anonymousclass;
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

   // anonymous class = an inner class without a name
	// 	   				only a single object is created from one
	// 	  					The object may have “extras” or "changes"
	// 	 					and no need to create a separate innerclass
	// 	 					when it is only need it once.
	// 	 					Helps us to avoid cluttering code with a class name
	
	// 	 					Syntax is similar to a constructor,
	// 	  					except that there is also a class definition
	// 	  					within a block of code.		
	// 	  					GREAT FOR LISTENERS

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
   // usses the lambda or known as anonymous method
   // to make and anonymouse inner class
   public static void functionalInterface3()
   {
      SampleInterface si= (x) -> { // the message here is a parameter name
         System.out.println(x);
      };

      si.message("This is a Lambda annonymouse class");

   // SampleInterface si = (a, b) -> { a + b;};
   }
   
}
