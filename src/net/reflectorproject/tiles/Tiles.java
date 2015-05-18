/**
 * 
 */
package net.reflectorproject.tiles;

import android.graphics.Picture;

/**
 * Tiles will be the generic tile object of Reflector. Any object that can be placed, moved, manipulated, or otherwise intractable is a Tile.
 * 
 * @author Rawhide
 *
 */
public abstract class Tiles
{
	private byte xPosition;
	private byte yPosition;
	
	private boolean movable;
	
	private Picture texture;
	
	public Tiles()
	{
		//X and Y position in the grid, Movable to false, and texture to null
		this((byte)0,(byte)0,false,null);
	}
	
	public Tiles(byte x, byte y)
	{
		this(x,y,false,null);
	}
	
	public Tiles(byte x, byte y, boolean move)
	{
		this(x,y,move,null);
	}
	
	public Tiles(byte x, byte y, boolean move, String src)
	{
		setxPosition(x);
		setyPosition(y);
		
		movable = move;
		
		//Determine how to get textures loaded to the Picture
		texture = null;
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
}
