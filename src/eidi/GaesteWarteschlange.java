package eidi;

import java.util.*;

public class GaesteWarteschlange {
	private List<Runnable> list;

	public GaesteWarteschlange() {
		this.list = new LinkedList<>();
	}

	public synchronized void einreihen(Runnable r) {
		// TODO
	}

	public synchronized Runnable zuteilen() {
		return null; // TODO
	}
}