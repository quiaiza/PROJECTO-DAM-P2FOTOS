package ao.uan.fc.dam.p2fotos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class encontar_amigos_activity extends Activity {

	
	private View _bg__encontar_amigos_ek2;
	private ImageView vector;
	private TextView pessoas;
	private TextView _lbuns;
	private TextView pesquisado_recentemente;
	private TextView celcia_laura;
	private TextView divertido;
	private TextView triste;
	private TextView amor;
	private TextView celcia_laura_ek1;
	private TextView celcia_laura_ek2;
	private TextView limpar;
	private View ellipse_8;
	private View ellipse_10;
	private View ellipse_9;
	private View rectangle_48;
	private View rectangle_49;
	private View rectangle_50;
	private View line_9;
	private View line_10;
	private View ellipse_6;
	private View ellipse_7;
	private View rectangle_37;
	private TextView pessoas___lbuns__fotografias;
	private TextView encontrar_amigos;
	private View rectangle_51;
	private ImageView add_image;
	private ImageView albums;
	private ImageView image_gallery;
	private ImageView search_for_love;
	private TextView criar_album;
	private TextView encontrar;
	private TextView album;
	private TextView partinhar;
	private TextView home;
	private ImageView vector_ek1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.encontar_amigos);

		
		_bg__encontar_amigos_ek2 = (View) findViewById(R.id._bg__encontar_amigos_ek2);
		vector = (ImageView) findViewById(R.id.vector);
		pessoas = (TextView) findViewById(R.id.pessoas);
		_lbuns = (TextView) findViewById(R.id._lbuns);
		pesquisado_recentemente = (TextView) findViewById(R.id.pesquisado_recentemente);
		celcia_laura = (TextView) findViewById(R.id.celcia_laura);
		divertido = (TextView) findViewById(R.id.divertido);
		triste = (TextView) findViewById(R.id.triste);
		amor = (TextView) findViewById(R.id.amor);
		celcia_laura_ek1 = (TextView) findViewById(R.id.celcia_laura_ek1);
		celcia_laura_ek2 = (TextView) findViewById(R.id.celcia_laura_ek2);
		limpar = (TextView) findViewById(R.id.limpar);
		ellipse_8 = (View) findViewById(R.id.ellipse_8);
		ellipse_10 = (View) findViewById(R.id.ellipse_10);
		ellipse_9 = (View) findViewById(R.id.ellipse_9);
		rectangle_48 = (View) findViewById(R.id.rectangle_48);
		rectangle_49 = (View) findViewById(R.id.rectangle_49);
		rectangle_50 = (View) findViewById(R.id.rectangle_50);
		line_9 = (View) findViewById(R.id.line_9);
		line_10 = (View) findViewById(R.id.line_10);
		ellipse_6 = (View) findViewById(R.id.ellipse_6);
		ellipse_7 = (View) findViewById(R.id.ellipse_7);
		rectangle_37 = (View) findViewById(R.id.rectangle_37);
		pessoas___lbuns__fotografias = (TextView) findViewById(R.id.pessoas___lbuns__fotografias);
		encontrar_amigos = (TextView) findViewById(R.id.encontrar_amigos);
		rectangle_51 = (View) findViewById(R.id.rectangle_51);
		add_image = (ImageView) findViewById(R.id.add_image);
		albums = (ImageView) findViewById(R.id.albums);
		image_gallery = (ImageView) findViewById(R.id.image_gallery);
		search_for_love = (ImageView) findViewById(R.id.search_for_love);
		criar_album = (TextView) findViewById(R.id.criar_album);
		encontrar = (TextView) findViewById(R.id.encontrar);
		album = (TextView) findViewById(R.id.album);
		partinhar = (TextView) findViewById(R.id.partinhar);
		home = (TextView) findViewById(R.id.home);
		vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
	
		
		//custom code goes here
	
	}

	public void encontraramigos(View encontra){

		Intent amigos = new Intent(encontar_amigos_activity.this, encontar_amigos_activity.class);

		startActivity(amigos);
	}

	public void veralbum(View veralbum){

		Intent ver = new Intent(encontar_amigos_activity.this, listar_album_activity.class);

		startActivity(ver);
	}

	public void partinhar(View partinhar){

		Intent partinha = new Intent(encontar_amigos_activity.this, partiha_activity.class);

		startActivity(partinha);
	}

	public void criaralbum(View criar){

		Intent cria = new Intent(encontar_amigos_activity.this, Novoalbum.class);

		startActivity(cria);
	}


	public void home(View home){

		Intent hom = new Intent(encontar_amigos_activity.this, inicio_activity.class);

		startActivity(hom);
	}
}
	
	