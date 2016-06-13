package SoccerStats;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Game {
	
	public Game()
	{	
	}
	
	public static void downloadFile ()
	{
		try
		{
			FileReader file = new FileReader("first_part.csv");
			BufferedReader bufRead = new BufferedReader(file);
			
			String line = bufRead.readLine();
			while (line!=null)
			{
				String[] array = line.split(",");
				int id = Integer.parseInt(array[0]);
				float val = Float.parseFloat(array[6]);
				
				line = bufRead.readLine();
			}
			bufRead.close();
			file.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void parseDate()
	{
		String timeString = null;
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		try
		{
			Date timeOfLine = df.parse(timeString);
		}
		catch (ParseException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main (String[] args)
	{
		downloadFile();
	}
}
