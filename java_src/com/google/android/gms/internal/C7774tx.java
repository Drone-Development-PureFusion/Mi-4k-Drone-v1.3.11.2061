package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import com.google.android.gms.common.internal.C4588d;
@aaa
/* renamed from: com.google.android.gms.internal.tx */
/* loaded from: classes.dex */
public class C7774tx {

    /* renamed from: a */
    private final Context f25703a;

    public C7774tx(Context context) {
        C4588d.m23626a(context, "Context can not be null");
        this.f25703a = context;
    }

    /* renamed from: e */
    public static boolean m13498e() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    /* renamed from: a */
    public boolean m13503a() {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        return m13502a(intent);
    }

    /* renamed from: a */
    public boolean m13502a(Intent intent) {
        C4588d.m23626a(intent, "Intent can not be null");
        return !this.f25703a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    /* renamed from: b */
    public boolean m13501b() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return m13502a(intent);
    }

    /* renamed from: c */
    public boolean m13500c() {
        return m13498e() && this.f25703a.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    /* renamed from: d */
    public boolean m13499d() {
        return true;
    }

    @TargetApi(14)
    /* renamed from: f */
    public boolean m13497f() {
        return Build.VERSION.SDK_INT >= 14 && m13502a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }
}
