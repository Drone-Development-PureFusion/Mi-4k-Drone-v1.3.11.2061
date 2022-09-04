package com.tencent.connect.dataprovider;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.google.android.gms.drive.AbstractC4808e;
import com.tencent.connect.dataprovider.DataType;
import java.io.File;
import java.lang.ref.WeakReference;
/* loaded from: classes2.dex */
public final class CallbackManager {

    /* renamed from: a */
    private WeakReference<Context> f31278a;

    /* renamed from: b */
    private Uri f31279b;

    /* renamed from: c */
    private String f31280c;

    /* renamed from: d */
    private String f31281d;

    /* renamed from: e */
    private String f31282e;

    /* renamed from: f */
    private String f31283f;

    /* renamed from: g */
    private boolean f31284g;

    /* renamed from: h */
    private int f31285h;

    public CallbackManager(Activity activity) {
        this.f31284g = false;
        this.f31278a = new WeakReference<>(activity.getApplicationContext());
        Intent intent = activity.getIntent();
        if (intent != null) {
            this.f31279b = intent.getData();
            this.f31280c = intent.getStringExtra(Constants.SRC_PACKAGE_NAME);
            this.f31281d = intent.getStringExtra(Constants.SRC_ACTIVITY_CLASS_NAME);
            this.f31282e = intent.getStringExtra(Constants.SRC_ACTIVITY_ACTION);
            this.f31285h = intent.getIntExtra(Constants.REQUEST_TYPE, 0);
            this.f31283f = intent.getStringExtra(Constants.APPID);
            if (this.f31279b == null || this.f31281d == null) {
                return;
            }
            this.f31284g = true;
        }
    }

    /* renamed from: a */
    private int m6075a(Bundle bundle) {
        if (!this.f31284g) {
            return -2;
        }
        Intent intent = new Intent();
        intent.setClassName(this.f31280c, this.f31281d);
        intent.setAction(this.f31282e);
        bundle.putString(Constants.APPID, this.f31283f);
        intent.putExtras(bundle);
        intent.setFlags(AbstractC4808e.f17570a_);
        this.f31278a.get().startActivity(intent);
        return 0;
    }

    /* renamed from: a */
    private int m6074a(String str) {
        if (str == null) {
            return -7;
        }
        String lowerCase = str.toLowerCase();
        if (lowerCase.startsWith("http://")) {
            return 0;
        }
        if (!Environment.getExternalStorageState().equals("mounted")) {
            return -10;
        }
        if (!lowerCase.startsWith(Environment.getExternalStorageDirectory().toString().toLowerCase())) {
            return -5;
        }
        File file = new File(str);
        if (!file.exists() || file.isDirectory()) {
            return -8;
        }
        long length = file.length();
        if (length == 0) {
            return -9;
        }
        return length > FimiMediaMeta.AV_CH_STEREO_RIGHT ? -6 : 0;
    }

    public int getRequestDateTypeFlag() {
        return this.f31285h;
    }

    public boolean isCallFromTencentApp() {
        return this.f31284g;
    }

    public boolean isSupportType(int i) {
        return (getRequestDateTypeFlag() & i) != 0;
    }

    public int sendTextAndImagePath(String str, String str2) {
        if (!isSupportType(1)) {
            return -1;
        }
        int m6074a = m6074a(str2);
        if (m6074a != 0) {
            return m6074a;
        }
        DataType.TextAndMediaPath textAndMediaPath = new DataType.TextAndMediaPath(str, str2);
        Bundle bundle = new Bundle();
        bundle.putInt(Constants.DATA_TYPE, 1);
        bundle.putParcelable(Constants.CONTENT_DATA, textAndMediaPath);
        return m6075a(bundle);
    }

    public int sendTextAndVideoPath(String str, String str2) {
        if (!isSupportType(2)) {
            return -1;
        }
        int m6074a = m6074a(str2);
        if (m6074a != 0) {
            return m6074a;
        }
        DataType.TextAndMediaPath textAndMediaPath = new DataType.TextAndMediaPath(str, str2);
        Bundle bundle = new Bundle();
        bundle.putInt(Constants.DATA_TYPE, 2);
        bundle.putParcelable(Constants.CONTENT_DATA, textAndMediaPath);
        return m6075a(bundle);
    }

    public int sendTextOnly(String str) {
        if (!isSupportType(4)) {
            return -1;
        }
        DataType.TextOnly textOnly = new DataType.TextOnly(str);
        Bundle bundle = new Bundle();
        bundle.putInt(Constants.DATA_TYPE, 4);
        bundle.putParcelable(Constants.CONTENT_DATA, textOnly);
        return m6075a(bundle);
    }
}
