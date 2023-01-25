package ao.uan.fc.dam.p2fotos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login_activity extends Activity {

	EditText emailid;
	EditText senha;
    Button btn_login;
	//basededados DB;
	TextView registar;
	GoogleSignInOptions gso;
	GoogleSignInClient gsc;
	ImageView google_btn;

	FirebaseAuth mAuth;
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		//DB=new basededados(this);
		emailid =findViewById(R.id.email_id);
		senha =findViewById(R.id.senha);
		btn_login=findViewById(R.id.btn_login);
		registar = findViewById(R.id.registar);

		mAuth = FirebaseAuth.getInstance();

		//BOTAO LODIN
		btn_login.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				String email = emailid.getText().toString();
				String senhaa = senha.getText().toString();


				if (TextUtils.isEmpty(email)) {
					emailid.setError("Preencha o campo Email!");

				} else if (TextUtils.isEmpty(senhaa)) {
					senha.setError("Preencha o campo Senha!");

				} else {
					mAuth.signInWithEmailAndPassword(email, senhaa).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
						@Override
						public void onComplete(@NonNull Task<AuthResult> task) {
							if (task.isSuccessful()) {
								Toast.makeText(login_activity.this, "login com sucesso!", Toast.LENGTH_SHORT).show();
								startActivity(new Intent(login_activity.this, inicio_activity.class));
							} else {
								Toast.makeText(login_activity.this, "login Falho! " , Toast.LENGTH_SHORT).show();
							}
						}
					});
				}
			}
		});

		//CHAMAR TELA DE registar
		registar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {

				Intent in = new Intent(getApplicationContext(), resgistar_activity.class);

				startActivity(in);
			}
		});


		///API GMAIL

		google_btn=findViewById(R.id.google_btn);
		gso=new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
		gsc= GoogleSignIn.getClient(this,gso);




		google_btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				signIn();
			}
		});

	}


	void signIn() {

		Intent singInIntent=gsc.getSignInIntent();
		startActivityForResult(singInIntent,1000);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		if (requestCode==1000){

			Task<GoogleSignInAccount> task= GoogleSignIn.getSignedInAccountFromIntent(data);
			try {
				task.getResult(ApiException.class);
				navigateToSecondActivity();
			}catch (ApiException e){

				Toast.makeText(this, "Algo deu errado", Toast.LENGTH_SHORT).show();
			}
		}

	}

	private void navigateToSecondActivity() {
		finish();
		Intent intent= new Intent(login_activity.this,inicio_activity.class);
		startActivity(intent);
	}



}


	
	