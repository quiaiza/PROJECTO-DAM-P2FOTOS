package ao.uan.fc.dam.p2fotos;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ProfileHolder> {
    Context mContext;

    List<Moduleclass> profilList;


    public ProfileAdapter(Context mContext, List<Moduleclass> profilList) {
        this.mContext = mContext;
        this.profilList = profilList;
    }

    @NonNull
    @Override
    public ProfileAdapter.ProfileHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View myView= LayoutInflater.from(mContext).inflate(R.layout.itemdogriw,parent,false);


        return new ProfileHolder(myView);
    }

    @Override
    public void onBindViewHolder(@NonNull ProfileAdapter.ProfileHolder holder, int position) {

        Moduleclass mn=profilList.get(position);
        holder.getname.setText(mn.getName());
        Bitmap myimg= BitmapFactory.decodeByteArray(mn.getProfile(),0,mn.getProfile().length);
        holder.getprofile.setImageBitmap(myimg);
    }

    @Override
    public int getItemCount() {
        return profilList.size();
    }

    public class ProfileHolder extends RecyclerView.ViewHolder {

        TextView getname;
      ImageView getprofile;





        public ProfileHolder(@NonNull View itemView) {
            super(itemView);



            getname=itemView.findViewById(R.id.getname);
            getprofile=itemView.findViewById(R.id.getprofile);

        }
    }
}
