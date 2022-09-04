package com.fimi.soul.module.setting;

import com.fimi.soul.utils.C3129m;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.FilenameFilter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.module.setting.f */
/* loaded from: classes.dex */
public class C2918f implements Serializable {

    /* renamed from: a */
    public static final String f10429a = ".vfm";

    /* renamed from: f */
    long f10434f;

    /* renamed from: i */
    boolean f10437i;

    /* renamed from: j */
    private boolean f10438j;

    /* renamed from: k */
    private long f10439k;

    /* renamed from: l */
    private long f10440l;

    /* renamed from: q */
    private int f10445q;

    /* renamed from: r */
    private long f10446r;

    /* renamed from: s */
    private String f10447s;

    /* renamed from: b */
    String f10430b = "";

    /* renamed from: c */
    String f10431c = "";

    /* renamed from: d */
    int f10432d = 0;

    /* renamed from: e */
    String f10433e = "0 k";

    /* renamed from: g */
    int f10435g = 0;

    /* renamed from: h */
    boolean f10436h = false;

    /* renamed from: m */
    private List<C2918f> f10441m = new ArrayList();

    /* renamed from: n */
    private List<C2918f> f10442n = new ArrayList();

    /* renamed from: o */
    private List<C2918f> f10443o = new ArrayList();

    /* renamed from: p */
    private int f10444p = 1;

    /* renamed from: A */
    public boolean m29977A() {
        return this.f10438j;
    }

    /* renamed from: B */
    public boolean m29976B() {
        return this.f10437i;
    }

    /* renamed from: a */
    public List<C2918f> m29975a() {
        return this.f10441m;
    }

    /* renamed from: a */
    public void m29974a(int i) {
        this.f10432d = i;
    }

    /* renamed from: a */
    public void m29973a(long j) {
        this.f10439k = j;
        this.f10440l = this.f10439k;
    }

    /* renamed from: a */
    public void m29972a(String str) {
        m29962c(str);
        m29966b(str);
        m29959d(str);
    }

    /* renamed from: a */
    public void m29971a(List<C2918f> list) {
        this.f10441m = list;
    }

    /* renamed from: a */
    public void m29970a(boolean z) {
        this.f10436h = z;
    }

    /* renamed from: b */
    public List<C2918f> m29969b() {
        return this.f10442n;
    }

    /* renamed from: b */
    public void m29968b(int i) {
        this.f10435g = i;
    }

    /* renamed from: b */
    public void m29967b(long j) {
        this.f10434f = j;
    }

