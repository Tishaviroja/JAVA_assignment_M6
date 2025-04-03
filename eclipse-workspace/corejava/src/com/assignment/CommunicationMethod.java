
//Use inter-thread communication methods like wait(), notify(), and
//notifyAll().

package com.assignment;


class SharedResource 
{
 private int data;
 private boolean hasData = false;


 public synchronized void produce(int value) 
 {
     while (hasData) 
     {
         try {
             wait(); 
         } catch (InterruptedException e)
         {
             e.printStackTrace();
         }
     }
     this.data = value;
     hasData = true;
     System.out.println("Produced: " + data);
     notify(); 
 }

 
 public synchronized void consume() 
 {
     while (!hasData) 
     {
         try 
         {
             wait(); 
         } catch (InterruptedException e) 
         {
             e.printStackTrace();
         }
     }
     System.out.println("Consumed: " + data);
     hasData = false;
     notify(); 
 }
}


class Producer extends Thread 
{
 private SharedResource resource;

 public Producer(SharedResource resource) 
 {
     this.resource = resource;
 }

 @Override
 public void run() 
 {
     for (int i = 1; i <= 5; i++) 
     {
         resource.produce(i);
         try {
             Thread.sleep(500); // Simulate processing delay
         } catch (InterruptedException e)
{
             e.printStackTrace();
         }
     }
 }
}


class Consumer extends Thread 
{
 private SharedResource resource;

 public Consumer(SharedResource resource) 
 {
     this.resource = resource;
 }

 @Override
 public void run()
 {
     for (int i = 1; i <= 5; i++) 
     {
         resource.consume();
         try {
             Thread.sleep(1000); 
         } catch (InterruptedException e)
         {
             e.printStackTrace();
         }
     }
 }
}

//Main class
public class CommunicationMethod 
{
 public static void main(String[] args) 
 {
     SharedResource resource = new SharedResource();

     Producer producer = new Producer(resource);
     Consumer consumer = new Consumer(resource);

     producer.start();
     consumer.start();
 }
}
