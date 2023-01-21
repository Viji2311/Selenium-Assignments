package week3.day1;

public class MyPad extends iPad {
	
	public static void main(String[] args) {
		
		MyPad my = new MyPad();
		my.watchMovie();
		my.watchMovie("Right");
		my.watchMovie("Left", 60);
	}

}
