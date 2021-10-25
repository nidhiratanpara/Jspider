package com.demo.thread;

class Q
{
	int n;
	boolean valueSet=false;
	
	synchronized int get()
	{
		while(! valueSet)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException caugth");
			}
		System.out.println("Got: " +n);
		valueSet=false;
		//notify();
		return n;
	}
	synchronized void put(int n)
	{
		while(valueSet)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException caugth");
			}
		this.n=n;
		valueSet=true;
		System.out.println("put :" +n);
		notify();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

class Producer implements Runnable
{
	 Q q;
	 
	 Producer(Q q)
	 {
		 this.q=q;
		 new Thread(this,"Producer").start();
	 }

	@Override
	public void run() {
           int i=0;
           while(true)
           {
        	   q.put(i++);
           }
	}
	 }
class Consumer implements Runnable
{
	Q q;
	
	Consumer(Q q)
	{
		this.q=q;
		new Thread(this,"Consumer").start();
	}

	@Override
	public void run() {
		while(true)
		{
			q.get();
		}
		
	}}
public class Demo1 {

	public static void main(String[] args) {
		Q q=new Q();
		new Producer(q);
		new Consumer(q);
System.out.println("press contol-C to stop");
	}

}
