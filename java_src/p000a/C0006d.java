package p000a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.C0004c;
/* renamed from: a.d */
/* loaded from: classes.dex */
public class C0006d {

    /* renamed from: a */
    private static final String f14a = "user_agent";

    /* renamed from: b */
    private static final String f15b = "version";

    /* renamed from: c */
    private static final String f16c = "referer_app_link";

    /* renamed from: d */
    private static final String f17d = "app_name";

    /* renamed from: e */
    private static final String f18e = "package";

    /* renamed from: f */
    private static final String f19f = "1.0";

    /* renamed from: g */
    private static AbstractC0009e f20g;

    /* renamed from: h */
    private final C0004c f21h;

    /* renamed from: i */
    private final Bundle f22i;

    /* renamed from: j */
    private final Bundle f23j;

    /* renamed from: a.d$a */
    /* loaded from: classes.dex */
    public enum EnumC0008a {
        FAILED("failed", false),
        WEB("web", true),
        APP("app", true);
        

        /* renamed from: d */
        private String f29d;

        /* renamed from: e */
        private boolean f30e;

        EnumC0008a(String str, boolean z) {
            this.f29d = str;
            this.f30e = z;
        }

        /* renamed from: a */
        public String m39956a() {
            return this.f29d;
        }

        /* renamed from: b */
        public boolean m39955b() {
            return this.f30e;
        }
    }

    public C0006d(C0004c c0004c, Bundle bundle, Bundle bundle2) {
        if (c0004c == null) {
            throw new IllegalArgumentException("appLink must not be null.");
        }
        bundle = bundle == null ? new Bundle() : bundle;
        bundle2 = bundle2 == null ? new Bundle() : bundle2;
        this.f21h = c0004c;
        this.f22i = bundle;
        this.f23j = bundle2;
    }

    /* renamed from: a */
    public static EnumC0008a m39972a(Context context, C0004c c0004c) {
        return new C0006d(c0004c, null, null).m39973a(context);
    }

    /* renamed from: a */
    public static C0018l<EnumC0008a> m39970a(Context context, Uri uri) {
        return m39969a(context, uri, m39959c(context));
    }

    /* renamed from: a */
    public static C0018l<EnumC0008a> m39969a(final Context context, Uri uri, AbstractC0009e abstractC0009e) {
        return abstractC0009e.mo39885a(uri).m39915c(new AbstractC0016j<C0004c, EnumC0008a>() { // from class: a.d.1
            @Override // p000a.AbstractC0016j
            /* renamed from: a */
            public EnumC0008a mo40096then(C0018l<C0004c> c0018l) {
                return C0006d.m39972a(context, c0018l.m39908e());
            }
        }, C0018l.f50b);
    }

    /* renamed from: a */
    public static C0018l<EnumC0008a> m39968a(Context context, String str) {
        return m39967a(context, str, m39959c(context));
    }

    /* renamed from: a */
    public static C0018l<EnumC0008a> m39967a(Context context, String str, AbstractC0009e abstractC0009e) {
        return m39969a(context, Uri.parse(str), abstractC0009e);
    }

    /* renamed from: a */
    public static C0018l<EnumC0008a> m39966a(Context context, URL url) {
        return m39965a(context, url, m39959c(context));
    }

    /* renamed from: a */
    public static C0018l<EnumC0008a> m39965a(Context context, URL url, AbstractC0009e abstractC0009e) {
        return m39969a(context, Uri.parse(url.toString()), abstractC0009e);
    }

    /* renamed from: a */
    private Object m39963a(Object obj) {
        int i = 0;
        if (obj instanceof Bundle) {
            return m39964a((Bundle) obj);
        }
        if (obj instanceof CharSequence) {
            return obj.toString();
        }
        if (obj instanceof List) {
            JSONArray jSONArray = new JSONArray();
            for (Object obj2 : (List) obj) {
                jSONArray.put(m39963a(obj2));
            }
            return jSONArray;
        } else if (obj instanceof SparseArray) {
            JSONArray jSONArray2 = new JSONArray();
            SparseArray sparseArray = (SparseArray) obj;
            while (i < sparseArray.size()) {
                jSONArray2.put(sparseArray.keyAt(i), m39963a(sparseArray.valueAt(i)));
                i++;
            }
            return jSONArray2;
        } else if (obj instanceof Character) {
            return obj.toString();
        } else {
            if (obj instanceof Boolean) {
                return obj;
            }
            if (obj instanceof Number) {
                return ((obj instanceof Double) || (obj instanceof Float)) ? Double.valueOf(((Number) obj).doubleValue()) : Long.valueOf(((Number) obj).longValue());
            } else if (obj instanceof boolean[]) {
                JSONArray jSONArray3 = new JSONArray();
                boolean[] zArr = (boolean[]) obj;
                int length = zArr.length;
                while (i < length) {
                    jSONArray3.put(m39963a(Boolean.valueOf(zArr[i])));
                    i++;
                }
                return jSONArray3;
            } else if (obj instanceof char[]) {
                JSONArray jSONArray4 = new JSONArray();
                char[] cArr = (char[]) obj;
                int length2 = cArr.length;
                while (i < length2) {
                    jSONArray4.put(m39963a(Character.valueOf(cArr[i])));
                    i++;
                }
                return jSONArray4;
            } else if (obj instanceof CharSequence[]) {
                JSONArray jSONArray5 = new JSONArray();
                CharSequence[] charSequenceArr = (CharSequence[]) obj;
                int length3 = charSequenceArr.length;
                while (i < length3) {
                    jSONArray5.put(m39963a(charSequenceArr[i]));
                    i++;
                }
                return jSONArray5;
            } else if (obj instanceof double[]) {
                JSONArray jSONArray6 = new JSONArray();
                double[] dArr = (double[]) obj;
                int length4 = dArr.length;
                while (i < length4) {
                    jSONArray6.put(m39963a(Double.valueOf(dArr[i])));
                    i++;
                }
                return jSONArray6;
            } else if (obj instanceof float[]) {
                JSONArray jSONArray7 = new JSONArray();
                float[] fArr = (float[]) obj;
                int length5 = fArr.length;
                while (i < length5) {
                    jSONArray7.put(m39963a(Float.valueOf(fArr[i])));
                    i++;
                }
                return jSONArray7;
            } else if (obj instanceof int[]) {
                JSONArray jSONArray8 = new JSONArray();
                int[] iArr = (int[]) obj;
                int length6 = iArr.length;
                while (i < length6) {
                    jSONArray8.put(m39963a(Integer.valueOf(iArr[i])));
                    i++;
                }
                return jSONArray8;
            } else if (obj instanceof long[]) {
                JSONArray jSONArray9 = new JSONArray();
                long[] jArr = (long[]) obj;
                int length7 = jArr.length;
                while (i < length7) {
                    jSONArray9.put(m39963a(Long.valueOf(jArr[i])));
                    i++;
                }
                return jSONArray9;
            } else if (obj instanceof short[]) {
                JSONArray jSONArray10 = new JSONArray();
                short[] sArr = (short[]) obj;
                int length8 = sArr.length;
                while (i < length8) {
                    jSONArray10.put(m39963a(Short.valueOf(sArr[i])));
                    i++;
                }
                return jSONArray10;
            } else if (!(obj instanceof String[])) {
                return null;
            } else {
                JSONArray jSONArray11 = new JSONArray();
                String[] strArr = (String[]) obj;
                int length9 = strArr.length;
                while (i < length9) {
                    jSONArray11.put(m39963a(strArr[i]));
                    i++;
                }
                return jSONArray11;
            }
        }
    }

