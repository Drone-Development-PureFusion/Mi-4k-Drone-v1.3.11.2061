package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Iterator;
/* loaded from: classes2.dex */
public class EventParams extends AbstractSafeParcelable implements Iterable<String> {
    public static final C8736v CREATOR = new C8736v();

    /* renamed from: a */
    public final int f27605a;

    /* renamed from: b */
    private final Bundle f27606b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public EventParams(int i, Bundle bundle) {
        this.f27605a = i;
        this.f27606b = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public EventParams(Bundle bundle) {
        C4588d.m23627a(bundle);
        this.f27606b = bundle;
        this.f27605a = 1;
    }

    /* renamed from: a */
    public int m10899a() {
        return this.f27606b.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Object m10897a(String str) {
        return this.f27606b.get(str);
    }

    /* renamed from: b */
    public Bundle m10896b() {
        return new Bundle(this.f27606b);
    }

    @Override // java.lang.Iterable
    public Iterator<String> iterator() {
        return new Iterator<String>() { // from class: com.google.android.gms.measurement.internal.EventParams.1

            /* renamed from: a */
            Iterator<String> f27607a;

            {
                this.f27607a = EventParams.this.f27606b.keySet().iterator();
            }

            @Override // java.util.Iterator
            /* renamed from: a */
            public String next() {
                return this.f27607a.next();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f27607a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Remove not supported");
            }
        };
    }

    public String toString() {
        return this.f27606b.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8736v.m10342a(this, parcel, i);
    }
}
