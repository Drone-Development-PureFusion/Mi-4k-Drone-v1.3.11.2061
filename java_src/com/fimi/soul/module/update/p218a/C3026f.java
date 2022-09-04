package com.fimi.soul.module.update.p218a;

import android.text.TextUtils;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.utils.C1681v;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.drone.p195d.p196a.p197a.C2163bz;
import com.fimi.soul.drone.p203g.C2274a;
import com.fimi.soul.drone.p203g.C2275b;
import com.fimi.soul.drone.p203g.C2276c;
import com.fimi.soul.drone.p204h.C2278b;
import com.fimi.soul.module.update.C3029b;
import com.fimi.soul.utils.C3129m;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.LinkedList;
import java.util.Queue;
/* renamed from: com.fimi.soul.module.update.a.f */
/* loaded from: classes.dex */
public class C3026f implements AbstractC3023c {

    /* renamed from: a */
    private int f11249a;

    /* renamed from: b */
    private Queue<C2163bz> f11250b;

    @Override // com.fimi.soul.module.update.p218a.AbstractC3023c
    /* renamed from: a */
    public int mo29545a() {
        return this.f11249a;
    }

    @Override // com.fimi.soul.module.update.p218a.AbstractC3023c
    /* renamed from: a */
    public long mo29544a(int i) {
        return new File(mo29539b(i)).length();
    }

    @Override // com.fimi.soul.module.update.p218a.AbstractC3023c
    /* renamed from: a */
    public void mo29543a(int i, int i2) {
        C3022b c3022b = (C3022b) C1642c.m34887c().mo34880a(C3029b.f11258C, C3022b.class);
        if (c3022b == null) {
            c3022b = new C3022b();
        }
        c3022b.m29588i().put(Integer.valueOf(i), Integer.valueOf(i2));
        switch (i) {
            case 0:
                c3022b.m29603a(i2);
                break;
            case 1:
                c3022b.m29601b(i2);
                break;
            case 3:
                c3022b.m29599c(i2);
                break;
            case 4:
                c3022b.m29597d(i2);
                c3022b.m29581l(i2);
                break;
            case 5:
                c3022b.m29585j(i2);
                break;
            case 6:
                c3022b.m29589h(i2);
                break;
            case 8:
                c3022b.m29577n(i2);
                break;
            case 9:
                c3022b.m29593f(i2);
                break;
            case 10:
                c3022b.m29591g(i2);
                break;
            case 11:
                c3022b.m29595e(i2);
                break;
            case 13:
                c3022b.m29583k(i2);
                c3022b.m29581l(i2);
                break;
            case 14:
                c3022b.m29587i(i2);
                break;
            case 15:
                c3022b.m29595e(i2);
                break;
            case 25:
                c3022b.m29587i(i2);
                break;
            case 26:
                c3022b.m29595e(i2);
                break;
            case 253:
                c3022b.m29579m(i2);
                break;
        }
        C1642c.m34887c().mo34879a(C3029b.f11258C, c3022b);
    }

    /* renamed from: a */
    public void m29542a(int i, byte[] bArr, byte[] bArr2) {
        for (int i2 = 0; i2 < 4; i2++) {
            bArr2[i + i2] = bArr[i2];
        }
    }

