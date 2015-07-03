package net.reflectorproject.gui;

import net.reflectorproject.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class Store extends Activity
{
	
	// ********** BUTTONS ********** \\
	
		ImageButton back;
		Button skips;
		Button hints;
		Button removeAds;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.store);
		
		back = (ImageButton) findViewById(R.id.bBack);
		
		back.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				finish();
			}	
		});
	}

	@Override
	protected void onPause()
	{
		// TODO Auto-generated method stub
		super.onPause();
	}
	
}
