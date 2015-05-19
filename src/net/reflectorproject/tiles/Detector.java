package net.reflectorproject.tiles;

public class Detector extends Tiles
{
	
	private boolean detected;

	public Detector()
	{
		this((byte)0, (byte)0, true, null, (byte)0);
		// TODO Auto-generated constructor stub
	}

	public Detector(byte x, byte y)
	{
		this(x, y, true, null, (byte)0);
		// TODO Auto-generated constructor stub
	}

	public Detector(byte x, byte y, boolean move)
	{
		this(x, y, move, null, (byte)0);
		// TODO Auto-generated constructor stub
	}

	public Detector(byte x, byte y, boolean move, String src)
	{
		this(x, y, move, src, (byte)0);
		// TODO Auto-generated constructor stub
	}

	public Detector(byte x, byte y, boolean move, String src, byte direct)
	{
		super(x, y, move, src, direct);
		// TODO Auto-generated constructor stub
		setDetected(false);
	}

	public boolean isDetected()
	{
		return detected;
	}

	public void setDetected(boolean detected)
	{
		this.detected = detected;
	}

}
