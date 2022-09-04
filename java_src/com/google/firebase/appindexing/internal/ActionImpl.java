package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.appindexing.AbstractC9658a;
/* loaded from: classes.dex */
public class ActionImpl extends AbstractSafeParcelable implements AbstractC9658a {
    public static final Parcelable.Creator<ActionImpl> CREATOR = new C9684a();

    /* renamed from: a */
    public final int f30289a;

    /* renamed from: b */
    private final String f30290b;

    /* renamed from: c */
    private final String f30291c;

    /* renamed from: d */
    private final String f30292d;

    /* renamed from: e */
    private final String f30293e;

    /* renamed from: f */
    private final MetadataImpl f30294f;

    /* renamed from: g */
    private final String f30295g;

    /* loaded from: classes.dex */
    public static class MetadataImpl extends AbstractSafeParcelable {
        public static final Parcelable.Creator<MetadataImpl> CREATOR = new C9708i();

        /* renamed from: a */
        public final int f30296a;

        /* renamed from: b */
        private int f30297b;

        /* renamed from: c */
        private final boolean f30298c;

        /* renamed from: d */
        private final String f30299d;

        /* renamed from: e */
        private final String f30300e;

        /* renamed from: f */
        private final byte[] f30301f;

        /* renamed from: g */
        private final boolean f30302g;

        /* JADX INFO: Access modifiers changed from: package-private */
        public MetadataImpl(int i, int i2, boolean z, String str, String str2, byte[] bArr, boolean z2) {
            this.f30297b = 0;
            this.f30296a = i;
            this.f30297b = i2;
            this.f30298c = z;
            this.f30299d = str;
            this.f30300e = str2;
            this.f30301f = bArr;
            this.f30302g = z2;
        }

        public MetadataImpl(boolean z, String str, String str2, byte[] bArr, boolean z2) {
            this.f30297b = 0;
            this.f30296a = 1;
            this.f30298c = z;
            this.f30299d = str;
            this.f30300e = str2;
            this.f30301f = bArr;
            this.f30302g = z2;
        }

        /* renamed from: a */
        public int m7462a() {
            return this.f30297b;
        }

        /* renamed from: a */
        public void m7461a(int i) {
            this.f30297b = i;
        }

        /* renamed from: b */
        public boolean m7460b() {
            return this.f30298c;
        }

        /* renamed from: c */
        public String m7459c() {
            return this.f30299d;
        }

        /* renamed from: d */
        public String m7458d() {
            return this.f30300e;
        }

        /* renamed from: e */
        public byte[] m7457e() {
            return this.f30301f;
        }

        /* renamed from: f */
        public boolean m7456f() {
            return this.f30302g;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MetadataImpl { ");
            sb.append("{ eventStatus: '").append(this.f30297b).append("' } ");
            sb.append("{ uploadable: '").append(this.f30298c).append("' } ");
            if (this.f30299d != null) {
                sb.append("{ completionToken: '").append(this.f30299d).append("' } ");
            }
            if (this.f30300e != null) {
                sb.append("{ accountName: '").append(this.f30300e).append("' } ");
            }
            if (this.f30301f != null) {
                sb.append("{ ssbContext: [ ");
                for (byte b : this.f30301f) {
                    sb.append("0x").append(Integer.toHexString(b)).append(" ");
                }
                sb.append("] } ");
            }
            sb.append("{ contextOnly: '").append(this.f30302g).append("' } ");
            sb.append("}");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C9708i.m7400a(this, parcel, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ActionImpl(int i, String str, String str2, String str3, String str4, MetadataImpl metadataImpl, String str5) {
        this.f30289a = i;
        this.f30290b = str;
        this.f30291c = str2;
        this.f30292d = str3;
        this.f30293e = str4;
        this.f30294f = metadataImpl;
        this.f30295g = str5;
    }

    public ActionImpl(@NonNull String str, @NonNull String str2, @NonNull String str3, String str4, @NonNull MetadataImpl metadataImpl, String str5) {
        this.f30289a = 1;
        this.f30290b = str;
        this.f30291c = str2;
        this.f30292d = str3;
        this.f30293e = str4;
        this.f30294f = metadataImpl;
        this.f30295g = str5;
    }

    /* renamed from: a */
    public String m7468a() {
        return this.f30290b;
    }

    /* renamed from: b */
    public String m7467b() {
        return this.f30291c;
    }

    /* renamed from: c */
    public String m7466c() {
        return this.f30292d;
    }

    /* renamed from: d */
    public String m7465d() {
        return this.f30293e;
    }

    /* renamed from: e */
    public MetadataImpl m7464e() {
        return this.f30294f;
    }

    /* renamed from: f */
    public String m7463f() {
        return this.f30295g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ActionImpl { ");
        sb.append("{ actionType: '").append(this.f30290b).append("' } ");
        sb.append("{ objectName: '").append(this.f30291c).append("' } ");
        sb.append("{ objectUrl: '").append(this.f30292d).append("' } ");
        if (this.f30293e != null) {
            sb.append("{ objectSameAs: '").append(this.f30293e).append("' } ");
        }
        if (this.f30294f != null) {
            sb.append("{ metadata: '").append(this.f30294f.toString()).append("' } ");
        }
        if (this.f30295g != null) {
            sb.append("{ actionStatus: '").append(this.f30295g).append("' } ");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9684a.m7444a(this, parcel, i);
    }
}
