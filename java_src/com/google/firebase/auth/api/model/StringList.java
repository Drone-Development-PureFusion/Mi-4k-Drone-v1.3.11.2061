package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.AbstractC7022gc;
import com.google.android.gms.internal.AbstractC7491om;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class StringList extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StringList> CREATOR = new C9725g();
    @AbstractC7022gc

    /* renamed from: a */
    public final int f30398a;
    @AbstractC7491om(m14334a = "values")

    /* renamed from: b */
    private List<String> f30399b;

    public StringList() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public StringList(int i, List<String> list) {
        this.f30398a = i;
        if (list == null || list.isEmpty()) {
            this.f30399b = Collections.emptyList();
        } else {
            this.f30399b = Collections.unmodifiableList(list);
        }
    }

    public StringList(@Nullable List<String> list) {
        this.f30398a = 1;
        this.f30399b = new ArrayList();
        if (list == null || list.isEmpty()) {
            return;
        }
        this.f30399b.addAll(list);
    }

    /* renamed from: a */
    public static StringList m7316a(StringList stringList) {
        return new StringList(stringList != null ? stringList.m7317a() : null);
    }

    /* renamed from: b */
    public static StringList m7315b() {
        return new StringList(null);
    }

    /* renamed from: a */
    public List<String> m7317a() {
        return this.f30399b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9725g.m7285a(this, parcel, i);
    }
}
