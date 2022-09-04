package com.google.android.gms.internal;

import com.google.firebase.p253b.AbstractC9765g;
import com.google.firebase.p253b.C9755a;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
/* renamed from: com.google.android.gms.internal.mx */
/* loaded from: classes2.dex */
public class C7421mx implements AbstractC9765g {

    /* renamed from: a */
    public static final Charset f24857a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final Pattern f24858b = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* renamed from: c */
    public static final Pattern f24859c = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* renamed from: d */
    private final byte[] f24860d;

    /* renamed from: e */
    private final int f24861e;

    public C7421mx(byte[] bArr, int i) {
        this.f24860d = bArr;
        this.f24861e = i;
    }

    /* renamed from: g */
    private void m14531g() {
        if (this.f24860d == null) {
            throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
        }
    }

    @Override // com.google.firebase.p253b.AbstractC9765g
    /* renamed from: a */
    public long mo7147a() {
        if (this.f24861e == 0) {
            return 0L;
        }
        String mo7145c = mo7145c();
        try {
            return Long.valueOf(mo7145c).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(mo7145c).length() + 40).append("[Value: ").append(mo7145c).append("] cannot be converted to a long.").toString(), e);
        }
    }

    @Override // com.google.firebase.p253b.AbstractC9765g
    /* renamed from: b */
    public double mo7146b() {
        if (this.f24861e == 0) {
            return C9755a.f30449c;
        }
        String mo7145c = mo7145c();
        try {
            return Double.valueOf(mo7145c).doubleValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(mo7145c).length() + 42).append("[Value: ").append(mo7145c).append("] cannot be converted to a double.").toString(), e);
        }
    }

    @Override // com.google.firebase.p253b.AbstractC9765g
    /* renamed from: c */
    public String mo7145c() {
        if (this.f24861e == 0) {
            return "";
        }
        m14531g();
        return new String(this.f24860d, f24857a);
    }

    @Override // com.google.firebase.p253b.AbstractC9765g
    /* renamed from: d */
    public byte[] mo7144d() {
        return this.f24861e == 0 ? C9755a.f30451e : this.f24860d;
    }

    @Override // com.google.firebase.p253b.AbstractC9765g
    /* renamed from: e */
    public boolean mo7143e() {
        if (this.f24861e == 0) {
            return false;
        }
        String mo7145c = mo7145c();
        if (f24858b.matcher(mo7145c).matches()) {
            return true;
        }
        if (f24859c.matcher(mo7145c).matches()) {
            return false;
        }
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(mo7145c).length() + 45).append("[Value: ").append(mo7145c).append("] cannot be interpreted as a boolean.").toString());
    }

    @Override // com.google.firebase.p253b.AbstractC9765g
    /* renamed from: f */
    public int mo7142f() {
        return this.f24861e;
    }
}
