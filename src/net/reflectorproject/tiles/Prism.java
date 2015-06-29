package net.reflectorproject.tiles;

public class Prism extends Detector {

	private boolean detected;
	
	public Prism() 
	{
		// TODO Auto-generated constructor stub
		this((byte)0,(byte)0,false,null);
	}
	
	public Prism(byte x, byte y) 
	{
		this(x, y,false,null);
		// TODO Auto-generated constructor stub
	}
	
	public Prism(byte x, byte y, boolean move) 
	{
		this(x, y, move,null);
		// TODO Auto-generated constructor stub
	}
	
	public Prism(byte x, byte y, boolean move, String src) 
	{
		super(x, y, move, src);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isDetected()
	{
		return detected;
	}

	public void setDetected(boolean detected)
	{
		this.detected = detected;
	}
	
	/////////////////////////////////////////////////////////////////////////////////////
	
	public void update()
	{
	
	}
	
	public void paint()
	{
	
	}
}
