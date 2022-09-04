package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.appindexing.AbstractC9680g;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Set;
/* loaded from: classes2.dex */
public final class Thing extends AbstractSafeParcelable implements ReflectedParcelable, AbstractC9680g {
    public static final Parcelable.Creator<Thing> CREATOR = new C9709j();

    /* renamed from: h */
    public final int f30303h;

    /* renamed from: i */
    private final Bundle f30304i;

    /* renamed from: j */
    private final Metadata f30305j;

    /* renamed from: k */
    private final String f30306k;

    /* renamed from: l */
    private final String f30307l;

    /* loaded from: classes2.dex */
    public static class Metadata extends AbstractSafeParcelable {
        public static final Parcelable.Creator<Metadata> CREATOR = new C9707h();

        /* renamed from: a */
        public final int f30308a;

        /* renamed from: b */
        private final boolean f30309b;

        /* renamed from: c */
        private int f30310c;

        /* renamed from: d */
        private String f30311d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Metadata(int i, boolean z, int i2, String str) {
            this.f30308a = i;
            this.f30309b = z;
            this.f30310c = i2;
            this.f30311d = str;
        }

        public Metadata(boolean z, int i, String str) {
            this.f30308a = 1;
            this.f30309b = z;
            this.f30310c = i;
            this.f30311d = str;
        }

        /* renamed from: a */
        public boolean m7449a() {
            return this.f30309b;
        }

        /* renamed from: b */
        public int m7448b() {
            return this.f30310c;
        }

        /* renamed from: c */
        public String m7447c() {
            return this.f30311d;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Metadata) {
                Metadata metadata = (Metadata) obj;
                return C4585c.m23634a(Boolean.valueOf(this.f30309b), Boolean.valueOf(metadata.f30309b)) && C4585c.m23634a(Integer.valueOf(this.f30310c), Integer.valueOf(metadata.f30310c)) && C4585c.m23634a(this.f30311d, metadata.f30311d);
            }
            return false;
        }

        public int hashCode() {
            return C4585c.m23633a(Boolean.valueOf(this.f30309b), Integer.valueOf(this.f30310c), this.f30311d);
        }

        public String toString() {
            String str = "";
            if (!m7447c().isEmpty()) {
                String valueOf = String.valueOf(m7447c());
                str = valueOf.length() != 0 ? ", accountEmail: ".concat(valueOf) : new String(", accountEmail: ");
            }
            return new StringBuilder(String.valueOf(str).length() + 39).append("worksOffline: ").append(m7449a()).append(", score: ").append(m7448b()).append(str).toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C9707h.m7403a(this, parcel, i);
        }
    }

    public Thing(int i, Bundle bundle, Metadata metadata, String str, String str2) {
        this.f30303h = i;
        this.f30304i = bundle;
        this.f30305j = metadata;
        this.f30306k = str;
        this.f30307l = str2;
        this.f30304i.setClassLoader(getClass().getClassLoader());
    }

    public Thing(@NonNull Bundle bundle, @NonNull Metadata metadata, String str, @NonNull String str2) {
        this.f30303h = 6;
        this.f30304i = bundle;
        this.f30305j = metadata;
        this.f30306k = str;
        this.f30307l = str2;
    }

    /* renamed from: a */
    public int m7455a() {
        return this.f30303h;
    }

    /* renamed from: b */
    public Bundle m7454b() {
        return this.f30304i;
    }

    /* renamed from: c */
    public Metadata m7453c() {
        return this.f30305j;
    }

    /* renamed from: d */
    public String m7452d() {
        return this.f30306k;
    }

    /* renamed from: e */
    public String m7451e() {
        return this.f30307l;
    }

    /* renamed from: f */
    public String m7450f() {
        return this.f30307l.equals("Thing") ? "Indexable" : this.f30307l;
    }

    public String toString() {
        String sb;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m7450f()).append(" { ");
        StringBuilder append = sb2.append("{ id: ");
        if (m7452d() == null) {
            sb = "<null> } ";
        } else {
            String valueOf = String.valueOf(m7452d());
            sb = new StringBuilder(String.valueOf(valueOf).length() + 5).append("'").append(valueOf).append("' } ").toString();
        }
        append.append(sb);
        sb2.append("Properties { ");
        Set<String> keySet = this.f30304i.keySet();
        String[] strArr = (String[]) keySet.toArray(new String[keySet.size()]);
        Arrays.sort(strArr);
        for (String str : strArr) {
            sb2.append("{ key: '").append(str).append("' value: ");
            Object obj = this.f30304i.get(str);
            if (obj == null) {
                sb2.append("<null>");
            } else if (obj.getClass().isArray()) {
                sb2.append("[ ");
                for (int i = 0; i < Array.getLength(obj); i++) {
                    sb2.append("'").append(Array.get(obj, i)).append("' ");
                }
                sb2.append("]");
            } else {
                sb2.append(obj.toString());
            }
            sb2.append(" } ");
        }
        sb2.append("} ");
        sb2.append("Metadata { ");
        sb2.append(this.f30305j.toString());
        sb2.append(" } ");
        sb2.append("}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9709j.m7397a(this, parcel, i);
    }
}
