package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.amz;
import com.google.android.gms.internal.ana;
import com.google.android.gms.internal.anb;
import com.google.android.gms.nearby.bootstrap.Device;
/* loaded from: classes2.dex */
public class ConnectRequest extends AbstractSafeParcelable {
    public static final C8747a CREATOR = new C8747a();

    /* renamed from: a */
    final int f28006a;

    /* renamed from: b */
    private final Device f28007b;

    /* renamed from: c */
    private final String f28008c;

    /* renamed from: d */
    private final String f28009d;

    /* renamed from: e */
    private final amz f28010e;

    /* renamed from: f */
    private final ana f28011f;

    /* renamed from: g */
    private final anb f28012g;

    /* renamed from: h */
    private final byte f28013h;

    /* renamed from: i */
    private final long f28014i;

    /* renamed from: j */
    private final String f28015j;

    /* renamed from: k */
    private final byte f28016k;

    /* renamed from: l */
    private final byte f28017l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConnectRequest(int i, Device device, String str, String str2, byte b, long j, String str3, byte b2, byte b3, IBinder iBinder, IBinder iBinder2, IBinder iBinder3) {
        this.f28006a = i;
        this.f28007b = (Device) C4588d.m23627a(device);
        this.f28008c = C4588d.m23625a(str);
        this.f28009d = (String) C4588d.m23627a(str2);
        this.f28013h = b;
        this.f28014i = j;
        this.f28016k = b2;
        this.f28017l = b3;
        this.f28015j = str3;
        C4588d.m23627a(iBinder);
        this.f28010e = amz.AbstractBinderC6597a.m16710a(iBinder);
        C4588d.m23627a(iBinder2);
        this.f28011f = ana.AbstractBinderC6600a.m16703a(iBinder2);
        C4588d.m23627a(iBinder3);
        this.f28012g = anb.AbstractBinderC6602a.m16700a(iBinder3);
    }

    /* renamed from: a */
    public Device m10283a() {
        return this.f28007b;
    }

    /* renamed from: b */
    public String m10282b() {
        return this.f28008c;
    }

    /* renamed from: c */
    public String m10281c() {
        return this.f28009d;
    }

    /* renamed from: d */
    public byte m10280d() {
        return this.f28013h;
    }

    /* renamed from: e */
    public long m10279e() {
        return this.f28014i;
    }

    /* renamed from: f */
    public String m10278f() {
        return this.f28015j;
    }

    /* renamed from: g */
    public byte m10277g() {
        return this.f28016k;
    }

    /* renamed from: h */
    public byte m10276h() {
        return this.f28017l;
    }

    /* renamed from: i */
    public IBinder m10275i() {
        if (this.f28010e == null) {
            return null;
        }
        return this.f28010e.asBinder();
    }

    /* renamed from: j */
    public IBinder m10274j() {
        if (this.f28011f == null) {
            return null;
        }
        return this.f28011f.asBinder();
    }

    /* renamed from: k */
    public IBinder m10273k() {
        if (this.f28012g == null) {
            return null;
        }
        return this.f28012g.asBinder();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8747a c8747a = CREATOR;
        C8747a.m10251a(this, parcel, i);
    }
}
