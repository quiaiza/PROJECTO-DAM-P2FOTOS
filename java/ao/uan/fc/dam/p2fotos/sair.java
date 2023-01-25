package ao.uan.fc.dam.p2fotos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class sair extends AppCompatActivity {

    ImageView close;
    GoogleSignInOptions gso;
    GoogleSignInClient gsc;
    TextView name,email;
    Button signout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sair);
        signout=findViewById(R.id.signout);
        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        close=findViewById(R.id.close);


        gso= new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        gsc= GoogleSignIn.getClient(this,gso);

        GoogleSignInAccount acct= GoogleSignIn.getLastSignedInAccount(this);
        if(acct!=null){
            String personName=acct.getDisplayName();
            String personEmail=acct.getEmail();
            name.setText(personName);
            email.setText(personEmail);}

        signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signout();
            }
        });

close.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        Intent intent= new Intent(sair.this,inicio_activity.class);
        startActivity(intent);
    }
});
    }

    void signout(){

        gsc.signOut().addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete( Task<Void> task) {
                finish();
                startActivity(new Intent(sair.this,login_activity.class));
            }
        });
    }


}