package ao.uan.fc.dam.p2fotos;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Novoalbum extends AppCompatActivity {

    EditText nome_album;
    Button addalbum,veralbum;
    ImageView myprolife;
    private Uri mSelectedUri;

    RecyclerView recyclerView;
    List<Moduleclass> profilelist;
    ProfileAdapter profileAdapter;
    int CAMERA_REQUEST_CODE=1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novoalbum);
        Button addfoto=findViewById(R.id.addfoto);

        nome_album=(EditText) findViewById(R.id.nome_album);

        addalbum = (Button) findViewById(R.id.addalbum);


        myprolife=findViewById(R.id.imagem);
        recyclerView=findViewById(R.id.recyclerview);
        profilelist=new ArrayList<>();
        profileAdapter=new ProfileAdapter(this,profilelist);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(profileAdapter);


        //Função registar




        addalbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Moduleclass mn= new Moduleclass();
                mn.setName(nome_album.getText().toString());
                byte[] myrofileimg=new byte[0];

                myrofileimg=converter_byte_array(myprolife);
                mn.setProfile(myrofileimg);

                profilelist.add(mn);
                profileAdapter.notifyDataSetChanged();




            }
        });


        addfoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                startActivityForResult(intent, 1);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable  Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1){

            mSelectedUri = data.getData();

            ImageView imageView =findViewById(R.id.imagem);

            imageView.setImageURI(mSelectedUri);


        }
    }



	public void menu(View menu){

		Intent men = new Intent(Novoalbum.this, menu_activity.class);

		startActivity(men);
	}






    public byte[] converter_byte_array(ImageView img){

        Bitmap image=((BitmapDrawable)img.getDrawable()).getBitmap();
        ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();

        image.compress(Bitmap.CompressFormat.PNG,100,byteArrayOutputStream);

        byte[]bytearr=byteArrayOutputStream.toByteArray();
        return bytearr;
    }
}

