package com.example.applicationlist;

import android.graphics.drawable.Drawable;
import android.util.Log;

public class PackInfo {
    public String appname = "";
    public String pname = "";
    public String versionName = "";
    public int versionCode = 0;
    public Drawable icon;
    
    public void prettyPrint() {
        Log.v("PackInfo", appname + "\t" + pname + "\t" + versionName + "\t" + versionCode);
    }
    
    public void showAppName(){
    	
    	Log.v("PackInfo", appname );
    	Log.v("PackInfo", "Icon" + icon );
    }
}

