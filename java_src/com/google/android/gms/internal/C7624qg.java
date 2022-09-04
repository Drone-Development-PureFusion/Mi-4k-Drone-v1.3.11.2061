package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.qg */
/* loaded from: classes2.dex */
public final class C7624qg extends AbstractC7642qx<C7624qg> {

    /* renamed from: a */
    public String f25306a;

    /* renamed from: b */
    public String f25307b;

    /* renamed from: c */
    public String f25308c;

    public C7624qg() {
        m14046b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public int mo13820a() {
        int mo13820a = super.mo13820a();
        if (!this.f25306a.equals("")) {
            mo13820a += C7640qw.m13948b(1, this.f25306a);
        }
        if (!this.f25307b.equals("")) {
            mo13820a += C7640qw.m13948b(2, this.f25307b);
        }
        return !this.f25308c.equals("") ? mo13820a + C7640qw.m13948b(3, this.f25308c) : mo13820a;
    }

    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public C7624qg mo13816b(C7639qv c7639qv) {
        while (true) {
            int m14015a = c7639qv.m14015a();
            switch (m14015a) {
                case 0:
                    break;
                case 10:
                    this.f25306a = c7639qv.m13993j();
                    break;
                case 18:
                    this.f25307b = c7639qv.m13993j();
                    break;
                case 26:
                    this.f25308c = c7639qv.m13993j();
                    break;
                default:
                    if (super.m13906a(c7639qv, m14015a)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public void mo13818a(C7640qw c7640qw) {
        if (!this.f25306a.equals("")) {
            c7640qw.m13970a(1, this.f25306a);
        }
        if (!this.f25307b.equals("")) {
            c7640qw.m13970a(2, this.f25307b);
        }
        if (!this.f25308c.equals("")) {
            c7640qw.m13970a(3, this.f25308c);
        }
        super.mo13818a(c7640qw);
    }

    /* renamed from: b */
    public C7624qg m14046b() {
        this.f25306a = "";
        this.f25307b = "";
        this.f25308c = "";
        this.f25374ag = null;
        this.f25391ah = -1;
        return this;
    }
}
