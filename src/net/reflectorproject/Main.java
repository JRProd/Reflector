package net.reflectorproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class Main extends Activity
{

	// ********** BUTTONS ********** \\

	Button play;
	Button achievements;
	Button store;
	Button rateGame;
	ImageButton options;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		store = (Button) findViewById(R.id.bStore);
		play = (Button) findViewById(R.id.bPlay);
		options = (ImageButton) findViewById(R.id.ibOptions);

		store.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				Intent storeLayout;
				// storeLayout = new Intent(Main.this,
				// Class.forName("net.reflectorproject.gui.Store"));
				storeLayout = new Intent("net.reflectorproject.gui.STORE");
				startActivity(storeLayout);
			}
		});

		play.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				Intent storeLayout;
				// storeLayout = new Intent(Main.this,
				// Class.forName("net.reflectorproject.gui.Store"));
				storeLayout = new Intent(
						"net.reflectorproject.gui.LEVELPACKSELECT");
				startActivity(storeLayout);
			}
		});

		options.setOnClickListener(new OnClickListener() {
			public void onClick(View v)
			{
				Intent storeLayout;
				// storeLayout = new Intent(Main.this,
				// Class.forName("net.reflectorproject.gui.Store"));
				storeLayout = new Intent("net.reflectorproject.gui.OPTIONS");
				startActivity(storeLayout);
			}
		});
	}
	/*
	 * @Override public boolean onCreateOptionsMenu(Menu menu) { // Inflate the
	 * menu; this adds items to the action bar if it is present.
	 * getMenuInflater().inflate(R.menu.main, menu); return true; }
	 * 
	 * @Override public boolean onOptionsItemSelected(MenuItem item) { // Handle
	 * action bar item clicks here. The action bar will // automatically handle
	 * clicks on the Home/Up button, so long // as you specify a parent activity
	 * in AndroidManifest.xml. int id = item.getItemId(); if (id ==
	 * R.id.action_settings) { return true; } return
	 * super.onOptionsItemSelected(item); }
	 */
}
