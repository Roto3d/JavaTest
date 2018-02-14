package ie.dit;

import java.io.BufferedReader;

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
		
		if(this.altTitle == NULL)
		{
			sb.append(this.x + ", " this.title)
		}
		else
		{
			sb.append(this.x + ", " + this.title + ", " + this.altTitle)
		}
	}
}