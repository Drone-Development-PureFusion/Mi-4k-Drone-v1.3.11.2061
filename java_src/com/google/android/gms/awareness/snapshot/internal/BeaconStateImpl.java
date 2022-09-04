package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.awareness.state.BeaconState;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.AbstractC7649rd;
import com.google.android.gms.internal.C7607px;
import com.google.android.gms.internal.C7648rc;
import com.google.android.gms.internal.C7715sw;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public final class BeaconStateImpl extends AbstractSafeParcelable implements BeaconState {
    public static final Parcelable.Creator<BeaconStateImpl> CREATOR = new C4112b();

    /* renamed from: a */
    private final int f15643a;

    /* renamed from: b */
    private final ArrayList<BeaconInfoImpl> f15644b;

    /* loaded from: classes2.dex */
    public static final class BeaconInfoImpl extends AbstractSafeParcelable implements BeaconState.AbstractC4140a {
        public static final Parcelable.Creator<BeaconInfoImpl> CREATOR = new C4111a();

        /* renamed from: a */
        private final int f15645a;

        /* renamed from: b */
        private final String f15646b;

        /* renamed from: c */
        private final String f15647c;

        /* renamed from: d */
        private final byte[] f15648d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public BeaconInfoImpl(int i, String str, String str2, byte[] bArr) {
            this.f15645a = i;
            this.f15646b = str;
            this.f15647c = str2;
            this.f15648d = bArr;
        }

        @Override // com.google.android.gms.awareness.state.BeaconState.AbstractC4140a
        /* renamed from: a */
        public String mo25357a() {
            return this.f15646b;
        }

        @Override // com.google.android.gms.awareness.state.BeaconState.AbstractC4140a
        /* renamed from: b */
        public String mo25356b() {
            return this.f15647c;
        }

        @Override // com.google.android.gms.awareness.state.BeaconState.AbstractC4140a
        /* renamed from: c */
        public byte[] mo25355c() {
            return this.f15648d;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public int m25466d() {
            return this.f15645a;
        }

        public String toString() {
            String str = this.f15648d == null ? "<null>" : new String(this.f15648d);
            String str2 = this.f15646b;
            String str3 = this.f15647c;
            return new StringBuilder(String.valueOf(str2).length() + 6 + String.valueOf(str3).length() + String.valueOf(str).length()).append("(").append(str2).append(", ").append(str3).append(", ").append(str).append(")").toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C4111a.m25420a(this, parcel, i);
        }
    }

    /* loaded from: classes2.dex */
    public static class TypeFilterImpl extends BeaconState.TypeFilter {
        public static final Parcelable.Creator<TypeFilterImpl> CREATOR = new C4138n();

        /* renamed from: a */
        private final int f15649a;

        /* renamed from: b */
        private final C7607px.C7608a f15650b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public TypeFilterImpl(int i, byte[] bArr) {
            this.f15649a = i;
            C7607px.C7608a c7608a = null;
            try {
                c7608a = C7607px.C7608a.m14080a(bArr);
            } catch (C7648rc e) {
                C7715sw.m13662b("BeaconStateImpl", "Could not deserialize BeaconFence.BeaconTypeFilter");
            }
            this.f15650b = c7608a;
        }

        public TypeFilterImpl(String str, String str2) {
            this.f15649a = 1;
            this.f15650b = new C7607px.C7608a();
            this.f15650b.f25230a = C4588d.m23625a(str);
            this.f15650b.f25231b = C4588d.m23625a(str2);
        }

        public TypeFilterImpl(String str, String str2, byte[] bArr) {
            this.f15649a = 1;
            this.f15650b = new C7607px.C7608a();
            this.f15650b.f25230a = C4588d.m23625a(str);
            this.f15650b.f25231b = C4588d.m23625a(str2);
            this.f15650b.f25232c = (byte[]) C4588d.m23627a(bArr);
        }

        /* renamed from: a */
        public String m25465a() {
            if (this.f15650b == null) {
                return null;
            }
            return this.f15650b.f25230a;
        }

        /* renamed from: b */
        public String m25464b() {
            if (this.f15650b == null) {
                return null;
            }
            return this.f15650b.f25231b;
        }

        /* renamed from: c */
        public byte[] m25463c() {
            if (this.f15650b == null || this.f15650b.f25232c == null || this.f15650b.f25232c.length == 0) {
                return null;
            }
            return this.f15650b.f25232c;
        }

        /* renamed from: d */
        public C7607px.C7608a m25462d() {
            return this.f15650b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e */
        public int m25461e() {
            return this.f15649a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TypeFilterImpl)) {
                return false;
            }
            TypeFilterImpl typeFilterImpl = (TypeFilterImpl) obj;
            return TextUtils.equals(m25465a(), typeFilterImpl.m25465a()) && TextUtils.equals(m25464b(), typeFilterImpl.m25464b()) && Arrays.equals(m25463c(), typeFilterImpl.m25463c());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: f */
        public byte[] m25460f() {
            return AbstractC7649rd.m13857a(this.f15650b);
        }

        public int hashCode() {
            int i = 0;
            Object[] objArr = new Object[3];
            objArr[0] = m25465a();
            objArr[1] = m25464b();
            if (m25463c() != null) {
                i = Arrays.hashCode(m25463c());
            }
            objArr[2] = Integer.valueOf(i);
            return C4585c.m23633a(objArr);
        }

        public String toString() {
            String valueOf = String.valueOf(m25465a());
            String valueOf2 = String.valueOf(m25464b());
            String str = m25463c() == null ? "null" : new String(m25463c());
            return new StringBuilder(String.valueOf(valueOf).length() + 4 + String.valueOf(valueOf2).length() + String.valueOf(str).length()).append("(").append(valueOf).append(Constants.ACCEPT_TIME_SEPARATOR_SP).append(valueOf2).append(Constants.ACCEPT_TIME_SEPARATOR_SP).append(str).append(")").toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C4138n.m25364a(this, parcel, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BeaconStateImpl(int i, ArrayList<BeaconInfoImpl> arrayList) {
        this.f15643a = i;
        this.f15644b = arrayList;
    }

    @Override // com.google.android.gms.awareness.state.BeaconState
    /* renamed from: a */
    public List<BeaconState.AbstractC4140a> mo25360a() {
        return this.f15644b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m25468b() {
        return this.f15643a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public ArrayList<BeaconInfoImpl> m25467c() {
        return this.f15644b;
    }

    public String toString() {
        if (this.f15644b == null || this.f15644b.isEmpty()) {
            return "BeaconState: empty";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("BeaconState: ");
        Iterator<BeaconInfoImpl> it2 = this.f15644b.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4112b.m25417a(this, parcel, i);
    }
}
