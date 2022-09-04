package com.google.android.gms.config.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* loaded from: classes2.dex */
public class FetchConfigIpcRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FetchConfigIpcRequest> CREATOR = new C4716g();

    /* renamed from: a */
    public final int f17319a;

    /* renamed from: b */
    private final String f17320b;

    /* renamed from: c */
    private final long f17321c;

    /* renamed from: d */
    private final DataHolder f17322d;

    /* renamed from: e */
    private final String f17323e;

    /* renamed from: f */
    private final String f17324f;

    /* renamed from: g */
    private final String f17325g;

    /* renamed from: h */
    private final List<String> f17326h;

    /* renamed from: i */
    private final int f17327i;

    /* renamed from: j */
    private final List<AnalyticsUserProperty> f17328j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FetchConfigIpcRequest(int i, String str, long j, DataHolder dataHolder, String str2, String str3, String str4, List<String> list, int i2, List<AnalyticsUserProperty> list2) {
        this.f17319a = i;
        this.f17320b = str;
        this.f17321c = j;
        this.f17322d = dataHolder;
        this.f17323e = str2;
        this.f17324f = str3;
        this.f17325g = str4;
        this.f17326h = list;
        this.f17327i = i2;
        this.f17328j = list2;
    }

    public FetchConfigIpcRequest(String str, long j, DataHolder dataHolder, String str2, String str3, String str4, List<String> list, int i, List<AnalyticsUserProperty> list2) {
        this(2, str, j, dataHolder, str2, str3, str4, list, i, list2);
    }

    /* renamed from: a */
    public String m23070a() {
        return this.f17320b;
    }

    /* renamed from: b */
    public long m23069b() {
        return this.f17321c;
    }

    /* renamed from: c */
    public DataHolder m23068c() {
        return this.f17322d;
    }

    /* renamed from: d */
    public String m23067d() {
        return this.f17323e;
    }

    /* renamed from: e */
    public String m23066e() {
        return this.f17324f;
    }

    /* renamed from: f */
    public String m23065f() {
        return this.f17325g;
    }

    /* renamed from: g */
    public List<String> m23064g() {
        return this.f17326h;
    }

    /* renamed from: h */
    public int m23063h() {
        return this.f17327i;
    }

    /* renamed from: i */
    public List<AnalyticsUserProperty> m23062i() {
        return this.f17328j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4716g.m23034a(this, parcel, i);
    }
}
