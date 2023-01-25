package ao.uan.fc.dam.p2fotos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class compartilhado_activity extends Activity {

	
	private View _bg__compartilhado_ek2;
	private ImageView vector;
	private ImageView vector_ek1;
	private ImageView vector_ek2;
	private ImageView vector_ek3;
	private ImageView _9230196_overflow_menu_vertical_navigation_interface_icon_1;
	private TextView nome_do_album;
	private TextView _14_11_2022;
	private TextView fotos_compartinhadas;
	private ImageView arrow_2;
	private View ellipse_12;
	private View ellipse_13;
	private ImageView vector_ek4;
	private View rectangle_28;
	private View rectangle_29;
	private View rectangle_30;
	private View rectangle_31;
	private View rectangle_32;
	private View rectangle_33;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.compartilhado);

		
		_bg__compartilhado_ek2 = (View) findViewById(R.id._bg__compartilhado_ek2);
		vector = (ImageView) findViewById(R.id.vector);
		vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
		vector_ek2 = (ImageView) findViewById(R.id.vector_ek2);
		vector_ek3 = (ImageView) findViewById(R.id.vector_ek3);
		_9230196_overflow_menu_vertical_navigation_interface_icon_1 = (ImageView) findViewById(R.id._9230196_overflow_menu_vertical_navigation_interface_icon_1);
		nome_do_album = (TextView) findViewById(R.id.nome_do_album);
		_14_11_2022 = (TextView) findViewById(R.id._14_11_2022);
		fotos_compartinhadas = (TextView) findViewById(R.id.fotos_compartinhadas);
		arrow_2 = (ImageView) findViewById(R.id.arrow_2);
		ellipse_12 = (View) findViewById(R.id.ellipse_12);
		ellipse_13 = (View) findViewById(R.id.ellipse_13);
		vector_ek4 = (ImageView) findViewById(R.id.vector_ek4);
		rectangle_28 = (View) findViewById(R.id.rectangle_28);
		rectangle_29 = (View) findViewById(R.id.rectangle_29);
		rectangle_30 = (View) findViewById(R.id.rectangle_30);
		rectangle_31 = (View) findViewById(R.id.rectangle_31);
		rectangle_32 = (View) findViewById(R.id.rectangle_32);
		rectangle_33 = (View) findViewById(R.id.rectangle_33);

	}
	public void voltar(View voltar){

		Intent volta= new Intent(compartilhado_activity.this, ver_album_activity.class);

		startActivity(volta);
	}
}
	
	