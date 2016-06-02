package SoccerStats;

public class Team 
{
	private int id;
	private String name; 
	private int nb_players;
	private String color;
	
	public Team()
	{
		id=0;
		name="";
		nb_players=0;
		color="";
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getNbPlayers()
	{
		return nb_players;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void setTeam(int pId, String pName, int pNb_players, String pColor)
	{
		id=pId;
		name=pName;
		nb_players=pNb_players;
		color=pColor;
	}
}
