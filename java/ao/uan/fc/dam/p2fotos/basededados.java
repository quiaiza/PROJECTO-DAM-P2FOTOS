package ao.uan.fc.dam.p2fotos;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;




public class basededados extends SQLiteOpenHelper {


    public static final String DBNAME = "login.db";

    public basededados(Context context) {
        super(
                context, "login.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE users(email TEXT primary key,senha TEXT)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS users");

    }

    public Boolean inserirdados(String email, String senha) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues dados = new ContentValues();
        dados.put("email", email);
        dados.put("Senha", senha);


        long result = db.insert("users", null, dados);

        if (result == -1) return false;
        else
            return true;


    }

    public boolean checkemail(String email){
        SQLiteDatabase db =this.getWritableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM users Where email=?", new String[]{email});

        if (cursor.getCount()>0)
            return true;
        else
            return false;
    }

    public boolean checkemailpassword(String email, String senha){
        SQLiteDatabase db =this.getWritableDatabase();

        Cursor cursor =  db.rawQuery("SELECT * FROM users Where email=? and senha=?", new String[]{email,senha});

        if (cursor.getCount()>0)
            return true;
        else
            return false;
    }
    public boolean validaremail(String email){
        SQLiteDatabase db =this.getWritableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM users Where email=?", new String[]{email});

        if (cursor.getCount()>0)
            return true;
        else
            return false;
    }
}
