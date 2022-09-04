package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class FieldMappingDictionary extends AbstractSafeParcelable {
    public static final C4665c CREATOR = new C4665c();

    /* renamed from: a */
    private final int f17213a;

    /* renamed from: b */
    private final HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> f17214b;

    /* renamed from: c */
    private final ArrayList<Entry> f17215c = null;

    /* renamed from: d */
    private final String f17216d;

    /* loaded from: classes2.dex */
    public static class Entry extends AbstractSafeParcelable {
        public static final C4666d CREATOR = new C4666d();

        /* renamed from: a */
        final int f17217a;

        /* renamed from: b */
        final String f17218b;

        /* renamed from: c */
        final ArrayList<FieldMapPair> f17219c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Entry(int i, String str, ArrayList<FieldMapPair> arrayList) {
            this.f17217a = i;
            this.f17218b = str;
            this.f17219c = arrayList;
        }

        Entry(String str, Map<String, FastJsonResponse.Field<?, ?>> map) {
            this.f17217a = 1;
            this.f17218b = str;
            this.f17219c = m23260a(map);
        }

        /* renamed from: a */
        private static ArrayList<FieldMapPair> m23260a(Map<String, FastJsonResponse.Field<?, ?>> map) {
            if (map == null) {
                return null;
            }
            ArrayList<FieldMapPair> arrayList = new ArrayList<>();
            for (String str : map.keySet()) {
                arrayList.add(new FieldMapPair(str, map.get(str)));
            }
            return arrayList;
        }

        /* renamed from: a */
        HashMap<String, FastJsonResponse.Field<?, ?>> m23261a() {
            HashMap<String, FastJsonResponse.Field<?, ?>> hashMap = new HashMap<>();
            int size = this.f17219c.size();
            for (int i = 0; i < size; i++) {
                FieldMapPair fieldMapPair = this.f17219c.get(i);
                hashMap.put(fieldMapPair.f17221b, fieldMapPair.f17222c);
            }
            return hashMap;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C4666d c4666d = CREATOR;
            C4666d.m23234a(this, parcel, i);
        }
    }

    /* loaded from: classes2.dex */
    public static class FieldMapPair extends AbstractSafeParcelable {
        public static final C4664b CREATOR = new C4664b();

        /* renamed from: a */
        final int f17220a;

        /* renamed from: b */
        final String f17221b;

        /* renamed from: c */
        final FastJsonResponse.Field<?, ?> f17222c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public FieldMapPair(int i, String str, FastJsonResponse.Field<?, ?> field) {
            this.f17220a = i;
            this.f17221b = str;
            this.f17222c = field;
        }

        FieldMapPair(String str, FastJsonResponse.Field<?, ?> field) {
            this.f17220a = 1;
            this.f17221b = str;
            this.f17222c = field;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C4664b c4664b = CREATOR;
            C4664b.m23240a(this, parcel, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FieldMappingDictionary(int i, ArrayList<Entry> arrayList, String str) {
        this.f17213a = i;
        this.f17214b = m23265a(arrayList);
        this.f17216d = (String) C4588d.m23627a(str);
        m23267a();
    }

    /* renamed from: a */
    private static HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> m23265a(ArrayList<Entry> arrayList) {
        HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> hashMap = new HashMap<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Entry entry = arrayList.get(i);
            hashMap.put(entry.f17218b, entry.m23261a());
        }
        return hashMap;
    }

    /* renamed from: a */
    public Map<String, FastJsonResponse.Field<?, ?>> m23266a(String str) {
        return this.f17214b.get(str);
    }

    /* renamed from: a */
    public void m23267a() {
        for (String str : this.f17214b.keySet()) {
            Map<String, FastJsonResponse.Field<?, ?>> map = this.f17214b.get(str);
            for (String str2 : map.keySet()) {
                map.get(str2).m23289a(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m23264b() {
        return this.f17213a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public ArrayList<Entry> m23263c() {
        ArrayList<Entry> arrayList = new ArrayList<>();
        for (String str : this.f17214b.keySet()) {
            arrayList.add(new Entry(str, this.f17214b.get(str)));
        }
        return arrayList;
    }

    /* renamed from: d */
    public String m23262d() {
        return this.f17216d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f17214b.keySet()) {
            sb.append(str).append(":\n");
            Map<String, FastJsonResponse.Field<?, ?>> map = this.f17214b.get(str);
            for (String str2 : map.keySet()) {
                sb.append("  ").append(str2).append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4665c c4665c = CREATOR;
        C4665c.m23237a(this, parcel, i);
    }
}
