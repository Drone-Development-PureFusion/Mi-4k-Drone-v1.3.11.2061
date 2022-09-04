package com.google.android.gms.internal;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.DocumentSection;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.internal.amm;
import com.google.android.gms.p231b.C4146a;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class aef {
    /* renamed from: a */
    public static DocumentSection m17897a(String str, amm.C6573c c6573c) {
        return new DocumentSection(AbstractC7649rd.m13857a(c6573c), new RegisterSectionInfo.C3949a(str).m25947a(true).m25946b(str).m25948a("blob").m25950a());
    }

    /* renamed from: a */
    public static UsageInfo m17899a(C4146a c4146a, long j, String str, int i) {
        int i2;
        boolean z = false;
        Bundle bundle = new Bundle();
        bundle.putAll(c4146a.a());
        Bundle bundle2 = bundle.getBundle("object");
        Uri parse = bundle2.containsKey("id") ? Uri.parse(bundle2.getString("id")) : null;
        String string = bundle2.getString("name");
        String string2 = bundle2.getString("type");
        Intent m17886a = aeh.m17886a(str, Uri.parse(bundle2.getString("url")));
        DocumentContents.C3948a m25943a = UsageInfo.m25943a(m17886a, string, parse, string2, null);
        if (bundle.containsKey(".private:ssbContext")) {
            m25943a.m25955a(DocumentSection.m25951a(bundle.getByteArray(".private:ssbContext")));
            bundle.remove(".private:ssbContext");
        }
        if (bundle.containsKey(".private:accountName")) {
            m25943a.m25956a(new Account(bundle.getString(".private:accountName"), "com.google"));
            bundle.remove(".private:accountName");
        }
        if (!bundle.containsKey(".private:isContextOnly") || !bundle.getBoolean(".private:isContextOnly")) {
            i2 = 0;
        } else {
            i2 = 4;
            bundle.remove(".private:isContextOnly");
        }
        if (bundle.containsKey(".private:isDeviceOnly")) {
            z = bundle.getBoolean(".private:isDeviceOnly", false);
            bundle.remove(".private:isDeviceOnly");
        }
        m25943a.m25955a(m17897a(".private:action", m17900a(bundle)));
        return new UsageInfo.C3951a().m25932a(UsageInfo.m25940a(str, m17886a)).m25934a(j).m25935a(i2).m25933a(m25943a.m25957a()).m25931a(z).m25930b(i).m25936a();
    }

    /* renamed from: a */
    private static amm.C6572b m17898a(String str, Bundle bundle) {
        amm.C6572b c6572b = new amm.C6572b();
        c6572b.f22291a = str;
        c6572b.f22292b = new amm.C6574d();
        c6572b.f22292b.f22299e = m17900a(bundle);
        return c6572b;
    }

    /* renamed from: a */
    private static amm.C6572b m17896a(String str, String str2) {
        amm.C6572b c6572b = new amm.C6572b();
        c6572b.f22291a = str;
        c6572b.f22292b = new amm.C6574d();
        c6572b.f22292b.f22296b = str2;
        return c6572b;
    }

    /* renamed from: a */
    private static amm.C6572b m17895a(String str, boolean z) {
        amm.C6572b c6572b = new amm.C6572b();
        c6572b.f22291a = str;
        c6572b.f22292b = new amm.C6574d();
        c6572b.f22292b.f22295a = z;
        return c6572b;
    }

    /* renamed from: a */
    public static amm.C6573c m17900a(Bundle bundle) {
        String[] strArr;
        Bundle[] bundleArr;
        ArrayList arrayList = new ArrayList();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof String) {
                arrayList.add(m17896a(str, (String) obj));
            } else if (obj instanceof Bundle) {
                arrayList.add(m17898a(str, (Bundle) obj));
            } else if (obj instanceof String[]) {
                for (String str2 : (String[]) obj) {
                    if (str2 != null) {
                        arrayList.add(m17896a(str, str2));
                    }
                }
            } else if (obj instanceof Bundle[]) {
                for (Bundle bundle2 : (Bundle[]) obj) {
                    if (bundle2 != null) {
                        arrayList.add(m17898a(str, bundle2));
                    }
                }
            } else if (obj instanceof Boolean) {
                arrayList.add(m17895a(str, ((Boolean) obj).booleanValue()));
            } else {
                String valueOf = String.valueOf(obj);
                Log.e("SearchIndex", new StringBuilder(String.valueOf(valueOf).length() + 19).append("Unsupported value: ").append(valueOf).toString());
            }
        }
        amm.C6573c c6573c = new amm.C6573c();
        if (bundle.containsKey("type")) {
            c6573c.f22293a = bundle.getString("type");
        }
        c6573c.f22294b = (amm.C6572b[]) arrayList.toArray(new amm.C6572b[arrayList.size()]);
        return c6573c;
    }
}
