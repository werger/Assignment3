
public class Passenger
{
	int id;
	int destination;
	public Passenger(int i, int d)
	{
		id=i;
		destination =d;
	}
	public int getID()
	{
		return id;
	}
	public int getDestination()
	{
		return destination;
		
	}
	public String toString()
	{
		return "Passenger " + id + "  is traveling to " + destination;
	}

}
