package com.google.android.gms.fitness.data;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4631c;
import p005b.p006a.p007a.p029b.p052m.p053a.C0612f;
/* loaded from: classes2.dex */
public class DataSource extends AbstractSafeParcelable {

    /* renamed from: a */
    public static final String f18404a = "vnd.google.fitness.data_source";

    /* renamed from: b */
    public static final int f18405b = 0;

    /* renamed from: c */
    public static final int f18406c = 1;

    /* renamed from: e */
    private final int f18408e;

    /* renamed from: f */
    private final DataType f18409f;

    /* renamed from: g */
    private final String f18410g;

    /* renamed from: h */
    private final int f18411h;

    /* renamed from: i */
    private final Device f18412i;

    /* renamed from: j */
    private final Application f18413j;

    /* renamed from: k */
    private final String f18414k;

    /* renamed from: l */
    private final int[] f18415l;

    /* renamed from: m */
    private final String f18416m;

    /* renamed from: d */
    private static final int[] f18407d = new int[0];
    public static final Parcelable.Creator<DataSource> CREATOR = new C5156n();

    /* renamed from: com.google.android.gms.fitness.data.DataSource$a */
    /* loaded from: classes2.dex */
    public static final class C5131a {

        /* renamed from: a */
        private DataType f18417a;

        /* renamed from: c */
        private String f18419c;

        /* renamed from: d */
        private Device f18420d;

        /* renamed from: e */
        private Application f18421e;

        /* renamed from: b */
        private int f18418b = -1;

        /* renamed from: f */
        private String f18422f = "";

        /* renamed from: g */
        static /* synthetic */ int[] m21660g(C5131a c5131a) {
            return null;
        }

        /* renamed from: a */
        public C5131a m21673a(int i) {
            this.f18418b = i;
            return this;
        }

        /* renamed from: a */
        public C5131a m21672a(Context context) {
            return m21666b(context.getPackageName());
        }

        /* renamed from: a */
        public C5131a m21670a(DataType dataType) {
            this.f18417a = dataType;
            return this;
        }

        /* renamed from: a */
        public C5131a m21669a(Device device) {
            this.f18420d = device;
            return this;
        }

        /* renamed from: a */
        public C5131a m21668a(String str) {
            this.f18419c = str;
            return this;
        }

        /* renamed from: a */
        public DataSource m21674a() {
            boolean z = true;
            C4588d.m23622a(this.f18417a != null, "Must set data type");
            if (this.f18418b < 0) {
                z = false;
            }
            C4588d.m23622a(z, "Must set data source type");
            return new DataSource(this);
        }

        /* renamed from: b */
        public C5131a m21666b(String str) {
            this.f18421e = Application.m21763a(str);
            return this;
        }