    /* renamed from: a */
    private JSONObject m39964a(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            jSONObject.put(str, m39963a(bundle.get(str)));
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m39974a(AbstractC0009e abstractC0009e) {
        f20g = abstractC0009e;
    }

    /* renamed from: a */
    private void m39971a(Context context, Intent intent, EnumC0008a enumC0008a, JSONException jSONException) {
        HashMap hashMap = new HashMap();
        if (jSONException != null) {
            hashMap.put("error", jSONException.getLocalizedMessage());
        }
        hashMap.put("success", enumC0008a.m39955b() ? "1" : "0");
        hashMap.put("type", enumC0008a.m39956a());
        C0017k.m39942a(context, C0017k.f44d, intent, hashMap);
    }

    /* renamed from: b */
    private Bundle m39961b(Context context) {
        String string;
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        if (context != null) {
            String packageName = context.getPackageName();
            if (packageName != null) {
                bundle2.putString(f18e, packageName);
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo != null && (string = context.getString(applicationInfo.labelRes)) != null) {
                bundle2.putString("app_name", string);
            }
        }
        bundle.putAll(m39962b());
        bundle.putString("target_url", m39975a().m39982a().toString());
        bundle.putString("version", "1.0");
        bundle.putString(f14a, "Bolts Android 1.1.4");
        bundle.putBundle(f16c, bundle2);
        bundle.putBundle("extras", m39960c());
        return bundle;
    }

    /* renamed from: c */
    private static AbstractC0009e m39959c(Context context) {
        return m39958d() != null ? m39958d() : new C0031m(context);
    }

    /* renamed from: d */
    public static AbstractC0009e m39958d() {
        return f20g;
    }

    /* renamed from: a */
    public C0004c m39975a() {
        return this.f21h;
    }

    /* renamed from: a */
    public EnumC0008a m39973a(Context context) {
        Intent intent;
        Intent intent2;
        EnumC0008a enumC0008a;
        PackageManager packageManager = context.getPackageManager();
        Bundle m39961b = m39961b(context);
        Iterator<C0004c.C0005a> it2 = m39975a().m39981b().iterator();
        while (true) {
            if (!it2.hasNext()) {
                intent = null;
                break;
            }
            C0004c.C0005a next = it2.next();
            Intent intent3 = new Intent("android.intent.action.VIEW");
            if (next.m39979a() != null) {
                intent3.setData(next.m39979a());
            } else {
                intent3.setData(this.f21h.m39982a());
            }
            intent3.setPackage(next.m39976d());
            if (next.m39977c() != null) {
                intent3.setClassName(next.m39976d(), next.m39977c());
            }
            intent3.putExtra("al_applink_data", m39961b);
            if (packageManager.resolveActivity(intent3, 65536) != null) {
                intent = intent3;
                break;
            }
        }
        EnumC0008a enumC0008a2 = EnumC0008a.FAILED;
        if (intent != null) {
            intent2 = intent;
            enumC0008a = EnumC0008a.APP;
        } else {
            Uri m39980c = m39975a().m39980c();
            if (m39980c != null) {
                try {
                    intent2 = new Intent("android.intent.action.VIEW", m39980c.buildUpon().appendQueryParameter("al_applink_data", m39964a(m39961b).toString()).build());
                    enumC0008a = EnumC0008a.WEB;
                } catch (JSONException e) {
                    m39971a(context, intent, EnumC0008a.FAILED, e);
                    throw new RuntimeException(e);
                }
            } else {
                enumC0008a = enumC0008a2;
                intent2 = null;
            }
        }
        m39971a(context, intent2, enumC0008a, null);
        if (intent2 != null) {
            context.startActivity(intent2);
        }
        return enumC0008a;
    }

    /* renamed from: b */
    public Bundle m39962b() {
        return this.f23j;
    }

    /* renamed from: c */
    public Bundle m39960c() {
        return this.f22i;
    }
}
