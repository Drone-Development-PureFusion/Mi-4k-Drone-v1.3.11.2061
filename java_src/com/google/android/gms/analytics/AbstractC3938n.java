package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.AbstractC3938n;
import com.google.firebase.p253b.C9755a;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;
/* renamed from: com.google.android.gms.analytics.n */
/* loaded from: classes2.dex */
public abstract class AbstractC3938n<T extends AbstractC3938n> {
    /* renamed from: a */
    public static String m25983a(Object obj) {
        return m25982a(obj, 0);
    }

    /* renamed from: a */
    private static String m25982a(Object obj, int i) {
        if (i > 10) {
            return "ERROR: Recursive toString calls";
        }
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return TextUtils.isEmpty((String) obj) ? "" : obj.toString();
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0 ? "" : obj.toString();
        } else if (obj instanceof Long) {
            return ((Long) obj).longValue() == 0 ? "" : obj.toString();
        } else if (obj instanceof Double) {
            return ((Double) obj).doubleValue() == C9755a.f30449c ? "" : obj.toString();
        } else if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue() ? "" : obj.toString();
        } else if (obj instanceof List) {
            StringBuffer stringBuffer = new StringBuffer();
            if (i > 0) {
                stringBuffer.append("[");
            }
            int length = stringBuffer.length();
            for (Object obj2 : (List) obj) {
                if (stringBuffer.length() > length) {
                    stringBuffer.append(", ");
                }
                stringBuffer.append(m25982a(obj2, i + 1));
            }
            if (i > 0) {
                stringBuffer.append("]");
            }
            return stringBuffer.toString();
        } else if (!(obj instanceof Map)) {
            return obj.toString();
        } else {
            StringBuffer stringBuffer2 = new StringBuffer();
            int i2 = 0;
            boolean z = false;
            for (Map.Entry entry : new TreeMap((Map) obj).entrySet()) {
                String m25982a = m25982a(entry.getValue(), i + 1);
                if (!TextUtils.isEmpty(m25982a)) {
                    if (i > 0 && !z) {
                        stringBuffer2.append("{");
                        z = true;
                        i2 = stringBuffer2.length();
                    }
                    if (stringBuffer2.length() > i2) {
                        stringBuffer2.append(", ");
                    }
                    stringBuffer2.append((String) entry.getKey());
                    stringBuffer2.append(SignatureVisitor.INSTANCEOF);
                    stringBuffer2.append(m25982a);
                }
            }
            if (z) {
                stringBuffer2.append("}");
            }
            return stringBuffer2.toString();
        }
    }

    /* renamed from: a */
    public static String m25981a(Map map) {
        return m25982a(map, 1);
    }

    /* renamed from: a */
    public abstract void mo17922a(T t);
}
