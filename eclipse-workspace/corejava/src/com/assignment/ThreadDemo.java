
//Write a program to create and run multiple threads using the Thread class

package com.assignment;

class MyThread extends Thread 
{
 private String threadName;

 public MyThread(String name) 
 {
     this.threadName = name;
 }

 
 @Override
 public void run() 
 {
     for (int i = 1; i <= 5; i++) 
     {
         System.out.println(threadName + " - Count: " + i);
         try 
         {
             Thread.sleep(500); // Making the thread sleep for 500ms
         } catch (InterruptedException e) 
         {
             System.out.println(threadName + " interrupted.");
         }
     }
     System.out.println(threadName + " finished execution.");
 }
}
public class ThreadDemo 
{public static void main(String[] args) 
{
    
    MyThread thread1 = new MyThread("Thread 1");
    MyThread thread2 = new MyThread("Thread 2");
    MyThread thread3 = new MyThread("Thread 3");

    
    thread1.start();
    thread2.start();
    thread3.start();

    System.out.println("Main thread execution completed.");
}

}
