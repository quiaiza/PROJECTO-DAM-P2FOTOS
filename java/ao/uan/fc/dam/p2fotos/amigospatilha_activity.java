package ao.uan.fc.dam.p2fotos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class amigospatilha_activity extends Activity {

	
	private View _bg__amigospatilha_ek2;
	private ImageView arrow_2;
	private TextView as_fotos_ainda_n_o_ser_o_partinhadas;
	private TextView selecionar_parceiro;
	private TextView mostrar_contactos_do_telemov_l;
	private TextView sugest_es;
	private View rectangle_60;
	private TextView escreva_um_nome_ou_endere_o_de_email;
	private TextView para_;
	private ImageView stroke_1;
	private ImageView stroke_2;
	private ImageView stroke_3;
	private ImageView stroke_1_ek1;
	private ImageView stroke_3_ek1;
	private ImageView stroke_15;
	private View ellipse_9;
	private View ellipse_11;
	private View ellipse_10;
	private TextView celcia_laura;
	private TextView celciaquia11_gmail_com;
	private TextView sabino_aspirante;
	private TextView sabino_gmail_com;
	private TextView pedro_poto;
	private TextView potop_gmail_com;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.amigospatilha);

		
		_bg__amigospatilha_ek2 = (View) findViewById(R.id._bg__amigospatilha_ek2);
		arrow_2 = (ImageView) findViewById(R.id.arrow_2);
		as_fotos_ainda_n_o_ser_o_partinhadas = (TextView) findViewById(R.id.as_fotos_ainda_n_o_ser_o_partinhadas);
		selecionar_parceiro = (TextView) findViewById(R.id.selecionar_parceiro);
		mostrar_contactos_do_telemov_l = (TextView) findViewById(R.id.mostrar_contactos_do_telemov_l);
		sugest_es = (TextView) findViewById(R.id.sugest_es);
		rectangle_60 = (View) findViewById(R.id.rectangle_60);
		escreva_um_nome_ou_endere_o_de_email = (TextView) findViewById(R.id.escreva_um_nome_ou_endere_o_de_email);
		para_ = (TextView) findViewById(R.id.para_);
		stroke_1 = (ImageView) findViewById(R.id.stroke_1);
		stroke_2 = (ImageView) findViewById(R.id.stroke_2);
		stroke_3 = (ImageView) findViewById(R.id.stroke_3);
		stroke_1_ek1 = (ImageView) findViewById(R.id.stroke_1_ek1);
		stroke_3_ek1 = (ImageView) findViewById(R.id.stroke_3_ek1);
		stroke_15 = (ImageView) findViewById(R.id.stroke_15);
		ellipse_9 = (View) findViewById(R.id.ellipse_9);
		ellipse_11 = (View) findViewById(R.id.ellipse_11);
		ellipse_10 = (View) findViewById(R.id.ellipse_10);
		celcia_laura = (TextView) findViewById(R.id.celcia_laura);
		celciaquia11_gmail_com = (TextView) findViewById(R.id.celciaquia11_gmail_com);
		sabino_aspirante = (TextView) findViewById(R.id.sabino_aspirante);
		sabino_gmail_com = (TextView) findViewById(R.id.sabino_gmail_com);
		pedro_poto = (TextView) findViewById(R.id.pedro_poto);
		potop_gmail_com = (TextView) findViewById(R.id.potop_gmail_com);
	
		
		//custom code goes here
	
	}
	public void voltar(View voltar){

		Intent volta= new Intent(amigospatilha_activity.this, partiha_activity.class);

		startActivity(volta);
	}
}
	
	