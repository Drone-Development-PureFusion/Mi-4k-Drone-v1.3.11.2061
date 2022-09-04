package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import com.google.android.gms.common.util.C4680c;
import com.google.android.gms.common.util.C4693p;
import com.google.android.gms.common.util.C4694q;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public abstract class FastJsonResponse {

    /* loaded from: classes2.dex */
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final C4663a CREATOR = new C4663a();

        /* renamed from: a */
        protected final int f17202a;

        /* renamed from: b */
        protected final boolean f17203b;

        /* renamed from: c */
        protected final int f17204c;

        /* renamed from: d */
        protected final boolean f17205d;

        /* renamed from: e */
        protected final String f17206e;

        /* renamed from: f */
        protected final int f17207f;

        /* renamed from: g */
        protected final Class<? extends FastJsonResponse> f17208g;

        /* renamed from: h */
        protected final String f17209h;

        /* renamed from: i */
        private final int f17210i;

        /* renamed from: j */
        private FieldMappingDictionary f17211j;

        /* renamed from: k */
        private AbstractC4662a<I, O> f17212k;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Field(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, ConverterWrapper converterWrapper) {
            this.f17210i = i;
            this.f17202a = i2;
            this.f17203b = z;
            this.f17204c = i3;
            this.f17205d = z2;
            this.f17206e = str;
            this.f17207f = i4;
            if (str2 == null) {
                this.f17208g = null;
                this.f17209h = null;
            } else {
                this.f17208g = SafeParcelResponse.class;
                this.f17209h = str2;
            }
            if (converterWrapper == null) {
                this.f17212k = null;
            } else {
                this.f17212k = (AbstractC4662a<I, O>) converterWrapper.m23313c();
            }
        }

        protected Field(int i, boolean z, int i2, boolean z2, String str, int i3, Class<? extends FastJsonResponse> cls, AbstractC4662a<I, O> abstractC4662a) {
            this.f17210i = 1;
            this.f17202a = i;
            this.f17203b = z;
            this.f17204c = i2;
            this.f17205d = z2;
            this.f17206e = str;
            this.f17207f = i3;
            this.f17208g = cls;
            if (cls == null) {
                this.f17209h = null;
            } else {
                this.f17209h = cls.getCanonicalName();
            }
            this.f17212k = abstractC4662a;
        }

        /* renamed from: a */
        public static Field<Integer, Integer> m23287a(String str, int i) {
            return new Field<>(0, false, 0, false, str, i, null, null);
        }

        /* renamed from: a */
        public static Field m23286a(String str, int i, AbstractC4662a<?, ?> abstractC4662a, boolean z) {
            return new Field(abstractC4662a.mo23269c(), z, abstractC4662a.mo23268d(), false, str, i, null, abstractC4662a);
        }

        /* renamed from: a */
        public static <T extends FastJsonResponse> Field<T, T> m23285a(String str, int i, Class<T> cls) {
            return new Field<>(11, false, 11, false, str, i, cls, null);
        }

        /* renamed from: b */
        public static Field<Boolean, Boolean> m23283b(String str, int i) {
            return new Field<>(6, false, 6, false, str, i, null, null);
        }

        /* renamed from: b */
        public static <T extends FastJsonResponse> Field<ArrayList<T>, ArrayList<T>> m23282b(String str, int i, Class<T> cls) {
            return new Field<>(11, true, 11, true, str, i, cls, null);
        }

        /* renamed from: c */
        public static Field<String, String> m23280c(String str, int i) {
            return new Field<>(7, false, 7, false, str, i, null, null);
        }

        /* renamed from: a */
        public int m23291a() {
            return this.f17210i;
        }

        /* renamed from: a */
        public I m23288a(O o) {
            return this.f17212k.mo23270a(o);
        }

        /* renamed from: a */
        public void m23289a(FieldMappingDictionary fieldMappingDictionary) {
            this.f17211j = fieldMappingDictionary;
        }

        /* renamed from: b */
        public int m23284b() {
            return this.f17202a;
        }

        /* renamed from: c */
        public boolean m23281c() {
            return this.f17203b;
        }

        /* renamed from: d */
        public int m23279d() {
            return this.f17204c;
        }

        /* renamed from: e */
        public boolean m23278e() {
            return this.f17205d;
        }

        /* renamed from: f */
        public String m23277f() {
            return this.f17206e;
        }

        /* renamed from: g */
        public int m23276g() {
            return this.f17207f;
        }

        /* renamed from: h */
        public Class<? extends FastJsonResponse> m23275h() {
            return this.f17208g;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: i */
        public String m23274i() {
            if (this.f17209h == null) {
                return null;
            }
            return this.f17209h;
        }

        /* renamed from: j */
        public boolean m23273j() {
            return this.f17212k != null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: k */
        public ConverterWrapper m23272k() {
            if (this.f17212k == null) {
                return null;
            }
            return ConverterWrapper.m23315a(this.f17212k);
        }

        /* renamed from: l */
        public Map<String, Field<?, ?>> m23271l() {
            C4588d.m23627a(this.f17209h);
            C4588d.m23627a(this.f17211j);
            return this.f17211j.m23266a(this.f17209h);
        }

        public String toString() {
            C4585c.C4587a m23632a = C4585c.m23635a(this).m23632a("versionCode", Integer.valueOf(this.f17210i)).m23632a("typeIn", Integer.valueOf(this.f17202a)).m23632a("typeInArray", Boolean.valueOf(this.f17203b)).m23632a("typeOut", Integer.valueOf(this.f17204c)).m23632a("typeOutArray", Boolean.valueOf(this.f17205d)).m23632a("outputFieldName", this.f17206e).m23632a("safeParcelFieldId", Integer.valueOf(this.f17207f)).m23632a("concreteTypeName", m23274i());
            Class<? extends FastJsonResponse> m23275h = m23275h();
            if (m23275h != null) {
                m23632a.m23632a("concreteType.class", m23275h.getCanonicalName());
            }
            if (this.f17212k != null) {
                m23632a.m23632a("converterName", this.f17212k.getClass().getCanonicalName());
            }
            return m23632a.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C4663a c4663a = CREATOR;
            C4663a.m23243a(this, parcel, i);
        }
    }

    /* renamed from: com.google.android.gms.common.server.response.FastJsonResponse$a */
    /* loaded from: classes2.dex */
    public interface AbstractC4662a<I, O> {
        /* renamed from: a */
        I mo23270a(O o);

        /* renamed from: c */
        int mo23269c();

        /* renamed from: d */
        int mo23268d();
    }

    /* renamed from: a */
    private void m23297a(StringBuilder sb, Field field, Object obj) {
        if (field.m23284b() == 11) {
            sb.append(field.m23275h().cast(obj).toString());
        } else if (field.m23284b() != 7) {
            sb.append(obj);
        } else {
            sb.append("\"");
            sb.append(C4693p.m23117a((String) obj));
            sb.append("\"");
        }
    }

    /* renamed from: a */
    private void m23296a(StringBuilder sb, Field field, ArrayList<Object> arrayList) {
        sb.append("[");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            Object obj = arrayList.get(i);
            if (obj != null) {
                m23297a(sb, field, obj);
            }
        }
        sb.append("]");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public <O, I> I m23298a(Field<I, O> field, Object obj) {
        return ((Field) field).f17212k != null ? field.m23288a((Field<I, O>) obj) : obj;
    }

    /* renamed from: a */
    protected abstract Object mo23257a(String str);

    /* renamed from: a */
    protected boolean mo9534a(Field field) {
        return field.m23279d() == 11 ? field.m23278e() ? m23293d(field.m23277f()) : m23295c(field.m23277f()) : mo23248b(field.m23277f());
    }

    /* renamed from: b */
    protected Object mo9533b(Field field) {
        String m23277f = field.m23277f();
        if (field.m23275h() != null) {
            C4588d.m23621a(mo23257a(field.m23277f()) == null, "Concrete field shouldn't be value object: %s", field.m23277f());
            HashMap<String, Object> m23292e = field.m23278e() ? m23292e() : m23294d();
            if (m23292e != null) {
                return m23292e.get(m23277f);
            }
            try {
                char upperCase = Character.toUpperCase(m23277f.charAt(0));
                String valueOf = String.valueOf(m23277f.substring(1));
                return getClass().getMethod(new StringBuilder(String.valueOf(valueOf).length() + 4).append("get").append(upperCase).append(valueOf).toString(), new Class[0]).invoke(this, new Object[0]);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return mo23257a(field.m23277f());
    }

    /* renamed from: b */
    protected abstract boolean mo23248b(String str);

    /* renamed from: c */
    public abstract Map<String, Field<?, ?>> mo9532c();

    /* renamed from: c */
    protected boolean m23295c(String str) {
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    /* renamed from: d */
    public HashMap<String, Object> m23294d() {
        return null;
    }

    /* renamed from: d */
    protected boolean m23293d(String str) {
        throw new UnsupportedOperationException("Concrete type arrays not supported");
    }

    /* renamed from: e */
    public HashMap<String, Object> m23292e() {
        return null;
    }

    public String toString() {
        Map<String, Field<?, ?>> mo9532c = mo9532c();
        StringBuilder sb = new StringBuilder(100);
        for (String str : mo9532c.keySet()) {
            Field<?, ?> field = mo9532c.get(str);
            if (mo9534a(field)) {
                Object m23298a = m23298a(field, mo9533b(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                sb.append("\"").append(str).append("\":");
                if (m23298a == null) {
                    sb.append("null");
                } else {
                    switch (field.m23279d()) {
                        case 8:
                            sb.append("\"").append(C4680c.m23160a((byte[]) m23298a)).append("\"");
                            continue;
                        case 9:
                            sb.append("\"").append(C4680c.m23159b((byte[]) m23298a)).append("\"");
                            continue;
                        case 10:
                            C4694q.m23116a(sb, (HashMap) m23298a);
                            continue;
                        default:
                            if (field.m23281c()) {
                                m23296a(sb, (Field) field, (ArrayList) m23298a);
                                break;
                            } else {
                                m23297a(sb, field, m23298a);
                                continue;
                            }
                    }
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }
}
