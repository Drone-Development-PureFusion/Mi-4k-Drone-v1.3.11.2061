package com.fimi.soul.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/* renamed from: com.fimi.soul.utils.h */
/* loaded from: classes.dex */
public class C3124h {

    /* renamed from: d */
    private static C3124h f11663d = new C3124h();

    /* renamed from: a */
    private BufferedWriter f11664a;

    /* renamed from: b */
    private File f11665b;

    /* renamed from: c */
    private StringBuffer f11666c = new StringBuffer();

    private C3124h() {
        if (!m29083c()) {
            m29084b();
        }
    }

    /* renamed from: a */
    public static C3124h m29086a() {
        if (f11663d == null) {
            f11663d = new C3124h();
        }
        return f11663d;
    }

    /* renamed from: a */
    public void m29085a(String str) {
        this.f11666c.append(new SimpleDateFormat("yyyy-MM-dd HH-mm-ss-SSSS", Locale.US).format(new Date())).append("   ");
        this.f11666c.append(str);
        this.f11666c.append("\n");
        try {
            this.f11664a.write(this.f11666c.toString());
            this.f11664a.flush();
            this.f11666c = this.f11666c.delete(0, this.f11666c.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public void m29084b() {
        this.f11665b = new File(C3129m.m29044w());
        if (!this.f11665b.exists()) {
            this.f11665b.getParentFile().mkdirs();
            try {
                this.f11665b.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (this.f11664a == null) {
            try {
                this.f11664a = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f11665b, true)));
                this.f11664a.flush();
                this.f11666c = this.f11666c.delete(0, this.f11666c.length());
            } catch (FileNotFoundException e2) {
                e2.printStackTrace();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public boolean m29083c() {
        if (this.f11665b != null && !this.f11665b.exists()) {
            try {
                this.f11664a.close();
                this.f11664a = null;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return (this.f11664a == null || this.f11665b == null || !this.f11665b.exists()) ? false : true;
    }
}
