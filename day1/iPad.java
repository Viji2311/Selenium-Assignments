package week3.day1;

public class iPad extends iOS {
	
	public void watchMovie() {
		System.out.println("Watch a movie");
	}
	
	public void watchMovie(String orientation)
	{
		System.out.println("The orientation is"+ orientation);
	}
	
	public void watchMovie(String orientation,int timeout)
	{
		System.out.println("The movie time is"+orientation+timeout);
	}

}
