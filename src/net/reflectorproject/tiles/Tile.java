/**
 * 
 */
package net.reflectorproject.tiles;

import net.reflectorproject.world.Grid;
import android.graphics.Picture;

/**
 * Tiles will be the generic tile object of Reflector. Any object that can be placed, moved, manipulated, or otherwise intractable is a Tile.
 * 
 * @author Rawhide
 * @author Colonel Miles
 * @author Enigma
 * 
 */
public abstract class Tile
{
	private enum Direction
	{
		EAST((byte)0), NORTH((byte)1), WEST((byte)2), SOUTH((byte)3);
		
		private byte direction;
		
		private Direction(byte direct)
		{
			direction = direct;
		}
		
		public byte getDirection()
		{
			return direction;
		}
		
		public String toString()
		{
			return Integer.toString(direction);
		}
	}
	
	private Grid world;
	
	private byte xPosition;
	private byte yPosition;
	
	private boolean movable;
	
	private Picture texture;
	
	private Direction direction;
	
	public Tile()
	{
		//X and Y position in the grid, Movable to false, and texture to null
		this(null,(byte)0,(byte)0,false,null,(byte)0);
	}
	
	public Tile(Grid w)
	{
		this(w,(byte)0,(byte)0,false,null,(byte)0);
	}
	
	public Tile(Grid w,byte x, byte y)
	{
		this(w,x,y,false,null,(byte)0);
	}
	
	public Tile(Grid w,byte x, byte y, boolean move)
	{
		this(w,x,y,move,null,(byte)0);
	}
	
	public Tile(Grid w,byte x, byte y, boolean move, String src)
	{
		this(w,x,y,move,src,(byte)0);
	}
	
	public Tile(Grid w,byte x, byte y, boolean move, String src, byte direct)
	{
		setXPosition(x);
		setYPosition(y);
		
		movable = move;
		
		//Determine how to get textures loaded to the Picture
		texture = null;
		
		switch(direct)
		{
			case 0:
				direction = Direction.EAST;
				break;
			case 1:
				direction = Direction.NORTH;
				break;
			case 2:
				direction = Direction.WEST;
				break;
			case 3:
				direction = Direction.SOUTH;
				break;
			default:
				direction = Direction.EAST;
				break;
		}
	}
	
	public abstract void update();
	public abstract void paint();
	
	/**
	 *@param xPosition the xPosition to set
	 *@param yPosition the yPosition to set
	 */
	public void setPosition(byte xPos, byte yPos)
	{
		this.xPosition = xPos;
		this.yPosition = yPos;
	}
	
	/**
	 * @return the xPosition
	 */
	public byte getXPosition()
	{
		return xPosition;
	}

	/**
	 * @param xPosition the xPosition to set
	 */
	public void setXPosition(byte xPos)
	{
		this.xPosition = xPos;
	}

	/**
	 * @return the yPosition
	 */
	public byte getYPosition()
	{
		return yPosition;
	}

	/**
	 * @param yPosition the yPosition to set
	 */
	public void setYPosition(byte yPos)
	{
		this.yPosition = yPos;
	}
	
	public byte getDirection()
	{
		return direction.direction;
	}
	
	public Grid getWorld()
	{
		return world;
	}
	
	public String toString()
	{
		return this.getClass().getSimpleName() + " xPos = " + xPosition + " yPos = " + yPosition
				+ " movable = " + movable + " texture " + texture.toString() + direction.toString();
	}
}
