package com.fimi.soul.biz.p177e;

import com.fimi.kernel.p164c.C1645c;
import com.fimi.kernel.utils.C1677r;
import com.fimi.soul.biz.p170b.C1772d;
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
/* renamed from: com.fimi.soul.biz.e.d */
/* loaded from: classes.dex */
public class C1842d {

    /* renamed from: j */
    private static final String f5006j = C1839c.m33944a().m33943b();

    /* renamed from: a */
    private BufferedWriter f5007a;

    /* renamed from: b */
    private BufferedWriter f5008b;

    /* renamed from: c */
    private SimpleDateFormat f5009c;

    /* renamed from: d */
    private SimpleDateFormat f5010d;

    /* renamed from: e */
    private SimpleDateFormat f5011e;

    /* renamed from: f */
    private File f5012f;

    /* renamed from: g */
    private File f5013g;

    /* renamed from: h */
    private StringBuffer f5014h;

    /* renamed from: i */
    private StringBuilder f5015i;

    /* renamed from: k */
    private C1645c f5016k;

    /* renamed from: com.fimi.soul.biz.e.d$a */
    /* loaded from: classes.dex */
    public static class C1844a {

        /* renamed from: a */
        private static final C1842d f5017a = new C1842d();
    }

    private C1842d() {
        this.f5014h = new StringBuffer();
        this.f5015i = new StringBuilder();
        this.f5016k = C1645c.m34884a();
    }

    /* renamed from: a */
    public static C1842d m33941a() {
        return C1844a.f5017a;
    }

    /* renamed from: a */
    private void m33938a(StringBuilder sb, BufferedWriter bufferedWriter) {
        if (bufferedWriter == null) {
            return;
        }
        try {
            bufferedWriter.write(sb.toString());
            bufferedWriter.flush();
            sb.delete(0, sb.length());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    private StringBuilder m33934c(C2196c c2196c) {
        try {
            this.f5014h.append(m33928i()).append("    ");
            byte[] m32755f = c2196c.m32755f();
            for (int i = 0; i < m32755f.length; i++) {
                this.f5014h.append(Character.forDigit((m32755f[i] & 240) >> 4, 16));
                this.f5014h.append(Character.forDigit(m32755f[i] & 15, 16));
            }
            this.f5015i.append(C1677r.m34600b(this.f5014h.toString(), f5006j));
            this.f5015i.append("\n");
            this.f5014h = this.f5014h.delete(0, this.f5014h.length());
        } catch (Exception e) {
        }
        return this.f5015i;
    }

    /* renamed from: a */
    public void m33940a(C2196c c2196c) {
        m33938a(m33934c(c2196c), this.f5007a);
    }

    /* renamed from: a */
    public void m33939a(File file) {
        HistoryFileInfo historyFileInfo = new HistoryFileInfo();
        historyFileInfo.setDeviceType(C1772d.m34208a().m34187k() ? "1" : "0");
        historyFileInfo.setFcId(C1849a.m33913a().m33910b());
        this.f5016k.mo34879a(file.getName(), historyFileInfo);
    }

    /* renamed from: b */
    public void m33937b() {
        String format = m33930g().format(new Date());
        File file = new File(C3129m.m29070a() + "/LOGDOWN/" + m33929h() + "/DroneData");
        file.mkdirs();
        if (this.f5012f == null || !this.f5012f.exists()) {
            this.f5012f = new File(file, format + ".fc");
        }
        if (this.f5007a == null) {
            try {
                this.f5007a = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f5012f, true)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public void m33936b(C2196c c2196c) {
        m33938a(m33934c(c2196c), this.f5008b);
    }

    /* renamed from: c */
    public void m33935c() {
        String format = m33930g().format(Long.valueOf(System.currentTimeMillis()));
        File file = new File(C3129m.m29070a() + "/LOGDOWN/" + m33929h() + "/DroneData");
        file.mkdirs();
        if (this.f5013g == null || !this.f5013g.exists()) {
            this.f5013g = new File(file, format + ".fc");
        }
        if (this.f5008b == null) {
            try {
                this.f5008b = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f5013g, true)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    public boolean m33933d() {
        return (this.f5013g == null || this.f5008b == null) ? false : true;
    }

    /* renamed from: e */
    public void m33932e() {
        try {
            if (this.f5008b == null) {
                return;
            }
            this.f5008b.close();
            this.f5008b = null;
        } catch (Exception e) {
        }
    }

    /* renamed from: f */
    public void m33931f() {
        if (this.f5013g != null) {
            this.f5013g.delete();
            this.f5013g = null;
        }
    }

    /* renamed from: g */
    public SimpleDateFormat m33930g() {
        if (this.f5009c == null) {
            this.f5009c = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
        }
        return this.f5009c;
    }

    /* renamed from: h */
    public String m33929h() {
        if (this.f5010d == null) {
            this.f5010d = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        }
        return this.f5010d.format(Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: i */
    public String m33928i() {
        if (this.f5011e == null) {
            this.f5011e = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss-SSS", Locale.US);
        }
        return this.f5011e.format(Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: j */
    public boolean m33927j() {
        return (this.f5007a == null || this.f5012f == null) ? false : true;
    }

    /* renamed from: k */
    public void m33926k() {
        if (this.f5007a != null) {
            try {
                this.f5007a.close();
                this.f5007a = null;
                this.f5012f = null;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: l */
    public File m33925l() {
        return this.f5012f;
    }

    /* renamed from: m */
    public File m33924m() {
        return this.f5013g;
    }
}