    /* renamed from: b */
    public void m29966b(String str) {
        File[] listFiles;
        File file = new File(C3129m.m29051p() + "/" + C3129m.m29050q() + "/" + str);
        if (!file.exists() || (listFiles = new File(file.getAbsolutePath()).listFiles(new FilenameFilter() { // from class: com.fimi.soul.module.setting.f.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file2, String str2) {
                return str2.toLowerCase().endsWith(C2918f.f10429a);
            }
        })) == null) {
            return;
        }
        for (int i = 0; i < listFiles.length; i++) {
            if (listFiles[i].length() > 0) {
                C2918f c2918f = new C2918f();
                c2918f.m29957e(listFiles[i].getName());
                c2918f.m29974a(0);
                c2918f.m29955f(listFiles[i].getAbsolutePath());
                c2918f.m29968b(0);
                c2918f.m29973a(listFiles[i].length());
                this.f10441m.add(c2918f);
                this.f10444p++;
                this.f10440l += listFiles[i].length();
            }
        }
    }

    /* renamed from: b */
    public void m29965b(List<C2918f> list) {
        this.f10442n = list;
    }

    /* renamed from: b */
    public void m29964b(boolean z) {
        this.f10438j = z;
    }

    /* renamed from: c */
    public List<C2918f> m29963c() {
        return this.f10443o;
    }

    /* renamed from: c */
    public void m29962c(String str) {
        File[] listFiles;
        File file = new File(C3129m.m29051p() + "/" + C3129m.m29049r() + "/" + str);
        if (!file.exists() || (listFiles = new File(file.getAbsolutePath()).listFiles(new FilenameFilter() { // from class: com.fimi.soul.module.setting.f.2
            @Override // java.io.FilenameFilter
            public boolean accept(File file2, String str2) {
                return str2.toLowerCase().endsWith(C2918f.f10429a);
            }
        })) == null) {
            return;
        }
        for (int i = 0; i < listFiles.length; i++) {
            if (listFiles[i].length() > 0) {
                C2918f c2918f = new C2918f();
                c2918f.m29957e(listFiles[i].getName());
                c2918f.m29974a(0);
                c2918f.m29955f(listFiles[i].getAbsolutePath());
                c2918f.m29968b(0);
                c2918f.m29973a(listFiles[i].length());
                this.f10442n.add(c2918f);
                this.f10444p++;
                this.f10440l += listFiles[i].length();
            }
        }
    }

    /* renamed from: c */
    public void m29961c(boolean z) {
        this.f10437i = z;
    }

    /* renamed from: d */
    public long m29960d() {
        return this.f10439k;
    }

    /* renamed from: d */
    public void m29959d(String str) {
        File[] listFiles;
        File file = new File(C3129m.m29051p() + "/" + C3129m.m29048s() + "/" + str);
        if (!file.exists() || (listFiles = new File(file.getAbsolutePath()).listFiles(new FilenameFilter() { // from class: com.fimi.soul.module.setting.f.3
            @Override // java.io.FilenameFilter
            public boolean accept(File file2, String str2) {
                return str2.toLowerCase().endsWith(C2918f.f10429a);
            }
        })) == null) {
            return;
        }
        for (int i = 0; i < listFiles.length; i++) {
            if (listFiles[i].length() > 0) {
                C2918f c2918f = new C2918f();
                c2918f.m29957e(listFiles[i].getName());
                c2918f.m29974a(0);
                c2918f.m29955f(listFiles[i].getAbsolutePath());
                c2918f.m29968b(0);
                c2918f.m29973a(listFiles[i].length());
                this.f10443o.add(c2918f);
                this.f10444p++;
                this.f10440l += listFiles[i].length();
            }
        }
    }

    /* renamed from: e */
    public long m29958e() {
        return this.f10440l;
    }

    /* renamed from: e */
    public void m29957e(String str) {
        this.f10430b = str;
    }

    /* renamed from: f */
    public int m29956f() {
        return this.f10444p;
    }

    /* renamed from: f */
    public void m29955f(String str) {
        this.f10431c = str;
        this.f10447s = str;
    }

    /* renamed from: g */
    public void m29954g() {
        if (this.f10445q == 0) {
            this.f10446r = this.f10439k;
            return;
        }
        int size = this.f10441m.size();
        int size2 = this.f10442n.size();
        if (this.f10445q - 1 < size) {
            this.f10446r = this.f10441m.get(this.f10445q - 1).m29960d() + this.f10446r;
        } else if ((this.f10445q - 1) - size >= size2) {
        } else {
            this.f10446r = this.f10442n.get((this.f10445q - 1) - size).m29960d() + this.f10446r;
        }
    }

    /* renamed from: g */
    public void m29953g(String str) {
        this.f10433e = str;
    }

    /* renamed from: h */
    public void m29952h() {
        if (this.f10445q == 0) {
            return;
        }
        int size = this.f10441m.size();
        int size2 = this.f10442n.size();
        if (this.f10445q - 1 < size) {
            C2918f c2918f = this.f10441m.get(this.f10445q - 1);
            c2918f.m29957e(c2918f.m29939u().replace(".", "&synced."));
        } else if ((this.f10445q - 1) - size >= size2) {
        } else {
            C2918f c2918f2 = this.f10442n.get((this.f10445q - 1) - size);
            c2918f2.m29957e(c2918f2.m29939u().replace(".", "&synced."));
        }
    }

    /* renamed from: i */
    public int m29951i() {
        int size = this.f10441m.size();
        int size2 = this.f10442n.size();
        if (this.f10445q - 1 < size) {
            return 5;
        }
        return (this.f10445q + (-1)) - size < size2 ? 4 : 0;
    }

    /* renamed from: j */
    public long m29950j() {
        return this.f10446r;
    }

    /* renamed from: k */
    public void m29949k() {
        this.f10445q++;
    }

    /* renamed from: l */
    public boolean m29948l() {
        return this.f10445q == this.f10444p;
    }

    /* renamed from: m */
    public boolean m29947m() {
        return this.f10445q < this.f10444p;
    }

    /* renamed from: n */
    public C2918f m29946n() {
        int size = this.f10441m.size();
        int size2 = this.f10442n.size();
        if (this.f10445q - 1 < size) {
            C2918f c2918f = this.f10441m.get(this.f10445q - 1);
            this.f10447s = c2918f.m29938v();
            return c2918f;
        } else if ((this.f10445q - 1) - size >= size2) {
            return null;
        } else {
            C2918f c2918f2 = this.f10442n.get((this.f10445q - 1) - size);
            this.f10447s = c2918f2.m29938v();
            return c2918f2;
        }
    }

    /* renamed from: o */
    public String m29945o() {
        return this.f10447s;
    }

    /* renamed from: p */
    public boolean m29944p() {
        if (this.f10441m != null) {
            for (C2918f c2918f : this.f10441m) {
                if (!c2918f.m29939u().contains("&synced")) {
                    return false;
                }
            }
        }
        if (this.f10442n != null) {
            for (C2918f c2918f2 : this.f10442n) {
                if (!c2918f2.m29939u().contains("&synced")) {
                    return false;
                }
            }
        }
        return this.f10430b.contains("&synced");
    }

    /* renamed from: q */
    public boolean m29943q() {
        return this.f10430b.contains("&synced");
    }

    /* renamed from: r */
    public boolean m29942r() {
        return this.f10430b.contains(Constants.ACCEPT_TIME_SEPARATOR_SERVER) && this.f10430b.contains(" ");
    }

    /* renamed from: s */
    public boolean m29941s() {
        return this.f10430b.contains(".sf") || this.f10430b.contains(".fc");
    }

    /* renamed from: t */
    public boolean m29940t() {
        return this.f10436h;
    }

    public String toString() {
        return "LogFileEntity{fileName='" + this.f10430b + C0494h.f738z + ", path='" + this.f10431c + C0494h.f738z + ", hasSync=" + this.f10432d + ", fileSize='" + this.f10433e + C0494h.f738z + ", createDate=" + this.f10434f + ", percent=" + this.f10435g + ", iselect=" + this.f10436h + ", isTitleItem=" + this.f10438j + C0494h.f735w;
    }

    /* renamed from: u */
    public String m29939u() {
        return this.f10430b;
    }

    /* renamed from: v */
    public String m29938v() {
        return this.f10431c;
    }

    /* renamed from: w */
    public int m29937w() {
        return this.f10432d;
    }

    /* renamed from: x */
    public String m29936x() {
        return this.f10433e;
    }

    /* renamed from: y */
    public long m29935y() {
        return this.f10434f;
    }

    /* renamed from: z */
    public int m29934z() {
        return this.f10435g;
    }
}
