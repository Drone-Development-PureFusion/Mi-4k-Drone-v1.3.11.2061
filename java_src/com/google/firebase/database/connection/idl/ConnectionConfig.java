package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.AbstractC7316kt;
import com.google.android.gms.internal.C7101hp;
import java.util.List;
/* loaded from: classes2.dex */
public class ConnectionConfig extends AbstractSafeParcelable {
    public static final C9842b CREATOR = new C9842b();

    /* renamed from: a */
    final int f30681a;

    /* renamed from: b */
    final HostInfoParcelable f30682b;

    /* renamed from: c */
    final int f30683c;

    /* renamed from: d */
    final List<String> f30684d;

    /* renamed from: e */
    final boolean f30685e;

    /* renamed from: f */
    final String f30686f;

    /* renamed from: g */
    final String f30687g;

    public ConnectionConfig(int i, HostInfoParcelable hostInfoParcelable, int i2, List<String> list, boolean z, String str, String str2) {
        this.f30681a = i;
        this.f30682b = hostInfoParcelable;
        this.f30683c = i2;
        this.f30684d = list;
        this.f30685e = z;
        this.f30686f = str;
        this.f30687g = str2;
    }

    public ConnectionConfig(C7101hp c7101hp, AbstractC7316kt.EnumC7317a enumC7317a, List<String> list, boolean z, String str, String str2) {
        int i;
        switch (enumC7317a) {
            case DEBUG:
                i = 1;
                break;
            case INFO:
                i = 2;
                break;
            case WARN:
                i = 3;
                break;
            case ERROR:
                i = 4;
                break;
            default:
                i = 0;
                break;
        }
        this.f30681a = 1;
        this.f30682b = HostInfoParcelable.m6846a(c7101hp);
        this.f30683c = i;
        this.f30684d = list;
        this.f30685e = z;
        this.f30686f = str;
        this.f30687g = str2;
    }

    /* renamed from: a */
    public AbstractC7316kt.EnumC7317a m6848a() {
        switch (this.f30683c) {
            case 0:
                return AbstractC7316kt.EnumC7317a.NONE;
            case 1:
                return AbstractC7316kt.EnumC7317a.DEBUG;
            case 2:
                return AbstractC7316kt.EnumC7317a.INFO;
            case 3:
                return AbstractC7316kt.EnumC7317a.WARN;
            case 4:
                return AbstractC7316kt.EnumC7317a.ERROR;
            default:
                return AbstractC7316kt.EnumC7317a.NONE;
        }
    }

    /* renamed from: b */
    public List<String> m6847b() {
        return this.f30684d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9842b.m6815a(this, parcel, i);
    }
}
