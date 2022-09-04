package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class MapValue extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<MapValue> CREATOR = new C5170z();

    /* renamed from: a */
    private final int f18614a;

    /* renamed from: b */
    private final int f18615b;

    /* renamed from: c */
    private final float f18616c;

    public MapValue(int i, float f) {
        this(1, i, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MapValue(int i, int i2, float f) {
        this.f18614a = i;
        this.f18615b = i2;
        this.f18616c = f;
    }

    /* renamed from: a */
    public static MapValue m21582a(float f) {
        return new MapValue(2, f);
    }

    /* renamed from: a */
    private boolean m21581a(MapValue mapValue) {
        if (this.f18615b == mapValue.f18615b) {
            switch (this.f18615b) {
                case 2:
                    return m21583a() == mapValue.m21583a();
                default:
                    return this.f18616c == mapValue.f18616c;
            }
        }
        return false;
    }

    /* renamed from: a */
    public float m21583a() {
        C4588d.m23622a(this.f18615b == 2, "Value is not in float format");
        return this.f18616c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m21580b() {
        return this.f18614a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m21579c() {
        return this.f18615b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public float m21578d() {
        return this.f18616c;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof MapValue) && m21581a((MapValue) obj));
    }

    public int hashCode() {
        return (int) this.f18616c;
    }

    public String toString() {
        switch (this.f18615b) {
            case 2:
                return Float.toString(m21583a());
            default:
                return "unknown";
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5170z.m21416a(this, parcel, i);
    }
}
