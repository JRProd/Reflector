package net.reflectorproject.tiles;

import net.reflectorproject.world.Grid;

public class Detector extends Tile
{
	
	private boolean detected;
	
	private byte color;

	public Detector()
	{
		this(null,(byte)0, (byte)0, true, null, (byte)0, (byte)0);
		// TODO Auto-generated constructor stub
	}
	
	public Detector(Grid w)
	{
		this(w,(byte)0,(byte)0,false,null,(byte)0, (byte)0);
	}

	public Detector(Grid w,byte x, byte y)
	{
		this(w,x, y, true, null, (byte)0, (byte)0);
		// TODO Auto-generated constructor stub
	}

	public Detector(Grid w,byte x, byte y, boolean move)
	{
		this(w,x, y, move, null, (byte)0, (byte)0);
		// TODO Auto-generated constructor stub
	}

	public Detector(Grid w,byte x, byte y, boolean move, String src)
	{
		this(w,x, y, move, src, (byte)0, (byte)0);
		// TODO Auto-generated constructor stub
	}

	public Detector(Grid w,byte x, byte y, boolean move, String src, byte direct)
	{
		this(w,x,y,move,src,direct,(byte)0);
		// TODO Auto-generated constructor stub
		setDetected(false);
	}
	
	public Detector(Grid w,byte x, byte y, boolean move, String src, byte direct, byte c)
	{
		super(w,x, y, move, src, direct);
		// TODO Auto-generated constructor stub
		setDetected(false);
		
	}
	
	public Detector(Grid w, short metadata)
	{
		super(w);
		decodeMetaData(metadata);
	}

	public boolean isDetected()
	{
		return detected;
	}

	public void setDetected(boolean detected)
	{
		this.detected = detected;
	}
	
	public short getColor()
	{
		return color;
	}
	
	public void setColor(byte c)
	{
		color = c;
	}

	public void update() {
		// TODO Auto-generated method stub
		//Getting error message "The type Detector must implement the inherited abstract method Tile.update()"
	}
	
	public void paint(){
		//TODO Auto-generated method stub
		//Getting error message
	}
	
	public void decodeMetaData(short metaData)
	{
		byte color = (byte)(metaData%10);
		metaData/=10;
		byte y = (byte)(metaData%10);
		metaData/=10;
		byte x = (byte)(metaData%10);
		setColor(color);
		setPosition(x, y);
	}

}


