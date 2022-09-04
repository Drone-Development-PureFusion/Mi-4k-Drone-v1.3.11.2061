package com.google.android.gms.internal;

import java.math.BigInteger;
/* renamed from: com.google.android.gms.internal.od */
/* loaded from: classes2.dex */
public final class C7478od extends AbstractC7471nx {

    /* renamed from: a */
    private static final Class<?>[] f24954a = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: b */
    private Object f24955b;

    public C7478od(Boolean bool) {
        m14351a(bool);
    }

    public C7478od(Number number) {
        m14351a(number);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7478od(Object obj) {
        m14351a(obj);
    }

    public C7478od(String str) {
        m14351a(str);
    }

    /* renamed from: a */
    private static boolean m14352a(C7478od c7478od) {
        if (c7478od.f24955b instanceof Number) {
            Number number = (Number) c7478od.f24955b;
            return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m14349b(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class<?> cls = obj.getClass();
        for (Class<?> cls2 : f24954a) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    void m14351a(Object obj) {
        if (obj instanceof Character) {
            this.f24955b = String.valueOf(((Character) obj).charValue());
            return;
        }
        C7494op.m14329a((obj instanceof Number) || m14349b(obj));
        this.f24955b = obj;
    }

    /* renamed from: a */
    public boolean m14353a() {
        return this.f24955b instanceof Boolean;
    }

    @Override // com.google.android.gms.internal.AbstractC7471nx
    /* renamed from: b */
    public Number mo14350b() {
        return this.f24955b instanceof String ? new C7516ov((String) this.f24955b) : (Number) this.f24955b;
    }

    @Override // com.google.android.gms.internal.AbstractC7471nx
    /* renamed from: c */
    public String mo14348c() {
        return m14342p() ? mo14350b().toString() : m14353a() ? mo14343o().toString() : (String) this.f24955b;
    }

    @Override // com.google.android.gms.internal.AbstractC7471nx
    /* renamed from: d */
    public double mo14347d() {
        return m14342p() ? mo14350b().doubleValue() : Double.parseDouble(mo14348c());
    }

    @Override // com.google.android.gms.internal.AbstractC7471nx
    /* renamed from: e */
    public long mo14346e() {
        return m14342p() ? mo14350b().longValue() : Long.parseLong(mo14348c());
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C7478od c7478od = (C7478od) obj;
        if (this.f24955b == null) {
            return c7478od.f24955b == null;
        } else if (m14352a(this) && m14352a(c7478od)) {
            return mo14350b().longValue() == c7478od.mo14350b().longValue();
        } else if (!(this.f24955b instanceof Number) || !(c7478od.f24955b instanceof Number)) {
            return this.f24955b.equals(c7478od.f24955b);
        } else {
            double doubleValue = mo14350b().doubleValue();
            double doubleValue2 = c7478od.mo14350b().doubleValue();
            if (doubleValue == doubleValue2 || (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2))) {
                z = true;
            }
            return z;
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7471nx
    /* renamed from: f */
    public int mo14345f() {
        return m14342p() ? mo14350b().intValue() : Integer.parseInt(mo14348c());
    }

    @Override // com.google.android.gms.internal.AbstractC7471nx
    /* renamed from: g */
    public boolean mo14344g() {
        return m14353a() ? mo14343o().booleanValue() : Boolean.parseBoolean(mo14348c());
    }

    public int hashCode() {
        if (this.f24955b == null) {
            return 31;
        }
        if (m14352a(this)) {
            long longValue = mo14350b().longValue();
            return (int) (longValue ^ (longValue >>> 32));
        } else if (!(this.f24955b instanceof Number)) {
            return this.f24955b.hashCode();
        } else {
            long doubleToLongBits = Double.doubleToLongBits(mo14350b().doubleValue());
            return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7471nx
    /* renamed from: o */
    Boolean mo14343o() {
        return (Boolean) this.f24955b;
    }

    /* renamed from: p */
    public boolean m14342p() {
        return this.f24955b instanceof Number;
    }

    /* renamed from: q */
    public boolean m14341q() {
        return this.f24955b instanceof String;
    }
}
