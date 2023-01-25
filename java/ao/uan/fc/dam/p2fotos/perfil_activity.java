package ao.uan.fc.dam.p2fotos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;

public class perfil_activity extends Activity {

	
	private View _bg__perfil_ek2;
	private View ellipse_5;
	private TextView celcia_quiaiza;
	private TextView celciaquia11_gmail_com;
	private TextView fotografias;
	private View rectangle_28;
	private View rectangle_29;
	private View rectangle_30;
	private View rectangle_31;
	private View rectangle_32;
	private View rectangle_33;
	private ImageView rectangle_40;
	private View ellipse_6;
	private View ellipse_7;
	private ImageView rectangle_41;
	private TextView adicionar_ao__lbum;
	private ImageView arrow_3;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.perfil);

		
		_bg__perfil_ek2 = (View) findViewById(R.id._bg__perfil_ek2);
		ellipse_5 = (View) findViewById(R.id.ellipse_5);
		celcia_quiaiza = (TextView) findViewById(R.id.celcia_quiaiza);
		celciaquia11_gmail_com = (TextView) findViewById(R.id.celciaquia11_gmail_com);
		fotografias = (TextView) findViewById(R.id.fotografias);
		rectangle_28 = (View) findViewById(R.id.rectangle_28);
		rectangle_29 = (View) findViewById(R.id.rectangle_29);
		rectangle_30 = (View) findViewById(R.id.rectangle_30);
		rectangle_31 = (View) findViewById(R.id.rectangle_31);
		rectangle_32 = (View) findViewById(R.id.rectangle_32);
		rectangle_33 = (View) findViewById(R.id.rectangle_33);
		rectangle_40 = (ImageView) findViewById(R.id.rectangle_40);
		ellipse_6 = (View) findViewById(R.id.ellipse_6);
		ellipse_7 = (View) findViewById(R.id.ellipse_7);
		rectangle_41 = (ImageView) findViewById(R.id.rectangle_41);
		adicionar_ao__lbum = (TextView) findViewById(R.id.adicionar_ao__lbum);
		arrow_3 = (ImageView) findViewById(R.id.arrow_3);

	
	}
	public void voltar(View volta){

		Intent voltar= new Intent(perfil_activity.this, encontar_amigos_activity.class);

		startActivity(voltar);
	}

}
	
	