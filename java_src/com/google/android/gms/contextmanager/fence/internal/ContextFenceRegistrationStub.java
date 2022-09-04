package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class ContextFenceRegistrationStub extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ContextFenceRegistrationStub> CREATOR = new C4741f();

    /* renamed from: a */
    private final int f17358a;

    /* renamed from: b */
    private final String f17359b;

    /* renamed from: c */
    private ContextFenceStub f17360c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ContextFenceRegistrationStub(int i, String str, ContextFenceStub contextFenceStub) {
        this.f17358a = i;
        this.f17359b = str;
        this.f17360c = contextFenceStub;
    }

    public ContextFenceRegistrationStub(String str, ContextFenceStub contextFenceStub) {
        this(1, C4588d.m23625a(str), (ContextFenceStub) C4588d.m23627a(contextFenceStub));
    }

    /* renamed from: a */
    public static ContextFenceRegistrationStub m22996a(String str, ContextFenceStub contextFenceStub) {
        return new ContextFenceRegistrationStub(str, contextFenceStub);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m22997a() {
        return this.f17358a;
    }

    /* renamed from: b */
    public String m22995b() {
        return this.f17359b;
    }

    /* renamed from: c */
    public ContextFenceStub m22994c() {
        return this.f17360c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContextFenceRegistrationStub) {
            return TextUtils.equals(m22995b(), ((ContextFenceRegistrationStub) obj).m22995b());
        }
        return false;
    }

    public int hashCode() {
        return C4585c.m23633a(this.f17359b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4741f.m22920a(this, parcel, i);
    }
}
