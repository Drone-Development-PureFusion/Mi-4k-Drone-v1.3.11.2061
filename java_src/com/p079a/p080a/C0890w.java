package com.p079a.p080a;

import com.p079a.p080a.C0867d;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
/* renamed from: com.a.a.w */
/* loaded from: classes.dex */
public class C0890w extends ZipEntry implements Cloneable {

    /* renamed from: a */
    public static final int f1909a = 3;

    /* renamed from: b */
    public static final int f1910b = 0;

    /* renamed from: c */
    private static final int f1911c = 65535;

    /* renamed from: d */
    private static final int f1912d = 16;

    /* renamed from: e */
    private static final byte[] f1913e = new byte[0];

    /* renamed from: f */
    private int f1914f;

    /* renamed from: g */
    private long f1915g;

    /* renamed from: h */
    private int f1916h;

    /* renamed from: i */
    private int f1917i;

    /* renamed from: j */
    private long f1918j;

    /* renamed from: k */
    private LinkedHashMap<C0863ab, AbstractC0891x> f1919k;

    /* renamed from: l */
    private C0878m f1920l;

    /* renamed from: m */
    private String f1921m;

    /* renamed from: n */
    private byte[] f1922n;

    /* renamed from: o */
    private C0870f f1923o;

    /* JADX INFO: Access modifiers changed from: protected */
    public C0890w() {
        this("");
    }

