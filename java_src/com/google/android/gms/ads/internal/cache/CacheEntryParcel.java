package com.google.android.gms.ads.internal.cache;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;
import java.io.InputStream;
@aaa
/* loaded from: classes.dex */
public class CacheEntryParcel extends AbstractSafeParcelable {
    public static final C3493b CREATOR = new C3493b();

    /* renamed from: a */
    public final int f13825a;
    @Nullable

    /* renamed from: b */
    private ParcelFileDescriptor f13826b;

    public CacheEntryParcel() {
        this(1, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CacheEntryParcel(int i, @Nullable ParcelFileDescriptor parcelFileDescriptor) {
        this.f13825a = i;
        this.f13826b = parcelFileDescriptor;
    }

    /* renamed from: a */
    public synchronized boolean m27669a() {
        return this.f13826b != null;
    }

    @Nullable
    /* renamed from: b */
    public synchronized InputStream m27668b() {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = null;
        synchronized (this) {
            if (this.f13826b != null) {
                autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f13826b);
                this.f13826b = null;
            }
        }
        return autoCloseInputStream;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized ParcelFileDescriptor m27667c() {
        return this.f13826b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3493b.m27649a(this, parcel, i);
    }
}
