
//Implement thread synchronization using synchronized blocks or methods.

package com.assignment;

class Counter 
{
 private int count = 0;

 public synchronized void increment() 
 {
     count++;
     System.out.println(Thread.currentThread().getName() + " - Count: " + count);
 }

 public int getCount() 
 {
     return count;
 }
}


class WorkerThread extends Thread 
{
 private Counter counter;

 public WorkerThread(Counter counter, String name) 
 {
     super(name);
     this.counter = counter;
 }

 @Override
 public void run() {
     for (int i = 0; i < 5; i++) 
     {
         counter.increment();
         try {
             Thread.sleep(200); 
         } catch (InterruptedException e) 
         {
             System.out.println(Thread.currentThread().getName() + " interrupted.");
         }
     }
 }
}


public class Syncronaization {
 public static void main(String[] args) {
     Counter counter = new Counter();

    
     WorkerThread thread1 = new WorkerThread(counter, "Thread A");
     WorkerThread thread2 = new WorkerThread(counter, "Thread B");

     thread1.start();
     thread2.start();

     try 
     {
         thread1.join();
         thread2.join();
     } catch (InterruptedException e) 
     {
         System.out.println("Main thread interrupted.");
     }

     System.out.println("Final Count: " + counter.getCount());
 }
}

