package com.google.android.gms.fitness.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.p001v4.util.ArrayMap;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.C4690m;
import com.google.android.gms.fitness.C5129d;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes2.dex */
public final class Value extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Value> CREATOR = new C5148f();

    /* renamed from: a */
    private final int f18668a;

    /* renamed from: b */
    private final int f18669b;

    /* renamed from: c */
    private boolean f18670c;

    /* renamed from: d */
    private float f18671d;

    /* renamed from: e */
    private String f18672e;

    /* renamed from: f */
    private Map<String, MapValue> f18673f;

    /* renamed from: g */
    private int[] f18674g;

    /* renamed from: h */
    private float[] f18675h;

    /* renamed from: i */
    private byte[] f18676i;

    public Value(int i) {
        this(3, i, false, 0.0f, null, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Value(int i, int i2, boolean z, float f, String str, Bundle bundle, int[] iArr, float[] fArr, byte[] bArr) {
        this.f18668a = i;
        this.f18669b = i2;
        this.f18670c = z;
        this.f18671d = f;
        this.f18672e = str;
        this.f18673f = m21517a(bundle);
        this.f18674g = iArr;
        this.f18675h = fArr;
        this.f18676i = bArr;
    }

    /* renamed from: a */
    private static Map<String, MapValue> m21517a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(MapValue.class.getClassLoader());
        ArrayMap arrayMap = new ArrayMap(bundle.size());
        for (String str : bundle.keySet()) {
            arrayMap.put(str, (MapValue) bundle.getParcelable(str));
        }
        return arrayMap;
    }

    /* renamed from: a */
    private boolean m21516a(Value value) {
        if (this.f18669b == value.f18669b && this.f18670c == value.f18670c) {
            switch (this.f18669b) {
                case 1:
                    return m21511c() == value.m21511c();
                case 2:
                    return this.f18671d == value.f18671d;
                case 3:
                    return C4585c.m23634a(this.f18672e, value.f18672e);
                case 4:
                    return C4585c.m23634a(this.f18673f, value.f18673f);
                case 5:
                    return Arrays.equals(this.f18674g, value.f18674g);
                case 6:
                    return Arrays.equals(this.f18675h, value.f18675h);
                case 7:
                    return Arrays.equals(this.f18676i, value.f18676i);
                default:
                    return this.f18671d == value.f18671d;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void m21519a(float f) {
        C4588d.m23622a(this.f18669b == 2, "Attempting to set an float value to a field that is not in FLOAT format.  Please check the data type definition and use the right format.");
        this.f18670c = true;
        this.f18671d = f;
    }

    /* renamed from: a */
    public void m21518a(int i) {
        C4588d.m23622a(this.f18669b == 1, "Attempting to set an int value to a field that is not in INT32 format.  Please check the data type definition and use the right format.");
        this.f18670c = true;
        this.f18671d = Float.intBitsToFloat(i);
    }

    /* renamed from: a */
    public void m21515a(String str) {
        C4588d.m23622a(this.f18669b == 3, "Attempting to set a string value to a field that is not in STRING format.  Please check the data type definition and use the right format.");
        this.f18670c = true;
        this.f18672e = str;
    }

    /* renamed from: a */
    public void m21514a(String str, float f) {
        C4588d.m23622a(this.f18669b == 4, "Attempting to set a key's value to a field that is not in FLOAT_MAP format.  Please check the data type definition and use the right format.");
        this.f18670c = true;
        if (this.f18673f == null) {
            this.f18673f = new HashMap();
        }
        this.f18673f.put(str, MapValue.m21582a(f));
    }

    /* renamed from: a */
    public boolean m21520a() {
        return this.f18670c;
    }

    /* renamed from: b */
    public int m21513b() {
        return this.f18669b;
    }

    /* renamed from: b */
    public void m21512b(String str) {
        C4588d.m23622a(this.f18669b == 4, "Attempting to set a key's value to a field that is not in FLOAT_MAP format.  Please check the data type definition and use the right format.");
        if (this.f18673f != null) {
            this.f18673f.remove(str);
        }
    }

    /* renamed from: c */
    public int m21511c() {
        boolean z = true;
        if (this.f18669b != 1) {
            z = false;
        }
        C4588d.m23622a(z, "Value is not in int format");
        return Float.floatToRawIntBits(this.f18671d);
    }

    /* renamed from: c */
    public void m21510c(String str) {
        m21518a(C5129d.m21767a(str));
    }

    /* renamed from: d */
    public float m21509d() {
        C4588d.m23622a(this.f18669b == 2, "Value is not in float format");
        return this.f18671d;
    }

    @Nullable
    /* renamed from: d */
    public Float m21508d(String str) {
        C4588d.m23622a(this.f18669b == 4, "Value is not in float map format");
        if (this.f18673f == null || !this.f18673f.containsKey(str)) {
            return null;
        }
        return Float.valueOf(this.f18673f.get(str).m21583a());
    }

    /* renamed from: e */
    public String m21507e() {
        C4588d.m23622a(this.f18669b == 3, "Value is not in string format");
        return this.f18672e;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Value) && m21516a((Value) obj));
    }

    /* renamed from: f */
    public String m21506f() {
        return C5129d.m21768a(m21511c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m21505g() {
        return this.f18668a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public float m21504h() {
        return this.f18671d;
    }

    public int hashCode() {
        return C4585c.m23633a(Float.valueOf(this.f18671d), this.f18672e, this.f18673f, this.f18674g, this.f18675h, this.f18676i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public String m21503i() {
        return this.f18672e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public Bundle m21502j() {
        if (this.f18673f == null) {
            return null;
        }
        Bundle bundle = new Bundle(this.f18673f.size());
        for (Map.Entry<String, MapValue> entry : this.f18673f.entrySet()) {
            bundle.putParcelable(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int[] m21501k() {
        return this.f18674g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public float[] m21500l() {
        return this.f18675h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public byte[] m21499m() {
        return this.f18676i;
    }

    public String toString() {
        if (!this.f18670c) {
            return "unset";
        }
        switch (this.f18669b) {
            case 1:
                return Integer.toString(m21511c());
            case 2:
                return Float.toString(this.f18671d);
            case 3:
                return this.f18672e;
            case 4:
                return new TreeMap(this.f18673f).toString();
            case 5:
                return Arrays.toString(this.f18674g);
            case 6:
                return Arrays.toString(this.f18675h);
            case 7:
                return C4690m.m23128a(this.f18676i, 0, this.f18676i.length, false);
            default:
                return "unknown";
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5148f.m21472a(this, parcel, i);
    }
}