        /* renamed from: c */
        public C5131a m21664c(String str) {
            C4588d.m23618b(str != null, "Must specify a valid stream name");
            this.f18422f = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataSource(int i, DataType dataType, String str, int i2, Device device, Application application, String str2, int[] iArr) {
        this.f18408e = i;
        this.f18409f = dataType;
        this.f18411h = i2;
        this.f18410g = str;
        this.f18412i = device;
        this.f18413j = application;
        this.f18414k = str2;
        this.f18416m = m21676l();
        this.f18415l = iArr == null ? f18407d : iArr;
    }

    private DataSource(C5131a c5131a) {
        this.f18408e = 3;
        this.f18409f = c5131a.f18417a;
        this.f18411h = c5131a.f18418b;
        this.f18410g = c5131a.f18419c;
        this.f18412i = c5131a.f18420d;
        this.f18413j = c5131a.f18421e;
        this.f18414k = c5131a.f18422f;
        this.f18416m = m21676l();
        this.f18415l = C5131a.m21660g(c5131a);
    }

    /* renamed from: a */
    public static DataSource m21689a(Intent intent) {
        if (intent == null) {
            return null;
        }
        return (DataSource) C4631c.m23445a(intent, f18404a, CREATOR);
    }

    /* renamed from: a */
    public static String m21690a(int i) {
        switch (i) {
            case 0:
                return "r";
            case 1:
                return C0612f.f1063a;
            case 2:
                return "c";
            case 3:
                return "v";
            default:
                throw new IllegalArgumentException(new StringBuilder(29).append("invalid type value").append(i).toString());
        }
    }

    /* renamed from: a */
    private boolean m21688a(DataSource dataSource) {
        return this.f18416m.equals(dataSource.f18416m);
    }

    /* renamed from: b */
    public static String m21686b(int i) {
        switch (i) {
            case 1:
                return "blood_pressure_esh2002";
            case 2:
                return "blood_pressure_esh2010";
            case 3:
                return "blood_pressure_aami";
            case 4:
                return "blood_pressure_bhs_a_a";
            case 5:
                return "blood_pressure_bhs_a_b";
            case 6:
                return "blood_pressure_bhs_b_a";
            case 7:
                return "blood_pressure_bhs_b_b";
            case 8:
                return "blood_glucose_iso151972003";
            case 9:
                return "blood_glucose_iso151972013";
            default:
                throw new IllegalArgumentException(new StringBuilder(47).append("invalid data quality standard value ").append(i).toString());
        }
    }

    /* renamed from: l */
    private String m21676l() {
        StringBuilder sb = new StringBuilder();
        sb.append(m21675m());
        sb.append(":").append(this.f18409f.m21659a());
        if (this.f18413j != null) {
            sb.append(":").append(this.f18413j.m21765a());
        }
        if (this.f18412i != null) {
            sb.append(":").append(this.f18412i.m21632g());
        }
        if (this.f18414k != null) {
            sb.append(":").append(this.f18414k);
        }
        return sb.toString();
    }

    /* renamed from: m */
    private String m21675m() {
        switch (this.f18411h) {
            case 0:
                return "raw";
            case 1:
                return "derived";
            case 2:
                return "cleaned";
            case 3:
                return "converted";
            default:
                throw new IllegalArgumentException("invalid type value");
        }
    }

    /* renamed from: a */
    public DataType m21691a() {
        return this.f18409f;
    }

    /* renamed from: b */
    public int m21687b() {
        return this.f18411h;
    }

    /* renamed from: c */
    public String m21685c() {
        return this.f18410g;
    }

    /* renamed from: d */
    public String m21684d() {
        if (this.f18413j == null) {
            return null;
        }
        return this.f18413j.m21765a();
    }

    /* renamed from: e */
    public Application m21683e() {
        return this.f18413j;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DataSource) && m21688a((DataSource) obj));
    }

    /* renamed from: f */
    public Device m21682f() {
        return this.f18412i;
    }

    /* renamed from: g */
    public String m21681g() {
        return this.f18414k;
    }

    /* renamed from: h */
    public int[] m21680h() {
        return this.f18415l;
    }

    public int hashCode() {
        return this.f18416m.hashCode();
    }

    /* renamed from: i */
    public String m21679i() {
        return this.f18416m;
    }

    /* renamed from: j */
    public String m21678j() {
        String concat;
        String str;
        String str2;
        String valueOf = String.valueOf(m21690a(this.f18411h));
        String valueOf2 = String.valueOf(this.f18409f.m21654c());
        if (this.f18413j == null) {
            concat = "";
        } else if (this.f18413j.equals(Application.f18368a)) {
            concat = ":gms";
        } else {
            String valueOf3 = String.valueOf(this.f18413j.m21765a());
            concat = valueOf3.length() != 0 ? ":".concat(valueOf3) : new String(":");
        }
        if (this.f18412i != null) {
            String valueOf4 = String.valueOf(this.f18412i.m21638b());
            String valueOf5 = String.valueOf(this.f18412i.m21635d());
            str = new StringBuilder(String.valueOf(valueOf4).length() + 2 + String.valueOf(valueOf5).length()).append(":").append(valueOf4).append(":").append(valueOf5).toString();
        } else {
            str = "";
        }
        if (this.f18414k != null) {
            String valueOf6 = String.valueOf(this.f18414k);
            str2 = valueOf6.length() != 0 ? ":".concat(valueOf6) : new String(":");
        } else {
            str2 = "";
        }
        return new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length() + String.valueOf(concat).length() + String.valueOf(str).length() + String.valueOf(str2).length()).append(valueOf).append(":").append(valueOf2).append(concat).append(str).append(str2).toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int m21677k() {
        return this.f18408e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DataSource{");
        sb.append(m21675m());
        if (this.f18410g != null) {
            sb.append(":").append(this.f18410g);
        }
        if (this.f18413j != null) {
            sb.append(":").append(this.f18413j);
        }
        if (this.f18412i != null) {
            sb.append(":").append(this.f18412i);
        }
        if (this.f18414k != null) {
            sb.append(":").append(this.f18414k);
        }
        sb.append(":").append(this.f18409f);
        return sb.append("}").toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5156n.m21442a(this, parcel, i);
    }
}
