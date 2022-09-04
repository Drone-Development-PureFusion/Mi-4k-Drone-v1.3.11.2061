package com.baidu.tts.p101e;

import android.content.Context;
/* renamed from: com.baidu.tts.e.b */
/* loaded from: classes.dex */
public class C1162b extends Thread {

    /* renamed from: a */
    private Context f2767a;

    /* renamed from: b */
    private String f2768b;

    public C1162b(Context context, String str) {
        this.f2767a = context;
        this.f2768b = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        C1161a.m36360a(this.f2767a, this.f2768b);
        this.f2767a = null;
    }
}
