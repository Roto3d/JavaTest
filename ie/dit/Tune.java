package ie.dit;

import java.io.BufferedReader;
import java.lang;

public class Tune
{
	private int x;
	private String title;
	private String altTitle;
	private String notation;
	
	public int getX()
	{
		return x;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getAltTitle()
	{
		return altTitle;
	}
	
	public String getNotation()
	{
		return notation;
	}
	
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		
		if(getAltTitle(altTitle) == NULL)
		{
			sb.append(getX(x) + ", " getTitle(title).title)
		}
		else
		{
			sb.append(getX(x) + ", " + getTitle(title) + ", " + getAltTitle(altTitle))
		}
	}
	
	interface Player
	{
		public void play();
	}
	
	public class Playermethod implements Player
	{
		public void play()
		{
			System.out.println(getNotation(notation))
		}
		
		public static void main(String args[])
		{
			Playermethod player = new Player();
			m.play();
		}
	}
}