    public C0890w(C0890w c0890w) {
        this((ZipEntry) c0890w);
        m37512a(c0890w.m37513a());
        m37511a(c0890w.m37501b());
        m37503a(c0890w.m37505a(true));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0890w(File file, String str) {
        this(str);
        if (file.isDirectory() && !str.endsWith("/")) {
            str = String.valueOf(str) + "/";
        }
        if (file.isFile()) {
            setSize(file.length());
        }
        setTime(file.lastModified());
    }

    public C0890w(String str) {
        super(str);
        this.f1914f = -1;
        this.f1915g = -1L;
        this.f1916h = 0;
        this.f1917i = 0;
        this.f1918j = 0L;
        this.f1919k = null;
        this.f1920l = null;
        this.f1921m = null;
        this.f1922n = null;
        this.f1923o = new C0870f();
        m37507a(str);
    }

    public C0890w(ZipEntry zipEntry) {
        super(zipEntry);
        this.f1914f = -1;
        this.f1915g = -1L;
        this.f1916h = 0;
        this.f1917i = 0;
        this.f1918j = 0L;
        this.f1919k = null;
        this.f1920l = null;
        this.f1921m = null;
        this.f1922n = null;
        this.f1923o = new C0870f();
        m37507a(zipEntry.getName());
        byte[] extra = zipEntry.getExtra();
        if (extra != null) {
            m37503a(C0867d.m37567a(extra, true, C0867d.C0868a.f1813f));
        } else {
            m37490h();
        }
        setMethod(zipEntry.getMethod());
        this.f1915g = zipEntry.getSize();
    }

    /* renamed from: a */
    private void m37502a(AbstractC0891x[] abstractC0891xArr, boolean z) {
        if (this.f1919k == null) {
            m37503a(abstractC0891xArr);
            return;
        }
        for (AbstractC0891x abstractC0891x : abstractC0891xArr) {
            AbstractC0891x m37498b = abstractC0891x instanceof C0878m ? this.f1920l : m37498b(abstractC0891x.mo37484a());
            if (m37498b == null) {
                m37508a(abstractC0891x);
            } else if (z || !(m37498b instanceof AbstractC0866c)) {
                byte[] mo37480e = abstractC0891x.mo37480e();
                m37498b.mo37483a(mo37480e, 0, mo37480e.length);
            } else {
                byte[] mo37482c = abstractC0891x.mo37482c();
                ((AbstractC0866c) m37498b).mo37536b(mo37482c, 0, mo37482c.length);
            }
        }
        m37490h();
    }

    /* renamed from: a */
    public int m37513a() {
        return this.f1916h;
    }

    /* renamed from: a */
    public void m37512a(int i) {
        this.f1916h = i;
    }

    /* renamed from: a */
    public void m37511a(long j) {
        this.f1918j = j;
    }

    /* renamed from: a */
    public void m37510a(C0863ab c0863ab) {
        if (this.f1919k == null) {
            throw new NoSuchElementException();
        }
        if (this.f1919k.remove(c0863ab) == null) {
            throw new NoSuchElementException();
        }
        m37490h();
    }

    /* renamed from: a */
    public void m37509a(C0870f c0870f) {
        this.f1923o = c0870f;
    }

    /* renamed from: a */
    public void m37508a(AbstractC0891x abstractC0891x) {
        if (abstractC0891x instanceof C0878m) {
            this.f1920l = (C0878m) abstractC0891x;
        } else {
            if (this.f1919k == null) {
                this.f1919k = new LinkedHashMap<>();
            }
            this.f1919k.put(abstractC0891x.mo37484a(), abstractC0891x);
        }
        m37490h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m37507a(String str) {
        if (str != null && m37494d() == 0 && str.indexOf("/") == -1) {
            str = str.replace('\\', '/');
        }
        this.f1921m = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m37506a(String str, byte[] bArr) {
        m37507a(str);
        this.f1922n = bArr;
    }

    /* renamed from: a */
    public void m37504a(byte[] bArr) {
        try {
            m37502a(C0867d.m37567a(bArr, false, C0867d.C0868a.f1813f), false);
        } catch (ZipException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public void m37503a(AbstractC0891x[] abstractC0891xArr) {
        this.f1919k = new LinkedHashMap<>();
        for (AbstractC0891x abstractC0891x : abstractC0891xArr) {
            if (abstractC0891x instanceof C0878m) {
                this.f1920l = (C0878m) abstractC0891x;
            } else {
                this.f1919k.put(abstractC0891x.mo37484a(), abstractC0891x);
            }
        }
        m37490h();
    }

    /* renamed from: a */
    public AbstractC0891x[] m37505a(boolean z) {
        if (this.f1919k == null) {
            return (!z || this.f1920l == null) ? new AbstractC0891x[0] : new AbstractC0891x[]{this.f1920l};
        }
        ArrayList arrayList = new ArrayList(this.f1919k.values());
        if (z && this.f1920l != null) {
            arrayList.add(this.f1920l);
        }
        return (AbstractC0891x[]) arrayList.toArray(new AbstractC0891x[0]);
    }

    /* renamed from: b */
    public long m37501b() {
        return this.f1918j;
    }

    /* renamed from: b */
    public AbstractC0891x m37498b(C0863ab c0863ab) {
        if (this.f1919k != null) {
            return this.f1919k.get(c0863ab);
        }
        return null;
    }

    /* renamed from: b */
    public void m37500b(int i) {
        int i2 = 0;
        int i3 = ((i & 128) == 0 ? 1 : 0) | (i << 16);
        if (isDirectory()) {
            i2 = 16;
        }
        m37511a(i3 | i2);
        this.f1917i = 3;
    }

    /* renamed from: b */
    public void m37499b(long j) {
        setCompressedSize(j);
    }

    /* renamed from: b */
    public void m37497b(AbstractC0891x abstractC0891x) {
        if (abstractC0891x instanceof C0878m) {
            this.f1920l = (C0878m) abstractC0891x;
        } else {
            LinkedHashMap<C0863ab, AbstractC0891x> linkedHashMap = this.f1919k;
            this.f1919k = new LinkedHashMap<>();
            this.f1919k.put(abstractC0891x.mo37484a(), abstractC0891x);
            if (linkedHashMap != null) {
                linkedHashMap.remove(abstractC0891x.mo37484a());
                this.f1919k.putAll(linkedHashMap);
            }
        }
        m37490h();
    }

    /* renamed from: c */
    public int m37496c() {
        if (this.f1917i != 3) {
            return 0;
        }
        return (int) ((m37501b() >> 16) & 65535);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public void m37495c(int i) {
        this.f1917i = i;
    }

    @Override // java.util.zip.ZipEntry
    public Object clone() {
        C0890w c0890w = (C0890w) super.clone();
        c0890w.m37512a(m37513a());
        c0890w.m37511a(m37501b());
        c0890w.m37503a(m37505a(true));
        return c0890w;
    }

    /* renamed from: d */
    public int m37494d() {
        return this.f1917i;
    }

    /* renamed from: e */
    public AbstractC0891x[] m37493e() {
        return m37505a(false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0890w c0890w = (C0890w) obj;
        String name = getName();
        String name2 = c0890w.getName();
        if (name == null) {
            if (name2 != null) {
                return false;
            }
        } else if (!name.equals(name2)) {
            return false;
        }
        String comment = getComment();
        String comment2 = c0890w.getComment();
        if (comment == null) {
            comment = "";
        }
        if (comment2 == null) {
            comment2 = "";
        }
        return getTime() == c0890w.getTime() && comment.equals(comment2) && m37513a() == c0890w.m37513a() && m37494d() == c0890w.m37494d() && m37501b() == c0890w.m37501b() && getMethod() == c0890w.getMethod() && getSize() == c0890w.getSize() && getCrc() == c0890w.getCrc() && getCompressedSize() == c0890w.getCompressedSize() && Arrays.equals(m37488j(), c0890w.m37488j()) && Arrays.equals(m37489i(), c0890w.m37489i()) && this.f1923o.equals(c0890w.f1923o);
    }

    /* renamed from: f */
    public void m37492f() {
        if (this.f1920l == null) {
            throw new NoSuchElementException();
        }
        this.f1920l = null;
        m37490h();
    }

    /* renamed from: g */
    public C0878m m37491g() {
        return this.f1920l;
    }

    @Override // java.util.zip.ZipEntry
    public int getMethod() {
        return this.f1914f;
    }

    @Override // java.util.zip.ZipEntry
    public String getName() {
        return this.f1921m == null ? super.getName() : this.f1921m;
    }

    @Override // java.util.zip.ZipEntry
    public long getSize() {
        return this.f1915g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public void m37490h() {
        super.setExtra(C0867d.m37566a(m37505a(true)));
    }

    @Override // java.util.zip.ZipEntry
    public int hashCode() {
        return getName().hashCode();
    }

    /* renamed from: i */
    public byte[] m37489i() {
        byte[] extra = getExtra();
        return extra != null ? extra : f1913e;
    }

    @Override // java.util.zip.ZipEntry
    public boolean isDirectory() {
        return getName().endsWith("/");
    }

    /* renamed from: j */
    public byte[] m37488j() {
        return C0867d.m37565b(m37505a(true));
    }

    /* renamed from: k */
    public byte[] m37487k() {
        if (this.f1922n != null) {
            byte[] bArr = new byte[this.f1922n.length];
            System.arraycopy(this.f1922n, 0, bArr, 0, this.f1922n.length);
            return bArr;
        }
        return null;
    }

    /* renamed from: l */
    public C0870f m37486l() {
        return this.f1923o;
    }

    /* renamed from: m */
    public Date m37485m() {
        return new Date(getTime());
    }

    @Override // java.util.zip.ZipEntry
    public void setExtra(byte[] bArr) {
        try {
            m37502a(C0867d.m37567a(bArr, true, C0867d.C0868a.f1813f), true);
        } catch (ZipException e) {
            throw new RuntimeException("Error parsing extra fields for entry: " + getName() + " - " + e.getMessage(), e);
        }
    }

    @Override // java.util.zip.ZipEntry
    public void setMethod(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("ZIP compression method can not be negative: " + i);
        }
        this.f1914f = i;
    }

    @Override // java.util.zip.ZipEntry
    public void setSize(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("invalid entry size");
        }
        this.f1915g = j;
    }
}
