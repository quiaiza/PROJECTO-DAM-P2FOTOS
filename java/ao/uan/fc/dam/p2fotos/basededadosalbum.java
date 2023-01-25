
package ao.uan.fc.dam.p2fotos;


        import android.content.ContentValues;
        import android.content.Context;
        import android.database.Cursor;
        import android.database.sqlite.SQLiteDatabase;
        import android.database.sqlite.SQLiteOpenHelper;

        import java.sql.Blob;


public class basededadosalbum extends SQLiteOpenHelper {


    public static final String DBNAME = "album.db";

    public basededadosalbum(Context context) {
        super(
                context, "album.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE album(nomealbum TEXT primary key,imagem Blod )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS album");

    }

    public Boolean inserirdados(String nomealbum) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues dados = new ContentValues();
        dados.put("nomealbum", nomealbum);


        long result = db.insert("album", null, dados);

        if (result == -1) return false;
        else
            return true;


    }

}







