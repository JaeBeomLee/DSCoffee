package com.lee.dscoffee;

import android.content.Context;
import android.content.res.AssetManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class DBHelper extends SQLiteOpenHelper {

	private final static String DB_NAME = "coffee_1.db";
	private final static int DB_VERSION = 1;
	
	public DBHelper(Context context){
		super(context, DB_NAME, null, DB_VERSION);
		
		try{
			boolean bResult = checkDB(context);
			Log.i("�����", "DB Check=" + bResult);
			
			if(bResult!= true){
				dumpDB(context);
			}else{
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public boolean checkDB(Context context){
		String filePath = "/data/data/com.lee.dscoffee/databases/coffee_1.db";//�ֽ�
		File file = new File(filePath);
		return file.exists();
	}
	public void dumpDB(Context mContext){
		AssetManager manager = mContext.getAssets();
		String folderPath = "/data/data/com.lee.dscoffee/databases";
		String filePath = "/data/data/com.lee.dscoffee/databases/coffee_1.db";//�ֽ�
		String oldfilePath = "/data/data/com.lee.dscoffee/databases/coffee_1.db";//����
		File folder = new File(folderPath);
		File file = new File(filePath);
		File oldfile = new File(oldfilePath);
		FileOutputStream fos = null;
		BufferedOutputStream bos= null;
		
		try{
			InputStream is = manager.open("assets/DB/coffee_1");//�ֽ�
			BufferedInputStream bis = new BufferedInputStream(is);
			
			if(folder.exists()){
				
			}else{
				folder.mkdirs();
			}
			
			if(file.exists()){
				file.delete();
				file.createNewFile();
			}
			if(oldfile.exists()){
				oldfile.delete();
			}else if(!oldfile.exists()){
				
			}
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			
			int read = -1;
			byte[] buffer = new byte[1024];
			while((read = bis.read(buffer, 0, 1024))!= -1 ){
				bos.write(buffer,0,read);
			}
			
			bos.flush();
			bos.close();
			fos.close();
			bis.close();
			is.close();
			
		}catch(IOException e){
			Log.e("ErrorMessage : ", e.getMessage());
		}
		
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}
	
	
}
