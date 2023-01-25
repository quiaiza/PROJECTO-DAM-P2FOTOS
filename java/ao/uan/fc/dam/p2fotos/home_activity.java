package ao.uan.fc.dam.p2fotos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class home_activity extends Activity {

	
	private View _bg__home_ek2;
	private ImageView logo_1;
	private View home_come_ar;
	private TextView come_ar;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);

		
		_bg__home_ek2 = (View) findViewById(R.id._bg__home_ek2);
		logo_1 = (ImageView) findViewById(R.id.logo_1);
		home_come_ar = (View) findViewById(R.id.home_come_ar);
		come_ar = (TextView) findViewById(R.id.come_ar);

	
	}
	public void começar(View começa){

		Intent começar = new Intent(home_activity.this, login_activity.class);

		startActivity(começar);
	}
}
	
	