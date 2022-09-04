package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.fr */
/* loaded from: classes2.dex */
public final class C6982fr extends AbstractC7642qx<C6982fr> {

    /* renamed from: a */
    public String[] f23666a;

    /* renamed from: b */
    public int[] f23667b;

    /* renamed from: c */
    public byte[][] f23668c;

    public C6982fr() {
        m15838b();
    }

    /* renamed from: a */
    public static C6982fr m15839a(byte[] bArr) {
        return (C6982fr) AbstractC7649rd.m13856a(new C6982fr(), bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public int mo13820a() {
        int i;
        int mo13820a = super.mo13820a();
        if (this.f23666a == null || this.f23666a.length <= 0) {
            i = mo13820a;
        } else {
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < this.f23666a.length; i4++) {
                String str = this.f23666a[i4];
                if (str != null) {
                    i3++;
                    i2 += C7640qw.m13942b(str);
                }
            }
            i = mo13820a + i2 + (i3 * 1);
        }
        if (this.f23667b != null && this.f23667b.length > 0) {
            int i5 = 0;
            for (int i6 = 0; i6 < this.f23667b.length; i6++) {
                i5 += C7640qw.m13938c(this.f23667b[i6]);
            }
            i = i + i5 + (this.f23667b.length * 1);
        }
        if (this.f23668c == null || this.f23668c.length <= 0) {
            return i;
        }
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < this.f23668c.length; i9++) {
            byte[] bArr = this.f23668c[i9];
            if (bArr != null) {
                i8++;
                i7 += C7640qw.m13932c(bArr);
            }
        }
        return i + i7 + (i8 * 1);
    }

    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public C6982fr mo13816b(C7639qv c7639qv) {
        while (true) {
            int m14015a = c7639qv.m14015a();
            switch (m14015a) {
                case 0:
                    break;
                case 10:
                    int m13839b = C7652rg.m13839b(c7639qv, 10);
                    int length = this.f23666a == null ? 0 : this.f23666a.length;
                    String[] strArr = new String[m13839b + length];
                    if (length != 0) {
                        System.arraycopy(this.f23666a, 0, strArr, 0, length);
                    }
                    while (length < strArr.length - 1) {
                        strArr[length] = c7639qv.m13993j();
                        c7639qv.m14015a();
                        length++;
                    }
                    strArr[length] = c7639qv.m13993j();
                    this.f23666a = strArr;
                    break;
                case 16:
                    int m13839b2 = C7652rg.m13839b(c7639qv, 16);
                    int length2 = this.f23667b == null ? 0 : this.f23667b.length;
                    int[] iArr = new int[m13839b2 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.f23667b, 0, iArr, 0, length2);
                    }
                    while (length2 < iArr.length - 1) {
                        iArr[length2] = c7639qv.m13997g();
                        c7639qv.m14015a();
                        length2++;
                    }
                    iArr[length2] = c7639qv.m13997g();
                    this.f23667b = iArr;
                    break;
                case 18:
                    int m14002d = c7639qv.m14002d(c7639qv.m13989n());
                    int m13983t = c7639qv.m13983t();
                    int i = 0;
                    while (c7639qv.m13985r() > 0) {
                        c7639qv.m13997g();
                        i++;
                    }
                    c7639qv.m13998f(m13983t);
                    int length3 = this.f23667b == null ? 0 : this.f23667b.length;
                    int[] iArr2 = new int[i + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.f23667b, 0, iArr2, 0, length3);
                    }
                    while (length3 < iArr2.length) {
                        iArr2[length3] = c7639qv.m13997g();
                        length3++;
                    }
                    this.f23667b = iArr2;
                    c7639qv.m14000e(m14002d);
                    break;
                case 26:
                    int m13839b3 = C7652rg.m13839b(c7639qv, 26);
                    int length4 = this.f23668c == null ? 0 : this.f23668c.length;
                    byte[][] bArr = new byte[m13839b3 + length4];
                    if (length4 != 0) {
                        System.arraycopy(this.f23668c, 0, bArr, 0, length4);
                    }
                    while (length4 < bArr.length - 1) {
                        bArr[length4] = c7639qv.m13992k();
                        c7639qv.m14015a();
                        length4++;
                    }
                    bArr[length4] = c7639qv.m13992k();
                    this.f23668c = bArr;
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
        if (this.f23666a != null && this.f23666a.length > 0) {
            for (int i = 0; i < this.f23666a.length; i++) {
                String str = this.f23666a[i];
                if (str != null) {
                    c7640qw.m13970a(1, str);
                }
            }
        }
        if (this.f23667b != null && this.f23667b.length > 0) {
            for (int i2 = 0; i2 < this.f23667b.length; i2++) {
                c7640qw.m13973a(2, this.f23667b[i2]);
            }
        }
        if (this.f23668c != null && this.f23668c.length > 0) {
            for (int i3 = 0; i3 < this.f23668c.length; i3++) {
                byte[] bArr = this.f23668c[i3];
                if (bArr != null) {
                    c7640qw.m13968a(3, bArr);
                }
            }
        }
        super.mo13818a(c7640qw);
    }

    /* renamed from: b */
    public C6982fr m15838b() {
        this.f23666a = C7652rg.f25399f;
        this.f23667b = C7652rg.f25394a;
        this.f23668c = C7652rg.f25400g;
        this.f25374ag = null;
        this.f25391ah = -1;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6982fr)) {
            return false;
        }
        C6982fr c6982fr = (C6982fr) obj;
        if (!C7647rb.m13867a(this.f23666a, c6982fr.f23666a) || !C7647rb.m13871a(this.f23667b, c6982fr.f23667b) || !C7647rb.m13865a(this.f23668c, c6982fr.f23668c)) {
            return false;
        }
        return (this.f25374ag == null || this.f25374ag.m13887b()) ? c6982fr.f25374ag == null || c6982fr.f25374ag.m13887b() : this.f25374ag.equals(c6982fr.f25374ag);
    }

    public int hashCode() {
        return ((this.f25374ag == null || this.f25374ag.m13887b()) ? 0 : this.f25374ag.hashCode()) + ((((((((getClass().getName().hashCode() + 527) * 31) + C7647rb.m13868a(this.f23666a)) * 31) + C7647rb.m13872a(this.f23667b)) * 31) + C7647rb.m13866a(this.f23668c)) * 31);
    }
}
