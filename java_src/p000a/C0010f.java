package p000a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.Map;
/* renamed from: a.f */
/* loaded from: classes.dex */
public final class C0010f {

    /* renamed from: a */
    static final String f31a = "al_applink_data";

    /* renamed from: b */
    static final String f32b = "extras";

    /* renamed from: c */
    static final String f33c = "target_url";

    /* renamed from: a */
    public static Uri m39954a(Context context, Intent intent) {
        String string;
        Bundle m39953a = m39953a(intent);
        if (m39953a == null || (string = m39953a.getString(f33c)) == null) {
            return null;
        }
        C0017k.m39942a(context, C0017k.f45e, intent, (Map<String, String>) null);
        return Uri.parse(string);
    }

    /* renamed from: a */
    public static Bundle m39953a(Intent intent) {
        return intent.getBundleExtra(f31a);
    }

    /* renamed from: b */
    public static Bundle m39952b(Intent intent) {
        Bundle m39953a = m39953a(intent);
        if (m39953a == null) {
            return null;
        }
        return m39953a.getBundle(f32b);
    }

    /* renamed from: c */
    public static Uri m39951c(Intent intent) {
        String string;
        Bundle m39953a = m39953a(intent);
        return (m39953a == null || (string = m39953a.getString(f33c)) == null) ? intent.getData() : Uri.parse(string);
    }
}
