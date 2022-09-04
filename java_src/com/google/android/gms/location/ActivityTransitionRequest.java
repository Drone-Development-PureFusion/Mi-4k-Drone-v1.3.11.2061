package com.google.android.gms.location;

import android.os.Parcel;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.internal.ClientIdentity;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
/* loaded from: classes2.dex */
public class ActivityTransitionRequest extends AbstractSafeParcelable {
    public static final C8338t CREATOR = new C8338t();

    /* renamed from: a */
    public static final Comparator<ActivityTransition> f26633a = new Comparator<ActivityTransition>() { // from class: com.google.android.gms.location.ActivityTransitionRequest.1
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(ActivityTransition activityTransition, ActivityTransition activityTransition2) {
            int m12656b = activityTransition.m12656b();
            int m12656b2 = activityTransition2.m12656b();
            if (m12656b != m12656b2) {
                return m12656b < m12656b2 ? -1 : 1;
            }
            int m12655c = activityTransition.m12655c();
            int m12655c2 = activityTransition2.m12655c();
            if (m12655c == m12655c2) {
                return 0;
            }
            return m12655c >= m12655c2 ? 1 : -1;
        }
    };

    /* renamed from: b */
    private final int f26634b;

    /* renamed from: c */
    private final List<ActivityTransition> f26635c;
    @Nullable

    /* renamed from: d */
    private final String f26636d;

    /* renamed from: e */
    private final List<ClientIdentity> f26637e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ActivityTransitionRequest(int i, List<ActivityTransition> list, @Nullable String str, @Nullable List<ClientIdentity> list2) {
        C4588d.m23626a(list, "transitions can't be null");
        C4588d.m23618b(list.size() > 0, "transitions can't be empty.");
        m12653a(list);
        this.f26634b = i;
        this.f26635c = Collections.unmodifiableList(list);
        this.f26636d = str;
        this.f26637e = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
    }

    /* renamed from: a */
    private static void m12653a(List<ActivityTransition> list) {
        TreeSet treeSet = new TreeSet(f26633a);
        for (ActivityTransition activityTransition : list) {
            C4588d.m23618b(treeSet.add(activityTransition), String.format("Found duplicated transition: %s.", activityTransition));
        }
    }

    /* renamed from: a */
    public int m12654a() {
        return this.f26634b;
    }

    /* renamed from: b */
    public List<ActivityTransition> m12652b() {
        return this.f26635c;
    }

    @Nullable
    /* renamed from: c */
    public String m12651c() {
        return this.f26636d;
    }

    /* renamed from: d */
    public List<ClientIdentity> m12650d() {
        return this.f26637e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
        return C4585c.m23634a(this.f26635c, activityTransitionRequest.f26635c) && C4585c.m23634a(this.f26636d, activityTransitionRequest.f26636d) && C4585c.m23634a(this.f26637e, activityTransitionRequest.f26637e);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.f26636d != null ? this.f26636d.hashCode() : 0) + (this.f26635c.hashCode() * 31)) * 31;
        if (this.f26637e != null) {
            i = this.f26637e.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f26635c);
        String str = this.f26636d;
        String valueOf2 = String.valueOf(this.f26637e);
        return new StringBuilder(String.valueOf(valueOf).length() + 61 + String.valueOf(str).length() + String.valueOf(valueOf2).length()).append("ActivityTransitionRequest [mTransitions=").append(valueOf).append(", mTag='").append(str).append("'").append(", mClients=").append(valueOf2).append("]").toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8338t.m12033a(this, parcel, i);
    }
}
