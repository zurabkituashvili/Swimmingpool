package eidi;

import java.util.*;

//Implement a class GuestWaitingQueue which is thread-safe. Unboundedly many hungry guests, i.e., Runnable objects should be admitted for waiting. A call enqueue(Runnable r) enqueues the argument Runnable into the queue. A call assign() blocks until at least one Runnable is available inside the queue. Subsequently, a Runnable is extracted and returned.
//For the implementation, the class uses a List<Runnable> in order to maintain waiting Runnable objects. For the list, you may, e.g., use the methods add(Runnable e), Runnable remove(int index), and int size(). As an implementation, you may, e.g., use a LinkedList<>.

public class GuestWaitingQueue {
	private List<Runnable> list;

	public GuestWaitingQueue() {
		this.list = new LinkedList<>();


	}


	public synchronized void enqueue(Runnable r) {
		list.add(r);
		notifyAll();


	}

	public synchronized Runnable assign() {
		while (list.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return list.remove(0);
	}
}
