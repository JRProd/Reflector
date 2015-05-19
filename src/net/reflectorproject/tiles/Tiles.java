/**
 * 
 */
package net.reflectorproject.tiles;

import android.graphics.Picture;

/**
 * Tiles will be the generic tile object of Reflector. Any object that can be placed, moved, manipulated, or otherwise intractable is a Tile.
 * 
 * @author Rawhide
 * @author Colonel Miles
 * 
 */
public abstract class Tiles
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
	
	
	private byte xPosition;
	private byte yPosition;
	
	private boolean movable;
	
	private Picture texture;
	
	private Direction direction;
	
	public Tiles()
	{
		//X and Y position in the grid, Movable to false, and texture to null
		this((byte)0,(byte)0,false,null,(byte)0);
	}
	
	public Tiles(byte x, byte y)
	{
		this(x,y,false,null,(byte)0);
	}
	
	public Tiles(byte x, byte y, boolean move)
	{
		this(x,y,move,null,(byte)0);
	}
	
	public Tiles(byte x, byte y, boolean move, String src)
	{
		this(x,y,move,src,(byte)0);
	}
	
	public Tiles(byte x, byte y, boolean move, String src, byte direct)
	{
		setxPosition(x);
		setyPosition(y);
		
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
	public byte getxPosition()
	{
		return xPosition;
	}

	/**
	 * @param xPosition the xPosition to set
	 */
	public void setxPosition(byte xPos)
	{
		this.xPosition = xPos;
	}

	/**
	 * @return the yPosition
	 */
	public byte getyPosition()
	{
		return yPosition;
	}

	/**
	 * @param yPosition the yPosition to set
	 */
	public void setyPosition(byte yPos)
	{
		this.yPosition = yPos;
	}
	
	public byte getDirection()
	{
		return direction.direction;
	}
	
	public String toString()
	{
		return this.getClass().getSimpleName() + " xPos = " + xPosition + " yPos = " + yPosition
				+ " movable = " + movable + " texture " + texture.toString() + direction.toString();
	}
}
