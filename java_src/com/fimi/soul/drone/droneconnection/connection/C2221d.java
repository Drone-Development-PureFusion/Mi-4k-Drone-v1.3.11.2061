package com.fimi.soul.drone.droneconnection.connection;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.fimi.kernel.p164c.C1645c;
import com.fimi.kernel.utils.C1677r;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.biz.p177e.C1834a;
import com.fimi.soul.biz.p177e.C1839c;
import com.fimi.soul.biz.p180h.C1849a;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.entity.HistoryFileInfo;
import com.fimi.soul.utils.C3129m;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import p005b.p006a.p007a.p029b.p052m.C0636h;
/* renamed from: com.fimi.soul.drone.droneconnection.connection.d */
/* loaded from: classes.dex */
public class C2221d {

    /* renamed from: c */
    private static final String f7002c = C1839c.m33944a().m33943b();

    /* renamed from: a */
    HandlerThread f7003a;

    /* renamed from: b */
    StringBuffer f7004b;

    /* renamed from: d */
    private Handler f7005d;

    /* renamed from: e */
    private SimpleDateFormat f7006e;

    /* renamed from: f */
    private SimpleDateFormat f7007f;

    /* renamed from: g */
    private SimpleDateFormat f7008g;

    /* renamed from: h */
    private BufferedWriter f7009h;

    /* renamed from: i */
    private File f7010i;

    /* renamed from: j */
    private File f7011j;

    /* renamed from: k */
    private StringBuilder f7012k;

    /* renamed from: l */
    private boolean f7013l;

    /* renamed from: m */
    private boolean f7014m;

    /* renamed from: n */
    private Runnable f7015n;

    /* renamed from: o */
    private boolean f7016o;

    /* renamed from: p */
    private C1645c f7017p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fimi.soul.drone.droneconnection.connection.d$a */
    /* loaded from: classes.dex */
    public static class C2223a {

        /* renamed from: a */
        private static final C2221d f7019a = new C2221d();

        C2223a() {
        }
    }

    private C2221d() {
        this.f7004b = new StringBuffer();
        this.f7012k = new StringBuilder();
        this.f7013l = false;
        this.f7015n = new Runnable() { // from class: com.fimi.soul.drone.droneconnection.connection.d.1
            @Override // java.lang.Runnable
            public void run() {
                C2221d.this.f7013l = false;
                C2221d.this.f7005d.postDelayed(this, 400L);
            }
        };
        this.f7017p = C1645c.m34884a();
        if (this.f7003a == null && this.f7005d == null) {
            this.f7003a = new HandlerThread("LogHandler");
            this.f7003a.start();
            this.f7005d = new Handler(this.f7003a.getLooper());
        }
    }

    /* renamed from: a */
    public static C2221d m32670a() {
        return C2223a.f7019a;
    }

    /* renamed from: a */
    private void m32668a(C2196c c2196c, String str) {
        byte[] m32755f = c2196c.m32755f();
        this.f7004b.append(str).append("    ");
        for (int i = 0; i < m32755f.length; i++) {
            this.f7004b.append(Character.forDigit((m32755f[i] & 240) >> 4, 16));
            this.f7004b.append(Character.forDigit(m32755f[i] & 15, 16));
            this.f7004b.append(" ");
        }
        this.f7012k.append(C1677r.m34600b(this.f7004b.toString(), f7002c));
        this.f7012k.append("\n");
        this.f7004b = this.f7004b.delete(0, this.f7004b.length());
        if (this.f7012k.length() > 2048) {
            if (this.f7014m && this.f7010i != null) {
                m32663a(this.f7012k, this.f7010i);
                m32660b(true);
            } else if (!this.f7014m && this.f7011j != null) {
                m32663a(this.f7012k, this.f7011j);
                m32660b(false);
            }
        }
    }

