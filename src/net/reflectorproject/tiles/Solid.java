package net.reflectorproject.tiles;

import net.reflectorproject.world.Grid;

public class Solid extends Tile
{
	public Solid() {
		this(null,(byte)0,(byte)0,false,null,(byte)0);
	}
	
	public Solid(Grid w)
	{
		this(w,(byte)0,(byte)0,false,null,(byte)0);
	}
	
	public Solid(Grid w,byte x, byte y) {
		this(w,x,y,false,null,(byte)0);
	}
	
	public Solid(Grid w,byte x, byte y, boolean move) {
		this(w,x,y,move,null,(byte)0);
	}

	public Solid(Grid w,byte x, byte y, boolean move, String src) {
		this(w,x,y,move,src,(byte)0);
	}
	
	public Solid(Grid w,byte x, byte y, boolean move, String src, byte direct) {
		super(w,x, y, move, src, direct);
	}
	
	public Solid(Grid w, short metadata)
	{
		super(w);
		decodeMetaData(metadata);
	}

	public void update() 
	{
		// TODO Auto-generated method stub
	}
	
	
	public void paint()
	{
		//TODO Auto-generated method stub
	}
	
	public void decodeMetaData(short metaData)
	{
		//TODO Auto-generated method stub
		byte y = (byte)(metaData%10);
		metaData/=10;
		byte x = (byte)(metaData%10);
		setPosition(x, y);
	}
}

