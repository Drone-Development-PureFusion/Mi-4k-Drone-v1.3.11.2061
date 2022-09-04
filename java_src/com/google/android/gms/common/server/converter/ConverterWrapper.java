package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
/* loaded from: classes2.dex */
public class ConverterWrapper extends AbstractSafeParcelable {
    public static final C4659a CREATOR = new C4659a();

    /* renamed from: a */
    private final int f17193a;

    /* renamed from: b */
    private final StringToIntConverter f17194b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConverterWrapper(int i, StringToIntConverter stringToIntConverter) {
        this.f17193a = i;
        this.f17194b = stringToIntConverter;
    }

    private ConverterWrapper(StringToIntConverter stringToIntConverter) {
        this.f17193a = 1;
        this.f17194b = stringToIntConverter;
    }

    /* renamed from: a */
    public static ConverterWrapper m23315a(FastJsonResponse.AbstractC4662a<?, ?> abstractC4662a) {
        if (abstractC4662a instanceof StringToIntConverter) {
            return new ConverterWrapper((StringToIntConverter) abstractC4662a);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m23316a() {
        return this.f17193a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public StringToIntConverter m23314b() {
        return this.f17194b;
    }

    /* renamed from: c */
    public FastJsonResponse.AbstractC4662a<?, ?> m23313c() {
        if (this.f17194b != null) {
            return this.f17194b;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4659a c4659a = CREATOR;
        C4659a.m23305a(this, parcel, i);
    }
}
