package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new C8339u();

    /* renamed from: a */
    public static final int f26652a = 1;

    /* renamed from: b */
    public static final int f26653b = 2;

    /* renamed from: c */
    public static final int f26654c = 4;

    /* renamed from: d */
    private final int f26655d;

    /* renamed from: e */
    private final List<ParcelableGeofence> f26656e;

    /* renamed from: f */
    private final int f26657f;

    /* renamed from: com.google.android.gms.location.GeofencingRequest$a */
    /* loaded from: classes2.dex */
    public static final class C8155a {

        /* renamed from: a */
        private final List<ParcelableGeofence> f26658a = new ArrayList();

        /* renamed from: b */
        private int f26659b = 5;

        /* renamed from: b */
        public static int m12634b(int i) {
            return i & 7;
        }

        /* renamed from: a */
        public C8155a m12637a(int i) {
            this.f26659b = m12634b(i);
            return this;
        }

        /* renamed from: a */
        public C8155a m12636a(AbstractC8167f abstractC8167f) {
            C4588d.m23626a(abstractC8167f, "geofence can't be null.");
            C4588d.m23618b(abstractC8167f instanceof ParcelableGeofence, "Geofence must be created using Geofence.Builder.");
            this.f26658a.add((ParcelableGeofence) abstractC8167f);
            return this;
        }

        /* renamed from: a */
        public C8155a m12635a(List<AbstractC8167f> list) {
            if (list != null && !list.isEmpty()) {
                for (AbstractC8167f abstractC8167f : list) {
                    if (abstractC8167f != null) {
                        m12636a(abstractC8167f);
                    }
                }
            }
            return this;
        }

        /* renamed from: a */
        public GeofencingRequest m12638a() {
            C4588d.m23618b(!this.f26658a.isEmpty(), "No geofence has been added to this request.");
            return new GeofencingRequest(this.f26658a, this.f26659b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GeofencingRequest(int i, List<ParcelableGeofence> list, int i2) {
        this.f26655d = i;
        this.f26656e = list;
        this.f26657f = i2;
    }

    private GeofencingRequest(List<ParcelableGeofence> list, int i) {
        this(1, list, i);
    }

    /* renamed from: a */
    public int m12642a() {
        return this.f26655d;
    }

    /* renamed from: b */
    public List<ParcelableGeofence> m12641b() {
        return this.f26656e;
    }

    /* renamed from: c */
    public List<AbstractC8167f> m12640c() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f26656e);
        return arrayList;
    }

    /* renamed from: d */
    public int m12639d() {
        return this.f26657f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8339u.m12030a(this, parcel, i);
    }
}
