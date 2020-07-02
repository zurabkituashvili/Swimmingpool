package eidi;

import java.util.*;

public class Restaurant {
	private GaesteWarteschlange tasks = null;
	private List<Tisch> threads = new ArrayList<>();



	public Restaurant(int threadCount){
        // TODO
	}

	public synchronized void  essen(Runnable task) throws Exception {
        // TODO
	}

	public synchronized void stop(){
        // TODO
	}
}