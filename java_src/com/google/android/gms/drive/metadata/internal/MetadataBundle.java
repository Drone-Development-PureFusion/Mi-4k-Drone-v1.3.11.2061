package com.google.android.gms.drive.metadata.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.internal.C4938by;
import com.google.android.gms.drive.metadata.AbstractC4991a;
import com.google.android.gms.internal.ajw;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* loaded from: classes2.dex */
public final class MetadataBundle extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<MetadataBundle> CREATOR = new C5010h();

    /* renamed from: a */
    final int f17995a;

    /* renamed from: b */
    final Bundle f17996b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MetadataBundle(int i, Bundle bundle) {
        this.f17995a = i;
        this.f17996b = (Bundle) C4588d.m23627a(bundle);
        this.f17996b.setClassLoader(getClass().getClassLoader());
        ArrayList<String> arrayList = new ArrayList();
        for (String str : this.f17996b.keySet()) {
            if (C5006e.m22130a(str) == null) {
                arrayList.add(str);
                String valueOf = String.valueOf(str);
                C4938by.m22378b("MetadataBundle", valueOf.length() != 0 ? "Ignored unknown metadata field in bundle: ".concat(valueOf) : new String("Ignored unknown metadata field in bundle: "));
            }
        }
        for (String str2 : arrayList) {
            this.f17996b.remove(str2);
        }
    }

    private MetadataBundle(Bundle bundle) {
        this(1, bundle);
    }

    /* renamed from: a */
    public static MetadataBundle m22156a() {
        return new MetadataBundle(new Bundle());
    }

    /* renamed from: a */
    public static <T> MetadataBundle m22153a(AbstractC4991a<T> abstractC4991a, T t) {
        MetadataBundle m22156a = m22156a();
        m22156a.m22150b(abstractC4991a, t);
        return m22156a;
    }

    /* renamed from: a */
    public <T> T m22154a(AbstractC4991a<T> abstractC4991a) {
        return abstractC4991a.mo22170a(this.f17996b);
    }

    /* renamed from: a */
    public void m22155a(Context context) {
        BitmapTeleporter bitmapTeleporter = (BitmapTeleporter) m22154a(ajw.f22061F);
        if (bitmapTeleporter != null) {
            bitmapTeleporter.m23902a(context.getCacheDir());
        }
    }

    /* renamed from: b */
    public MetadataBundle m22152b() {
        return new MetadataBundle(new Bundle(this.f17996b));
    }

    /* renamed from: b */
    public <T> void m22150b(AbstractC4991a<T> abstractC4991a, T t) {
        if (C5006e.m22130a(abstractC4991a.mo22171a()) == null) {
            String valueOf = String.valueOf(abstractC4991a.mo22171a());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unregistered field: ".concat(valueOf) : new String("Unregistered field: "));
        } else {
            abstractC4991a.mo22167a(t, this.f17996b);
        }
    }

    /* renamed from: b */
    public boolean m22151b(AbstractC4991a<?> abstractC4991a) {
        return this.f17996b.containsKey(abstractC4991a.mo22171a());
    }

    /* renamed from: c */
    public Set<AbstractC4991a<?>> m22149c() {
        HashSet hashSet = new HashSet();
        for (String str : this.f17996b.keySet()) {
            hashSet.add(C5006e.m22130a(str));
        }
        return hashSet;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetadataBundle)) {
            return false;
        }
        MetadataBundle metadataBundle = (MetadataBundle) obj;
        Set<String> keySet = this.f17996b.keySet();
        if (!keySet.equals(metadataBundle.f17996b.keySet())) {
            return false;
        }
        for (String str : keySet) {
            if (!C4585c.m23634a(this.f17996b.get(str), metadataBundle.f17996b.get(str))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        Iterator<String> it2 = this.f17996b.keySet().iterator();
        while (true) {
            int i2 = i;
            if (it2.hasNext()) {
                i = this.f17996b.get(it2.next()).hashCode() + (i2 * 31);
            } else {
                return i2;
            }
        }
    }

    public String toString() {
        String valueOf = String.valueOf(this.f17996b);
        return new StringBuilder(String.valueOf(valueOf).length() + 24).append("MetadataBundle [values=").append(valueOf).append("]").toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5010h.m22121a(this, parcel, i);
    }
}
