

import java.util.ArrayList;
public class station 
{
	private Queue <Passenger> line;
	private ArrayList <Passenger> pass;
	private int pIN;
	private int pOUT;
	private int total;
	
	//Constructor. creates a new queue of size 100
	public station ()
	{
		line = new Queue <Passenger> (100);
		pass = new ArrayList <Passenger>(100);
		reset ();
	}
	
	//simulate the Station. adds or drops passengers
	//int i represents station. there are 10 stations. if the train reaches the last station, all the passengers get out
	public void simulation ()
	{
		for (int i = 0; i < 10 ; i++)
			{
			pIN = 0;
			pOUT = 0;
				if (i == 9)
					{
						System.out.println ("last Station");
						print (i+1, 0, line.getSize(),0);
						reset();
					}
				else
					{
						for (int j = 0; j < (int) (Math.random()*20+1) ; j++)
						{
							pass.add(new Passenger (i, (int)(Math.random()*10+1)));
							line.enqueue(pass.get(j));
							pIN++;
						}
						for (int j = 0; j < pass.size(); j++)
						{
							if (pass.get(j).destination == i)
								{
									line.dequeue();
									pOUT++;
								}
					}
					print (i+1, pIN, pOUT, line.getSize());
					}
			}
		total = line.getSize();
	}
	
	//prints out the Station, the number of passengers in the station waiting to board
	// and number of passengers in train waiting to get out
	public void print(int stop, int pIN, int pOUT, int totalPass)
	{
		System.out.println();
		System.out.println ("Station:\t" + stop + "\n" + "Passengers IN:\t" + pIN 
							+ "\n" + "Passengers Out:\t" + pOUT + "\n" 
							+ "Total Passengers in train:\t" + totalPass + "\n");
	}
	
	//resets the number of Passengers
	public void reset ()
	{
		line.clear();
		pIN = pOUT = total = 0;
	}
	
	//returns total number of Passengers
	public int getTotal()
	{
		return total;
	}
}
