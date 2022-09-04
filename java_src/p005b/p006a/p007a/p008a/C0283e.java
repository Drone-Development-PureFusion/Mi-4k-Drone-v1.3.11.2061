package p005b.p006a.p007a.p008a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.p356d.AbstractC11747c;
import org.p356d.AbstractC11759f;
import org.p356d.C11751d;
import org.p356d.p360d.AbstractC11752a;
import p005b.p006a.p007a.p008a.p026n.AbstractC0366d;
import p005b.p006a.p007a.p008a.p026n.C0374l;
import p005b.p006a.p007a.p008a.p028p.C0399g;
import p005b.p006a.p007a.p029b.AbstractC0401a;
import p005b.p006a.p007a.p029b.C0494h;
import p005b.p006a.p007a.p029b.p055o.AbstractC0658b;
import p005b.p006a.p007a.p029b.p055o.C0659c;
import p005b.p006a.p007a.p029b.p055o.EnumC0668l;
/* renamed from: b.a.a.a.e */
/* loaded from: classes.dex */
public final class C0283e implements AbstractC0658b<AbstractC0366d>, Serializable, AbstractC11747c, AbstractC11752a {

    /* renamed from: a */
    public static final String f219a = C0283e.class.getName();

    /* renamed from: p */
    private static final int f220p = 5;
    private static final long serialVersionUID = 5454405123156820674L;

    /* renamed from: b */
    final transient C0286f f221b;

    /* renamed from: i */
    private String f222i;

    /* renamed from: j */
    private transient C0281d f223j;

    /* renamed from: k */
    private transient int f224k;

    /* renamed from: l */
    private transient C0283e f225l;

    /* renamed from: m */
    private transient List<C0283e> f226m;

    /* renamed from: n */
    private transient C0659c<AbstractC0366d> f227n;

    /* renamed from: o */
    private transient boolean f228o = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0283e(String str, C0283e c0283e, C0286f c0286f) {
        this.f222i = str;
        this.f225l = c0283e;
        this.f221b = c0286f;
    }

