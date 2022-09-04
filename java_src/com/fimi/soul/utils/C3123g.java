package com.fimi.soul.utils;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;
import java.util.Date;
/* renamed from: com.fimi.soul.utils.g */
/* loaded from: classes.dex */
public class C3123g {

    /* renamed from: c */
    private static C3123g f11660c = new C3123g();

    /* renamed from: a */
    private RandomAccessFile f11661a = null;

    /* renamed from: b */
    private final boolean f11662b = true;

    public C3123g() {
        m29088b();
    }

    /* renamed from: a */
    public static C3123g m29090a() {
        if (f11660c == null) {
            f11660c = new C3123g();
        }
        return f11660c;
    }

    /* renamed from: a */
    public void m29089a(String str) {
        if (this.f11661a != null) {
            try {
                this.f11661a.write((new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()) + " " + str + "\n").getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public void m29088b() {
        String str = C3129m.m29047t() + new SimpleDateFormat("yyyy-MM-dd").format(new Date()) + ".txt";
        File file = new File(C3129m.m29047t());
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            this.f11661a = new RandomAccessFile(str, "rw");
            this.f11661a.seek(this.f11661a.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public void m29087c() {
        if (this.f11661a != null) {
            try {
                this.f11661a.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
