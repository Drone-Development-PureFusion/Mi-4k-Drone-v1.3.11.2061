package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.qa */
/* loaded from: classes2.dex */
public final class C7612qa extends AbstractC7649rd {

    /* renamed from: s */
    private static volatile C7612qa[] f25244s;

    /* renamed from: a */
    public int f25245a;

    /* renamed from: b */
    public C7612qa[] f25246b;

    /* renamed from: c */
    public C7637qt f25247c;

    /* renamed from: d */
    public C7625qh f25248d;

    /* renamed from: e */
    public C7629ql f25249e;

    /* renamed from: f */
    public C7605pv f25250f;

    /* renamed from: g */
    public C7633qp f25251g;

    /* renamed from: h */
    public C7630qm f25252h;

    /* renamed from: i */
    public C7628qk f25253i;

    /* renamed from: j */
    public C7606pw f25254j;

    /* renamed from: k */
    public C7607px f25255k;

    /* renamed from: l */
    public C7626qi f25256l;

    /* renamed from: m */
    public C7634qq f25257m;

    /* renamed from: n */
    public C7638qu f25258n;

    /* renamed from: o */
    public C7615qd f25259o;

    /* renamed from: p */
    public C7616qe f25260p;

    /* renamed from: q */
    public C7627qj f25261q;

    /* renamed from: r */
    public C7631qn f25262r;

    public C7612qa() {
        m14069c();
    }

    /* renamed from: a */
    public static C7612qa m14071a(byte[] bArr) {
        return (C7612qa) AbstractC7649rd.m13856a(new C7612qa(), bArr);
    }

