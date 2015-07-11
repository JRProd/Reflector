package net.reflectorproject.tiles;

import net.reflectorproject.world.Grid;

public class Projector extends Solid
{

	// //////////////////////////////////////////
	private boolean projectDirectionEast;
	private boolean projectDirectionNorth;
	private boolean projectDirectionWest;
	private boolean projectDirectionSouth;

	// //////////////////////////////////////////

	public Projector()
	{
		// TODO Auto-generated constructor stub
		this(null, (byte) 0, (byte) 0, false, null, (byte) 0);
	}

	public Projector(Grid w)
	{
		this(w, (byte) 0, (byte) 0, false, null, (byte) 0);
	}

	public Projector(Grid w, byte x, byte y)
	{
		this(w, x, y, false, null, (byte) 0);
		// TODO Auto-generated constructor stub
	}

	public Projector(Grid w, byte x, byte y, boolean move)
	{
		this(w, x, y, move, null, (byte) 0);
		// TODO Auto-generated constructor stub
	}

	public Projector(Grid w, byte x, byte y, boolean move, String src)
	{
		this(w, x, y, move, src, (byte) 0);
		// TODO Auto-generated constructor stub
	}

	public Projector(Grid w, byte x, byte y, boolean move, String src,
			byte direct)
	{
		super(w, x, y, move, src, direct);
		// TODO Auto-generated constructor stub
	}

	// /////////////////////////////////////////////////////////////////
	public boolean isProjectDirectionEast()
	{
		return projectDirectionEast;
	}

	public void setProjectDirectionEast(boolean proDirEast)
	{
		projectDirectionEast = proDirEast;
	}

	public boolean isProjectDirectionNorth()
	{
		return projectDirectionNorth;
	}

	public void setProjectDirectionNorth(boolean proDirNorth)
	{
		projectDirectionNorth = proDirNorth;
	}

	public boolean isProjectDirectionWest()
	{
		return projectDirectionWest;
	}

	public void setProjectDirectionWest(boolean proDirWest)
	{
		projectDirectionEast = proDirWest;
	}

	public boolean isProjectDirectionSouth()
	{
		return projectDirectionSouth;
	}

	public void setProjectDirectionSouth(boolean proDirSouth)
	{
		projectDirectionEast = proDirSouth;
	}

	// //////////////////////////////////////////////////////////////////////////////

	public void update()
	{

	}

	public void paint()
	{

	}

}
