package com.ahmadrosid.olxlite.core.iklan_saya.newiklan;

import com.ahmadrosid.lib.baseapp.core.BasePresenter;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ocittwo on 2/3/17.
 *
 * @Author Ahmad Rosid
 * @Email ocittwo@gmail.com
 * @Github https://github.com/ar-android
 * @Web http://ahmadrosid.com
 */

public class NewIklanPresenter extends BasePresenter<NewIklanView> {

    private DatabaseReference mDatabase;

    public NewIklanPresenter(NewIklanView mvpView) {
        super(mvpView);
        mDatabase = FirebaseDatabase.getInstance().getReference();
    }

    public void postNewIklan(String judul, String harga, String lokasi, String description, String url_photo) {
        
    }

    public String getUid() {
        return FirebaseAuth.getInstance().getCurrentUser().getUid();
    }
}
