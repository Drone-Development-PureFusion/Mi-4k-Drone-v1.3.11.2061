package com.tencent.open.web.security;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.tencent.open.C10241a;
import com.tencent.open.p264a.C10257f;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* renamed from: com.tencent.open.web.security.b */
/* loaded from: classes2.dex */
public class C10292b extends C10241a {

    /* renamed from: b */
    private static final String f32037b = C10257f.f31917d + ".SecureJs";

    @Override // com.tencent.open.C10241a
    /* renamed from: a */
    public void mo5570a(String str, String str2, List<String> list, C10241a.C10242a c10242a) {
        C10257f.m5670c(f32037b, "-->getResult, objectName: " + str + " | methodName: " + str2);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                list.set(i, URLDecoder.decode(list.get(i), "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        C10241a.C10243b c10243b = this.f31861a.get(str);
        if (c10243b != null) {
            C10257f.m5673b(f32037b, "-->handler != null");
            c10243b.call(str2, list, c10242a);
            return;
        }
        C10257f.m5673b(f32037b, "-->handler == null");
        if (c10242a == null) {
            return;
        }
        c10242a.mo5569a();
    }

    @Override // com.tencent.open.C10241a
    /* renamed from: a */
    public boolean mo5571a(WebView webView, String str) {
        C10257f.m5673b(f32037b, "-->canHandleUrl---url = " + str);
        if (str != null && Uri.parse(str).getScheme().equals("jsbridge")) {
            ArrayList arrayList = new ArrayList(Arrays.asList((str + "/#").split("/")));
            if (arrayList.size() < 7) {
                return false;
            }
            String str2 = (String) arrayList.get(2);
            String str3 = (String) arrayList.get(3);
            String str4 = (String) arrayList.get(4);
            String str5 = (String) arrayList.get(5);
            C10257f.m5670c(f32037b, "-->canHandleUrl, objectName: " + str2 + " | methodName: " + str3 + " | snStr: " + str4);
            if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                return false;
            }
            try {
                mo5570a(str2, str3, arrayList.subList(6, arrayList.size() - 1), new C10293c(webView, Long.parseLong(str4), str, str5));
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }
}
