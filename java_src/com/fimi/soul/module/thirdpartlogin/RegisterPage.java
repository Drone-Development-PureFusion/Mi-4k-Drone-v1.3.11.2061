package com.fimi.soul.module.thirdpartlogin;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.ShareSDK;
import com.fimi.soul.module.thirdpartlogin.C2994f;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import p005b.p006a.p007a.p029b.p045i.p046a.C0548a;
/* loaded from: classes.dex */
public class RegisterPage extends Activity implements Handler.Callback, View.OnClickListener {

    /* renamed from: a */
    private static final int f10933a = 0;

    /* renamed from: b */
    private static final int f10934b = 1;

    /* renamed from: c */
    private static final int f10935c = 2;

    /* renamed from: d */
    private static final int f10936d = 3;

    /* renamed from: e */
    private static final String f10937e = "UserIcon.jpg";

    /* renamed from: f */
    private static AbstractC2992d f10938f;

    /* renamed from: g */
    private static String f10939g;

    /* renamed from: h */
    private AbstractC2992d f10940h;

    /* renamed from: i */
    private Platform f10941i;

    /* renamed from: j */
    private ImageView f10942j;

    /* renamed from: k */
    private ImageView f10943k;

    /* renamed from: l */
    private ImageView f10944l;

    /* renamed from: m */
    private TextView f10945m;

    /* renamed from: n */
    private EditText f10946n;

    /* renamed from: o */
    private String f10947o;

    /* renamed from: p */
    private C2994f f10948p = new C2994f();

    /* renamed from: a */
    private void m29782a() {
        if (this.f10941i != null) {
            if (this.f10941i.getDb().getUserGender().equals(C0548a.f931b)) {
                this.f10948p.m29754a(C2994f.EnumC2995a.MALE);
                this.f10943k.setVisibility(0);
                this.f10944l.setVisibility(4);
            } else {
                this.f10948p.m29754a(C2994f.EnumC2995a.FEMALE);
                this.f10943k.setVisibility(4);
                this.f10944l.setVisibility(0);
            }
            this.f10948p.m29753a(this.f10941i.getDb().getUserIcon());
            this.f10948p.m29751b(this.f10941i.getDb().getUserName());
            this.f10948p.m29749c(this.f10941i.getDb().getUserId());
        }
        this.f10946n.setText(this.f10948p.m29752b());
        this.f10945m.setText(this.f10948p.m29748d());
        if (!TextUtils.isEmpty(this.f10948p.m29755a())) {
            m29778b();
        }
        if (!Environment.getExternalStorageState().equals("mounted")) {
            Log.d("change user icon ==>>", "there is not sdcard!");
            return;
        }
        File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + getPackageName() + "/download");
        File file2 = new File(file, f10937e);
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            if (!file2.exists()) {
                file2.createNewFile();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f10947o = file2.getAbsolutePath();
        Log.d("picturePath ==>>", this.f10947o);
    }

    /* renamed from: a */
    static final void m29780a(AbstractC2992d abstractC2992d) {
        f10938f = abstractC2992d;
    }

    /* renamed from: a */
    static final void m29779a(String str) {
        f10939g = str;
    }

    /* renamed from: b */
    private void m29778b() {
        final String userIcon = this.f10941i.getDb().getUserIcon();
        new Thread(new Runnable() { // from class: com.fimi.soul.module.thirdpartlogin.RegisterPage.1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v14, types: [android.widget.ImageView] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r1v3 */
            /* JADX WARN: Type inference failed for: r1v8, types: [com.fimi.soul.module.thirdpartlogin.RegisterPage$1$1, java.lang.Runnable] */
            @Override // java.lang.Runnable
            public void run() {
                FileOutputStream fileOutputStream;
                try {
                    ?? r1 = userIcon;
                    Bitmap decodeStream = BitmapFactory.decodeStream(new URL(r1).openStream());
                    FileOutputStream fileOutputStream2 = null;
                    try {
                        try {
                            fileOutputStream = new FileOutputStream(RegisterPage.this.f10947o);
                            try {
                                decodeStream.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                                try {
                                    fileOutputStream.flush();
                                    fileOutputStream.close();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            } catch (FileNotFoundException e2) {
                                e = e2;
                                e.printStackTrace();
                                try {
                                    fileOutputStream.flush();
                                    fileOutputStream.close();
                                } catch (IOException e3) {
                                    e3.printStackTrace();
                                }
                                RegisterPage.this.f10948p.m29753a(RegisterPage.this.f10947o);
                                new Message().what = 3;
                                ?? r0 = RegisterPage.this.f10942j;
                                r1 = new Runnable() { // from class: com.fimi.soul.module.thirdpartlogin.RegisterPage.1.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        RegisterPage.this.f10942j.setImageURI(Uri.parse(RegisterPage.this.f10947o));
                                    }
                                };
                                r0.post(r1);
                            }
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream2 = r1;
                            try {
                                fileOutputStream2.flush();
                                fileOutputStream2.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                            throw th;
                        }
                    } catch (FileNotFoundException e5) {
                        e = e5;
                        fileOutputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream2.flush();
                        fileOutputStream2.close();
                        throw th;
                    }
                    RegisterPage.this.f10948p.m29753a(RegisterPage.this.f10947o);
                    new Message().what = 3;
                    ?? r02 = RegisterPage.this.f10942j;
                    r1 = new Runnable() { // from class: com.fimi.soul.module.thirdpartlogin.RegisterPage.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            RegisterPage.this.f10942j.setImageURI(Uri.parse(RegisterPage.this.f10947o));
                        }
                    };
                    r02.post(r1);
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
            }
        }).start();
    }

    /* renamed from: c */
    private void m29776c() {
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        intent.setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(intent, 0);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 3:
                this.f10942j.setImageURI(Uri.parse(this.f10947o));
                return false;
            default:
                return false;
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 0 && i2 == -1 && intent != null) {
            Cursor query = getBaseContext().getContentResolver().query(intent.getData(), null, null, null, null);
            query.moveToNext();
            String string = query.getString(query.getColumnIndex("_data"));
            query.close();
            if (!new File(string).exists()) {
                return;
            }
            Log.d(getClass().getSimpleName(), "onActivityResult == " + string + " == exist");
            this.f10948p.m29753a(string);
            this.f10942j.setImageBitmap(C2993e.m29756a(string));
        } else if (i == 1 && i2 == -1) {
            this.f10948p.m29753a(this.f10947o);
            this.f10942j.setImageDrawable(Drawable.createFromPath(this.f10947o));
        } else if (i != 2 || i2 != -1 || intent == null) {
        } else {
            this.f10942j.setImageDrawable(Drawable.createFromPath(this.f10947o));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.f10940h = f10938f;
        this.f10941i = ShareSDK.getPlatform(f10939g);
        f10938f = null;
        f10939g = null;
        super.onCreate(bundle);
        m29782a();
    }
}
