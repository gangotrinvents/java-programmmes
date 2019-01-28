package VideoStore;

public class Video {
	String name;
	boolean flag;
	int rating;
	public boolean beingCheckedout()  //if someone already taken away movie
	{
		flag=false;
		return flag;
	}
	public boolean beingReturned()  //if movie is returned back
	{
		flag=true;
		return flag;
	}
	public int rating(int rate)   //rating of movie
	{   
		rating=rate;
		return rate;
		
	}
}
