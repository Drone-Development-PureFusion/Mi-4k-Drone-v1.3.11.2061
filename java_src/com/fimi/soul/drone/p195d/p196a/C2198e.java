package com.fimi.soul.drone.p195d.p196a;

import android.content.Context;
import android.util.Log;
/* renamed from: com.fimi.soul.drone.d.a.e */
/* loaded from: classes.dex */
public class C2198e {

    /* renamed from: a */
    public int f6919a;

    /* renamed from: b */
    public int f6920b;

    /* renamed from: c */
    public int f6921c;

    /* renamed from: d */
    String f6922d;

    /* renamed from: e */
    private int f6923e;

    /* renamed from: f */
    private Context f6924f;

    /* renamed from: c */
    private void m32725c() {
        this.f6923e = (this.f6923e + 1) & 255;
    }

    /* renamed from: a */
    public void m32729a() {
        this.f6920b++;
    }

    /* renamed from: a */
    public void m32728a(Context context) {
        Log.e("fdfdfdfd", this.f6919a + "//////" + this.f6920b);
    }

    /* renamed from: a */
    public void m32727a(C2196c c2196c) {
        this.f6919a++;
    }

    /* renamed from: b */
    public void m32726b() {
        this.f6923e = -1;
        this.f6921c = 0;
        this.f6920b = 0;
        this.f6919a = 0;
    }
}
