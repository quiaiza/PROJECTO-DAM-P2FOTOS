package ao.uan.fc.dam.p2fotos;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;


import android.view.View;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class listar_album_activity extends Activity {

	GridView gridview;


	@Override
	public void onCreate(@Nullable Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.listar_album);


gridview=(GridView) findViewById(R.id.gridview);




	
	}
	public void encontraramigos(View encontra){

		Intent amigos = new Intent(listar_album_activity.this, encontar_amigos_activity.class);

		startActivity(amigos);
	}

	public void veralbum(View veralbum){

		Intent ver = new Intent(listar_album_activity.this, listar_album_activity.class);

		startActivity(ver);
	}

	public void partinhar(View partinhar){

		Intent partinha = new Intent(listar_album_activity.this, partiha_activity.class);

		startActivity(partinha);
	}

	public void criaralbum(View criar){

		Intent cria = new Intent(listar_album_activity.this, Novoalbum.class);

		startActivity(cria);
	}


	public void home(View home){

		Intent hom = new Intent(listar_album_activity.this, inicio_activity.class);

		startActivity(hom);
	}



}
	
	