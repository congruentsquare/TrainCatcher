//package ninja.carre.mbta.gtfsRealtime;
//
//import android.content.ContentValues;
//import android.content.Context;
//import android.database.sqlite.SQLiteDatabase;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
///**
// * Created by carre on 10/4/2016.
// */
//
//public class importCSV {
//    public void insertCSVintoDb(Context context, File file, String nameTable) {
//        final File dbFile = new File(
//                context.getCacheDir(), "ImportExport");
//        ContentValues cv = new ContentValues();
//        BufferedReader br = null;
//        String s = "";
//        boolean skipLines = true;
//        String[] data;
//        SQLiteDatabase db = SQLiteDatabase.openDatabase(context.getDatabasePath("MBTA_GTFS"), cursor(), );
//        db.beginTransaction();
//        try {
//            br = new BufferedReader(new InputStreamReader(new FileInputStream(File), "Windows-1251"));
//            while ((s = br.readLine()) != null) {
//                //skip header
//                if (skipLines) {
//                    skipLines = false;
//                    continue;
//                }
//                //- 1 not skip blank
//                data = s.split(";", -1);
//                for (int i = 0; i < data.length - 1; ++i) {
//                    cv.put(tableCol[i], data[i]);
//                }
//                db.insert(nameTable, null, cv);
//            }
//            db.setTransactionSuccessful();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                db.endTransaction();
//                br.close();
//                new Folder().deleteFolder();
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
