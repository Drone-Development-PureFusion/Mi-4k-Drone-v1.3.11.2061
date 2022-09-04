package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class AppVisibleCustomProperties extends AbstractSafeParcelable implements ReflectedParcelable, Iterable<CustomProperty> {
    public static final Parcelable.Creator<AppVisibleCustomProperties> CREATOR = new C5002a();

    /* renamed from: a */
    public static final AppVisibleCustomProperties f17988a = new C5001a().m22161a();

    /* renamed from: b */
    final int f17989b;

    /* renamed from: c */
    final List<CustomProperty> f17990c;

    /* renamed from: com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties$a */
    /* loaded from: classes2.dex */
    public static class C5001a {

        /* renamed from: a */
        private final Map<CustomPropertyKey, CustomProperty> f17991a = new HashMap();

        /* renamed from: a */
        public C5001a m22160a(CustomPropertyKey customPropertyKey, String str) {
            C4588d.m23626a(customPropertyKey, "key");
            this.f17991a.put(customPropertyKey, new CustomProperty(customPropertyKey, str));
            return this;
        }

        /* renamed from: a */
        public C5001a m22159a(CustomProperty customProperty) {
            C4588d.m23626a(customProperty, "property");
            this.f17991a.put(customProperty.m22158a(), customProperty);
            return this;
        }

        /* renamed from: a */
        public AppVisibleCustomProperties m22161a() {
            return new AppVisibleCustomProperties(this.f17991a.values());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppVisibleCustomProperties(int i, Collection<CustomProperty> collection) {
        this.f17989b = i;
        C4588d.m23627a(collection);
        this.f17990c = new ArrayList(collection);
    }

    private AppVisibleCustomProperties(Collection<CustomProperty> collection) {
        this(1, collection);
    }

    /* renamed from: a */
    public Map<CustomPropertyKey, String> m22162a() {
        HashMap hashMap = new HashMap(this.f17990c.size());
        for (CustomProperty customProperty : this.f17990c) {
            hashMap.put(customProperty.m22158a(), customProperty.m22157b());
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            return m22162a().equals(((AppVisibleCustomProperties) obj).m22162a());
        }
        return false;
    }

    public int hashCode() {
        return C4585c.m23633a(this.f17990c);
    }

    @Override // java.lang.Iterable
    public Iterator<CustomProperty> iterator() {
        return this.f17990c.iterator();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5002a.m22143a(this, parcel, i);
    }
}
