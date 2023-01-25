package ao.uan.fc.dam.p2fotos;


import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;


import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ver_album_activity extends Activity {


	Button select, previous, next;
	ImageSwitcher imageView;
	int PICK_IMAGE_MULTIPLE = 1;
	String imageEncoded;
	TextView total;
	ArrayList<Uri> mArrayUri;
	int position = 0;
	List<String> imagesEncodedList;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.ver_album);

		select = findViewById(R.id.select);
		total = findViewById(R.id.text);
		imageView = findViewById(R.id.image);
		previous = findViewById(R.id.previous);
		mArrayUri = new ArrayList<Uri>();

		// showing all images in imageswitcher
		imageView.setFactory(new ViewSwitcher.ViewFactory() {
			@Override
			public View makeView() {
				ImageView imageView1 = new ImageView(getApplicationContext());
				return imageView1;
			}
		});
		next = findViewById(R.id.next);

		// click here to select next image
		next.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if (position < mArrayUri.size() - 1) {
					// increase the position by 1
					position++;
					imageView.setImageURI(mArrayUri.get(position));
				} else {
					Toast.makeText(ver_album_activity.this, "Ultima foto", Toast.LENGTH_SHORT).show();
				}
			}
		});

		// click here to view previous image
		previous.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if (position > 0) {
					// decrease the position by 1
					position--;
					imageView.setImageURI(mArrayUri.get(position));
				}
			}
		});

		imageView = findViewById(R.id.image);

		// click here to select image
		select.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				// initialising intent
				Intent intent = new Intent();

				// setting type to select to be image
				intent.setType("image/*");

				// allowing multiple image to be selected
				intent.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
				intent.setAction(Intent.ACTION_GET_CONTENT);
				startActivityForResult(Intent.createChooser(intent, "Selecionar fotos"), PICK_IMAGE_MULTIPLE);
			}
		});
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		// When an Image is picked
		if (requestCode == PICK_IMAGE_MULTIPLE && resultCode == RESULT_OK && null != data) {
			// Get the Image from data
			if (data.getClipData() != null) {
				ClipData mClipData = data.getClipData();
				int cout = data.getClipData().getItemCount();
				for (int i = 0; i < cout; i++) {
					// adding imageuri in array
					Uri imageurl = data.getClipData().getItemAt(i).getUri();
					mArrayUri.add(imageurl);
				}
				// setting 1st selected image into image switcher
				imageView.setImageURI(mArrayUri.get(0));
				position = 0;
			} else {
				Uri imageurl = data.getData();
				mArrayUri.add(imageurl);
				imageView.setImageURI(mArrayUri.get(0));
				position = 0;
			}
		} else {
			// show this if no image is selected
			Toast.makeText(this, "Não há fotos", Toast.LENGTH_LONG).show();
		}

	}



	public void voltar(View voltar){

		Intent volta= new Intent(ver_album_activity.this, Novoalbum.class);

		startActivity(volta);
	}
}
	
	