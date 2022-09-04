package p005b.p006a.p007a.p008a.p009a;

import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import p005b.p006a.p007a.p029b.AbstractC0427f;
import p005b.p006a.p007a.p029b.C0494h;
import p005b.p006a.p007a.p029b.p030a.AbstractC0402a;
import p005b.p006a.p007a.p029b.p056p.AbstractC0686k;
import p005b.p006a.p007a.p029b.p056p.C0688m;
import p005b.p006a.p007a.p029b.p058r.C0720s;
/* renamed from: b.a.a.a.a.b */
/* loaded from: classes.dex */
public class C0266b {
    /* renamed from: a */
    public static void m39846a(AbstractC0427f abstractC0427f) {
        C0264a c0264a = new C0264a();
        c0264a.m39857a(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        c0264a.m39859a("manifest");
        AbstractC0686k mo39315n = abstractC0427f.mo39315n();
        InputStream resourceAsStream = C0720s.m38398a(abstractC0427f).getResourceAsStream("AndroidManifest.xml");
        if (resourceAsStream == null) {
            mo39315n.mo38506a(new C0688m("Could not find AndroidManifest.xml", abstractC0427f));
            return;
        }
        try {
            c0264a.a(resourceAsStream);
            abstractC0427f.mo39319a(C0494h.f697R, AbstractC0402a.m39417a());
            Map<String, String> m39860a = c0264a.m39860a();
            for (String str : m39860a.keySet()) {
                if (str.equals("android:versionName")) {
                    abstractC0427f.mo39319a(C0494h.f699T, m39860a.get(str));
                } else if (str.equals("android:versionCode")) {
                    abstractC0427f.mo39319a(C0494h.f700U, m39860a.get(str));
                } else if (str.equals("package")) {
                    abstractC0427f.mo39319a(C0494h.f698S, m39860a.get(str));
                }
            }
            String str2 = m39860a.get("package");
            if (str2 == null || str2.length() <= 0) {
                mo39315n.mo38506a(new C0688m("Package name not found. Some properties cannot be set.", abstractC0427f));
            } else {
                abstractC0427f.mo39319a(C0494h.f696Q, AbstractC0402a.m39416a(str2));
            }
        } finally {
            try {
                resourceAsStream.close();
            } catch (IOException e) {
            }
        }
    }
}