    /* renamed from: a */
    private void m32663a(StringBuilder sb, File file) {
        try {
            this.f7009h.write(sb.toString());
            this.f7009h.flush();
            sb.delete(0, sb.length());
            this.f7013l = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m32660b(boolean z) {
        if (TextUtils.isEmpty(C1849a.m33913a().m33910b()) || this.f7016o) {
            return;
        }
        this.f7016o = true;
        File file = z ? this.f7010i : this.f7011j;
        if (file == null) {
            return;
        }
        m32665a(file);
    }

    /* renamed from: a */
    public void m32669a(C2196c c2196c) {
        if (c2196c.f6913c != 105 || this.f7013l) {
            m32668a(c2196c, m32652j());
        } else {
            this.f7013l = true;
        }
    }

    /* renamed from: a */
    public void m32665a(File file) {
        HistoryFileInfo historyFileInfo = new HistoryFileInfo();
        historyFileInfo.setDeviceType(C1772d.m34208a().m34187k() ? "1" : "0");
        historyFileInfo.setFcId(C1849a.m33913a().m33910b());
        this.f7017p.mo34879a(file.getName(), historyFileInfo);
    }

    /* renamed from: a */
    public void m32664a(String str) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                File file = new File(C3129m.m29055l() + "log.txt");
                if (file == null || !file.exists()) {
                    if (!file.getParentFile().exists()) {
                        file.getParentFile().mkdirs();
                    }
                    file.createNewFile();
                }
                fileOutputStream = new FileOutputStream(file, true);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        }
        try {
            fileOutputStream.write((new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + " : " + str).getBytes());
            fileOutputStream.write("\r\n".getBytes());
            try {
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            try {
                fileOutputStream2.flush();
                fileOutputStream2.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            try {
                fileOutputStream2.flush();
                fileOutputStream2.close();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public void m32662a(boolean z) {
        if (this.f7014m != z) {
            this.f7014m = z;
        }
    }

    /* renamed from: b */
    public void m32661b() {
        String format = m32654h().format(Long.valueOf(System.currentTimeMillis()));
        File file = new File(C3129m.m29070a() + "/LOGDOWN/" + m32653i() + "/AirFly");
        file.mkdirs();
        if (this.f7010i == null || !this.f7010i.exists()) {
            this.f7010i = new File(file, format + ".pb");
        }
        if (this.f7009h == null) {
            try {
                this.f7009h = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f7010i, true)));
                for (Map.Entry<Integer, C2196c> entry : C1834a.m33964a().m33962b().entrySet()) {
                    m32668a(entry.getValue(), m32652j());
                }
                this.f7005d.postDelayed(this.f7015n, 200L);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.f7016o = false;
    }

    /* renamed from: c */
    public void m32659c() {
        String format = m32654h().format(new Date());
        File file = new File(C3129m.m29070a() + "/LOGDOWN/" + m32653i() + "/NoFly");
        file.mkdirs();
        if (this.f7011j == null || !this.f7011j.exists()) {
            this.f7011j = new File(file, format + ".pb");
        }
        if (this.f7009h == null) {
            try {
                this.f7009h = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f7011j, true)));
                for (Map.Entry<Integer, C2196c> entry : C1834a.m33964a().m33962b().entrySet()) {
                    m32668a(entry.getValue(), m32652j());
                }
                this.f7005d.postDelayed(this.f7015n, 200L);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.f7016o = false;
    }

    /* renamed from: d */
    public void m32658d() {
        if (this.f7009h != null) {
            try {
                this.f7009h.close();
                this.f7009h = null;
                this.f7010i = null;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: e */
    public boolean m32657e() {
        return (this.f7009h == null || this.f7010i == null) ? false : true;
    }

    /* renamed from: f */
    public boolean m32656f() {
        return (this.f7009h == null || this.f7011j == null) ? false : true;
    }

    /* renamed from: g */
    public void m32655g() {
        if (this.f7009h != null) {
            try {
                this.f7009h.close();
                this.f7009h = null;
                this.f7011j = null;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: h */
    public SimpleDateFormat m32654h() {
        if (this.f7006e == null) {
            this.f7006e = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
        }
        return this.f7006e;
    }

    /* renamed from: i */
    public String m32653i() {
        if (this.f7007f == null) {
            this.f7007f = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        }
        return this.f7007f.format(Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: j */
    public String m32652j() {
        if (this.f7008g == null) {
            this.f7008g = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss-SSS", Locale.US);
        }
        return this.f7008g.format(Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: k */
    public boolean m32651k() {
        return this.f7011j != null && this.f7011j.length() > C0636h.f1132b;
    }
}
