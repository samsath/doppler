package uk.org.samhipwell.doppler;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class FeedDataBase extends SQLiteOpenHelper {

    // Database setting
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "DOPPLER_FEEDS";

    // Table and column names
    private static final String TABLE_FEEDS = "FEEDS";
    private static final String COLUMN_ID = "ID";
    private static final String COLUMN_TITLE = "TITLE";

    FeedDataBase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
