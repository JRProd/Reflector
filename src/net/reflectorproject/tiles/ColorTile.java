package net.reflectorproject.tiles;

import net.reflectorproject.world.Grid;
import android.graphics.Color;

public class ColorTile extends Tile
{
	
	private int color;
	
	public ColorTile()
	{
		this(null,Color.YELLOW,(byte)0,(byte)0,null,(byte)0);
	}
	
	public ColorTile(Grid w)
	{
		this(w,Color.YELLOW,(byte)0,(byte)0,null,(byte)0);
	}
	
	public ColorTile(Grid w,int c)
	{
		this(w,c,(byte)0,(byte)0,null,(byte)0);
	}
	
	public ColorTile(Grid w,int c, byte x, byte y)
	{
		this(w,c,x,y,null,(byte)0);
	}
	
	public ColorTile(Grid w,int c, byte x, byte y, String src)
	{
		this(w,c,x,y,src,(byte)0);
	}
	
	public ColorTile(Grid w,int c, byte x, byte y, String src, byte direct)
	{
		super(w,x,y,false,src,direct);
		
		color = c;
	}
	
	@Override
	public void update()
	{
		// TODO Auto-generated method stub
		byte direct = this.getDirection();
		
		ColorTile newTile = null;
		
		switch(direct)
		{
			case 0:
				if(getWorld().canPlace(getYPosition()+1, getYPosition()))
					newTile = new ColorTile(getWorld(),color,(byte)(getXPosition()+1),getYPosition(),null,getDirection());
				break;
			case 1:
				if(getWorld().canPlace(getYPosition(), getYPosition()-1))
					newTile = new ColorTile(getWorld(),color,getXPosition(),(byte)(getYPosition()-1),null,getDirection());
				break;
			case 2:
				if(getWorld().canPlace(getYPosition()-1, getYPosition()))
					newTile = new ColorTile(getWorld(),color,(byte)(getXPosition()-1),getYPosition(),null,getDirection());
				break;
			case 3:
				if(getWorld().canPlace(getYPosition(), getYPosition()+1))
					newTile = new ColorTile(getWorld(),color,getXPosition(),(byte)(getYPosition()+1),null,getDirection());
				break;
		}
		
		if(newTile!=null)
			newTile.update();
	}

	@Override
	public void paint()
	{
		// TODO Auto-generated method stub
		
	}

}
