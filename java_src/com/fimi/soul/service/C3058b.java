package com.fimi.soul.service;

import com.fimi.kernel.C1642c;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p202f.C2269a;
import com.fimi.soul.utils.C3129m;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
/* renamed from: com.fimi.soul.service.b */
/* loaded from: classes.dex */
public class C3058b {

    /* renamed from: a */
    BufferedWriter f11459a;

    /* renamed from: b */
    BufferedWriter f11460b;

    /* renamed from: c */
    SimpleDateFormat f11461c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.fimi.soul.service.b$a */
    /* loaded from: classes.dex */
    public static class C3059a {

        /* renamed from: a */
        private static C3058b f11462a = new C3058b();

        private C3059a() {
        }
    }

    /* renamed from: a */
    public static C3058b m29428a() {
        return C3059a.f11462a;
    }

    /* renamed from: a */
    private void m29427a(C2196c c2196c) {
        if (c2196c == null) {
            return;
        }
        byte[] m32755f = c2196c.m32755f();
        try {
            if (this.f11460b == null) {
                this.f11460b = m29425b();
            }
            this.f11460b.write(m29424c());
            this.f11460b.write("    ");
            StringBuffer stringBuffer = new StringBuffer(m32755f.length * 2);
            for (int i = 0; i < m32755f.length; i++) {
                stringBuffer.append(Character.forDigit((m32755f[i] & 240) >> 4, 16));
                stringBuffer.append(Character.forDigit(m32755f[i] & 15, 16));
                stringBuffer.append(" ");
            }
            this.f11460b.write(stringBuffer.toString());
            this.f11460b.write("\n");
            this.f11460b.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    private String m29424c() {
        if (this.f11461c == null) {
            this.f11461c = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss", Locale.US);
        }
        return this.f11461c.format(Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: a */
    public void m29426a(ConcurrentHashMap<String, C2196c> concurrentHashMap) {
        if (concurrentHashMap != null) {
            synchronized (this) {
                for (String str : concurrentHashMap.keySet()) {
                    m29427a(concurrentHashMap.get(str));
                }
            }
        }
    }

    /* renamed from: b */
    public BufferedWriter m29425b() {
        C2269a c2269a = (C2269a) C1642c.m34887c().mo34880a("0", C2269a.class);
        String str = c2269a != null ? c2269a.m32513d() + "" + c2269a.m32511e() + "" + c2269a.m32509g() : null;
        try {
            File file = new File(C3129m.m29070a() + "/SAVEDRONEINFO/");
            file.mkdirs();
            if (str == null) {
                str = "savedrone.txt";
            }
            File file2 = new File(file, str);
            if (!file2.exists() && this.f11459a != null) {
                this.f11459a.close();
                file2.createNewFile();
                this.f11459a = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2, true)));
            } else if (!file2.exists() && this.f11459a == null) {
                file2.createNewFile();
                this.f11459a = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2, true)));
            } else if (file2.exists() && this.f11459a == null) {
                this.f11459a = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2, true)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.f11459a;
    }
}
