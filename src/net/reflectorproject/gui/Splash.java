package net.reflectorproject.gui;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import net.reflectorproject.R;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity
{	
	MediaPlayer mainTheme;
	
	private boolean music = true;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		
		mainTheme = MediaPlayer.create(Splash.this, R.raw.main_theme);
		
		Thread timer = new Thread(){
			public void run()
			{
				try
				{
					sleep(5200);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				finally
				{
					Intent activityToStart = new Intent("net.reflectorproject.MAIN");
					startActivity(activityToStart);
				}
			}
		};
		
		timer.start();
		checkOptionsFile();
		if(music)
			mainTheme.start();
	}
	
	private void checkOptionsFile()
	{
		String filePath = getBaseContext().getFilesDir().toString()+"/options.dat";
		
		BufferedWriter outputWriter = null;
		try
		{
			File options = getBaseContext().getFileStreamPath("options.dat");
			if(!options.exists())
			{
				options = new File(filePath);
				outputWriter = new BufferedWriter(new FileWriter(options));
				outputWriter
					.write("soundEffects=ture\nmusic=true\nrewatchTutorial=true");
			}
			else
			{
				BufferedReader cin = new BufferedReader(new FileReader(getBaseContext().getFileStreamPath("options.dat")));
				cin.readLine();
				String musicString = cin.readLine();
				if(musicString.contains("true"))
					music=true;
				else
					music=false;
				cin.close();
			}
		} catch (IOException e)
		{
			e.printStackTrace();
		} finally
		{
			if (outputWriter != null) try
			{
				outputWriter.close();
			} catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	protected void onPause()
	{
		// TODO Auto-generated method stub
		super.onPause();
		mainTheme.release();
		finish();
	}

}
