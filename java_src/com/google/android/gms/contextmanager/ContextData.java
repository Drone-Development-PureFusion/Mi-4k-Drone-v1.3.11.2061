package com.google.android.gms.contextmanager;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.AbstractC7649rd;
import com.google.android.gms.internal.C7609py;
import com.google.android.gms.internal.C7648rc;
/* loaded from: classes2.dex */
public class ContextData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ContextData> CREATOR = new C4726b();

    /* renamed from: a */
    private final int f17347a;

    /* renamed from: b */
    private C7609py f17348b = null;

    /* renamed from: c */
    private byte[] f17349c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ContextData(int i, byte[] bArr) {
        this.f17347a = i;
        this.f17349c = bArr;
        m23011f();
    }

    /* renamed from: e */
    private void m23012e() {
        if (!m23016a()) {
            try {
                this.f17348b = C7609py.m14076a(this.f17349c);
                this.f17349c = null;
            } catch (C7648rc e) {
                Log.e("ContextData", "Could not deserialize context bytes.", e);
                throw new IllegalStateException(e);
            }
        }
        m23011f();
    }

    /* renamed from: f */
    private void m23011f() {
        if (this.f17348b != null || this.f17349c == null) {
            if (this.f17348b != null && this.f17349c == null) {
                return;
            }
            if (this.f17348b != null && this.f17349c != null) {
                throw new IllegalStateException("Invalid internal representation - full");
            }
            if (this.f17348b != null || this.f17349c != null) {
                throw new IllegalStateException("Impossible");
            }
            throw new IllegalStateException("Invalid internal representation - empty");
        }
    }

    /* renamed from: a */
    boolean m23016a() {
        return this.f17348b != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m23015b() {
        return this.f17347a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public byte[] m23014c() {
        return this.f17349c != null ? this.f17349c : AbstractC7649rd.m13857a(this.f17348b);
    }

    /* renamed from: d */
    public String m23013d() {
        m23012e();
        return this.f17348b.f25235b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContextData)) {
            return false;
        }
        ContextData contextData = (ContextData) obj;
        m23012e();
        contextData.m23012e();
        return m23013d().equals(contextData.m23013d()) && this.f17348b.f25236c.f25265c == contextData.f17348b.f25236c.f25265c;
    }

    public int hashCode() {
        m23012e();
        return C4585c.m23633a(m23013d(), Integer.valueOf(this.f17348b.f25236c.f25265c));
    }

    public String toString() {
        m23012e();
        return this.f17348b.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4726b.m23001a(this, parcel, i);
    }
}
