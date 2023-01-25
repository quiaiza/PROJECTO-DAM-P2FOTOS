package ao.uan.fc.dam.p2fotos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class inicio_activity extends Activity {



	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.inicio);


	}
	public void perfil(View perfi){

		Intent sair = new Intent(inicio_activity.this, sair.class);

		startActivity(sair);
	}
	public void menu(View menu){

		Intent men = new Intent(inicio_activity.this, menu_activity.class);

		startActivity(men);
	}
	public void criaralbum(View cria){

		Intent criar = new Intent(inicio_activity.this, Novoalbum.class);

		startActivity(criar);
	}
	public void partilhar(View partilhar){

		Intent partilha = new Intent(inicio_activity.this, partiha_activity.class);

		startActivity(partilha);
	}
	public void veralbum(View ver){

		Intent veralbum = new Intent(inicio_activity.this, listar_album_activity.class);

		startActivity(veralbum);
	}

	public void encontraramigos(View amigos){

		Intent amigosencontardos = new Intent(inicio_activity.this, encontar_amigos_activity.class);

		startActivity(amigosencontardos);
	}
}
	
	