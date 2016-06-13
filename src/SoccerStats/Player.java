package SoccerStats;

public class Player 
{
	private int tag_id;
	private float x_pos;
	private float y_pos;
	private float speed;
	private float energy;
	private float total_distance;
	private float heading;
	private float direction;
	
	public Player()
	{
		tag_id=0;
		x_pos=0;
		y_pos=0;
		speed=0;
		energy=0;
		total_distance=0;
		heading=0;
		direction=0;
	}
	
	public int getTagId()
	{
		return tag_id;
	}
	
	public float getPosX()
	{
		return x_pos;
	}
	
	public float getPosY()
	{
		return y_pos;
	}
	
	public float getSpeed()
	{
		return speed; 
	}
	
	public float getEnergy()
	{
		return energy; 
	}
	
	public float getTotalDistance()
	{
		return total_distance; 
	}
	
	public float getHeading()
	{
		return heading; 
	}
	
	public float getDirection()
	{
		return direction; 
	}
	
	public void setPlayer(int pTag_id, float pX_pos, float pY_pos, float pSpeed, float pEnergy, float pTotal_distance, float pHeading, float pDirection)
	{
		tag_id=pTag_id;
		x_pos=pX_pos;
		y_pos=pY_pos;
		speed=pSpeed;
		energy=pEnergy;
		total_distance=pTotal_distance;
		heading=pHeading;
		direction=pDirection;
	}
}
