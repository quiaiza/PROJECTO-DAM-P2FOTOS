package ao.uan.fc.dam.p2fotos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class confirma_ao_activity extends Activity {

	
	private View _bg__confirma_ao_ek2;
	private ImageView arrow_2;
	private View ellipse_8;
	private TextView celcia_laura;
	private TextView a_partinha_com_celciaquia11_gmail_com;
	private TextView confirmar;
	private TextView celciaquia11_gmail_com;
	private TextView sabino_gmail_com_ter__acesso_a;
	private TextView todas_as_fotos__incluindo_as_mais_antigas;
	private TextView a_localiza__o_onde_as_suas_fotos_partinhadas_foram_tiradads;
	private TextView fotos_com_c_pias_de_seguran_a_no_futuro;
	private View rectangle_59;
	private TextView enviar_convite;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.confirma_ao);

		
		_bg__confirma_ao_ek2 = (View) findViewById(R.id._bg__confirma_ao_ek2);
		arrow_2 = (ImageView) findViewById(R.id.arrow_2);
		ellipse_8 = (View) findViewById(R.id.ellipse_8);
		celcia_laura = (TextView) findViewById(R.id.celcia_laura);
		a_partinha_com_celciaquia11_gmail_com = (TextView) findViewById(R.id.a_partinha_com_celciaquia11_gmail_com);
		confirmar = (TextView) findViewById(R.id.confirmar);
		celciaquia11_gmail_com = (TextView) findViewById(R.id.celciaquia11_gmail_com);
		sabino_gmail_com_ter__acesso_a = (TextView) findViewById(R.id.sabino_gmail_com_ter__acesso_a);
		todas_as_fotos__incluindo_as_mais_antigas = (TextView) findViewById(R.id.todas_as_fotos__incluindo_as_mais_antigas);
		a_localiza__o_onde_as_suas_fotos_partinhadas_foram_tiradads = (TextView) findViewById(R.id.a_localiza__o_onde_as_suas_fotos_partinhadas_foram_tiradads);
		fotos_com_c_pias_de_seguran_a_no_futuro = (TextView) findViewById(R.id.fotos_com_c_pias_de_seguran_a_no_futuro);
		rectangle_59 = (View) findViewById(R.id.rectangle_59);
		enviar_convite = (TextView) findViewById(R.id.enviar_convite);
	
		
		//custom code goes here
	
	}
	public void voltar(View voltar){

		Intent volta= new Intent(confirma_ao_activity.this, partiha_activity.class);

		startActivity(volta);
	}
}
	
	