    /* renamed from: a */
    private synchronized void m39793a(int i) {
        if (this.f223j == null) {
            this.f224k = i;
            if (this.f226m != null) {
                int size = this.f226m.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.f226m.get(i2).m39793a(i);
                }
            }
        }
    }

    /* renamed from: a */
    private void m39789a(String str, AbstractC11759f abstractC11759f, C0281d c0281d, String str2, Object obj, Object obj2, Throwable th) {
        EnumC0668l m39758a = this.f221b.m39758a(abstractC11759f, this, c0281d, str2, obj, obj2, th);
        if (m39758a == EnumC0668l.NEUTRAL) {
            if (this.f224k > c0281d.f217v) {
                return;
            }
        } else if (m39758a == EnumC0668l.DENY) {
            return;
        }
        m39781b(str, abstractC11759f, c0281d, str2, new Object[]{obj, obj2}, th);
    }

    /* renamed from: a */
    private void m39788a(String str, AbstractC11759f abstractC11759f, C0281d c0281d, String str2, Object obj, Throwable th) {
        EnumC0668l m39757a = this.f221b.m39757a(abstractC11759f, this, c0281d, str2, obj, th);
        if (m39757a == EnumC0668l.NEUTRAL) {
            if (this.f224k > c0281d.f217v) {
                return;
            }
        } else if (m39757a == EnumC0668l.DENY) {
            return;
        }
        m39781b(str, abstractC11759f, c0281d, str2, new Object[]{obj}, th);
    }

    /* renamed from: a */
    private void m39787a(String str, AbstractC11759f abstractC11759f, C0281d c0281d, String str2, Object[] objArr, Throwable th) {
        EnumC0668l m39756a = this.f221b.m39756a(abstractC11759f, this, c0281d, str2, objArr, th);
        if (m39756a == EnumC0668l.NEUTRAL) {
            if (this.f224k > c0281d.f217v) {
                return;
            }
        } else if (m39756a == EnumC0668l.DENY) {
            return;
        }
        m39781b(str, abstractC11759f, c0281d, str2, objArr, th);
    }

    /* renamed from: b */
    private int m39782b(AbstractC0366d abstractC0366d) {
        if (this.f227n != null) {
            return this.f227n.m38568a((C0659c<AbstractC0366d>) abstractC0366d);
        }
        return 0;
    }

    /* renamed from: b */
    private EnumC0668l m39780b(AbstractC11759f abstractC11759f, C0281d c0281d) {
        return this.f221b.m39756a(abstractC11759f, this, c0281d, (String) null, (Object[]) null, (Throwable) null);
    }

    /* renamed from: b */
    private void m39781b(String str, AbstractC11759f abstractC11759f, C0281d c0281d, String str2, Object[] objArr, Throwable th) {
        C0374l c0374l = new C0374l(str, this, c0281d, str2, th, objArr);
        c0374l.m39547a(abstractC11759f);
        m39791a(c0374l);
    }

    /* renamed from: o */
    private boolean m39773o() {
        return this.f225l == null;
    }

    /* renamed from: p */
    private void m39772p() {
        this.f224k = 10000;
        if (m39773o()) {
            this.f223j = C0281d.f214s;
        } else {
            this.f223j = null;
        }
    }

    /* renamed from: a */
    public C0281d m39794a() {
        return C0281d.m39803a(this.f224k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C0283e m39790a(String str) {
        if (this.f226m == null) {
            return null;
        }
        int size = this.f226m.size();
        for (int i = 0; i < size; i++) {
            C0283e c0283e = this.f226m.get(i);
            if (str.equals(c0283e.mo88d())) {
                return c0283e;
            }
        }
        return null;
    }

    /* renamed from: a */
    public synchronized void m39792a(C0281d c0281d) {
        if (this.f223j != c0281d) {
            if (c0281d == null && m39773o()) {
                throw new IllegalArgumentException("The level of the root logger cannot be set to null");
            }
            this.f223j = c0281d;
            if (c0281d == null) {
                this.f224k = this.f225l.f224k;
                c0281d = this.f225l.m39794a();
            } else {
                this.f224k = c0281d.f217v;
            }
            if (this.f226m != null) {
                int size = this.f226m.size();
                for (int i = 0; i < size; i++) {
                    this.f226m.get(i).m39793a(this.f224k);
                }
            }
            this.f221b.m39762a(this, c0281d);
        }
    }

    /* renamed from: a */
    public void m39791a(AbstractC0366d abstractC0366d) {
        int i = 0;
        for (C0283e c0283e = this; c0283e != null; c0283e = c0283e.f225l) {
            i += c0283e.m39782b(abstractC0366d);
            if (!c0283e.f228o) {
                break;
            }
        }
        if (i == 0) {
            this.f221b.m39763a(this);
        }
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0658b
    /* renamed from: a */
    public synchronized void mo38569a(AbstractC0401a<AbstractC0366d> abstractC0401a) {
        if (this.f227n == null) {
            this.f227n = new C0659c<>();
        }
        this.f227n.mo38569a(abstractC0401a);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: a */
    public void mo118a(String str, Object obj) {
        m39788a(f219a, (AbstractC11759f) null, C0281d.f215t, str, obj, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: a */
    public void mo117a(String str, Object obj, Object obj2) {
        m39789a(f219a, null, C0281d.f215t, str, obj, obj2, null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: a */
    public void mo116a(String str, Throwable th) {
        m39787a(f219a, (AbstractC11759f) null, C0281d.f215t, str, (Object[]) null, th);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: a */
    public void mo115a(String str, Object[] objArr) {
        m39787a(f219a, (AbstractC11759f) null, C0281d.f215t, str, objArr, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: a */
    public void mo113a(AbstractC11759f abstractC11759f, String str) {
        m39787a(f219a, abstractC11759f, C0281d.f215t, str, (Object[]) null, (Throwable) null);
    }

    @Override // org.p356d.p360d.AbstractC11752a
    /* renamed from: a */
    public void mo31a(AbstractC11759f abstractC11759f, String str, int i, String str2, Object[] objArr, Throwable th) {
        m39787a(str, abstractC11759f, C0281d.m39797b(i), str2, objArr, th);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: a */
    public void mo112a(AbstractC11759f abstractC11759f, String str, Object obj) {
        m39788a(f219a, abstractC11759f, C0281d.f215t, str, obj, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: a */
    public void mo111a(AbstractC11759f abstractC11759f, String str, Object obj, Object obj2) {
        m39789a(f219a, abstractC11759f, C0281d.f215t, str, obj, obj2, null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: a */
    public void mo110a(AbstractC11759f abstractC11759f, String str, Throwable th) {
        m39787a(f219a, abstractC11759f, C0281d.f215t, str, (Object[]) null, th);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: a */
    public void mo109a(AbstractC11759f abstractC11759f, String str, Object[] objArr) {
        m39787a(f219a, abstractC11759f, C0281d.f215t, str, objArr, (Throwable) null);
    }

    /* renamed from: a */
    public void m39785a(boolean z) {
        this.f228o = z;
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: a */
    public boolean mo114a(AbstractC11759f abstractC11759f) {
        EnumC0668l m39780b = m39780b(abstractC11759f, C0281d.f214s);
        if (m39780b == EnumC0668l.NEUTRAL) {
            return this.f224k <= 10000;
        } else if (m39780b == EnumC0668l.DENY) {
            return false;
        } else {
            if (m39780b == EnumC0668l.ACCEPT) {
                return true;
            }
            throw new IllegalStateException("Unknown FilterReply value: " + m39780b);
        }
    }

    /* renamed from: a */
    public boolean m39786a(AbstractC11759f abstractC11759f, C0281d c0281d) {
        EnumC0668l m39780b = m39780b(abstractC11759f, c0281d);
        if (m39780b == EnumC0668l.NEUTRAL) {
            return this.f224k <= c0281d.f217v;
        } else if (m39780b == EnumC0668l.DENY) {
            return false;
        } else {
            if (m39780b == EnumC0668l.ACCEPT) {
                return true;
            }
            throw new IllegalStateException("Unknown FilterReply value: " + m39780b);
        }
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0658b
    /* renamed from: a_ */
    public AbstractC0401a<AbstractC0366d> mo38567a_(String str) {
        if (this.f227n == null) {
            return null;
        }
        return this.f227n.mo38567a_(str);
    }

    /* renamed from: b */
    int m39784b() {
        return this.f224k;
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: b */
    public void mo108b(String str, Object obj) {
        m39788a(f219a, (AbstractC11759f) null, C0281d.f214s, str, obj, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: b */
    public void mo107b(String str, Object obj, Object obj2) {
        m39789a(f219a, null, C0281d.f214s, str, obj, obj2, null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: b */
    public void mo106b(String str, Throwable th) {
        m39787a(f219a, (AbstractC11759f) null, C0281d.f214s, str, (Object[]) null, th);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: b */
    public void mo105b(String str, Object[] objArr) {
        m39787a(f219a, (AbstractC11759f) null, C0281d.f214s, str, objArr, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: b */
    public void mo103b(AbstractC11759f abstractC11759f, String str) {
        m39787a(f219a, abstractC11759f, C0281d.f214s, str, (Object[]) null, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: b */
    public void mo102b(AbstractC11759f abstractC11759f, String str, Object obj) {
        m39788a(f219a, abstractC11759f, C0281d.f214s, str, obj, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: b */
    public void mo101b(AbstractC11759f abstractC11759f, String str, Object obj, Object obj2) {
        m39789a(f219a, abstractC11759f, C0281d.f214s, str, obj, obj2, null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: b */
    public void mo100b(AbstractC11759f abstractC11759f, String str, Throwable th) {
        m39787a(f219a, abstractC11759f, C0281d.f214s, str, (Object[]) null, th);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: b */
    public void mo99b(AbstractC11759f abstractC11759f, String str, Object[] objArr) {
        m39787a(f219a, abstractC11759f, C0281d.f214s, str, objArr, (Throwable) null);
    }

    /* renamed from: b */
    public boolean m39783b(C0281d c0281d) {
        return m39786a((AbstractC11759f) null, c0281d);
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0658b
    /* renamed from: b */
    public boolean mo38566b(AbstractC0401a<AbstractC0366d> abstractC0401a) {
        if (this.f227n == null) {
            return false;
        }
        return this.f227n.mo38566b(abstractC0401a);
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0658b
    /* renamed from: b */
    public boolean mo38565b(String str) {
        if (this.f227n == null) {
            return false;
        }
        return this.f227n.mo38565b(str);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: b */
    public boolean mo104b(AbstractC11759f abstractC11759f) {
        EnumC0668l m39780b = m39780b(abstractC11759f, C0281d.f213r);
        if (m39780b == EnumC0668l.NEUTRAL) {
            return this.f224k <= 20000;
        } else if (m39780b == EnumC0668l.DENY) {
            return false;
        } else {
            if (m39780b == EnumC0668l.ACCEPT) {
                return true;
            }
            throw new IllegalStateException("Unknown FilterReply value: " + m39780b);
        }
    }

    /* renamed from: c */
    public C0281d m39779c() {
        return this.f223j;
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: c */
    public void mo98c(String str, Object obj) {
        m39788a(f219a, (AbstractC11759f) null, C0281d.f211p, str, obj, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: c */
    public void mo97c(String str, Object obj, Object obj2) {
        m39789a(f219a, null, C0281d.f211p, str, obj, obj2, null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: c */
    public void mo96c(String str, Throwable th) {
        m39787a(f219a, (AbstractC11759f) null, C0281d.f211p, str, (Object[]) null, th);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: c */
    public void mo95c(String str, Object[] objArr) {
        m39787a(f219a, (AbstractC11759f) null, C0281d.f211p, str, objArr, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: c */
    public void mo93c(AbstractC11759f abstractC11759f, String str) {
        m39787a(f219a, abstractC11759f, C0281d.f211p, str, (Object[]) null, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: c */
    public void mo92c(AbstractC11759f abstractC11759f, String str, Object obj) {
        m39788a(f219a, abstractC11759f, C0281d.f211p, str, obj, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: c */
    public void mo91c(AbstractC11759f abstractC11759f, String str, Object obj, Object obj2) {
        m39789a(f219a, abstractC11759f, C0281d.f211p, str, obj, obj2, null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: c */
    public void mo90c(AbstractC11759f abstractC11759f, String str, Throwable th) {
        m39787a(f219a, abstractC11759f, C0281d.f211p, str, (Object[]) null, th);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: c */
    public void mo89c(AbstractC11759f abstractC11759f, String str, Object[] objArr) {
        m39787a(f219a, abstractC11759f, C0281d.f211p, str, objArr, (Throwable) null);
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0658b
    /* renamed from: c */
    public boolean mo38564c(AbstractC0401a<AbstractC0366d> abstractC0401a) {
        if (this.f227n == null) {
            return false;
        }
        return this.f227n.mo38564c(abstractC0401a);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: c */
    public boolean mo94c(AbstractC11759f abstractC11759f) {
        EnumC0668l m39780b = m39780b(abstractC11759f, C0281d.f215t);
        if (m39780b == EnumC0668l.NEUTRAL) {
            return this.f224k <= 5000;
        } else if (m39780b == EnumC0668l.DENY) {
            return false;
        } else {
            if (m39780b == EnumC0668l.ACCEPT) {
                return true;
            }
            throw new IllegalStateException("Unknown FilterReply value: " + m39780b);
        }
    }

    /* renamed from: d */
    C0283e m39778d(String str) {
        if (C0399g.m39423a(str) != -1) {
            throw new IllegalArgumentException("Child name [" + str + " passed as parameter, may not include [" + C0494h.f686G + "]");
        }
        if (this.f226m == null) {
            this.f226m = new ArrayList();
        }
        C0283e c0283e = m39773o() ? new C0283e(str, this, this.f221b) : new C0283e(this.f222i + C0494h.f686G + str, this, this.f221b);
        this.f226m.add(c0283e);
        c0283e.f224k = this.f224k;
        return c0283e;
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: d */
    public String mo88d() {
        return this.f222i;
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: d */
    public void mo87d(String str, Object obj) {
        m39788a(f219a, (AbstractC11759f) null, C0281d.f213r, str, obj, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: d */
    public void mo86d(String str, Object obj, Object obj2) {
        m39789a(f219a, null, C0281d.f213r, str, obj, obj2, null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: d */
    public void mo85d(String str, Throwable th) {
        m39787a(f219a, (AbstractC11759f) null, C0281d.f213r, str, (Object[]) null, th);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: d */
    public void mo84d(String str, Object[] objArr) {
        m39787a(f219a, (AbstractC11759f) null, C0281d.f213r, str, objArr, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: d */
    public void mo82d(AbstractC11759f abstractC11759f, String str) {
        m39787a(f219a, abstractC11759f, C0281d.f213r, str, (Object[]) null, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: d */
    public void mo81d(AbstractC11759f abstractC11759f, String str, Object obj) {
        m39788a(f219a, abstractC11759f, C0281d.f213r, str, obj, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: d */
    public void mo80d(AbstractC11759f abstractC11759f, String str, Object obj, Object obj2) {
        m39789a(f219a, abstractC11759f, C0281d.f213r, str, obj, obj2, null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: d */
    public void mo79d(AbstractC11759f abstractC11759f, String str, Throwable th) {
        m39787a(f219a, abstractC11759f, C0281d.f213r, str, (Object[]) null, th);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: d */
    public void mo78d(AbstractC11759f abstractC11759f, String str, Object[] objArr) {
        m39787a(f219a, abstractC11759f, C0281d.f213r, str, objArr, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: d */
    public boolean mo83d(AbstractC11759f abstractC11759f) {
        EnumC0668l m39780b = m39780b(abstractC11759f, C0281d.f211p);
        if (m39780b == EnumC0668l.NEUTRAL) {
            return this.f224k <= 40000;
        } else if (m39780b == EnumC0668l.DENY) {
            return false;
        } else {
            if (m39780b == EnumC0668l.ACCEPT) {
                return true;
            }
            throw new IllegalStateException("Unknown FilterReply value: " + m39780b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C0283e m39777e(String str) {
        if (C0399g.m39422a(str, this.f222i.length() + 1) != -1) {
            throw new IllegalArgumentException("For logger [" + this.f222i + "] child name [" + str + " passed as parameter, may not include '.' after index" + (this.f222i.length() + 1));
        }
        if (this.f226m == null) {
            this.f226m = new ArrayList(5);
        }
        C0283e c0283e = new C0283e(str, this, this.f221b);
        this.f226m.add(c0283e);
        c0283e.f224k = this.f224k;
        return c0283e;
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0658b
    /* renamed from: e */
    public void mo38563e() {
        if (this.f227n != null) {
            this.f227n.mo38563e();
        }
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: e */
    public void mo77e(String str, Object obj) {
        m39788a(f219a, (AbstractC11759f) null, C0281d.f212q, str, obj, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: e */
    public void mo76e(String str, Object obj, Object obj2) {
        m39789a(f219a, null, C0281d.f212q, str, obj, obj2, null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: e */
    public void mo75e(String str, Throwable th) {
        m39787a(f219a, (AbstractC11759f) null, C0281d.f212q, str, (Object[]) null, th);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: e */
    public void mo74e(String str, Object[] objArr) {
        m39787a(f219a, (AbstractC11759f) null, C0281d.f212q, str, objArr, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: e */
    public void mo72e(AbstractC11759f abstractC11759f, String str) {
        m39787a(f219a, abstractC11759f, C0281d.f212q, str, (Object[]) null, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: e */
    public void mo71e(AbstractC11759f abstractC11759f, String str, Object obj) {
        m39788a(f219a, abstractC11759f, C0281d.f212q, str, obj, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: e */
    public void mo70e(AbstractC11759f abstractC11759f, String str, Object obj, Object obj2) {
        m39789a(f219a, abstractC11759f, C0281d.f212q, str, obj, obj2, null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: e */
    public void mo69e(AbstractC11759f abstractC11759f, String str, Throwable th) {
        m39787a(f219a, abstractC11759f, C0281d.f212q, str, (Object[]) null, th);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: e */
    public void mo68e(AbstractC11759f abstractC11759f, String str, Object[] objArr) {
        m39787a(f219a, abstractC11759f, C0281d.f212q, str, objArr, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: e */
    public boolean mo73e(AbstractC11759f abstractC11759f) {
        EnumC0668l m39780b = m39780b(abstractC11759f, C0281d.f212q);
        if (m39780b == EnumC0668l.NEUTRAL) {
            return this.f224k <= 30000;
        } else if (m39780b == EnumC0668l.DENY) {
            return false;
        } else {
            if (m39780b == EnumC0668l.ACCEPT) {
                return true;
            }
            throw new IllegalStateException("Unknown FilterReply value: " + m39780b);
        }
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0658b
    /* renamed from: f */
    public Iterator<AbstractC0401a<AbstractC0366d>> mo38562f() {
        return this.f227n == null ? Collections.EMPTY_LIST.iterator() : this.f227n.mo38562f();
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: f */
    public void mo67f(String str) {
        m39787a(f219a, (AbstractC11759f) null, C0281d.f215t, str, (Object[]) null, (Throwable) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m39776g() {
        mo38563e();
        m39772p();
        this.f228o = true;
        if (this.f226m == null) {
            return;
        }
        for (C0283e c0283e : this.f226m) {
            c0283e.m39776g();
        }
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: g */
    public void mo66g(String str) {
        m39787a(f219a, (AbstractC11759f) null, C0281d.f214s, str, (Object[]) null, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: h */
    public void mo64h(String str) {
        m39787a(f219a, (AbstractC11759f) null, C0281d.f211p, str, (Object[]) null, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: h */
    public boolean mo65h() {
        return mo114a((AbstractC11759f) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: i */
    public void mo62i(String str) {
        m39787a(f219a, (AbstractC11759f) null, C0281d.f213r, str, (Object[]) null, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: i */
    public boolean mo63i() {
        return mo104b((AbstractC11759f) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: j */
    public void mo60j(String str) {
        m39787a(f219a, (AbstractC11759f) null, C0281d.f212q, str, (Object[]) null, (Throwable) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: j */
    public boolean mo61j() {
        return mo94c((AbstractC11759f) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: k */
    public boolean mo59k() {
        return mo83d((AbstractC11759f) null);
    }

    @Override // org.p356d.AbstractC11747c
    /* renamed from: l */
    public boolean mo58l() {
        return mo73e((AbstractC11759f) null);
    }

    /* renamed from: m */
    public boolean m39775m() {
        return this.f228o;
    }

    /* renamed from: n */
    public C0286f m39774n() {
        return this.f221b;
    }

    protected Object readResolve() {
        return C11751d.m48a(mo88d());
    }

    public String toString() {
        return "Logger[" + this.f222i + "]";
    }
}
