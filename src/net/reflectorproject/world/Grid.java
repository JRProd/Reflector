package net.reflectorproject.world;

import java.io.File;

import net.reflectorproject.tiles.Tile;

public class Grid
{
	private Tile[][] tileWorld;
	/*
	 * tileWorld Defined as
	 * [3][1] 		x p o s
	 *		   0    1    2    3    4 
	 * 	y	0 [ ]  [ ]  [ ]  [ ]  [ ]
	 * 
	 * 	p	1 [ ]  [ ]  [ ]  [*]  [ ]
	 * 
	 * 	o	2 [ ]  [ ]  [ ]  [ ]  [ ]
	 * 
	 * 	s	3 [ ]  [ ]  [ ]  [ ]  [ ]
	 * 
	 * 		4 [ ]  [ ]  [ ]  [ ]  [ ]
	 * 
	 * 
	 */
	
	//Temporary. That is a lot of arrays and it could be achieved with enum or byte
	private boolean[][][][] [][][][] [][][][] [][][][] [][][][] [][][][] colorWorld;
	
	public Grid()
	{
		this(5, null);
	}
	
	public Grid(int cubeLength)
	{
		this(cubeLength, null);
	}
	
	public Grid(int cubeLength, File imput)
	{
		tileWorld = new Tile[cubeLength][cubeLength];
		loadWorld(imput);
	}
	
	private void loadWorld(File imput)
	{
		if(imput!=null)
		{
			//Load in world
		}
	}
	
	public void update()
	{
		for(Tile[] tileArray : tileWorld)
		{
			for(Tile tile : tileArray)
			{
				tile.update();
			}
		}
	}
	
	public Tile getTile(int xPos, int yPos)
	{
		return tileWorld[xPos][yPos];
	}
	
	public void placeTile(int xPos, int yPos, Tile tile)
	{
		tileWorld[xPos][yPos] = tile;
	}
	
	public boolean canPlace(int xPos, int yPos)
	{
		if(xPos<0||xPos>tileWorld.length)
		{
			return false;
		}
		if(yPos<0||yPos>tileWorld[xPos].length)
		{
			return false;
		}
		return true;
	}
}
