class Thread1 extends Thread 
{ 
   public void run() 
   { 
     System.out.println("Thread 1 Started"); 
     for(int i=0; i<5; i++) 
        { 
              System.out.println("\t value of i in Thread 1 : " + i); 
        } 
              System.out.println("Thread1 finished "); 
    } 
} 
class Thread2 extends Thread 
{ 
      public void run() 
    { 
       System.out.println("Thread 2 started"); 
       for(int i=0; i<5; i++) 
           { 
                 System.out.println("\tValue of i in Thread 2 : " + i); 
            } 
                 System.out.println("Thread2 Finished"); 
      } 
} 
class Thread3 extends Thread 
{ 
      public void run() 
    { 
       System.out.println("Thread 3 started"); 
       for(int i=0; i<5; i++) 
           { 
                 System.out.println("\tValue of i in Thread 3 : " + i); 
            } 
                 System.out.println("Thread3 Finished"); 
      } 
} 
 class ThreadPriority 
{ 
         public static void main(String[] args) 
      { 
              System.out.println("Main thread started"); 
              Thread1 thread1 = new Thread1(); 
              Thread2 thread2 = new Thread2(); 
              Thread3 thread3 = new Thread3(); 
              thread3.setPriority(Thread.MAX_PRIORITY);  // priority = 10 
              thread2.setPriority(thread1.getPriority()+1); // priority = 6 
              thread1.setPriority(Thread.MIN_PRIORITY); // priority =l 
              thread1.start(); thread2.start(); thread3.start(); 
             try 
             { 
                 thread1.join();thread2.join();thread3.join(); 
             } 
                 catch(InterruptedException e){} 
                 System.out.println("Main Thread Finished"); 
        } 
} 