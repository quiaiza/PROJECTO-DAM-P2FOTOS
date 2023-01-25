package ao.uan.fc.dam.p2fotos;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
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


import java.util.regex.Pattern;

public class  resgistar_activity extends Activity {

	EditText emailid;
	EditText senha;

Button btn_continuar;

	TextView login;
	
//basededados DB;
	GoogleSignInOptions gso;
	GoogleSignInClient gsc;
	ImageView google_btn;
	FirebaseAuth mAuth;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.resgistar);

		//DB=new basededados(this);
		emailid = findViewById(R.id.email_id);
		senha = findViewById(R.id.senha);
		btn_continuar = findViewById(R.id.btn_continuar);
		login = findViewById(R.id.login);
		mAuth = FirebaseAuth.getInstance();

		//botao de registo
		btn_continuar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {

				String emailuser = emailid.getText().toString();
				String pass = senha.getText().toString();


				if (TextUtils.isEmpty(emailuser) && Patterns.EMAIL_ADDRESS.matcher(emailuser).matches()){
					emailid.setError("Preencha o campo Email!");

				}else if (TextUtils.isEmpty(pass)){
					senha.setError("Preencha o campo Senha!");

				}else{
					mAuth.createUserWithEmailAndPassword(emailuser,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
						@Override
						public void onComplete(@NonNull Task<AuthResult> task) {
							if (task.isSuccessful()){
								Toast.makeText(resgistar_activity.this, "Registado com sucesso!", Toast.LENGTH_SHORT).show();
								startActivity(new Intent(resgistar_activity.this, inicio_activity.class));
							}else{
								Toast.makeText(resgistar_activity.this, "Registado Falho! " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
							}
						}
					});
				}
			}
		});


//CHAMAR TELA DE LOGIN
		login.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {

				Intent in = new Intent(getApplicationContext(), login_activity.class);

				startActivity(in);
			}
		});


// API DO GMAIL

	google_btn=findViewById(R.id.google_btn);
	gso=new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
	gsc= GoogleSignIn.getClient(this,gso);


	GoogleSignInAccount acct= GoogleSignIn.getLastSignedInAccount(this);
		if (acct!= null){
		navigateToSecondActivity();
	}

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
		Intent intent= new Intent(resgistar_activity.this,inicio_activity.class);
		startActivity(intent);
	}



}



