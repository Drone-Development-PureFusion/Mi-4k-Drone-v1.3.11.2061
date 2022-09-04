package p005b.p006a.p007a.p029b.p056p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import p005b.p006a.p007a.p029b.AbstractC0427f;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: b.a.a.b.p.l */
/* loaded from: classes.dex */
public class C0687l {

    /* renamed from: a */
    AbstractC0686k f1227a;

    public C0687l(AbstractC0427f abstractC0427f) {
        this.f1227a = abstractC0427f.mo39315n();
    }

    public C0687l(AbstractC0686k abstractC0686k) {
        this.f1227a = abstractC0686k;
    }

    /* renamed from: a */
    public static List<AbstractC0682g> m38489a(List<AbstractC0682g> list, long j) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC0682g abstractC0682g : list) {
            if (abstractC0682g.mo38512f().longValue() >= j) {
                arrayList.add(abstractC0682g);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m38495a(AbstractC0427f abstractC0427f) {
        List<AbstractC0684i> mo38500e;
        AbstractC0686k mo39315n = abstractC0427f.mo39315n();
        return (mo39315n == null || (mo38500e = mo39315n.mo38500e()) == null || mo38500e.size() == 0) ? false : true;
    }

    /* renamed from: a */
    public long m38499a() {
        List<AbstractC0682g> mo38507a = this.f1227a.mo38507a();
        if (mo38507a == null) {
            return -1L;
        }
        for (int size = mo38507a.size() - 1; size >= 0; size--) {
            AbstractC0682g abstractC0682g = mo38507a.get(size);
            if (C0494h.f710ad.equals(abstractC0682g.mo38514d())) {
                return abstractC0682g.mo38512f().longValue();
            }
        }
        return -1L;
    }

    /* renamed from: a */
    public void m38494a(AbstractC0682g abstractC0682g) {
        if (this.f1227a != null) {
            this.f1227a.mo38506a(abstractC0682g);
        }
    }

    /* renamed from: a */
    public void m38492a(Object obj, String str) {
        m38494a(new C0677b(str, obj));
    }

    /* renamed from: a */
    public void m38491a(Object obj, String str, Throwable th) {
        m38494a(new C0676a(str, obj, th));
    }

    /* renamed from: a */
    public boolean m38498a(int i, String str) {
        return m38496a(0L, i, str);
    }

    /* renamed from: a */
    public boolean m38497a(long j) {
        return m38496a(j, 2, C0494h.f693N);
    }

    /* renamed from: a */
    public boolean m38496a(long j, int i, String str) {
        List<AbstractC0682g> m38489a = m38489a(this.f1227a.mo38507a(), j);
        Pattern compile = Pattern.compile(str);
        for (AbstractC0682g abstractC0682g : m38489a) {
            if (i == abstractC0682g.mo38519a() && compile.matcher(abstractC0682g.mo38514d()).lookingAt()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m38493a(Class<?> cls) {
        for (AbstractC0682g abstractC0682g : this.f1227a.mo38507a()) {
            Throwable mo38513e = abstractC0682g.mo38513e();
            if (mo38513e != null && mo38513e.getClass().getName().equals(cls.getName())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m38490a(String str) {
        Pattern compile = Pattern.compile(str);
        for (AbstractC0682g abstractC0682g : this.f1227a.mo38507a()) {
            if (compile.matcher(abstractC0682g.mo38514d()).lookingAt()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public int m38486b(String str) {
        int i = 0;
        Pattern compile = Pattern.compile(str);
        Iterator<AbstractC0682g> it2 = this.f1227a.mo38507a().iterator();
        while (true) {
            int i2 = i;
            if (it2.hasNext()) {
                i = compile.matcher(it2.next().mo38514d()).lookingAt() ? i2 + 1 : i2;
            } else {
                return i2;
            }
        }
    }

    /* renamed from: b */
    public void m38487b(Object obj, String str) {
        m38494a(new C0688m(str, obj));
    }

    /* renamed from: b */
    public boolean m38488b(long j) {
        return !m38497a(j);
    }

    /* renamed from: c */
    public int m38485c(long j) {
        int i = 0;
        Iterator<AbstractC0682g> it2 = m38489a(this.f1227a.mo38507a(), j).iterator();
        while (true) {
            int i2 = i;
            if (it2.hasNext()) {
                AbstractC0682g next = it2.next();
                i = next.mo38519a() > i2 ? next.mo38519a() : i2;
            } else {
                return i2;
            }
        }
    }

    /* renamed from: d */
    public boolean m38484d(long j) {
        return 2 > m38485c(j);
    }
}
