

public class Queue <T> implements QueueInterface <T>
{
	private int size;
	private T [] line;
	private int front,rear,numberPassengers;
	
	//Constructor. gives size to the array of Passenger
	@SuppressWarnings("unchecked")
	public Queue(int s)
	{
		size = s;
		line = (T[]) new Object [size];
		front = 0;
		rear = -1;
		numberPassengers = 0;
	}
	
	// Adds item to the rear of the queue. Increments the current size and adds Passenger
	public void enqueue (T obj)
	{
		if (rear == (size-1))
			{
				rear--;
			}
		line [++rear] =  obj;
		numberPassengers++;
	}
	
	// Takes away Passenger from the front of the queue
	public T dequeue ()
	{
		T temp = line [front++];
		if (front == size)
			front = 0;
		numberPassengers--;
		return temp;
	}
	
	//returns true if the queue is empty
	public boolean isEmpty()
	{
		return (numberPassengers == 0);
	}
	
	//returns true is the queue is full
	public boolean isFull()
	{
		return (numberPassengers == size);
	}
	
	//returns the current number of Passengers
	public int getSize()
	{
		return numberPassengers;
	}
	
	//Clears the Queue
	public void clear()
	{
		@SuppressWarnings("unchecked")
		T [] temp = (T[]) new Object [size];
		line = temp;
	}
}
