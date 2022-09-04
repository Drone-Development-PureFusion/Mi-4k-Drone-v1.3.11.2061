package com.fimi.p154g;

import com.fimi.p140a.p141a.C1489a;
import com.fimi.p140a.p146f.C1515a;
import com.fimi.p140a.p146f.C1516b;
import com.fimi.p140a.p146f.C1517c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.fimi.g.b */
/* loaded from: classes.dex */
public class C1554b {

    /* renamed from: a */
    public static final int f3799a = 176;

    /* renamed from: b */
    byte[] f3800b;

    /* renamed from: c */
    byte[] f3801c;

    /* renamed from: d */
    byte[] f3802d;

    /* renamed from: e */
    private List<C1489a> f3803e = new ArrayList();

    /* renamed from: f */
    private long f3804f;

    /* renamed from: g */
    private long f3805g;

    /* renamed from: h */
    private int f3806h;

    /* renamed from: a */
    public int m35197a() {
        return this.f3806h;
    }

    /* renamed from: a */
    public int m35192a(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] m35193a = m35193a(str);
        if (m35193a == null) {
            return -1;
        }
        this.f3800b = bArr;
        this.f3801c = bArr2;
        this.f3802d = bArr3;
        m35191a(m35193a);
        m35189b(m35193a);
        m35185f();
        return 1;
    }

    /* renamed from: a */
    public void m35196a(int i) {
        this.f3805g += i;
    }

    /* renamed from: a */
    public void m35195a(int i, byte[] bArr, byte[] bArr2) {
        for (int i2 = 0; i2 < 4; i2++) {
            bArr2[i + i2] = bArr[i2];
        }
    }

    /* renamed from: a */
    public void m35194a(long j) {
        this.f3804f = j;
    }

    /* renamed from: a */
    public void m35191a(byte[] bArr) {
        m35195a(16, this.f3800b, bArr);
        m35195a(20, this.f3801c, bArr);
        m35195a(24, this.f3802d, bArr);
        m35195a(48, C1517c.m35394a((int) C1517c.m35391a(C1515a.m35428a(bArr), 12)), bArr);
        int[] m35428a = C1515a.m35428a(bArr);
        m35195a(bArr.length - 4, C1517c.m35394a((int) C1517c.m35391a(m35428a, m35428a.length - 1)), bArr);
    }

    /* renamed from: a */
    public byte[] m35193a(String str) {
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        int length = (int) file.length();
        m35194a(file.length());
        byte[] bArr = new byte[length];
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.read(bArr);
            fileInputStream.close();
            return bArr;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return bArr;
        } catch (IOException e2) {
            e2.printStackTrace();
            return bArr;
        }
    }

    /* renamed from: b */
    public void m35190b() {
        m35196a(this.f3803e.get(this.f3806h).f3557c);
        this.f3806h++;
    }

    /* renamed from: b */
    public void m35189b(byte[] bArr) {
        int length = bArr.length % 176;
        int length2 = bArr.length / 176;
        if (length != 0) {
            length2++;
        }
        for (int i = 0; i < length2; i++) {
            C1489a c1489a = new C1489a();
            if (i != length2 - 1 || length == 0) {
                byte[] bArr2 = new byte[176];
                System.arraycopy(bArr, i * 176, bArr2, 0, 176);
                c1489a.f3555a = bArr2;
                c1489a.f3556b = bArr2.length;
                c1489a.f3557c = bArr2.length;
                this.f3803e.add(c1489a);
            } else {
                byte[] bArr3 = new byte[176];
                System.arraycopy(bArr, i * 176, bArr3, 0, length);
                c1489a.f3555a = bArr3;
                c1489a.f3556b = bArr3.length;
                c1489a.f3557c = length;
                this.f3803e.add(c1489a);
                System.out.println("-----------");
            }
            C1516b.m35418a(c1489a.f3555a);
        }
    }

    /* renamed from: c */
    public boolean m35188c() {
        return this.f3806h == this.f3803e.size();
    }

    /* renamed from: d */
    public long m35187d() {
        return this.f3804f;
    }

    /* renamed from: e */
    public long m35186e() {
        return this.f3805g;
    }

    /* renamed from: f */
    public void m35185f() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f3803e.size()) {
                C1489a c1489a = this.f3803e.get(i2);
                System.out.println(C1516b.m35418a(c1489a.f3555a) + " UpgradeFileData--> " + c1489a.f3556b);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public C1489a m35184g() {
        return this.f3803e.get(this.f3806h);
    }

    /* renamed from: h */
    public List<C1489a> m35183h() {
        return this.f3803e;
    }
}
