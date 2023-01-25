package ao.uan.fc.dam.p2fotos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class partiha_activity extends Activity {

	
	private View _bg__partiha_ek2;
	private View ellipse_4;
	private ImageView ellipse_5;
	private ImageView ellipse_11;
	private TextView partilha_com_os_amigos;
	private TextView nunca_mais_se_esque_a_de_partilhar_uma_foto_com_o_amigo_partilhe_as_suas_melhores_fotos__ou_todas_as_suas_fotos_com_as_suas_pessoas_favoritas;
	private TextView selecione_o_seu_amigo;
	private TextView selecione_o_conteudo_que_pretende_partinhar;
	private View rectangle_53;
	private TextView come_ar_a_utilizar;
	private View ellipse_14;
	private View ellipse_15;
	private TextView _1;
	private TextView _2;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.partiha);

		
		_bg__partiha_ek2 = (View) findViewById(R.id._bg__partiha_ek2);
		ellipse_4 = (View) findViewById(R.id.ellipse_4);
		ellipse_5 = (ImageView) findViewById(R.id.ellipse_5);
		ellipse_11 = (ImageView) findViewById(R.id.ellipse_11);
		partilha_com_os_amigos = (TextView) findViewById(R.id.partilha_com_os_amigos);
		nunca_mais_se_esque_a_de_partilhar_uma_foto_com_o_amigo_partilhe_as_suas_melhores_fotos__ou_todas_as_suas_fotos_com_as_suas_pessoas_favoritas = (TextView) findViewById(R.id.nunca_mais_se_esque_a_de_partilhar_uma_foto_com_o_amigo_partilhe_as_suas_melhores_fotos__ou_todas_as_suas_fotos_com_as_suas_pessoas_favoritas);
		selecione_o_seu_amigo = (TextView) findViewById(R.id.selecione_o_seu_amigo);
		selecione_o_conteudo_que_pretende_partinhar = (TextView) findViewById(R.id.selecione_o_conteudo_que_pretende_partinhar);
		rectangle_53 = (View) findViewById(R.id.rectangle_53);
		come_ar_a_utilizar = (TextView) findViewById(R.id.come_ar_a_utilizar);
		ellipse_14 = (View) findViewById(R.id.ellipse_14);
		ellipse_15 = (View) findViewById(R.id.ellipse_15);
		_1 = (TextView) findViewById(R.id._1);
		_2 = (TextView) findViewById(R.id._2);
	
		
		//custom code goes here
	
	}
	public void começarpartinha(View começar){

		Intent começa= new Intent(partiha_activity.this, amigospatilha_activity.class);

		startActivity(começa);
	}

	public void voltar(View voltar){

		Intent volta= new Intent(partiha_activity.this, inicio_activity.class);

		startActivity(volta);
	}
}
	
	