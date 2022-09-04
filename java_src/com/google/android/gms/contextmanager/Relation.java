package com.google.android.gms.contextmanager;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.AbstractC7649rd;
import com.google.android.gms.internal.C7632qo;
import com.google.android.gms.internal.C7648rc;
/* loaded from: classes2.dex */
public class Relation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Relation> CREATOR = new C4755g();

    /* renamed from: a */
    private final int f17350a;

    /* renamed from: b */
    private C7632qo f17351b = null;

    /* renamed from: c */
    private byte[] f17352c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Relation(int i, byte[] bArr) {
        this.f17350a = i;
        this.f17352c = bArr;
        m23005f();
    }

    /* renamed from: e */
    private void m23006e() {
        if (!m23010a()) {
            try {
                this.f17351b = C7632qo.m14030a(this.f17352c);
                this.f17352c = null;
            } catch (C7648rc e) {
                Log.e("Relation", "Could not deserialize relation bytes.", e);
                throw new IllegalStateException(e);
            }
        }
        m23005f();
    }

    /* renamed from: f */
    private void m23005f() {
        if (this.f17351b != null || this.f17352c == null) {
            if (this.f17351b != null && this.f17352c == null) {
                return;
            }
            if (this.f17351b != null && this.f17352c != null) {
                throw new IllegalStateException("Invalid internal representation - full");
            }
            if (this.f17351b != null || this.f17352c != null) {
                throw new IllegalStateException("Impossible");
            }
            throw new IllegalStateException("Invalid internal representation - empty");
        }
    }

    /* renamed from: a */
    boolean m23010a() {
        return this.f17351b != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m23009b() {
        return this.f17350a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public byte[] m23008c() {
        return this.f17352c != null ? this.f17352c : AbstractC7649rd.m13857a(this.f17351b);
    }

    /* renamed from: d */
    public String m23007d() {
        m23006e();
        return this.f17351b.f25338a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Relation)) {
            return false;
        }
        Relation relation = (Relation) obj;
        m23006e();
        relation.m23006e();
        return m23007d().equals(relation.m23007d()) && this.f17351b.f25340c.f25265c == relation.f17351b.f25340c.f25265c;
    }

    public int hashCode() {
        m23006e();
        return C4585c.m23633a(m23007d(), Integer.valueOf(this.f17351b.f25340c.f25265c));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4755g.m22882a(this, parcel, i);
    }
}
