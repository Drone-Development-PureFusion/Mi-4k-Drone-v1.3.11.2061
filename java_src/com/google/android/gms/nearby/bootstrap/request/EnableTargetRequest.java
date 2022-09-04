package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.amz;
import com.google.android.gms.internal.ana;
import com.google.android.gms.internal.anb;
/* loaded from: classes2.dex */
public class EnableTargetRequest extends AbstractSafeParcelable {
    public static final C8751e CREATOR = new C8751e();

    /* renamed from: a */
    final int f28026a;

    /* renamed from: b */
    private final String f28027b;

    /* renamed from: c */
    private final String f28028c;

    /* renamed from: d */
    private final amz f28029d;

    /* renamed from: e */
    private final ana f28030e;

    /* renamed from: f */
    private final anb f28031f;

    /* renamed from: g */
    private final byte f28032g;

    /* renamed from: h */
    private final byte f28033h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public EnableTargetRequest(int i, String str, String str2, byte b, byte b2, IBinder iBinder, IBinder iBinder2, IBinder iBinder3) {
        this.f28026a = i;
        this.f28027b = C4588d.m23625a(str);
        this.f28028c = (String) C4588d.m23627a(str2);
        this.f28032g = b;
        this.f28033h = b2;
        C4588d.m23627a(iBinder);
        this.f28029d = amz.AbstractBinderC6597a.m16710a(iBinder);
        C4588d.m23627a(iBinder2);
        this.f28030e = ana.AbstractBinderC6600a.m16703a(iBinder2);
        C4588d.m23627a(iBinder3);
        this.f28031f = anb.AbstractBinderC6602a.m16700a(iBinder3);
    }

    /* renamed from: a */
    public String m10267a() {
        return this.f28027b;
    }

    /* renamed from: b */
    public String m10266b() {
        return this.f28028c;
    }

    /* renamed from: c */
    public byte m10265c() {
        return this.f28032g;
    }

    /* renamed from: d */
    public byte m10264d() {
        return this.f28033h;
    }

    /* renamed from: e */
    public IBinder m10263e() {
        if (this.f28029d == null) {
            return null;
        }
        return this.f28029d.asBinder();
    }

    /* renamed from: f */
    public IBinder m10262f() {
        if (this.f28030e == null) {
            return null;
        }
        return this.f28030e.asBinder();
    }

    /* renamed from: g */
    public IBinder m10261g() {
        if (this.f28031f == null) {
            return null;
        }
        return this.f28031f.asBinder();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8751e c8751e = CREATOR;
        C8751e.m10239a(this, parcel, i);
    }
}
