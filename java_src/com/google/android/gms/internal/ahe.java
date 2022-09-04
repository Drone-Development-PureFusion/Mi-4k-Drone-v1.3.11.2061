package com.google.android.gms.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.clearcut.C4456b;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* loaded from: classes2.dex */
public class ahe implements C4456b.AbstractC4459b {

    /* renamed from: b */
    final C6335a f21711b;

    /* renamed from: c */
    private static final Charset f21710c = Charset.forName("UTF-8");

    /* renamed from: a */
    static Boolean f21709a = null;

    /* renamed from: com.google.android.gms.internal.ahe$a */
    /* loaded from: classes2.dex */
    static class C6335a {

        /* renamed from: a */
        final ContentResolver f21712a;

        C6335a(Context context) {
            if (context == null || !m17498a(context)) {
                this.f21712a = null;
                return;
            }
            this.f21712a = context.getContentResolver();
            C6955fg.m15871b(this.f21712a, "gms:playlog:service:sampling_");
        }

        /* renamed from: a */
        private static boolean m17498a(Context context) {
            if (ahe.f21709a == null) {
                ahe.f21709a = Boolean.valueOf(context.checkCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
            }
            return ahe.f21709a.booleanValue();
        }

        /* renamed from: a */
        long m17499a() {
            if (this.f21712a == null) {
                return 0L;
            }
            return C6955fg.m15875a(this.f21712a, "android_id", 0L);
        }

        /* renamed from: a */
        String m17497a(String str) {
            if (this.f21712a == null) {
                return null;
            }
            ContentResolver contentResolver = this.f21712a;
            String valueOf = String.valueOf("gms:playlog:service:sampling_");
            String valueOf2 = String.valueOf(str);
            return C6955fg.m15874a(contentResolver, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), (String) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.ahe$b */
    /* loaded from: classes2.dex */
    public static class C6336b {

        /* renamed from: a */
        public final String f21713a;

        /* renamed from: b */
        public final long f21714b;

        /* renamed from: c */
        public final long f21715c;

        public C6336b(String str, long j, long j2) {
            this.f21713a = str;
            this.f21714b = j;
            this.f21715c = j2;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6336b)) {
                return false;
            }
            C6336b c6336b = (C6336b) obj;
            return C4585c.m23634a(this.f21713a, c6336b.f21713a) && C4585c.m23634a(Long.valueOf(this.f21714b), Long.valueOf(c6336b.f21714b)) && C4585c.m23634a(Long.valueOf(this.f21715c), Long.valueOf(c6336b.f21715c));
        }

        public int hashCode() {
            return C4585c.m23633a(this.f21713a, Long.valueOf(this.f21714b), Long.valueOf(this.f21715c));
        }
    }

    public ahe() {
        this(new C6335a(null));
    }

    public ahe(Context context) {
        this(new C6335a(context));
    }

    ahe(C6335a c6335a) {
        this.f21711b = (C6335a) C4588d.m23627a(c6335a);
    }

    /* renamed from: a */
    static long m17504a(long j) {
        return ahb.m17515a(ByteBuffer.allocate(8).putLong(j).array());
    }

    /* renamed from: a */
    static long m17500a(String str, long j) {
        if (str == null || str.isEmpty()) {
            return m17504a(j);
        }
        byte[] bytes = str.getBytes(f21710c);
        ByteBuffer allocate = ByteBuffer.allocate(bytes.length + 8);
        allocate.put(bytes);
        allocate.putLong(j);
        return ahb.m17515a(allocate.array());
    }

    /* renamed from: a */
    static C6336b m17502a(String str) {
        int i = 0;
        if (str == null) {
            return null;
        }
        String str2 = "";
        int indexOf = str.indexOf(44);
        if (indexOf >= 0) {
            str2 = str.substring(0, indexOf);
            i = indexOf + 1;
        }
        int indexOf2 = str.indexOf(47, i);
        if (indexOf2 <= 0) {
            String valueOf = String.valueOf(str);
            Log.e("LogSamplerImpl", valueOf.length() != 0 ? "Failed to parse the rule: ".concat(valueOf) : new String("Failed to parse the rule: "));
            return null;
        }
        try {
            long parseLong = Long.parseLong(str.substring(i, indexOf2));
            long parseLong2 = Long.parseLong(str.substring(indexOf2 + 1));
            if (parseLong >= 0 && parseLong2 >= 0) {
                return new C6336b(str2, parseLong, parseLong2);
            }
            Log.e("LogSamplerImpl", new StringBuilder(72).append("negative values not supported: ").append(parseLong).append("/").append(parseLong2).toString());
            return null;
        } catch (NumberFormatException e) {
            String valueOf2 = String.valueOf(str);
            Log.e("LogSamplerImpl", valueOf2.length() != 0 ? "parseLong() failed while parsing: ".concat(valueOf2) : new String("parseLong() failed while parsing: "), e);
            return null;
        }
    }

    /* renamed from: a */
    static boolean m17503a(long j, long j2, long j3) {
        if (j2 < 0 || j3 < 0) {
            throw new IllegalArgumentException(new StringBuilder(72).append("negative values not supported: ").append(j2).append("/").append(j3).toString());
        }
        return j3 > 0 && ahf.m17496a(j, j3) < j2;
    }

    @Override // com.google.android.gms.clearcut.C4456b.AbstractC4459b
    /* renamed from: a */
    public boolean mo17501a(String str, int i) {
        if (str == null || str.isEmpty()) {
            str = i >= 0 ? String.valueOf(i) : null;
        }
        if (str == null) {
            return true;
        }
        long m17499a = this.f21711b.m17499a();
        C6336b m17502a = m17502a(this.f21711b.m17497a(str));
        if (m17502a == null) {
            return true;
        }
        return m17503a(m17500a(m17502a.f21713a, m17499a), m17502a.f21714b, m17502a.f21715c);
    }
}
