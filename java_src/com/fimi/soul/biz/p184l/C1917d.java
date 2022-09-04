package com.fimi.soul.biz.p184l;

import com.xiaomi.infra.galaxy.fds.android.auth.GalaxyFDSCredential;
import com.xiaomi.infra.galaxy.fds.android.util.Args;
/* renamed from: com.fimi.soul.biz.l.d */
/* loaded from: classes.dex */
public class C1917d {

    /* renamed from: a */
    public static final int f5294a = 50000;

    /* renamed from: b */
    public static final int f5295b = 3;

    /* renamed from: c */
    public static final int f5296c = 4096;

    /* renamed from: d */
    public static final int f5297d = 50000;

    /* renamed from: e */
    private static final String f5298e = "http://";

    /* renamed from: f */
    private static final String f5299f = "https://";

    /* renamed from: g */
    private static final String f5300g = "files";

    /* renamed from: h */
    private static final String f5301h = "cdn";

    /* renamed from: i */
    private static final String f5302i = ".fds.api.xiaomi.com";

    /* renamed from: j */
    private static final String f5303j = ".fds-ssl.api.xiaomi.com";

    /* renamed from: q */
    private GalaxyFDSCredential f5310q;

    /* renamed from: k */
    private int f5304k = 50000;

    /* renamed from: l */
    private int f5305l = 50000;

    /* renamed from: m */
    private int f5306m = 0;

    /* renamed from: n */
    private int f5307n = 0;

    /* renamed from: o */
    private int f5308o = 3;

    /* renamed from: p */
    private int f5309p = 4096;

    /* renamed from: r */
    private String f5311r = "";

    /* renamed from: s */
    private boolean f5312s = true;

    /* renamed from: t */
    private boolean f5313t = false;

    /* renamed from: u */
    private boolean f5314u = true;

    /* renamed from: v */
    private boolean f5315v = false;

    /* renamed from: w */
    private String f5316w = "";

    /* renamed from: a */
    public int m33590a() {
        return this.f5308o;
    }

    /* renamed from: a */
    public String m33584a(boolean z, String str) {
        return str.isEmpty() ? z ? f5301h : "files" : z ? str + "-cdn" : str + "-files";
    }

    /* renamed from: a */
    public String m33583a(boolean z, boolean z2) {
        return (!z || !z2) ? f5302i : f5303j;
    }

    /* renamed from: a */
    public void m33589a(int i) {
        Args.notNegative(i, "max retry times");
        this.f5308o = i;
    }

    /* renamed from: a */
    public void m33588a(int i, int i2) {
        this.f5306m = i;
        this.f5307n = i2;
    }

    /* renamed from: a */
    public void m33587a(GalaxyFDSCredential galaxyFDSCredential) {
        Args.notNull(galaxyFDSCredential, "credential");
        this.f5310q = galaxyFDSCredential;
    }

    @Deprecated
    /* renamed from: a */
    public void m33586a(String str) {
    }

    /* renamed from: a */
    public void m33585a(boolean z) {
        this.f5312s = z;
    }

    /* renamed from: b */
    public int m33582b() {
        return this.f5304k;
    }

    /* renamed from: b */
    public C1917d m33581b(int i) {
        m33589a(i);
        return this;
    }

    /* renamed from: b */
    public C1917d m33580b(int i, int i2) {
        m33588a(i, i2);
        return this;
    }

    /* renamed from: b */
    public C1917d m33579b(GalaxyFDSCredential galaxyFDSCredential) {
        m33587a(galaxyFDSCredential);
        return this;
    }

    @Deprecated
    /* renamed from: b */
    public C1917d m33578b(String str) {
        return this;
    }

    /* renamed from: b */
    public C1917d m33577b(boolean z) {
        m33585a(z);
        return this;
    }

    /* renamed from: c */
    public int m33576c() {
        return this.f5305l;
    }

    /* renamed from: c */
    public void m33575c(int i) {
        this.f5304k = i;
    }

    @Deprecated
    /* renamed from: c */
    public void m33574c(String str) {
    }

    /* renamed from: c */
    public void m33573c(boolean z) {
        this.f5313t = z;
    }

    /* renamed from: d */
    public C1917d m33571d(int i) {
        m33575c(i);
        return this;
    }

    @Deprecated
    /* renamed from: d */
    public C1917d m33570d(String str) {
        return this;
    }

    /* renamed from: d */
    public C1917d m33569d(boolean z) {
        m33573c(z);
        return this;
    }

    /* renamed from: d */
    public int[] m33572d() {
        return new int[]{this.f5306m, this.f5307n};
    }

    /* renamed from: e */
    public int m33568e() {
        return this.f5309p;
    }

    /* renamed from: e */
    public void m33567e(int i) {
        this.f5305l = i;
    }

    /* renamed from: e */
    public void m33566e(String str) {
        this.f5311r = str;
    }

    /* renamed from: e */
    public void m33565e(boolean z) {
        this.f5314u = z;
    }

    /* renamed from: f */
    public C1917d m33563f(int i) {
        m33567e(i);
        return this;
    }

    /* renamed from: f */
    public C1917d m33562f(String str) {
        m33566e(str);
        return this;
    }

    /* renamed from: f */
    public C1917d m33561f(boolean z) {
        m33565e(z);
        return this;
    }

    /* renamed from: f */
    public GalaxyFDSCredential m33564f() {
        return this.f5310q;
    }

    @Deprecated
    /* renamed from: g */
    public String m33560g() {
        return m33545o();
    }

    /* renamed from: g */
    public void m33559g(int i) {
        Args.positive(i, "upload part size");
        this.f5309p = i;
    }

    /* renamed from: g */
    void m33558g(String str) {
        this.f5316w = str;
    }

    /* renamed from: g */
    void m33557g(boolean z) {
        this.f5315v = z;
    }

    /* renamed from: h */
    public C1917d m33555h(int i) {
        m33559g(i);
        return this;
    }

    /* renamed from: h */
    C1917d m33554h(String str) {
        m33558g(str);
        return this;
    }

    /* renamed from: h */
    C1917d m33553h(boolean z) {
        m33557g(z);
        return this;
    }

    @Deprecated
    /* renamed from: h */
    public String m33556h() {
        return m33544p();
    }

    /* renamed from: i */
    public String m33552i() {
        return this.f5311r;
    }

    /* renamed from: i */
    String m33551i(boolean z) {
        if (this.f5315v) {
            return this.f5316w;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5312s ? f5299f : f5298e);
        sb.append(m33584a(z, this.f5311r));
        sb.append(m33583a(z, this.f5312s));
        return sb.toString();
    }

    /* renamed from: j */
    public boolean m33550j() {
        return this.f5312s;
    }

    /* renamed from: k */
    public boolean m33549k() {
        return this.f5313t;
    }

    /* renamed from: l */
    public boolean m33548l() {
        return this.f5314u;
    }

    /* renamed from: m */
    boolean m33547m() {
        return this.f5315v;
    }

    /* renamed from: n */
    String m33546n() {
        return this.f5316w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public String m33545o() {
        return m33551i(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public String m33544p() {
        return m33551i(true);
    }

    /* renamed from: q */
    String m33543q() {
        return m33551i(this.f5314u);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public String m33542r() {
        return m33551i(this.f5313t);
    }
}
