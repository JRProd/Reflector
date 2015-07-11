package net.reflectorproject.tiles;

import net.reflectorproject.world.Grid;

public class Prism extends Detector {

	private boolean detected;
	
	public Prism() 
	{
		// TODO Auto-generated constructor stub
		this(null,(byte)0,(byte)0,false,null);
	}
	
	public Prism(Grid w)
	{
		this(w,(byte)0,(byte)0,false,null);
	}
	
	public Prism(Grid w,byte x, byte y) 
	{
		this(w,x, y,false,null);
		// TODO Auto-generated constructor stub
	}
	
	public Prism(Grid w,byte x, byte y, boolean move) 
	{
		this(w,x, y, move,null);
		// TODO Auto-generated constructor stub
	}
	
	public Prism(Grid w,byte x, byte y, boolean move, String src) 
	{
		super(w,x, y, move, src);
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
