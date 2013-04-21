

public interface QueueInterface<T> 
{
	public void enqueue (T obj);
	public T dequeue();
	public boolean isEmpty();
	public boolean isFull();
	public int getSize();
}
