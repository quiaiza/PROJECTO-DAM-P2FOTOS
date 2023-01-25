package ao.uan.fc.dam.p2fotos;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;

public class sem_fotos_activity extends Activity {

	
	private View _bg__sem_fotos_ek2;
	private TextView nenhuma_fotografia;
	private TextView _lbuns;
	private ImageView arrow_2;
	private TextView divertido;
	private ImageView rectangle_42;
	private TextView adicionar;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.sem_fotos);

		
		_bg__sem_fotos_ek2 = (View) findViewById(R.id._bg__sem_fotos_ek2);
		nenhuma_fotografia = (TextView) findViewById(R.id.nenhuma_fotografia);
		_lbuns = (TextView) findViewById(R.id._lbuns);
		arrow_2 = (ImageView) findViewById(R.id.arrow_2);
		divertido = (TextView) findViewById(R.id.divertido);
		rectangle_42 = (ImageView) findViewById(R.id.rectangle_42);
		adicionar = (TextView) findViewById(R.id.adicionar);
	
		
		//custom code goes here
	
	}
}
	
	