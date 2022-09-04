package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class ActivityRecognitionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityRecognitionRequest> CREATOR = new C8336r();

    /* renamed from: a */
    private final int f26615a;

    /* renamed from: b */
    private long f26616b;

    /* renamed from: c */
    private boolean f26617c;
    @Nullable

    /* renamed from: d */
    private WorkSource f26618d;
    @Nullable

    /* renamed from: e */
    private String f26619e;
    @Nullable

    /* renamed from: f */
    private int[] f26620f;
    @Nullable

    /* renamed from: g */
    private boolean f26621g;
    @Nullable

    /* renamed from: h */
    private String f26622h;

    /* renamed from: i */
    private final long f26623i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ActivityRecognitionRequest(int i, long j, boolean z, @Nullable WorkSource workSource, @Nullable String str, @Nullable int[] iArr, boolean z2, @Nullable String str2, long j2) {
        this.f26615a = i;
        this.f26616b = j;
        this.f26617c = z;
        this.f26618d = workSource;
        this.f26619e = str;
        this.f26620f = iArr;
        this.f26621g = z2;
        this.f26622h = str2;
        this.f26623i = j2;
    }

    /* renamed from: a */
    public long m12679a() {
        return this.f26616b;
    }

    /* renamed from: b */
    public boolean m12678b() {
        return this.f26617c;
    }

    @Nullable
    /* renamed from: c */
    public WorkSource m12677c() {
        return this.f26618d;
    }

    @Nullable
    /* renamed from: d */
    public String m12676d() {
        return this.f26619e;
    }

    @Nullable
    /* renamed from: e */
    public int[] m12675e() {
        return this.f26620f;
    }

    /* renamed from: f */
    public boolean m12674f() {
        return this.f26621g;
    }

    @Nullable
    /* renamed from: g */
    public String m12673g() {
        return this.f26622h;
    }

    /* renamed from: h */
    public long m12672h() {
        return this.f26623i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m12671i() {
        return this.f26615a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8336r.m12039a(this, parcel, i);
    }
}
