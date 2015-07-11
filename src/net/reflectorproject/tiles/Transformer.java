package net.reflectorproject.tiles;

import net.reflectorproject.world.Grid;

public class Transformer extends Detector
{

	private boolean detected;
	// //////////////////////////////////////////
	private byte northArm;
	private byte eastArm;
	private byte southArm;
	private byte westArm;

	// //////////////////////////////////////////

	public Transformer()
	{
		// TODO Auto-generated constructor stub
		this(null, (byte) 0, (byte) 0, false, null, (byte) 0, (byte) 0,
				(byte) 0, (byte) 0, (byte) 0);
	}

	public Transformer(Grid w)
	{
		this(w, (byte) 0, (byte) 0, false, null, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
				(byte) 0);
	}

	public Transformer(Grid w, byte x, byte y)
	{
		this(w, x, y, false, null, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
				(byte) 0);
		// TODO Auto-generated constructor stub
	}

	public Transformer(Grid w, byte x, byte y, boolean move)
	{
		this(w, x, y, move, null, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
				(byte) 0);
		// TODO Auto-generated constructor stub
	}

	public Transformer(Grid w, byte x, byte y, boolean move, String src)
	{
		this(w, x, y, move, src, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
				(byte) 0);
		// TODO Auto-generated constructor stub
	}

	public Transformer(Grid w, byte x, byte y, boolean move, String src,
			byte direct, byte north, byte east, byte south, byte west)
	{
		super(w, x, y, move, src, direct);
		northArm = north;
		eastArm = east;
		southArm = south;
		westArm = west;
		// TODO Auto-generated constructor stub
	}

	// /////////////////////////////////////////////////////////////////
	public boolean isDetected()
	{
		return detected;
	}

	public void setDetected(boolean detected)
	{
		this.detected = detected;
	}

	/*
	 * The Transformer class uses the direction bytes to detect which branches
	 * are active and how they are operating. 0 means a branch is not active, 1
	 * means a branch is projecting, and 2 means a branch is receiving.
	 */

	public boolean isProjectDirectionEast()
	{
		return detected && eastArm == 1;
	}

	public void setBranchEast(byte b)
	{
		eastArm = b;
	}

	public boolean isProjectDirectionNorth()
	{
		return detected && northArm == 1;
	}

	public void setBranchNorth(byte b)
	{
		northArm = b;
	}

	public boolean isProjectDirectionWest()
	{
		return detected && westArm == 1;
	}

	public void setBranchWest(byte b)
	{
		westArm = b;
	}

	public boolean isProjectDirectionSouth()
	{
		return detected && southArm == 1;
	}

	public void setBranchSouth(byte b)
	{
		southArm = b;
	}

	// //////////////////////////////////////////////////////////////////////////////

	public void update()
	{

	}

	public void paint()
	{

	}
}
