package com.fimi.p147b;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import java.io.File;
/* renamed from: com.fimi.b.a */
/* loaded from: classes.dex */
public class C1520a extends Thread {

    /* renamed from: a */
    private Handler f3653a;

    /* renamed from: b */
    private File f3654b;

    /* renamed from: c */
    private String f3655c;

    /* renamed from: d */
    private File[] f3656d;

    /* renamed from: e */
    private boolean f3657e;

    /* renamed from: a */
    public Handler m35389a() {
        return this.f3653a;
    }

    /* renamed from: a */
    public void m35388a(Handler handler) {
        this.f3653a = handler;
    }

    /* renamed from: a */
    public void m35387a(File file) {
        this.f3654b = file;
    }

    /* renamed from: a */
    public void m35386a(String str) {
        this.f3655c = str;
    }

    /* renamed from: a */
    public void m35385a(boolean z) {
        this.f3657e = z;
    }

    /* renamed from: a */
    public void m35384a(File[] fileArr) {
        this.f3656d = fileArr;
    }

    /* renamed from: b */
    public File m35383b() {
        return this.f3654b;
    }

    /* renamed from: c */
    public File[] m35382c() {
        return this.f3656d;
    }

    /* renamed from: d */
    public boolean m35381d() {
        return this.f3657e;
    }

    /* renamed from: e */
    public String m35380e() {
        return this.f3655c;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        int m35376a = this.f3657e ? C1521b.m35376a(this.f3655c + ".zip", new File[]{this.f3654b}) : C1521b.m35377a(this.f3654b.getAbsolutePath(), this.f3655c);
        Message message = new Message();
        Bundle bundle = new Bundle();
        bundle.putInt("OPTION_STATUS", m35376a);
        message.setData(bundle);
        this.f3653a.sendMessage(message);
    }
}