    @Override // com.fimi.soul.module.update.p218a.AbstractC3023c
    /* renamed from: a */
    public void mo29541a(C3025e c3025e) {
        if (c3025e == null) {
            return;
        }
        File file = new File(mo29538c(c3025e.m29557d()));
        if (!file.exists()) {
            file.mkdir();
        }
        int m29557d = c3025e.m29557d();
        c3025e.m29571a();
        long m29554e = c3025e.m29554e();
        long m29553f = c3025e.m29553f();
        long m29552g = c3025e.m29552g();
        long m29551h = c3025e.m29551h();
        FileInputStream fileInputStream = null;
        try {
            File file2 = new File(mo29538c(c3025e.m29557d()));
            if (file2.exists()) {
                fileInputStream = new FileInputStream(file2);
            }
            File file3 = new File(mo29539b(m29557d));
            if (!file3.exists()) {
                file3.createNewFile();
            }
            byte[] m32458a = C2278b.m32458a(m29554e);
            byte[] m32458a2 = C2278b.m32458a(m29553f);
            byte[] m32458a3 = C2278b.m32458a(m29552g);
            byte[] m32458a4 = C2278b.m32458a(m29551h);
            byte[] m32463a = C2276c.m32463a(fileInputStream);
            FileOutputStream fileOutputStream = new FileOutputStream(file3);
            m29542a(16, m32458a, m32463a);
            m29542a(20, m32458a2, m32463a);
            m29542a(24, m32458a3, m32463a);
            m29542a(28, m32458a4, m32463a);
            m29542a(48, C2278b.m32459a((int) C2278b.m32456a(C2274a.m32469a(m32463a), 12)), m32463a);
            int[] m32469a = C2274a.m32469a(m32463a);
            m29542a(m32463a.length - 4, C2278b.m32459a((int) C2278b.m32456a(m32469a, m32469a.length - 1)), m32463a);
            fileOutputStream.write(m32463a);
            fileOutputStream.flush();
            fileInputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.fimi.soul.module.update.p218a.AbstractC3023c
    /* renamed from: b */
    public String mo29539b(int i) {
        return String.format("%s", mo29538c(i) + ".crc");
    }

    @Override // com.fimi.soul.module.update.p218a.AbstractC3023c
    /* renamed from: b */
    public Queue<C2163bz> mo29540b() {
        return this.f11250b;
    }

    @Override // com.fimi.soul.module.update.p218a.AbstractC3023c
    /* renamed from: c */
    public String mo29538c(int i) {
        boolean z = false;
        boolean z2 = C1681v.m34543a(DroidPlannerApp.m34273g()).m34499r() == 1;
        if (C1772d.m34208a().m34189i() || z2) {
            z = true;
        }
        boolean m34188j = C1772d.m34208a().m34188j();
        String str = null;
        if (i == 0 && m34188j) {
            str = C3029b.f11259D;
        } else if (i == 3 && m34188j) {
            str = C3029b.f11262G;
        } else if (i == 1 && m34188j) {
            str = C3029b.f11260E;
        } else if (i == 2 && m34188j) {
            str = C3029b.f11261F;
        } else if (i == 10 && m34188j) {
            str = C3029b.f11263H;
        } else if (i == 9 && m34188j) {
            str = C3029b.f11265J;
        } else if (i == 6 && m34188j) {
            str = C3029b.f11264I;
        } else if (i == 11 && m34188j) {
            str = C3029b.f11267L;
        } else if (i == 4 && m34188j) {
            str = "firmware.zip";
        } else if (i == 0 && z) {
            str = C3029b.f11278W;
        } else if (i == 1 && z) {
            str = C3029b.f11279X;
        } else if (i == 3 && z) {
            str = C3029b.f11280Y;
        } else if (i == 13 && z) {
            str = C3029b.f11281Z;
        } else if (i == 10 && z) {
            str = C3029b.f11272Q;
        } else if (i == 9 && z) {
            str = C3029b.f11273R;
        } else if (i == 6 && z) {
            str = C3029b.f11274S;
        } else if (i == 253 && m34188j) {
            str = C3029b.f11276U;
        } else if (i == 5 && m34188j) {
            str = C3029b.f11275T;
        } else if (i == 5 && z) {
            str = C3029b.f11283aa;
        } else if (i == 8) {
            str = C3029b.f11257B;
        }
        return TextUtils.isEmpty(str) ? "" : C3129m.m29045v() + str;
    }

    @Override // com.fimi.soul.module.update.p218a.AbstractC3023c
    /* renamed from: d */
    public Queue<C2163bz> mo29537d(int i) {
        File file = new File(mo29539b(i));
        this.f11250b = new LinkedList();
        if (file.exists()) {
            try {
                C2275b.m32465a(i, new FileInputStream(file), file.length());
                this.f11250b = C2275b.m32466a();
                this.f11249a = this.f11250b.size();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return this.f11250b;
    }

    @Override // com.fimi.soul.module.update.p218a.AbstractC3023c
    /* renamed from: e */
    public void mo29536e(int i) {
    }
}
