package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.internal.C4430f;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public class ApplicationMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApplicationMetadata> CREATOR = new C4416i();

    /* renamed from: a */
    String f15778a;

    /* renamed from: b */
    String f15779b;

    /* renamed from: c */
    List<WebImage> f15780c;

    /* renamed from: d */
    List<String> f15781d;

    /* renamed from: e */
    String f15782e;

    /* renamed from: f */
    Uri f15783f;

    /* renamed from: g */
    private final int f15784g;

    private ApplicationMetadata() {
        this.f15784g = 1;
        this.f15780c = new ArrayList();
        this.f15781d = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ApplicationMetadata(int i, String str, String str2, List<WebImage> list, List<String> list2, String str3, Uri uri) {
        this.f15784g = i;
        this.f15778a = str;
        this.f15779b = str2;
        this.f15780c = list;
        this.f15781d = list2;
        this.f15782e = str3;
        this.f15783f = uri;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m25260a() {
        return this.f15784g;
    }

    /* renamed from: a */
    public boolean m25259a(String str) {
        return this.f15781d != null && this.f15781d.contains(str);
    }

    /* renamed from: a */
    public boolean m25258a(List<String> list) {
        return this.f15781d != null && this.f15781d.containsAll(list);
    }

    /* renamed from: b */
    public String m25257b() {
        return this.f15778a;
    }

    /* renamed from: c */
    public String m25256c() {
        return this.f15779b;
    }

    /* renamed from: d */
    public List<String> m25255d() {
        return Collections.unmodifiableList(this.f15781d);
    }

    /* renamed from: e */
    public String m25254e() {
        return this.f15782e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApplicationMetadata)) {
            return false;
        }
        ApplicationMetadata applicationMetadata = (ApplicationMetadata) obj;
        return C4430f.m24206a(this.f15778a, applicationMetadata.f15778a) && C4430f.m24206a(this.f15780c, applicationMetadata.f15780c) && C4430f.m24206a(this.f15779b, applicationMetadata.f15779b) && C4430f.m24206a(this.f15781d, applicationMetadata.f15781d) && C4430f.m24206a(this.f15782e, applicationMetadata.f15782e) && C4430f.m24206a(this.f15783f, applicationMetadata.f15783f);
    }

    /* renamed from: f */
    public Uri m25253f() {
        return this.f15783f;
    }

    /* renamed from: g */
    public List<WebImage> m25252g() {
        return this.f15780c;
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f15784g), this.f15778a, this.f15779b, this.f15780c, this.f15781d, this.f15782e, this.f15783f);
    }

    public String toString() {
        int i = 0;
        StringBuilder append = new StringBuilder().append("applicationId: ").append(this.f15778a).append(", name: ").append(this.f15779b).append(", images.count: ").append(this.f15780c == null ? 0 : this.f15780c.size()).append(", namespaces.count: ");
        if (this.f15781d != null) {
            i = this.f15781d.size();
        }
        return append.append(i).append(", senderAppIdentifier: ").append(this.f15782e).append(", senderAppLaunchUrl: ").append(this.f15783f).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4416i.m24281a(this, parcel, i);
    }
}
