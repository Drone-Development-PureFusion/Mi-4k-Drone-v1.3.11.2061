package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.util.SparseArray;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.C4679b;
import com.google.android.gms.common.util.C4680c;
import com.google.android.gms.common.util.C4693p;
import com.google.android.gms.common.util.C4694q;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p005b.p006a.p007a.p029b.C0494h;
/* loaded from: classes2.dex */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final C4667e CREATOR = new C4667e();

    /* renamed from: a */
    private final int f17223a;

    /* renamed from: b */
    private final Parcel f17224b;

    /* renamed from: c */
    private final int f17225c = 2;

    /* renamed from: d */
    private final FieldMappingDictionary f17226d;

    /* renamed from: e */
    private final String f17227e;

    /* renamed from: f */
    private int f17228f;

    /* renamed from: g */
    private int f17229g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SafeParcelResponse(int i, Parcel parcel, FieldMappingDictionary fieldMappingDictionary) {
        this.f17223a = i;
        this.f17224b = (Parcel) C4588d.m23627a(parcel);
        this.f17226d = fieldMappingDictionary;
        if (this.f17226d == null) {
            this.f17227e = null;
        } else {
            this.f17227e = this.f17226d.m23262d();
        }
        this.f17228f = 2;
    }

    /* renamed from: a */
    private static SparseArray<Map.Entry<String, FastJsonResponse.Field<?, ?>>> m23250a(Map<String, FastJsonResponse.Field<?, ?>> map) {
        SparseArray<Map.Entry<String, FastJsonResponse.Field<?, ?>>> sparseArray = new SparseArray<>();
        for (Map.Entry<String, FastJsonResponse.Field<?, ?>> entry : map.entrySet()) {
            sparseArray.put(entry.getValue().m23276g(), entry);
        }
        return sparseArray;
    }

    /* renamed from: a */
    public static HashMap<String, String> m23258a(Bundle bundle) {
        HashMap<String, String> hashMap = new HashMap<>();
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getString(str));
        }
        return hashMap;
    }

    /* renamed from: a */
    private void m23256a(StringBuilder sb, int i, Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"").append(C4693p.m23117a(obj.toString())).append("\"");
                return;
            case 8:
                sb.append("\"").append(C4680c.m23160a((byte[]) obj)).append("\"");
                return;
            case 9:
                sb.append("\"").append(C4680c.m23159b((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                C4694q.m23116a(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException(new StringBuilder(26).append("Unknown type = ").append(i).toString());
        }
    }

    /* renamed from: a */
    private void m23255a(StringBuilder sb, FastJsonResponse.Field<?, ?> field, Parcel parcel, int i) {
        switch (field.m23279d()) {
            case 0:
                m23254a(sb, field, a(field, Integer.valueOf(C4628a.m23500g(parcel, i))));
                return;
            case 1:
                m23254a(sb, field, a(field, C4628a.m23496k(parcel, i)));
                return;
            case 2:
                m23254a(sb, field, a(field, Long.valueOf(C4628a.m23498i(parcel, i))));
                return;
            case 3:
                m23254a(sb, field, a(field, Float.valueOf(C4628a.m23495l(parcel, i))));
                return;
            case 4:
                m23254a(sb, field, a(field, Double.valueOf(C4628a.m23493n(parcel, i))));
                return;
            case 5:
                m23254a(sb, field, a(field, C4628a.m23491p(parcel, i)));
                return;
            case 6:
                m23254a(sb, field, a(field, Boolean.valueOf(C4628a.m23505c(parcel, i))));
                return;
            case 7:
                m23254a(sb, field, a(field, C4628a.m23490q(parcel, i)));
                return;
            case 8:
            case 9:
                m23254a(sb, field, a(field, C4628a.m23487t(parcel, i)));
                return;
            case 10:
                m23254a(sb, field, a(field, m23258a(C4628a.m23488s(parcel, i))));
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException(new StringBuilder(36).append("Unknown field out type = ").append(field.m23279d()).toString());
        }
    }

    /* renamed from: a */
    private void m23254a(StringBuilder sb, FastJsonResponse.Field<?, ?> field, Object obj) {
        if (field.m23281c()) {
            m23253a(sb, field, (ArrayList) obj);
        } else {
            m23256a(sb, field.m23284b(), obj);
        }
    }

    /* renamed from: a */
    private void m23253a(StringBuilder sb, FastJsonResponse.Field<?, ?> field, ArrayList<?> arrayList) {
        sb.append("[");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            m23256a(sb, field.m23284b(), arrayList.get(i));
        }
        sb.append("]");
    }

    /* renamed from: a */
    private void m23252a(StringBuilder sb, String str, FastJsonResponse.Field<?, ?> field, Parcel parcel, int i) {
        sb.append("\"").append(str).append("\":");
        if (field.m23273j()) {
            m23255a(sb, field, parcel, i);
        } else {
            m23247b(sb, field, parcel, i);
        }
    }

    /* renamed from: a */
    private void m23251a(StringBuilder sb, Map<String, FastJsonResponse.Field<?, ?>> map, Parcel parcel) {
        SparseArray<Map.Entry<String, FastJsonResponse.Field<?, ?>>> m23250a = m23250a(map);
        sb.append(C0494h.f734v);
        int m23508b = C4628a.m23508b(parcel);
        boolean z = false;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            Map.Entry<String, FastJsonResponse.Field<?, ?>> entry = m23250a.get(C4628a.m23515a(m23514a));
            if (entry != null) {
                if (z) {
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                m23252a(sb, entry.getKey(), entry.getValue(), parcel, m23514a);
                z = true;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        sb.append(C0494h.f735w);
    }

    /* renamed from: b */
    private void m23247b(StringBuilder sb, FastJsonResponse.Field<?, ?> field, Parcel parcel, int i) {
        if (field.m23278e()) {
            sb.append("[");
            switch (field.m23279d()) {
                case 0:
                    C4679b.m23170a(sb, C4628a.m23484w(parcel, i));
                    break;
                case 1:
                    C4679b.m23168a(sb, C4628a.m23482y(parcel, i));
                    break;
                case 2:
                    C4679b.m23169a(sb, C4628a.m23483x(parcel, i));
                    break;
                case 3:
                    C4679b.m23171a(sb, C4628a.m23481z(parcel, i));
                    break;
                case 4:
                    C4679b.m23172a(sb, C4628a.m23522A(parcel, i));
                    break;
                case 5:
                    C4679b.m23168a(sb, C4628a.m23521B(parcel, i));
                    break;
                case 6:
                    C4679b.m23166a(sb, C4628a.m23485v(parcel, i));
                    break;
                case 7:
                    C4679b.m23167a(sb, C4628a.m23520C(parcel, i));
                    break;
                case 8:
                case 9:
                case 10:
                    throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                case 11:
                    Parcel[] m23516G = C4628a.m23516G(parcel, i);
                    int length = m23516G.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (i2 > 0) {
                            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                        }
                        m23516G[i2].setDataPosition(0);
                        m23251a(sb, field.m23271l(), m23516G[i2]);
                    }
                    break;
                default:
                    throw new IllegalStateException("Unknown field type out.");
            }
            sb.append("]");
            return;
        }
        switch (field.m23279d()) {
            case 0:
                sb.append(C4628a.m23500g(parcel, i));
                return;
            case 1:
                sb.append(C4628a.m23496k(parcel, i));
                return;
            case 2:
                sb.append(C4628a.m23498i(parcel, i));
                return;
            case 3:
                sb.append(C4628a.m23495l(parcel, i));
                return;
            case 4:
                sb.append(C4628a.m23493n(parcel, i));
                return;
            case 5:
                sb.append(C4628a.m23491p(parcel, i));
                return;
            case 6:
                sb.append(C4628a.m23505c(parcel, i));
                return;
            case 7:
                sb.append("\"").append(C4693p.m23117a(C4628a.m23490q(parcel, i))).append("\"");
                return;
            case 8:
                sb.append("\"").append(C4680c.m23160a(C4628a.m23487t(parcel, i))).append("\"");
                return;
            case 9:
                sb.append("\"").append(C4680c.m23159b(C4628a.m23487t(parcel, i)));
                sb.append("\"");
                return;
            case 10:
                Bundle m23488s = C4628a.m23488s(parcel, i);
                Set<String> keySet = m23488s.keySet();
                keySet.size();
                sb.append("{");
                boolean z = true;
                for (String str : keySet) {
                    if (!z) {
                        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    }
                    sb.append("\"").append(str).append("\"");
                    sb.append(":");
                    sb.append("\"").append(C4693p.m23117a(m23488s.getString(str))).append("\"");
                    z = false;
                }
                sb.append("}");
                return;
            case 11:
                Parcel m23517F = C4628a.m23517F(parcel, i);
                m23517F.setDataPosition(0);
                m23251a(sb, field.m23271l(), m23517F);
                return;
            default:
                throw new IllegalStateException("Unknown field type out");
        }
    }

    /* renamed from: a */
    public int m23259a() {
        return this.f17223a;
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: a */
    public Object mo23257a(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    /* renamed from: b */
    public Parcel m23249b() {
        switch (this.f17228f) {
            case 0:
                this.f17229g = C4630b.m23480a(this.f17224b);
                C4630b.m23479a(this.f17224b, this.f17229g);
                this.f17228f = 2;
                break;
            case 1:
                C4630b.m23479a(this.f17224b, this.f17229g);
                this.f17228f = 2;
                break;
        }
        return this.f17224b;
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: b */
    public boolean mo23248b(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: c */
    public Map<String, FastJsonResponse.Field<?, ?>> mo9532c() {
        if (this.f17226d == null) {
            return null;
        }
        return this.f17226d.m23266a(this.f17227e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public FieldMappingDictionary m23246f() {
        switch (this.f17225c) {
            case 0:
                return null;
            case 1:
                return this.f17226d;
            case 2:
                return this.f17226d;
            default:
                throw new IllegalStateException(new StringBuilder(34).append("Invalid creation type: ").append(this.f17225c).toString());
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public String toString() {
        C4588d.m23626a(this.f17226d, "Cannot convert to JSON on client side.");
        Parcel m23249b = m23249b();
        m23249b.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        m23251a(sb, this.f17226d.m23266a(this.f17227e), m23249b);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4667e c4667e = CREATOR;
        C4667e.m23231a(this, parcel, i);
    }
}
