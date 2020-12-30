package eidi;

import java.util.*;

public class Restaurant {
	private GuestWaitingQueue tasks = null;
	private Table[] threads = null;
	// private List<Table> threads = new ArrayList<>();

	public Restaurant(int threadCount){
        // TODO
	}

	public synchronized void  reserve(Runnable task) throws Exception {
        // TODO
	}

	public synchronized void stop(){
        // TODO
	}
}
