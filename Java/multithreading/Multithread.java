
class MultithreadingDemo extends Thread 
{ 
    public void run() 
    { 
        try
        { 
            
            System.out.println ("Thread " +Thread.currentThread().getId() +" is running"); 
  
        } 
        catch (Exception e) 
        { 
            
            System.out.println ("Exception is caught"); 
        } 
    } 
} 
  

public class Multithread 
{ 
    public static void main(String[] args) 
    { 
        int n = 8;
        for (int i=0; i<8; i++) 
        { 
            MultithreadingDemo object = new MultithreadingDemo(); 
            object.start(); 
        } 
    } 
} 
/*

Output :

Thread 8 is running
Thread 9 is running
Thread 10 is running
Thread 11 is running
Thread 12 is running
Thread 13 is running
Thread 14 is running
Thread 15 is running*/
