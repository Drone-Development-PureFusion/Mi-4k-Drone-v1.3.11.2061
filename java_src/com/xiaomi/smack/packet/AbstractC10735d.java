package com.xiaomi.smack.packet;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.smack.util.C10749d;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
/* renamed from: com.xiaomi.smack.packet.d */
/* loaded from: classes.dex */
public abstract class AbstractC10735d {

    /* renamed from: f */
    private String f33485f;

    /* renamed from: g */
    private String f33486g;

    /* renamed from: h */
    private String f33487h;

    /* renamed from: i */
    private String f33488i;

    /* renamed from: j */
    private String f33489j;

    /* renamed from: k */
    private String f33490k;

    /* renamed from: l */
    private List<C10731a> f33491l;

    /* renamed from: m */
    private final Map<String, Object> f33492m;

    /* renamed from: n */
    private C10741h f33493n;

    /* renamed from: a */
    protected static final String f33480a = Locale.getDefault().getLanguage().toLowerCase();

    /* renamed from: c */
    private static String f33482c = null;

    /* renamed from: b */
    public static final DateFormat f33481b = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

    /* renamed from: d */
    private static String f33483d = C10749d.m3839a(5) + Constants.ACCEPT_TIME_SEPARATOR_SERVER;

    /* renamed from: e */
    private static long f33484e = 0;

    static {
        f33481b.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    public AbstractC10735d() {
        this.f33485f = f33482c;
        this.f33486g = null;
        this.f33487h = null;
        this.f33488i = null;
        this.f33489j = null;
        this.f33490k = null;
        this.f33491l = new CopyOnWriteArrayList();
        this.f33492m = new HashMap();
        this.f33493n = null;
    }

    public AbstractC10735d(Bundle bundle) {
        this.f33485f = f33482c;
        this.f33486g = null;
        this.f33487h = null;
        this.f33488i = null;
        this.f33489j = null;
        this.f33490k = null;
        this.f33491l = new CopyOnWriteArrayList();
        this.f33492m = new HashMap();
        this.f33493n = null;
        this.f33487h = bundle.getString("ext_to");
        this.f33488i = bundle.getString("ext_from");
        this.f33489j = bundle.getString("ext_chid");
        this.f33486g = bundle.getString("ext_pkt_id");
        Parcelable[] parcelableArray = bundle.getParcelableArray("ext_exts");
        if (parcelableArray != null) {
            this.f33491l = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                C10731a m3923a = C10731a.m3923a((Bundle) parcelable);
                if (m3923a != null) {
                    this.f33491l.add(m3923a);
                }
            }
        }
        Bundle bundle2 = bundle.getBundle("ext_ERROR");
        if (bundle2 != null) {
            this.f33493n = new C10741h(bundle2);
        }
    }

    /* renamed from: j */
    public static synchronized String m3887j() {
        String sb;
        synchronized (AbstractC10735d.class) {
            StringBuilder append = new StringBuilder().append(f33483d);
            long j = f33484e;
            f33484e = 1 + j;
            sb = append.append(Long.toString(j)).toString();
        }
        return sb;
    }

    /* renamed from: u */
    public static String m3869u() {
        return f33480a;
    }

    /* renamed from: a */
    public void m3890a(C10731a c10731a) {
        this.f33491l.add(c10731a);
    }

    /* renamed from: a */
    public void m3889a(C10741h c10741h) {
        this.f33493n = c10741h;
    }

