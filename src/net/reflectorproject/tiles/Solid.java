package net.reflectorproject.tiles;

public class Solid extends Tile
{
	public Solid() {
		this((byte)0,(byte)0,false,null,(byte)0);
	}
	
	public Solid(byte x, byte y) {
		this(x,y,false,null,(byte)0);
	}
	
	public Solid(byte x, byte y, boolean move) {
		this(x,y,move,null,(byte)0);
	}

	public Solid(byte x, byte y, boolean move, String src) {
		this(x,y,move,src,(byte)0);
	}
	
	public Solid(byte x, byte y, boolean move, String src, byte direct) {
		super(x, y, move, src, direct);
	}

}

