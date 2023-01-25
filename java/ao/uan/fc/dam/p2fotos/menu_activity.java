package ao.uan.fc.dam.p2fotos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;

public class menu_activity extends Activity {



	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);



	
	}


	public void voltar(View voltar){

		Intent volta= new Intent(menu_activity.this, inicio_activity.class);

		startActivity(volta);
	}
	public void encontraramigos(View encontra){

		Intent amigos = new Intent(menu_activity.this, encontar_amigos_activity.class);

		startActivity(amigos);
	}

	public void veralbum(View veralbum){

		Intent ver = new Intent(menu_activity.this, ver_album_activity.class);

		startActivity(ver);
	}

	public void partinhar(View partinhar){

		Intent partinha = new Intent(menu_activity.this, partiha_activity.class);

		startActivity(partinha);
	}

	public void criaralbum(View criar){

		Intent cria = new Intent(menu_activity.this, Novoalbum.class);

		startActivity(cria);
	}


	public void home(View home){

		Intent hom = new Intent(menu_activity.this, home_activity.class);

		startActivity(hom);
	}
}
	
	