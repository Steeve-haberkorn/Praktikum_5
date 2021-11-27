package de.hfu;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class QueueTest {
	private Queue queue;
	
	@Before
	public void erzeugeQueue() {
		queue = new Queue(3);
		
	}
	
	@Test
	public void konstructorTest() {
		assertEquals(queue.head,0);
		assertEquals(queue.tail, -1);
		assertEquals(queue.queue.length, 3);
	}
	
	@Test
	public void queueTest() {
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		assertEquals(2 , queue.queue[0]);
		assertEquals(3 , queue.queue[1]);
		assertEquals(4 , queue.queue[2]);
		queue.enqueue(5);
		assertEquals(5 , queue.queue[2]);
		assertEquals(2,queue.dequeue());
		assertEquals(3,queue.dequeue());
		assertEquals(5,queue.dequeue());
		
		try {
			queue.dequeue();
			}
		catch(Exception e) {
		}
		
		
		
	}
	
	

}