    /* renamed from: b */
    public static C7612qa[] m14070b() {
        if (f25244s == null) {
            synchronized (C7647rb.f25390c) {
                if (f25244s == null) {
                    f25244s = new C7612qa[0];
                }
            }
        }
        return f25244s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public int mo13820a() {
        int mo13820a = super.mo13820a();
        if (this.f25245a != 0) {
            mo13820a += C7640qw.m13937c(1, this.f25245a);
        }
        if (this.f25246b != null && this.f25246b.length > 0) {
            int i = mo13820a;
            for (int i2 = 0; i2 < this.f25246b.length; i2++) {
                C7612qa c7612qa = this.f25246b[i2];
                if (c7612qa != null) {
                    i += C7640qw.m13935c(2, c7612qa);
                }
            }
            mo13820a = i;
        }
        if (this.f25247c != null) {
            mo13820a += C7640qw.m13935c(3, this.f25247c);
        }
        if (this.f25248d != null) {
            mo13820a += C7640qw.m13935c(4, this.f25248d);
        }
        if (this.f25249e != null) {
            mo13820a += C7640qw.m13935c(5, this.f25249e);
        }
        if (this.f25250f != null) {
            mo13820a += C7640qw.m13935c(6, this.f25250f);
        }
        if (this.f25251g != null) {
            mo13820a += C7640qw.m13935c(7, this.f25251g);
        }
        if (this.f25252h != null) {
            mo13820a += C7640qw.m13935c(8, this.f25252h);
        }
        if (this.f25253i != null) {
            mo13820a += C7640qw.m13935c(9, this.f25253i);
        }
        if (this.f25254j != null) {
            mo13820a += C7640qw.m13935c(10, this.f25254j);
        }
        if (this.f25255k != null) {
            mo13820a += C7640qw.m13935c(11, this.f25255k);
        }
        if (this.f25256l != null) {
            mo13820a += C7640qw.m13935c(12, this.f25256l);
        }
        if (this.f25257m != null) {
            mo13820a += C7640qw.m13935c(13, this.f25257m);
        }
        if (this.f25258n != null) {
            mo13820a += C7640qw.m13935c(14, this.f25258n);
        }
        if (this.f25259o != null) {
            mo13820a += C7640qw.m13935c(15, this.f25259o);
        }
        if (this.f25260p != null) {
            mo13820a += C7640qw.m13935c(16, this.f25260p);
        }
        if (this.f25261q != null) {
            mo13820a += C7640qw.m13935c(17, this.f25261q);
        }
        return this.f25262r != null ? mo13820a + C7640qw.m13935c(18, this.f25262r) : mo13820a;
    }

    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public C7612qa mo13816b(C7639qv c7639qv) {
        while (true) {
            int m14015a = c7639qv.m14015a();
            switch (m14015a) {
                case 0:
                    break;
                case 8:
                    int m13997g = c7639qv.m13997g();
                    switch (m13997g) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                            this.f25245a = m13997g;
                            continue;
                    }
                case 18:
                    int m13839b = C7652rg.m13839b(c7639qv, 18);
                    int length = this.f25246b == null ? 0 : this.f25246b.length;
                    C7612qa[] c7612qaArr = new C7612qa[m13839b + length];
                    if (length != 0) {
                        System.arraycopy(this.f25246b, 0, c7612qaArr, 0, length);
                    }
                    while (length < c7612qaArr.length - 1) {
                        c7612qaArr[length] = new C7612qa();
                        c7639qv.m14011a(c7612qaArr[length]);
                        c7639qv.m14015a();
                        length++;
                    }
                    c7612qaArr[length] = new C7612qa();
                    c7639qv.m14011a(c7612qaArr[length]);
                    this.f25246b = c7612qaArr;
                    break;
                case 26:
                    if (this.f25247c == null) {
                        this.f25247c = new C7637qt();
                    }
                    c7639qv.m14011a(this.f25247c);
                    break;
                case 34:
                    if (this.f25248d == null) {
                        this.f25248d = new C7625qh();
                    }
                    c7639qv.m14011a(this.f25248d);
                    break;
                case 42:
                    if (this.f25249e == null) {
                        this.f25249e = new C7629ql();
                    }
                    c7639qv.m14011a(this.f25249e);
                    break;
                case 50:
                    if (this.f25250f == null) {
                        this.f25250f = new C7605pv();
                    }
                    c7639qv.m14011a(this.f25250f);
                    break;
                case 58:
                    if (this.f25251g == null) {
                        this.f25251g = new C7633qp();
                    }
                    c7639qv.m14011a(this.f25251g);
                    break;
                case 66:
                    if (this.f25252h == null) {
                        this.f25252h = new C7630qm();
                    }
                    c7639qv.m14011a(this.f25252h);
                    break;
                case 74:
                    if (this.f25253i == null) {
                        this.f25253i = new C7628qk();
                    }
                    c7639qv.m14011a(this.f25253i);
                    break;
                case 82:
                    if (this.f25254j == null) {
                        this.f25254j = new C7606pw();
                    }
                    c7639qv.m14011a(this.f25254j);
                    break;
                case 90:
                    if (this.f25255k == null) {
                        this.f25255k = new C7607px();
                    }
                    c7639qv.m14011a(this.f25255k);
                    break;
                case 98:
                    if (this.f25256l == null) {
                        this.f25256l = new C7626qi();
                    }
                    c7639qv.m14011a(this.f25256l);
                    break;
                case 106:
                    if (this.f25257m == null) {
                        this.f25257m = new C7634qq();
                    }
                    c7639qv.m14011a(this.f25257m);
                    break;
                case 114:
                    if (this.f25258n == null) {
                        this.f25258n = new C7638qu();
                    }
                    c7639qv.m14011a(this.f25258n);
                    break;
                case 122:
                    if (this.f25259o == null) {
                        this.f25259o = new C7615qd();
                    }
                    c7639qv.m14011a(this.f25259o);
                    break;
                case 130:
                    if (this.f25260p == null) {
                        this.f25260p = new C7616qe();
                    }
                    c7639qv.m14011a(this.f25260p);
                    break;
                case 138:
                    if (this.f25261q == null) {
                        this.f25261q = new C7627qj();
                    }
                    c7639qv.m14011a(this.f25261q);
                    break;
                case 146:
                    if (this.f25262r == null) {
                        this.f25262r = new C7631qn();
                    }
                    c7639qv.m14011a(this.f25262r);
                    break;
                default:
                    if (C7652rg.m13841a(c7639qv, m14015a)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public void mo13818a(C7640qw c7640qw) {
        if (this.f25245a != 0) {
            c7640qw.m13973a(1, this.f25245a);
        }
        if (this.f25246b != null && this.f25246b.length > 0) {
            for (int i = 0; i < this.f25246b.length; i++) {
                C7612qa c7612qa = this.f25246b[i];
                if (c7612qa != null) {
                    c7640qw.m13971a(2, c7612qa);
                }
            }
        }
        if (this.f25247c != null) {
            c7640qw.m13971a(3, this.f25247c);
        }
        if (this.f25248d != null) {
            c7640qw.m13971a(4, this.f25248d);
        }
        if (this.f25249e != null) {
            c7640qw.m13971a(5, this.f25249e);
        }
        if (this.f25250f != null) {
            c7640qw.m13971a(6, this.f25250f);
        }
        if (this.f25251g != null) {
            c7640qw.m13971a(7, this.f25251g);
        }
        if (this.f25252h != null) {
            c7640qw.m13971a(8, this.f25252h);
        }
        if (this.f25253i != null) {
            c7640qw.m13971a(9, this.f25253i);
        }
        if (this.f25254j != null) {
            c7640qw.m13971a(10, this.f25254j);
        }
        if (this.f25255k != null) {
            c7640qw.m13971a(11, this.f25255k);
        }
        if (this.f25256l != null) {
            c7640qw.m13971a(12, this.f25256l);
        }
        if (this.f25257m != null) {
            c7640qw.m13971a(13, this.f25257m);
        }
        if (this.f25258n != null) {
            c7640qw.m13971a(14, this.f25258n);
        }
        if (this.f25259o != null) {
            c7640qw.m13971a(15, this.f25259o);
        }
        if (this.f25260p != null) {
            c7640qw.m13971a(16, this.f25260p);
        }
        if (this.f25261q != null) {
            c7640qw.m13971a(17, this.f25261q);
        }
        if (this.f25262r != null) {
            c7640qw.m13971a(18, this.f25262r);
        }
        super.mo13818a(c7640qw);
    }

    /* renamed from: c */
    public C7612qa m14069c() {
        this.f25245a = 0;
        this.f25246b = m14070b();
        this.f25247c = null;
        this.f25248d = null;
        this.f25249e = null;
        this.f25250f = null;
        this.f25251g = null;
        this.f25252h = null;
        this.f25253i = null;
        this.f25254j = null;
        this.f25255k = null;
        this.f25256l = null;
        this.f25257m = null;
        this.f25258n = null;
        this.f25259o = null;
        this.f25260p = null;
        this.f25261q = null;
        this.f25262r = null;
        this.f25391ah = -1;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7612qa)) {
            return false;
        }
        C7612qa c7612qa = (C7612qa) obj;
        if (this.f25245a == c7612qa.f25245a && C7647rb.m13867a(this.f25246b, c7612qa.f25246b)) {
            if (this.f25247c == null) {
                if (c7612qa.f25247c != null) {
                    return false;
                }
            } else if (!this.f25247c.equals(c7612qa.f25247c)) {
                return false;
            }
            if (this.f25248d == null) {
                if (c7612qa.f25248d != null) {
                    return false;
                }
            } else if (!this.f25248d.equals(c7612qa.f25248d)) {
                return false;
            }
            if (this.f25249e == null) {
                if (c7612qa.f25249e != null) {
                    return false;
                }
            } else if (!this.f25249e.equals(c7612qa.f25249e)) {
                return false;
            }
            if (this.f25250f == null) {
                if (c7612qa.f25250f != null) {
                    return false;
                }
            } else if (!this.f25250f.equals(c7612qa.f25250f)) {
                return false;
            }
            if (this.f25251g == null) {
                if (c7612qa.f25251g != null) {
                    return false;
                }
            } else if (!this.f25251g.equals(c7612qa.f25251g)) {
                return false;
            }
            if (this.f25252h == null) {
                if (c7612qa.f25252h != null) {
                    return false;
                }
            } else if (!this.f25252h.equals(c7612qa.f25252h)) {
                return false;
            }
            if (this.f25253i == null) {
                if (c7612qa.f25253i != null) {
                    return false;
                }
            } else if (!this.f25253i.equals(c7612qa.f25253i)) {
                return false;
            }
            if (this.f25254j == null) {
                if (c7612qa.f25254j != null) {
                    return false;
                }
            } else if (!this.f25254j.equals(c7612qa.f25254j)) {
                return false;
            }
            if (this.f25255k == null) {
                if (c7612qa.f25255k != null) {
                    return false;
                }
            } else if (!this.f25255k.equals(c7612qa.f25255k)) {
                return false;
            }
            if (this.f25256l == null) {
                if (c7612qa.f25256l != null) {
                    return false;
                }
            } else if (!this.f25256l.equals(c7612qa.f25256l)) {
                return false;
            }
            if (this.f25257m == null) {
                if (c7612qa.f25257m != null) {
                    return false;
                }
            } else if (!this.f25257m.equals(c7612qa.f25257m)) {
                return false;
            }
            if (this.f25258n == null) {
                if (c7612qa.f25258n != null) {
                    return false;
                }
            } else if (!this.f25258n.equals(c7612qa.f25258n)) {
                return false;
            }
            if (this.f25259o == null) {
                if (c7612qa.f25259o != null) {
                    return false;
                }
            } else if (!this.f25259o.equals(c7612qa.f25259o)) {
                return false;
            }
            if (this.f25260p == null) {
                if (c7612qa.f25260p != null) {
                    return false;
                }
            } else if (!this.f25260p.equals(c7612qa.f25260p)) {
                return false;
            }
            if (this.f25261q == null) {
                if (c7612qa.f25261q != null) {
                    return false;
                }
            } else if (!this.f25261q.equals(c7612qa.f25261q)) {
                return false;
            }
            return this.f25262r == null ? c7612qa.f25262r == null : this.f25262r.equals(c7612qa.f25262r);
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.f25261q == null ? 0 : this.f25261q.hashCode()) + (((this.f25260p == null ? 0 : this.f25260p.hashCode()) + (((this.f25259o == null ? 0 : this.f25259o.hashCode()) + (((this.f25258n == null ? 0 : this.f25258n.hashCode()) + (((this.f25257m == null ? 0 : this.f25257m.hashCode()) + (((this.f25256l == null ? 0 : this.f25256l.hashCode()) + (((this.f25255k == null ? 0 : this.f25255k.hashCode()) + (((this.f25254j == null ? 0 : this.f25254j.hashCode()) + (((this.f25253i == null ? 0 : this.f25253i.hashCode()) + (((this.f25252h == null ? 0 : this.f25252h.hashCode()) + (((this.f25251g == null ? 0 : this.f25251g.hashCode()) + (((this.f25250f == null ? 0 : this.f25250f.hashCode()) + (((this.f25249e == null ? 0 : this.f25249e.hashCode()) + (((this.f25248d == null ? 0 : this.f25248d.hashCode()) + (((this.f25247c == null ? 0 : this.f25247c.hashCode()) + ((((((getClass().getName().hashCode() + 527) * 31) + this.f25245a) * 31) + C7647rb.m13868a(this.f25246b)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        if (this.f25262r != null) {
            i = this.f25262r.hashCode();
        }
        return hashCode + i;
    }
}
