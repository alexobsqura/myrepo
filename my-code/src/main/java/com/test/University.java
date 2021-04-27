package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class University extends Thread {
	Lock myLock = new ReentrantLock();
	static List<String> students = new ArrayList<String>();

	public void add(String newStudent) {
		myLock.lock();
		try {
			System.out.println("Acquired" + this);
			Thread.sleep(4000);
			students.add(newStudent);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("Released" + this);
			myLock.unlock();
		}
	}

	public static void main(String[] args) {
		University u1 = new University();
		University u2 = new University();
		
		u1.add(newStudent);
	}

}
