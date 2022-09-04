package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.AbstractC4682e;
import com.google.android.gms.internal.C7640qw;
import com.google.android.gms.internal.amu;
import com.google.android.gms.internal.amw;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tagmanager.C9196e;
import com.tencent.connect.common.Constants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.BitSet;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p000a.C0017k;
/* renamed from: com.google.android.gms.measurement.internal.m */
/* loaded from: classes2.dex */
public class C8723m extends C8682al {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C8723m(C8668aj c8668aj) {
        super(c8668aj);
    }

    /* renamed from: a */
    private Object m10551a(int i, Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return null;
            }
            return m10535a(String.valueOf(obj), i, z);
        }
    }

    /* renamed from: a */
    public static String m10542a(amu.C6581b c6581b) {
        if (c6581b == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        m10523a(sb, 0, "filter_id", c6581b.f22316a);
        m10523a(sb, 0, C0017k.f42b, c6581b.f22317b);
        m10526a(sb, 1, "event_count_filter", c6581b.f22320e);
        sb.append("  filters {\n");
        for (amu.C6582c c6582c : c6581b.f22318c) {
            m10528a(sb, 2, c6582c);
        }
        m10529a(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* renamed from: a */
    public static String m10541a(amu.C6584e c6584e) {
        if (c6584e == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        m10523a(sb, 0, "filter_id", c6584e.f22332a);
        m10523a(sb, 0, "property_name", c6584e.f22333b);
        m10528a(sb, 1, c6584e.f22334c);
        sb.append("}\n");
        return sb.toString();
    }

    /* renamed from: a */
    private static void m10529a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* renamed from: a */
    private static void m10528a(StringBuilder sb, int i, amu.C6582c c6582c) {
        if (c6582c == null) {
            return;
        }
        m10529a(sb, i);
        sb.append("filter {\n");
        m10523a(sb, i, "complement", c6582c.f22324c);
        m10523a(sb, i, "param_name", c6582c.f22325d);
        m10525a(sb, i + 1, "string_filter", c6582c.f22322a);
        m10526a(sb, i + 1, "number_filter", c6582c.f22323b);
        m10529a(sb, i);
        sb.append("}\n");
    }

    /* renamed from: a */
    private static void m10527a(StringBuilder sb, int i, amw.C6593e c6593e) {
        if (c6593e == null) {
            return;
        }
        m10529a(sb, i);
        sb.append("bundle {\n");
        m10523a(sb, i, "protocol_version", c6593e.f22377a);
        m10523a(sb, i, Constants.PARAM_PLATFORM, c6593e.f22385i);
        m10523a(sb, i, "gmp_version", c6593e.f22393q);
        m10523a(sb, i, "uploading_gmp_version", c6593e.f22394r);
        m10523a(sb, i, "gmp_app_id", c6593e.f22401y);
        m10523a(sb, i, "app_id", c6593e.f22391o);
        m10523a(sb, i, com.xiaomi.mipush.sdk.Constants.EXTRA_KEY_APP_VERSION, c6593e.f22392p);
        m10523a(sb, i, "app_version_major", c6593e.f22373C);
        m10523a(sb, i, "firebase_instance_id", c6593e.f22372B);
        m10523a(sb, i, "dev_cert_hash", c6593e.f22398v);
        m10523a(sb, i, "app_store", c6593e.f22390n);
        m10523a(sb, i, "upload_timestamp_millis", c6593e.f22380d);
        m10523a(sb, i, "start_timestamp_millis", c6593e.f22381e);
        m10523a(sb, i, "end_timestamp_millis", c6593e.f22382f);
        m10523a(sb, i, "previous_bundle_start_timestamp_millis", c6593e.f22383g);
        m10523a(sb, i, "previous_bundle_end_timestamp_millis", c6593e.f22384h);
        m10523a(sb, i, "app_instance_id", c6593e.f22397u);
        m10523a(sb, i, "resettable_device_id", c6593e.f22395s);
        m10523a(sb, i, "device_id", c6593e.f22376F);
        m10523a(sb, i, "limited_ad_tracking", c6593e.f22396t);
        m10523a(sb, i, "os_version", c6593e.f22386j);
        m10523a(sb, i, "device_model", c6593e.f22387k);
        m10523a(sb, i, "user_default_language", c6593e.f22388l);
        m10523a(sb, i, "time_zone_offset_minutes", c6593e.f22389m);
        m10523a(sb, i, "bundle_sequential_index", c6593e.f22399w);
        m10523a(sb, i, "service_upload", c6593e.f22402z);
        m10523a(sb, i, "health_monitor", c6593e.f22400x);
        m10519a(sb, i, c6593e.f22379c);
        m10522a(sb, i, c6593e.f22371A);
        m10521a(sb, i, c6593e.f22378b);
        m10529a(sb, i);
        sb.append("}\n");
    }

    /* renamed from: a */
    private static void m10526a(StringBuilder sb, int i, String str, amu.C6583d c6583d) {
        if (c6583d == null) {
            return;
        }
        m10529a(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (c6583d.f22326a != null) {
            String str2 = "UNKNOWN_COMPARISON_TYPE";
            switch (c6583d.f22326a.intValue()) {
                case 1:
                    str2 = "LESS_THAN";
                    break;
                case 2:
                    str2 = "GREATER_THAN";
                    break;
                case 3:
                    str2 = "EQUAL";
                    break;
                case 4:
                    str2 = "BETWEEN";
                    break;
            }
            m10523a(sb, i, "comparison_type", str2);
        }
        m10523a(sb, i, "match_as_float", c6583d.f22327b);
        m10523a(sb, i, "comparison_value", c6583d.f22328c);
        m10523a(sb, i, "min_comparison_value", c6583d.f22329d);
        m10523a(sb, i, "max_comparison_value", c6583d.f22330e);
        m10529a(sb, i);
        sb.append("}\n");
    }

    /* renamed from: a */
    private static void m10525a(StringBuilder sb, int i, String str, amu.C6585f c6585f) {
        String[] strArr;
        if (c6585f == null) {
            return;
        }
        m10529a(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (c6585f.f22335a != null) {
            String str2 = "UNKNOWN_MATCH_TYPE";
            switch (c6585f.f22335a.intValue()) {
                case 1:
                    str2 = "REGEXP";
                    break;
                case 2:
                    str2 = "BEGINS_WITH";
                    break;
                case 3:
                    str2 = "ENDS_WITH";
                    break;
                case 4:
                    str2 = "PARTIAL";
                    break;
                case 5:
                    str2 = "EXACT";
                    break;
                case 6:
                    str2 = "IN_LIST";
                    break;
            }
            m10523a(sb, i, "match_type", str2);
        }
        m10523a(sb, i, "expression", c6585f.f22336b);
        m10523a(sb, i, "case_sensitive", c6585f.f22337c);
        if (c6585f.f22338d.length > 0) {
            m10529a(sb, i + 1);
            sb.append("expression_list {\n");
            for (String str3 : c6585f.f22338d) {
                m10529a(sb, i + 2);
                sb.append(str3);
                sb.append("\n");
            }
            sb.append("}\n");
        }
        m10529a(sb, i);
        sb.append("}\n");
    }

    /* renamed from: a */
    private static void m10524a(StringBuilder sb, int i, String str, amw.C6594f c6594f) {
        int i2 = 0;
        if (c6594f == null) {
            return;
        }
        int i3 = i + 1;
        m10529a(sb, i3);
        sb.append(str);
        sb.append(" {\n");
        if (c6594f.f22404b != null) {
            m10529a(sb, i3 + 1);
            sb.append("results: ");
            long[] jArr = c6594f.f22404b;
            int length = jArr.length;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                Long valueOf = Long.valueOf(jArr[i4]);
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(valueOf);
                i4++;
                i5 = i6;
            }
            sb.append('\n');
        }
        if (c6594f.f22403a != null) {
            m10529a(sb, i3 + 1);
            sb.append("status: ");
            long[] jArr2 = c6594f.f22403a;
            int length2 = jArr2.length;
            int i7 = 0;
            while (i2 < length2) {
                Long valueOf2 = Long.valueOf(jArr2[i2]);
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(valueOf2);
                i2++;
                i7 = i8;
            }
            sb.append('\n');
        }
        m10529a(sb, i3);
        sb.append("}\n");
    }

    /* renamed from: a */
    private static void m10523a(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        m10529a(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    /* renamed from: a */
    private static void m10522a(StringBuilder sb, int i, amw.C6589a[] c6589aArr) {
        if (c6589aArr == null) {
            return;
        }
        int i2 = i + 1;
        for (amw.C6589a c6589a : c6589aArr) {
            if (c6589a != null) {
                m10529a(sb, i2);
                sb.append("audience_membership {\n");
                m10523a(sb, i2, "audience_id", c6589a.f22353a);
                m10523a(sb, i2, "new_audience", c6589a.f22356d);
                m10524a(sb, i2, "current_data", c6589a.f22354b);
                m10524a(sb, i2, "previous_data", c6589a.f22355c);
                m10529a(sb, i2);
                sb.append("}\n");
            }
        }
    }

    /* renamed from: a */
    private static void m10521a(StringBuilder sb, int i, amw.C6590b[] c6590bArr) {
        if (c6590bArr == null) {
            return;
        }
        int i2 = i + 1;
        for (amw.C6590b c6590b : c6590bArr) {
            if (c6590b != null) {
                m10529a(sb, i2);
                sb.append("event {\n");
                m10523a(sb, i2, "name", c6590b.f22359b);
                m10523a(sb, i2, "timestamp_millis", c6590b.f22360c);
                m10523a(sb, i2, "previous_timestamp_millis", c6590b.f22361d);
                m10523a(sb, i2, "count", c6590b.f22362e);
                m10520a(sb, i2, c6590b.f22358a);
                m10529a(sb, i2);
                sb.append("}\n");
            }
        }
    }

    /* renamed from: a */
    private static void m10520a(StringBuilder sb, int i, amw.C6591c[] c6591cArr) {
        if (c6591cArr == null) {
            return;
        }
        int i2 = i + 1;
        for (amw.C6591c c6591c : c6591cArr) {
            if (c6591c != null) {
                m10529a(sb, i2);
                sb.append("param {\n");
                m10523a(sb, i2, "name", c6591c.f22364a);
                m10523a(sb, i2, "string_value", c6591c.f22365b);
                m10523a(sb, i2, "int_value", c6591c.f22366c);
                m10523a(sb, i2, "double_value", c6591c.f22368e);
                m10529a(sb, i2);
                sb.append("}\n");
            }
        }
    }

    /* renamed from: a */
    private static void m10519a(StringBuilder sb, int i, amw.C6595g[] c6595gArr) {
        if (c6595gArr == null) {
            return;
        }
        int i2 = i + 1;
        for (amw.C6595g c6595g : c6595gArr) {
            if (c6595g != null) {
                m10529a(sb, i2);
                sb.append("user_property {\n");
                m10523a(sb, i2, "set_timestamp_millis", c6595g.f22406a);
                m10523a(sb, i2, "name", c6595g.f22407b);
                m10523a(sb, i2, "string_value", c6595g.f22408c);
                m10523a(sb, i2, "int_value", c6595g.f22409d);
                m10523a(sb, i2, "double_value", c6595g.f22411f);
                m10529a(sb, i2);
                sb.append("}\n");
            }
        }
    }

    /* renamed from: a */
    public static boolean m10548a(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 4)) == null) {
                return false;
            }
            return serviceInfo.enabled;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m10547a(Context context, String str, boolean z) {
        ActivityInfo receiverInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, str), 2)) == null || !receiverInfo.enabled) {
                return false;
            }
            if (z) {
                if (!receiverInfo.exported) {
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m10537a(String str) {
        C4588d.m23625a(str);
        return str.charAt(0) != '_';
    }

    /* renamed from: a */
    public static boolean m10516a(long[] jArr, int i) {
        return i < jArr.length * 64 && (jArr[i / 64] & (1 << (i % 64))) != 0;
    }

    /* renamed from: a */
    public static long[] m10518a(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = 0;
            for (int i2 = 0; i2 < 64 && (i * 64) + i2 < bitSet.length(); i2++) {
                if (bitSet.get((i * 64) + i2)) {
                    jArr[i] = jArr[i] | (1 << i2);
                }
            }
        }
        return jArr;
    }

    /* renamed from: b */
    public static String m10515b(amw.C6592d c6592d) {
        amw.C6593e[] c6593eArr;
        if (c6592d == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        if (c6592d.f22369a != null) {
            for (amw.C6593e c6593e : c6592d.f22369a) {
                if (c6593e != null) {
                    m10527a(sb, 1, c6593e);
                }
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static long m10507c(byte[] bArr) {
        int i = 0;
        C4588d.m23627a(bArr);
        C4588d.m23623a(bArr.length > 0);
        long j = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j += (bArr[length] & 255) << i;
            i += 8;
        }
        return j;
    }

    /* renamed from: c */
    public static boolean m10508c(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str != null) {
            return str.equals(str2);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static MessageDigest m10498j(String str) {
        MessageDigest messageDigest;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < 2) {
                try {
                    messageDigest = MessageDigest.getInstance(str);
                } catch (NoSuchAlgorithmException e) {
                }
                if (messageDigest != null) {
                    return messageDigest;
                }
                i = i2 + 1;
            } else {
                return null;
            }
        }
    }

    /* renamed from: l */
    public static boolean m10496l(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static boolean m10494n(String str) {
        return str != null && str.matches("(\\+|-)?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* renamed from: o */
    private int m10493o(String str) {
        return "_ldl".equals(str) ? mo10292y().m10484A() : mo10292y().m10428z();
    }

    /* renamed from: a */
    public Bundle m10546a(@NonNull Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        Bundle bundle = null;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str4 = uri.getQueryParameter("utm_campaign");
                    str3 = uri.getQueryParameter("utm_source");
                    str2 = uri.getQueryParameter("utm_medium");
                    str = uri.getQueryParameter("gclid");
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                }
                if (!TextUtils.isEmpty(str4) || !TextUtils.isEmpty(str3) || !TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str)) {
                    bundle = new Bundle();
                    if (!TextUtils.isEmpty(str4)) {
                        bundle.putString("campaign", str4);
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        bundle.putString("source", str3);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        bundle.putString("medium", str2);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        bundle.putString("gclid", str);
                    }
                    String queryParameter = uri.getQueryParameter("utm_term");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        bundle.putString("term", queryParameter);
                    }
                    String queryParameter2 = uri.getQueryParameter("utm_content");
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        bundle.putString("content", queryParameter2);
                    }
                    String queryParameter3 = uri.getQueryParameter("aclid");
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        bundle.putString("aclid", queryParameter3);
                    }
                    String queryParameter4 = uri.getQueryParameter("cp1");
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("cp1", queryParameter4);
                    }
                    String queryParameter5 = uri.getQueryParameter("anid");
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        bundle.putString("anid", queryParameter5);
                    }
                }
            } catch (UnsupportedOperationException e) {
                mo10294w().m10832z().m10830a("Install referrer url isn't a hierarchical URI", e);
            }
        }
        return bundle;
    }

    /* renamed from: a */
    public Bundle m10534a(String str, Bundle bundle, @Nullable List<String> list, boolean z) {
        int m10502f;
        if (bundle != null) {
            Bundle bundle2 = new Bundle(bundle);
            int m10444b = mo10292y().m10444b();
            int i = 0;
            for (String str2 : bundle.keySet()) {
                if (list == null || !list.contains(str2)) {
                    m10502f = z ? m10502f(str2) : 0;
                    if (m10502f == 0) {
                        m10502f = m10501g(str2);
                    }
                } else {
                    m10502f = 0;
                }
                if (m10502f != 0) {
                    if (m10545a(bundle2, m10502f)) {
                        bundle2.putString("_ev", m10535a(str2, mo10292y().m10437e(), true));
                        if (m10502f == 3) {
                            m10544a(bundle2, str2);
                        }
                    }
                    bundle2.remove(str2);
                } else if (!m10533a(str2, bundle.get(str2)) && !"_ev".equals(str2)) {
                    if (m10545a(bundle2, 4)) {
                        bundle2.putString("_ev", m10535a(str2, mo10292y().m10437e(), true));
                        m10544a(bundle2, bundle.get(str2));
                    }
                    bundle2.remove(str2);
                } else if (!m10537a(str2) || (i = i + 1) <= m10444b) {
                    i = i;
                } else {
                    mo10294w().m10834f().m10829a(new StringBuilder(48).append("Event can't contain more then ").append(m10444b).append(" params").toString(), str, bundle);
                    m10545a(bundle2, 5);
                    bundle2.remove(str2);
                }
            }
            return bundle2;
        }
        return null;
    }

    /* renamed from: a */
    public String m10535a(String str, int i, boolean z) {
        if (str.length() > i) {
            if (!z) {
                return null;
            }
            return String.valueOf(str.substring(0, i)).concat("...");
        }
        return str;
    }

    /* renamed from: a */
    public void m10550a(int i, String str, String str2, int i2) {
        Bundle bundle = new Bundle();
        m10545a(bundle, i);
        if (!TextUtils.isEmpty(str)) {
            bundle.putString(str, str2);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        this.f27815n.m10692l().m10632a("auto", "_err", bundle);
    }

    /* renamed from: a */
    public void m10544a(Bundle bundle, Object obj) {
        C4588d.m23627a(bundle);
        if (obj != null) {
            if (!(obj instanceof String) && !(obj instanceof CharSequence)) {
                return;
            }
            bundle.putLong("_el", String.valueOf(obj).length());
        }
    }

    /* renamed from: a */
    public void m10543a(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (str == null) {
        } else {
            mo10294w().m10846B().m10829a("Not putting event parameter. Invalid value type. name, type", str, obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    /* renamed from: a */
    public void m10540a(amw.C6591c c6591c, Object obj) {
        C4588d.m23627a(obj);
        c6591c.f22365b = null;
        c6591c.f22366c = null;
        c6591c.f22368e = null;
        if (obj instanceof String) {
            c6591c.f22365b = (String) obj;
        } else if (obj instanceof Long) {
            c6591c.f22366c = (Long) obj;
        } else if (obj instanceof Double) {
            c6591c.f22368e = (Double) obj;
        } else {
            mo10294w().m10834f().m10830a("Ignoring invalid (type) event param value", obj);
        }
    }

    /* renamed from: a */
    public void m10538a(amw.C6595g c6595g, Object obj) {
        C4588d.m23627a(obj);
        c6595g.f22408c = null;
        c6595g.f22409d = null;
        c6595g.f22411f = null;
        if (obj instanceof String) {
            c6595g.f22408c = (String) obj;
        } else if (obj instanceof Long) {
            c6595g.f22409d = (Long) obj;
        } else if (obj instanceof Double) {
            c6595g.f22411f = (Double) obj;
        } else {
            mo10294w().m10834f().m10830a("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* renamed from: a */
    public boolean m10549a(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(mo10301p().mo16434a() - j) > j2;
    }

    /* renamed from: a */
    public boolean m10545a(Bundle bundle, int i) {
        if (bundle != null && bundle.getLong("_err") == 0) {
            bundle.putLong("_err", i);
            return true;
        }
        return false;
    }

    /* renamed from: a */
    boolean m10536a(String str, int i, String str2) {
        if (str2 == null) {
            mo10294w().m10834f().m10830a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() <= i) {
            return true;
        } else {
            mo10294w().m10834f().m10828a("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    /* renamed from: a */
    public boolean m10533a(String str, Object obj) {
        return m10496l(str) ? m10531a("param", str, mo10292y().m10433g(), obj) : m10531a("param", str, mo10292y().m10435f(), obj);
    }

    /* renamed from: a */
    boolean m10532a(String str, String str2) {
        if (str2 == null) {
            mo10294w().m10834f().m10830a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            mo10294w().m10834f().m10830a("Name is required and can't be empty. Type", str);
            return false;
        } else if (!Character.isLetter(str2.charAt(0))) {
            mo10294w().m10834f().m10829a("Name must start with a letter. Type, name", str, str2);
            return false;
        } else {
            for (int i = 1; i < str2.length(); i++) {
                char charAt = str2.charAt(i);
                if (charAt != '_' && !Character.isLetterOrDigit(charAt)) {
                    mo10294w().m10834f().m10829a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    boolean m10531a(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.length() <= i) {
                return true;
            }
            mo10294w().m10832z().m10828a("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
            return false;
        }
        return true;
    }

    /* renamed from: a */
    boolean m10530a(String str, Map<String, String> map, String str2) {
        if (str2 == null) {
            mo10294w().m10834f().m10830a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.startsWith("firebase_")) {
            mo10294w().m10834f().m10829a("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        } else if (map == null || !map.containsKey(str2)) {
            return true;
        } else {
            mo10294w().m10834f().m10829a("Name is reserved. Type, name", str, str2);
            return false;
        }
    }

    /* renamed from: a */
    public byte[] m10539a(amw.C6592d c6592d) {
        try {
            byte[] bArr = new byte[c6592d.g()];
            C7640qw m13959a = C7640qw.m13959a(bArr);
            c6592d.mo13818a(m13959a);
            m13959a.m13957b();
            return bArr;
        } catch (IOException e) {
            mo10294w().m10834f().m10830a("Data loss. Failed to serialize batch", e);
            return null;
        }
    }

    /* renamed from: a */
    public byte[] m10517a(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            mo10294w().m10834f().m10830a("Failed to gzip content", e);
            throw e;
        }
    }

    /* renamed from: b */
    public int m10514b(String str) {
        if (!m10532a(C9196e.f29004b, str)) {
            return 2;
        }
        if (!m10530a(C9196e.f29004b, AppMeasurement.C8635a.f27587a, str)) {
            return 13;
        }
        return m10536a(C9196e.f29004b, mo10292y().m10441c(), str) ? 0 : 2;
    }

    /* renamed from: b */
    public Object m10513b(String str, Object obj) {
        if ("_ev".equals(str)) {
            return m10551a(mo10292y().m10433g(), obj, true);
        }
        return m10551a(m10496l(str) ? mo10292y().m10433g() : mo10292y().m10435f(), obj, false);
    }

    /* renamed from: b */
    boolean m10512b(String str, String str2) {
        if (str2 == null) {
            mo10294w().m10834f().m10830a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            mo10294w().m10834f().m10830a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            char charAt = str2.charAt(0);
            if (!Character.isLetter(charAt) && charAt != '_') {
                mo10294w().m10834f().m10829a("Name must start with a letter or _ (underscores). Type, name", str, str2);
                return false;
            }
            for (int i = 1; i < str2.length(); i++) {
                char charAt2 = str2.charAt(i);
                if (charAt2 != '_' && !Character.isLetterOrDigit(charAt2)) {
                    mo10294w().m10834f().m10829a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: b */
    public byte[] m10511b(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
        } catch (IOException e) {
            mo10294w().m10834f().m10830a("Failed to ungzip content", e);
            throw e;
        }
    }

    /* renamed from: c */
    public int m10510c(String str) {
        if (!m10512b(C9196e.f29004b, str)) {
            return 2;
        }
        if (!m10530a(C9196e.f29004b, AppMeasurement.C8635a.f27587a, str)) {
            return 13;
        }
        return m10536a(C9196e.f29004b, mo10292y().m10441c(), str) ? 0 : 2;
    }

    /* renamed from: c */
    public int m10509c(String str, Object obj) {
        return "_ldl".equals(str) ? m10531a("user property referrer", str, m10493o(str), obj) : m10531a("user property", str, m10493o(str), obj) ? 0 : 7;
    }

    /* renamed from: d */
    public int m10506d(String str) {
        if (!m10532a("user property", str)) {
            return 6;
        }
        if (!m10530a("user property", AppMeasurement.C8639e.f27589a, str)) {
            return 15;
        }
        return m10536a("user property", mo10292y().m10439d(), str) ? 0 : 6;
    }

    /* renamed from: d */
    public long m10504d(byte[] bArr) {
        C4588d.m23627a(bArr);
        MessageDigest m10498j = m10498j("MD5");
        if (m10498j == null) {
            mo10294w().m10834f().m10831a("Failed to get MD5");
            return 0L;
        }
        return m10507c(m10498j.digest(bArr));
    }

    /* renamed from: d */
    public Object m10505d(String str, Object obj) {
        return "_ldl".equals(str) ? m10551a(m10493o(str), obj, true) : m10551a(m10493o(str), obj, false);
    }

    /* renamed from: e */
    public int m10503e(String str) {
        if (!m10512b("user property", str)) {
            return 6;
        }
        if (!m10530a("user property", AppMeasurement.C8639e.f27589a, str)) {
            return 15;
        }
        return m10536a("user property", mo10292y().m10439d(), str) ? 0 : 6;
    }

    /* renamed from: f */
    public int m10502f(String str) {
        if (!m10532a("event param", str)) {
            return 3;
        }
        if (!m10530a("event param", (Map<String, String>) null, str)) {
            return 14;
        }
        return m10536a("event param", mo10292y().m10437e(), str) ? 0 : 3;
    }

    /* renamed from: g */
    public int m10501g(String str) {
        if (!m10512b("event param", str)) {
            return 3;
        }
        if (!m10530a("event param", (Map<String, String>) null, str)) {
            return 14;
        }
        return m10536a("event param", mo10292y().m10437e(), str) ? 0 : 3;
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: h */
    public /* bridge */ /* synthetic */ void mo10309h() {
        super.mo10309h();
    }

    /* renamed from: h */
    public boolean m10500h(String str) {
        if (TextUtils.isEmpty(str)) {
            mo10294w().m10834f().m10831a("Measurement Service called without google_app_id");
            return false;
        } else if (!str.startsWith("1:")) {
            mo10294w().m10832z().m10830a("Measurement Service called with unknown id version", str);
            return true;
        } else if (m10499i(str)) {
            return true;
        } else {
            mo10294w().m10834f().m10830a("Invalid google_app_id. Firebase Analytics disabled. See", "https://goo.gl/FZRIUV");
            return false;
        }
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: i */
    public /* bridge */ /* synthetic */ void mo10308i() {
        super.mo10308i();
    }

    /* renamed from: i */
    boolean m10499i(String str) {
        C4588d.m23627a(str);
        return str.matches("^1:\\d+:android:[a-f0-9]+$");
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: j */
    public /* bridge */ /* synthetic */ void mo10307j() {
        super.mo10307j();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: k */
    public /* bridge */ /* synthetic */ C8725o mo10306k() {
        return super.mo10306k();
    }

    @WorkerThread
    /* renamed from: k */
    public boolean m10497k(String str) {
        mo10307j();
        if (mo10300q().checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        mo10294w().m10844D().m10830a("Permission not granted", str);
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: l */
    public /* bridge */ /* synthetic */ C8685d mo10305l() {
        return super.mo10305l();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: m */
    public /* bridge */ /* synthetic */ C8743z mo10304m() {
        return super.mo10304m();
    }

    /* renamed from: m */
    public boolean m10495m(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return mo10292y().m10445aj().equals(str);
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: n */
    public /* bridge */ /* synthetic */ C8733s mo10303n() {
        return super.mo10303n();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: o */
    public /* bridge */ /* synthetic */ C8693e mo10302o() {
        return super.mo10302o();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: p */
    public /* bridge */ /* synthetic */ AbstractC4682e mo10301p() {
        return super.mo10301p();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: q */
    public /* bridge */ /* synthetic */ Context mo10300q() {
        return super.mo10300q();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: r */
    public /* bridge */ /* synthetic */ C8727q mo10299r() {
        return super.mo10299r();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: s */
    public /* bridge */ /* synthetic */ C8723m mo10298s() {
        return super.mo10298s();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: t */
    public /* bridge */ /* synthetic */ C8662ah mo10297t() {
        return super.mo10297t();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: u */
    public /* bridge */ /* synthetic */ C8710g mo10296u() {
        return super.mo10296u();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: v */
    public /* bridge */ /* synthetic */ C8663ai mo10295v() {
        return super.mo10295v();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: w */
    public /* bridge */ /* synthetic */ C8643ab mo10294w() {
        return super.mo10294w();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: x */
    public /* bridge */ /* synthetic */ C8654af mo10293x() {
        return super.mo10293x();
    }

    @Override // com.google.android.gms.measurement.internal.C8682al
    /* renamed from: y */
    public /* bridge */ /* synthetic */ C8726p mo10292y() {
        return super.mo10292y();
    }
}
