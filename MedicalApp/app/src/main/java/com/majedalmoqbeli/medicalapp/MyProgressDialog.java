package com.majedalmoqbeli.medicalapp;
import android.app.ProgressDialog;
import android.content.Context;


class  MyProgressDialog {
    static ProgressDialog  progressDialog = null;
    public  static void show(Context context){
        progressDialog = ProgressDialog.show(context, "", context.getResources().getString(R.string.wait), true);

    }
    public  static void hide(){
        if (progressDialog!=null)
        progressDialog.dismiss();
    }


}