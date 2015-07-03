package net.reflectorproject.gui;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import net.reflectorproject.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ToggleButton;

public class Options extends Activity
{

	// ********** BUTTONS **********\\

	ImageButton back;
	ToggleButton soundEffects;
	ToggleButton music;
	ToggleButton tutorial;
	Button save;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.options);

		back = (ImageButton) findViewById(R.id.bBack);
		save = (Button) findViewById(R.id.bSave);
		
		

		back.setOnClickListener(new OnClickListener() {
			public void onClick(View v)
			{
				finish();
			}
		});

		save.setOnClickListener(new OnClickListener() {
			public void onClick(View v)
			{
				writeConfig();
				finish();
			}
		});

		soundEffects = (ToggleButton) findViewById(R.id.tbSoundEffects);
		music = (ToggleButton) findViewById(R.id.tbMusic);
		tutorial = (ToggleButton) findViewById(R.id.tbTutorial);
		applyOptionsToButtons();
	}

	private void writeConfig()
	{

		try
		{
			PrintWriter optionsWriter = new PrintWriter(getBaseContext()
					.getFilesDir().toString() + "/options.dat", "UTF-8");
			optionsWriter.println("soundEffects="
					+ (soundEffects.isChecked() ? "true" : "false"));
			optionsWriter.println("music="
					+ (music.isChecked() ? "true" : "false"));
			optionsWriter.println("rewatchTutorial="
					+ (tutorial.isChecked() ? "true" : "false"));
			optionsWriter.close();
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private void applyOptionsToButtons()
	{
		BufferedReader cin = null;
		try
		{
			cin = new BufferedReader(new FileReader(getBaseContext().getFileStreamPath("options.dat")));
			String check;
			check = cin.readLine();
			if(check.contains("true"))
				soundEffects.setChecked(true);
			else
				soundEffects.setChecked(false);
			check = cin.readLine();
			if(check.contains("true"))
				music.setChecked(true);
			else
				music.setChecked(false);
			check = cin.readLine();
			if(check.contains("true"))
				tutorial.setChecked(true);
			else
				tutorial.setChecked(false);cin.close();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally
		{
			if(cin!=null) try
			{
				cin.close();
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
	}
}
