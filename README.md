<p><strong>Due to Covid-19, restaurants (if allowed to open) suffer restrictions in their capacities. This assignment realizes
a simulation of a restaurant with waiting guests.</strong></p>
<h6 id="subtask1">Sub-task 1 </h6>
<p>Implement a class <code>GuestWaitingQueue</code> which is thread-safe.
Unboundedly many hungry guests, i.e., <code>Runnable</code> objects should be admitted for waiting.
A call <code>enqueue(Runnable r)</code> enqueues the argument <code>Runnable</code> into the queue.
A call <code>assign()</code> blocks until at least one <code>Runnable</code> is available inside the queue.
Subsequently, a <code>Runnable</code> is extracted and returned.</p>
<p>For the implementation, the class uses a <code>List&lt;Runnable&gt;</code> in order to maintain waiting <code>Runnable</code> objects.
For the list, you may, e.g., use the methods <code>add(Runnable e)</code>, <code>Runnable remove(int index)</code>, and <code>int size()</code>.
As an implementation, you may, e.g., use a <code>LinkedList&lt;&gt;</code>.</p>
<h6 id="subtask2">Sub-task 2</h6>
<p>Now implement the class <code>Table extends Thread</code> which provides the following constructors and methods:</p>
<ul>
<li><code>public Table(GuestWaitingQueue gw)</code>. <br> 
The constructor receives a <code>GuesteWaitingQueue</code> as a parameter.</li>
<li><code>public void run()</code>. <br>
This method tries to get assigned a guest, i.e., a <code>Runnable</code> from <code>GuestWaitingQueue</code> and blocks if this is not possible.
If there an exception occurs during dining, i.e., during execution of <code>run()</code>, the method tries to 
obtain another guest.</li>
<li><code>public synchronized void doStop()</code>. <br>
This method takes care that the <code>Restaurant</code> stops waiting, does no longer start fresh dinings but terminates as soon the current guest (if any) has finished.</li>
</ul>
<h6 id="subtask3">Sub-task 3 </h6>
<p>Implement the class <code>Restaurant</code>. This class receives in its constructor the maximal number of
tables, i.e., threads to be created.</p>
<p>A <code>Restaurant</code> offers for following constructors and methods:</p>
<ul>
<li><code>public Restaurant(int threadCount)</code>. <br>
constructor receiving the number of threads. It should initialize all attributes. 
It should establish the required number of tables and start the corresponding threads.</li>
<li><code>public synchronized void reserve(Runnable task) throws Exception</code> should add <code>Runnable</code> into the queue.
If service has already been stopped, an <code>IllegalStateException</code> should be thrown.</li>
<li><code>public synchronized void stop()</code> terminates waiting as well as execution of all threads and prohibits that further <code>Runnable</code>s are added to the queue.</li>
</ul></div>
</div><!---->
<!---->
</jhi-programming-exercise-instructions>
