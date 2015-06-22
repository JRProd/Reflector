package net.reflectorproject.tiles;

public class Transformer extends Detector {

	private boolean detected;
	////////////////////////////////////////////
	private byte north;
	private byte east;
	private byte south;
	private byte west;
	////////////////////////////////////////////
	
	public Transformer() 
	{
	// TODO Auto-generated constructor stub
	this((byte)0,(byte)0,false,null,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0);
	}
	
	public Transformer(byte x, byte y) 
	{
	this(x, y,false,null,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0);
	// TODO Auto-generated constructor stub
	}
	
	public Transformer(byte x, byte y, boolean move) 
	{
	this(x, y, move,null,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0);
	// TODO Auto-generated constructor stub
	}
	
	public Transformer(byte x, byte y, boolean move, String src) 
	{
	this(x, y, move, src,(byte)0,(byte)0,(byte)0,(byte)0,(byte)0);
	// TODO Auto-generated constructor stub
	}
	
	public Transformer(byte x, byte y, boolean move, String src, byte direct, byte n, byte e, byte s, byte w) 
	{
	super(x, y, move, src, direct);
	north=n;
	east=e;
	south=s;
	west=w;
	// TODO Auto-generated constructor stub
	}
	
	
	
	///////////////////////////////////////////////////////////////////
	public boolean isDetected()
	{
		return detected;
	}

	public void setDetected(boolean detected)
	{
		this.detected = detected;
	}
	
	
	/*
	 * The Transformer class uses the direction bytes to detect which branches are active
	 * and how they are operating. 0 means a branch is not active, 1 means a branch is 
	 * projecting, and 2 means a branch is receiving.
	 */
	
	public boolean isProjectDirectionEast()
	{
		return detected&&east==1;
	}
	
	public void setProjectDirectionEast()
	{
		east=1;
	}
	
	public boolean isProjectDirectionNorth()
	{
		return detected&&north==1;
	}
	
	public void setProjectDirectionNorth()
	{
		north = 1;
	}
	
	public boolean isProjectDirectionWest()
	{
		return detected&&west==1;
	}
	
	public void setProjectDirectionWest()
	{
		west = 1;
	}
	
	public boolean isProjectDirectionSouth()
	{
		return detected&&south==1;
	}
	
	public void setProjectDirectionSouth()
	{
		south = 1;
	}
	
	////////////////////////////////////////////////////////////////////////////////
	
	public void update()
	{
	
	}
	
	public void paint()
	{
	
	}
}
