package com.google.android.gms.contextmanager.fence.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.fence.AbstractC4104i;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.contextmanager.fence.internal.AbstractC4748m;
import com.google.android.gms.internal.C7716sx;
/* loaded from: classes2.dex */
public class UpdateFenceOperation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UpdateFenceOperation> CREATOR = new C4754q();

    /* renamed from: a */
    private final int f17381a;

    /* renamed from: b */
    private final int f17382b;

    /* renamed from: c */
    private final ContextFenceRegistrationStub f17383c;

    /* renamed from: d */
    private AbstractC4748m f17384d;

    /* renamed from: e */
    private final AbstractC4104i f17385e;

    /* renamed from: f */
    private final PendingIntent f17386f;

    /* renamed from: g */
    private final String f17387g;

    /* renamed from: h */
    private final long f17388h;

    /* renamed from: i */
    private final long f17389i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public UpdateFenceOperation(int i, int i2, ContextFenceRegistrationStub contextFenceRegistrationStub, IBinder iBinder, PendingIntent pendingIntent, String str, long j, long j2) {
        this.f17381a = i;
        this.f17382b = i2;
        this.f17383c = contextFenceRegistrationStub;
        this.f17384d = iBinder == null ? null : AbstractC4748m.AbstractBinderC4749a.m22901a(iBinder);
        this.f17385e = null;
        this.f17386f = pendingIntent;
        this.f17387g = str;
        this.f17388h = j;
        this.f17389i = j2;
    }

    private UpdateFenceOperation(int i, ContextFenceRegistrationStub contextFenceRegistrationStub, AbstractC4104i abstractC4104i, PendingIntent pendingIntent, String str, long j, long j2) {
        this.f17381a = 1;
        this.f17382b = i;
        this.f17383c = contextFenceRegistrationStub;
        this.f17384d = null;
        this.f17385e = abstractC4104i;
        this.f17386f = pendingIntent;
        this.f17387g = str;
        this.f17388h = j;
        this.f17389i = j2;
    }

    /* renamed from: a */
    public static final UpdateFenceOperation m22952a(PendingIntent pendingIntent) {
        return new UpdateFenceOperation(4, null, null, pendingIntent, null, -1L, -1L);
    }

    /* renamed from: a */
    public static final UpdateFenceOperation m22950a(String str) {
        return new UpdateFenceOperation(5, null, null, null, str, -1L, -1L);
    }

    /* renamed from: a */
    public static final UpdateFenceOperation m22949a(String str, ContextFenceStub contextFenceStub, PendingIntent pendingIntent) {
        return new UpdateFenceOperation(2, ContextFenceRegistrationStub.m22996a(str, contextFenceStub), null, pendingIntent, null, -1L, -1L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m22953a() {
        return this.f17381a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m22951a(C7716sx<AbstractC4104i, BinderC4738e> c7716sx) {
        if (this.f17384d != null || this.f17385e == null) {
            return;
        }
        this.f17384d = c7716sx.m13661a(this.f17385e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public IBinder m22948b() {
        if (this.f17384d == null) {
            return null;
        }
        return this.f17384d.asBinder();
    }

    /* renamed from: c */
    public int m22947c() {
        return this.f17382b;
    }

    /* renamed from: d */
    public ContextFenceRegistrationStub m22946d() {
        return this.f17383c;
    }

    /* renamed from: e */
    public PendingIntent m22945e() {
        return this.f17386f;
    }

    /* renamed from: f */
    public String m22944f() {
        return this.f17387g;
    }

    /* renamed from: g */
    public long m22943g() {
        return this.f17388h;
    }

    /* renamed from: h */
    public long m22942h() {
        return this.f17389i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4754q.m22885a(this, parcel, i);
    }
}
