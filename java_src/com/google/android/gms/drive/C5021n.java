package com.google.android.gms.drive;

import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.drive.metadata.AbstractC4991a;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.ajw;
import com.google.android.gms.internal.ajy;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
/* renamed from: com.google.android.gms.drive.n */
/* loaded from: classes2.dex */
public final class C5021n {

    /* renamed from: a */
    public static final int f18007a = 131072;

    /* renamed from: b */
    public static final int f18008b = 124;

    /* renamed from: c */
    public static final int f18009c = 30;

    /* renamed from: d */
    public static final int f18010d = 30;

    /* renamed from: e */
    public static final int f18011e = 100;

    /* renamed from: f */
    public static final C5021n f18012f = new C5021n(MetadataBundle.m22156a());

    /* renamed from: g */
    private final MetadataBundle f18013g;

    /* renamed from: com.google.android.gms.drive.n$a */
    /* loaded from: classes2.dex */
    public static class C5022a {

        /* renamed from: a */
        private final MetadataBundle f18014a = MetadataBundle.m22156a();

        /* renamed from: b */
        private AppVisibleCustomProperties.C5001a f18015b;

        /* renamed from: a */
        private String m22075a(String str, int i, int i2) {
            return String.format("%s must be no more than %d bytes, but is %d bytes.", str, Integer.valueOf(i), Integer.valueOf(i2));
        }

        /* renamed from: b */
        private AppVisibleCustomProperties.C5001a m22072b() {
            if (this.f18015b == null) {
                this.f18015b = new AppVisibleCustomProperties.C5001a();
            }
            return this.f18015b;
        }

        /* renamed from: b */
        private void m22070b(String str, int i, int i2) {
            C4588d.m23618b(i2 <= i, m22075a(str, i, i2));
        }

        /* renamed from: e */
        private int m22065e(String str) {
            if (str == null) {
                return 0;
            }
            return str.getBytes().length;
        }

        /* renamed from: a */
        public C5022a m22078a(CustomPropertyKey customPropertyKey) {
            C4588d.m23626a(customPropertyKey, "key");
            m22072b().m22160a(customPropertyKey, null);
            return this;
        }

        /* renamed from: a */
        public C5022a m22077a(CustomPropertyKey customPropertyKey, String str) {
            C4588d.m23626a(customPropertyKey, "key");
            C4588d.m23626a(str, (Object) "value");
            m22070b("The total size of key string and value string of a custom property", 124, m22065e(customPropertyKey.m22175a()) + m22065e(str));
            m22072b().m22160a(customPropertyKey, str);
            return this;
        }

        /* renamed from: a */
        public C5022a m22076a(String str) {
            this.f18014a.m22150b(ajw.f22076d, str);
            return this;
        }

        /* renamed from: a */
        public C5022a m22074a(Date date) {
            this.f18014a.m22150b(ajy.f22101b, date);
            return this;
        }

        /* renamed from: a */
        public C5022a m22073a(boolean z) {
            this.f18014a.m22150b(ajw.f22088p, Boolean.valueOf(z));
            return this;
        }

        /* renamed from: a */
        public C5021n m22079a() {
            if (this.f18015b != null) {
                this.f18014a.m22150b(ajw.f22075c, this.f18015b.m22161a());
            }
            return new C5021n(this.f18014a);
        }

        /* renamed from: b */
        public C5022a m22071b(String str) {
            m22070b("Indexable text size", 131072, m22065e(str));
            this.f18014a.m22150b(ajw.f22082j, str);
            return this;
        }

        /* renamed from: b */
        public C5022a m22069b(boolean z) {
            this.f18014a.m22150b(ajw.f22060E, Boolean.valueOf(z));
            return this;
        }

        /* renamed from: c */
        public C5022a m22068c(String str) {
            this.f18014a.m22150b(ajw.f22096x, str);
            return this;
        }

        /* renamed from: c */
        public C5022a m22067c(boolean z) {
            this.f18014a.m22150b(ajw.f22095w, Boolean.valueOf(z));
            return this;
        }

        /* renamed from: d */
        public C5022a m22066d(String str) {
            this.f18014a.m22150b(ajw.f22062G, str);
            return this;
        }
    }

    public C5021n(MetadataBundle metadataBundle) {
        this.f18013g = metadataBundle.m22152b();
    }

    /* renamed from: a */
    public <T> C5021n m22090a(AbstractC4991a<T> abstractC4991a, T t) {
        C5021n m22080k = m22080k();
        m22080k.m22081j().m22150b(abstractC4991a, t);
        return m22080k;
    }

    /* renamed from: a */
    public Map<CustomPropertyKey, String> m22091a() {
        AppVisibleCustomProperties appVisibleCustomProperties = (AppVisibleCustomProperties) this.f18013g.m22154a(ajw.f22075c);
        return appVisibleCustomProperties == null ? Collections.emptyMap() : appVisibleCustomProperties.m22162a();
    }

    /* renamed from: b */
    public String m22089b() {
        return (String) this.f18013g.m22154a(ajw.f22076d);
    }

    /* renamed from: c */
    public String m22088c() {
        return (String) this.f18013g.m22154a(ajw.f22082j);
    }

    /* renamed from: d */
    public Date m22087d() {
        return (Date) this.f18013g.m22154a(ajy.f22101b);
    }

    /* renamed from: e */
    public String m22086e() {
        return (String) this.f18013g.m22154a(ajw.f22096x);
    }

    /* renamed from: f */
    public String m22085f() {
        return (String) this.f18013g.m22154a(ajw.f22062G);
    }

    /* renamed from: g */
    public Boolean m22084g() {
        return (Boolean) this.f18013g.m22154a(ajw.f22088p);
    }

    /* renamed from: h */
    public Boolean m22083h() {
        return (Boolean) this.f18013g.m22154a(ajw.f22060E);
    }

    /* renamed from: i */
    public Boolean m22082i() {
        return (Boolean) this.f18013g.m22154a(ajw.f22095w);
    }

    /* renamed from: j */
    public MetadataBundle m22081j() {
        return this.f18013g;
    }

    /* renamed from: k */
    public C5021n m22080k() {
        return new C5021n(m22081j());
    }
}
