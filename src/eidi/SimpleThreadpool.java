package eidi;

import java.util.*;

public class SimpleThreadpool {
	private WartendeRunnables tasks = null;
	private List<SimpleThreadpoolThread> threads = new ArrayList<>();



	public SimpleThreadpool(int threadCount){
        // TODO
	}

	public synchronized void  execute(Runnable task) throws Exception {
        // TODO
	}

	public synchronized void stop(){
        // TODO
	}
}