    /* renamed from: b */
    public Bundle mo3863b() {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(this.f33485f)) {
            bundle.putString("ext_ns", this.f33485f);
        }
        if (!TextUtils.isEmpty(this.f33488i)) {
            bundle.putString("ext_from", this.f33488i);
        }
        if (!TextUtils.isEmpty(this.f33487h)) {
            bundle.putString("ext_to", this.f33487h);
        }
        if (!TextUtils.isEmpty(this.f33486g)) {
            bundle.putString("ext_pkt_id", this.f33486g);
        }
        if (!TextUtils.isEmpty(this.f33489j)) {
            bundle.putString("ext_chid", this.f33489j);
        }
        if (this.f33493n != null) {
            bundle.putBundle("ext_ERROR", this.f33493n.m3861a());
        }
        if (this.f33491l != null) {
            Bundle[] bundleArr = new Bundle[this.f33491l.size()];
            int i = 0;
            Iterator<C10731a> it2 = this.f33491l.iterator();
            while (true) {
                int i2 = i;
                if (!it2.hasNext()) {
                    break;
                }
                Bundle m3916e = it2.next().m3916e();
                if (m3916e != null) {
                    i = i2 + 1;
                    bundleArr[i2] = m3916e;
                } else {
                    i = i2;
                }
            }
            bundle.putParcelableArray("ext_exts", bundleArr);
        }
        return bundle;
    }

    /* renamed from: b */
    public C10731a m3888b(String str, String str2) {
        for (C10731a c10731a : this.f33491l) {
            if (str2 == null || str2.equals(c10731a.m3919b())) {
                if (str.equals(c10731a.m3924a())) {
                    return c10731a;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public abstract String mo3862c();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC10735d abstractC10735d = (AbstractC10735d) obj;
        if (this.f33493n != null) {
            if (!this.f33493n.equals(abstractC10735d.f33493n)) {
                return false;
            }
        } else if (abstractC10735d.f33493n != null) {
            return false;
        }
        if (this.f33488i != null) {
            if (!this.f33488i.equals(abstractC10735d.f33488i)) {
                return false;
            }
        } else if (abstractC10735d.f33488i != null) {
            return false;
        }
        if (!this.f33491l.equals(abstractC10735d.f33491l)) {
            return false;
        }
        if (this.f33486g != null) {
            if (!this.f33486g.equals(abstractC10735d.f33486g)) {
                return false;
            }
        } else if (abstractC10735d.f33486g != null) {
            return false;
        }
        if (this.f33489j != null) {
            if (!this.f33489j.equals(abstractC10735d.f33489j)) {
                return false;
            }
        } else if (abstractC10735d.f33489j != null) {
            return false;
        }
        if (this.f33492m != null) {
            if (!this.f33492m.equals(abstractC10735d.f33492m)) {
                return false;
            }
        } else if (abstractC10735d.f33492m != null) {
            return false;
        }
        if (this.f33487h != null) {
            if (!this.f33487h.equals(abstractC10735d.f33487h)) {
                return false;
            }
        } else if (abstractC10735d.f33487h != null) {
            return false;
        }
        if (this.f33485f == null ? abstractC10735d.f33485f != null : !this.f33485f.equals(abstractC10735d.f33485f)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((this.f33489j != null ? this.f33489j.hashCode() : 0) + (((this.f33488i != null ? this.f33488i.hashCode() : 0) + (((this.f33487h != null ? this.f33487h.hashCode() : 0) + (((this.f33486g != null ? this.f33486g.hashCode() : 0) + ((this.f33485f != null ? this.f33485f.hashCode() : 0) * 31)) * 31)) * 31)) * 31)) * 31) + this.f33491l.hashCode()) * 31) + this.f33492m.hashCode()) * 31;
        if (this.f33493n != null) {
            i = this.f33493n.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: k */
    public String m3886k() {
        if ("ID_NOT_AVAILABLE".equals(this.f33486g)) {
            return null;
        }
        if (this.f33486g == null) {
            this.f33486g = m3887j();
        }
        return this.f33486g;
    }

    /* renamed from: k */
    public void m3885k(String str) {
        this.f33486g = str;
    }

    /* renamed from: l */
    public String m3884l() {
        return this.f33489j;
    }

    /* renamed from: l */
    public void m3883l(String str) {
        this.f33489j = str;
    }

    /* renamed from: m */
    public String m3882m() {
        return this.f33487h;
    }

    /* renamed from: m */
    public void m3881m(String str) {
        this.f33487h = str;
    }

    /* renamed from: n */
    public String m3880n() {
        return this.f33488i;
    }

    /* renamed from: n */
    public void m3879n(String str) {
        this.f33488i = str;
    }

    /* renamed from: o */
    public String m3878o() {
        return this.f33490k;
    }

    /* renamed from: o */
    public void m3877o(String str) {
        this.f33490k = str;
    }

    /* renamed from: p */
    public C10731a m3875p(String str) {
        return m3888b(str, null);
    }

    /* renamed from: p */
    public C10741h m3876p() {
        return this.f33493n;
    }

    /* renamed from: q */
    public synchronized Object m3873q(String str) {
        return this.f33492m == null ? null : this.f33492m.get(str);
    }

    /* renamed from: q */
    public synchronized Collection<C10731a> m3874q() {
        return this.f33491l == null ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(this.f33491l));
    }

    /* renamed from: r */
    public synchronized Collection<String> m3872r() {
        return this.f33492m == null ? Collections.emptySet() : Collections.unmodifiableSet(new HashSet(this.f33492m.keySet()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0140 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x013b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized String m3871s() {
        StringBuilder sb;
        ObjectOutputStream objectOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        ObjectOutputStream objectOutputStream2;
        ByteArrayOutputStream byteArrayOutputStream2;
        sb = new StringBuilder();
        for (C10731a c10731a : m3874q()) {
            sb.append(c10731a.mo3868d());
        }
        if (this.f33492m != null && !this.f33492m.isEmpty()) {
            sb.append("<properties xmlns=\"http://www.jivesoftware.com/xmlns/xmpp/properties\">");
            for (String str : m3872r()) {
                Object m3873q = m3873q(str);
                sb.append("<property>");
                sb.append("<name>").append(C10749d.m3838a(str)).append("</name>");
                sb.append("<value type=\"");
                if (m3873q instanceof Integer) {
                    sb.append("integer\">").append(m3873q).append("</value>");
                } else if (m3873q instanceof Long) {
                    sb.append("long\">").append(m3873q).append("</value>");
                } else if (m3873q instanceof Float) {
                    sb.append("float\">").append(m3873q).append("</value>");
                } else if (m3873q instanceof Double) {
                    sb.append("double\">").append(m3873q).append("</value>");
                } else if (m3873q instanceof Boolean) {
                    sb.append("boolean\">").append(m3873q).append("</value>");
                } else if (m3873q instanceof String) {
                    sb.append("string\">");
                    sb.append(C10749d.m3838a((String) m3873q));
                    sb.append("</value>");
                } else {
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                        } catch (Exception e) {
                            e = e;
                            objectOutputStream2 = null;
                            byteArrayOutputStream2 = byteArrayOutputStream;
                        } catch (Throwable th) {
                            th = th;
                            objectOutputStream = null;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        objectOutputStream2 = null;
                        byteArrayOutputStream2 = null;
                    } catch (Throwable th2) {
                        th = th2;
                        objectOutputStream = null;
                        byteArrayOutputStream = null;
                    }
                    try {
                        objectOutputStream.writeObject(m3873q);
                        sb.append("java-object\">");
                        sb.append(C10749d.m3836a(byteArrayOutputStream.toByteArray())).append("</value>");
                        if (objectOutputStream != null) {
                            try {
                                objectOutputStream.close();
                            } catch (Exception e3) {
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception e4) {
                            }
                        }
                    } catch (Exception e5) {
                        e = e5;
                        objectOutputStream2 = objectOutputStream;
                        byteArrayOutputStream2 = byteArrayOutputStream;
                        try {
                            e.printStackTrace();
                            if (objectOutputStream2 != null) {
                                try {
                                    objectOutputStream2.close();
                                } catch (Exception e6) {
                                }
                            }
                            if (byteArrayOutputStream2 != null) {
                                try {
                                    byteArrayOutputStream2.close();
                                } catch (Exception e7) {
                                }
                            }
                            sb.append("</property>");
                        } catch (Throwable th3) {
                            th = th3;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            objectOutputStream = objectOutputStream2;
                            if (objectOutputStream != null) {
                                try {
                                    objectOutputStream.close();
                                } catch (Exception e8) {
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Exception e9) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        if (objectOutputStream != null) {
                        }
                        if (byteArrayOutputStream != null) {
                        }
                        throw th;
                    }
                }
                sb.append("</property>");
            }
            sb.append("</properties>");
        }
        return sb.toString();
    }

    /* renamed from: t */
    public String m3870t() {
        return this.f33485f;
    }
}
