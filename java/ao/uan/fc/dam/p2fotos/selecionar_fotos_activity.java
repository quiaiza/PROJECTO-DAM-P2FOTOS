package ao.uan.fc.dam.p2fotos;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;

public class selecionar_fotos_activity extends Activity {

	
	private View _bg__selecionar_fotos_ek2;
	private View rectangle_45;
	private View rectangle_46;
	private View line_7;
	private TextView cancelar;
	private View line_8;
	private TextView nome_do_album;
	private View rectangle_522;
	private TextView selecionar_fotos_ek3;
	private ImageView plus_math;
	private TextView concluido;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.selecionar_fotos);

		
		_bg__selecionar_fotos_ek2 = (View) findViewById(R.id._bg__selecionar_fotos_ek2);
		rectangle_45 = (View) findViewById(R.id.rectangle_45);
		rectangle_46 = (View) findViewById(R.id.rectangle_46);
		line_7 = (View) findViewById(R.id.line_7);
		cancelar = (TextView) findViewById(R.id.cancelar);
		line_8 = (View) findViewById(R.id.line_8);
		nome_do_album = (TextView) findViewById(R.id.nome_do_album);
		rectangle_522 = (View) findViewById(R.id.rectangle_522);
		selecionar_fotos_ek3 = (TextView) findViewById(R.id.selecionar_fotos_ek3);
		plus_math = (ImageView) findViewById(R.id.plus_math);
		concluido = (TextView) findViewById(R.id.concluido);
	
		
		//custom code goes here
	
	}
	public void cancelar(View cancelar){

		Intent cancela= new Intent(selecionar_fotos_activity.this, inicio_activity.class);

		startActivity(cancela);
	}

	public void concluido(View listar){

		Intent  lista= new Intent(selecionar_fotos_activity.this, listar_album_activity.class);

		startActivity( lista);
	}
	public void addfotos(View add){

		Intent  addfotos= new Intent(Intent.ACTION_GET_CONTENT);
		addfotos.setType("image/*");

		startActivityForResult(addfotos,1);
	}


}
	
	