package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.Field;
import com.google.android.gms.internal.akz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public class DataTypeCreateRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DataTypeCreateRequest> CREATOR = new C5246w();

    /* renamed from: a */
    private final int f18917a;

    /* renamed from: b */
    private final String f18918b;

    /* renamed from: c */
    private final List<Field> f18919c;

    /* renamed from: d */
    private final akz f18920d;

    /* renamed from: com.google.android.gms.fitness.request.DataTypeCreateRequest$a */
    /* loaded from: classes2.dex */
    public static class C5191a {

        /* renamed from: a */
        private String f18921a;

        /* renamed from: b */
        private List<Field> f18922b = new ArrayList();

        /* renamed from: a */
        public C5191a m21287a(Field field) {
            if (!this.f18922b.contains(field)) {
                this.f18922b.add(field);
            }
            return this;
        }

        /* renamed from: a */
        public C5191a m21285a(String str) {
            this.f18921a = str;
            return this;
        }

        /* renamed from: a */
        public C5191a m21284a(String str, int i) {
            C4588d.m23618b(str != null && !str.isEmpty(), "Invalid name specified");
            return m21287a(Field.m21625a(str, i));
        }

        /* renamed from: a */
        public DataTypeCreateRequest m21288a() {
            boolean z = true;
            C4588d.m23622a(this.f18921a != null, "Must set the name");
            if (this.f18922b.isEmpty()) {
                z = false;
            }
            C4588d.m23622a(z, "Must specify the data fields");
            return new DataTypeCreateRequest(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataTypeCreateRequest(int i, String str, List<Field> list, IBinder iBinder) {
        this.f18917a = i;
        this.f18918b = str;
        this.f18919c = Collections.unmodifiableList(list);
        this.f18920d = akz.AbstractBinderC6478a.m16990a(iBinder);
    }

    private DataTypeCreateRequest(C5191a c5191a) {
        this(c5191a.f18921a, c5191a.f18922b, null);
    }

    public DataTypeCreateRequest(DataTypeCreateRequest dataTypeCreateRequest, akz akzVar) {
        this(dataTypeCreateRequest.f18918b, dataTypeCreateRequest.f18919c, akzVar);
    }

    public DataTypeCreateRequest(String str, List<Field> list, akz akzVar) {
        this.f18917a = 3;
        this.f18918b = str;
        this.f18919c = Collections.unmodifiableList(list);
        this.f18920d = akzVar;
    }

    /* renamed from: a */
    private boolean m21292a(DataTypeCreateRequest dataTypeCreateRequest) {
        return C4585c.m23634a(this.f18918b, dataTypeCreateRequest.f18918b) && C4585c.m23634a(this.f18919c, dataTypeCreateRequest.f18919c);
    }

    /* renamed from: a */
    public String m21293a() {
        return this.f18918b;
    }

    /* renamed from: b */
    public List<Field> m21291b() {
        return this.f18919c;
    }

    /* renamed from: c */
    public IBinder m21290c() {
        if (this.f18920d == null) {
            return null;
        }
        return this.f18920d.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m21289d() {
        return this.f18917a;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof DataTypeCreateRequest) && m21292a((DataTypeCreateRequest) obj));
    }

    public int hashCode() {
        return C4585c.m23633a(this.f18918b, this.f18919c);
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("name", this.f18918b).m23632a("fields", this.f18919c).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5246w.m20977a(this, parcel, i);
    }
}
