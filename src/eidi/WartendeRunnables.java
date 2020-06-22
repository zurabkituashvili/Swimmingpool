package eidi;

import java.util.*;

public class WartendeRunnables {
	private List<Runnable> list;

	public WartendeRunnables() {
		this.list = new LinkedList<>();
	}

	public synchronized void einreihen(Runnable r) {
		// TODO
	}

	public synchronized Runnable zuteilen() {
		return null; // TODO
	}
}