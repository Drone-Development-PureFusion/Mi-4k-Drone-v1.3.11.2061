package com.tencent.open;

import android.net.Uri;
import android.webkit.WebView;
import com.tencent.open.p264a.C10257f;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
/* renamed from: com.tencent.open.a */
/* loaded from: classes2.dex */
public class C10241a {

    /* renamed from: b */
    private static final String f31860b = C10257f.f31917d + ".JsBridge";

    /* renamed from: a */
    protected HashMap<String, C10243b> f31861a = new HashMap<>();

    /* renamed from: com.tencent.open.a$a */
    /* loaded from: classes2.dex */
    public static class C10242a {

        /* renamed from: a */
        protected WeakReference<WebView> f31862a;

        /* renamed from: b */
        protected long f31863b;

        /* renamed from: c */
        protected String f31864c;

        public C10242a(WebView webView, long j, String str) {
            this.f31862a = new WeakReference<>(webView);
            this.f31863b = j;
            this.f31864c = str;
        }

        /* renamed from: a */
        public void mo5569a() {
            WebView webView = this.f31862a.get();
            if (webView == null) {
                return;
            }
            webView.loadUrl("javascript:window.JsBridge&&JsBridge.callback(" + this.f31863b + ",{'r':1,'result':'no such method'})");
        }

        /* renamed from: a */
        public void mo5568a(Object obj) {
            WebView webView = this.f31862a.get();
            if (webView == null) {
                return;
            }
            String str = "'undefined'";
            if (obj instanceof String) {
                str = "'" + ((Object) ((String) obj).replace("\\", "\\\\").replace("'", "\\'")) + "'";
            } else if ((obj instanceof Number) || (obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Double) || (obj instanceof Float)) {
                str = obj.toString();
            } else if (obj instanceof Boolean) {
                str = obj.toString();
            }
            webView.loadUrl("javascript:window.JsBridge&&JsBridge.callback(" + this.f31863b + ",{'r':0,'result':" + str + "});");
        }

        /* renamed from: a */
        public void mo5567a(String str) {
            WebView webView = this.f31862a.get();
            if (webView != null) {
                webView.loadUrl("javascript:" + str);
            }
        }
    }

    /* renamed from: com.tencent.open.a$b */
    /* loaded from: classes2.dex */
    public static class C10243b {
        public void call(String str, List<String> list, C10242a c10242a) {
            Object invoke;
            Method[] declaredMethods = getClass().getDeclaredMethods();
            Method method = null;
            int length = declaredMethods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Method method2 = declaredMethods[i];
                if (method2.getName().equals(str) && method2.getParameterTypes().length == list.size()) {
                    method = method2;
                    break;
                }
                try {
                    i++;
                } catch (Exception e) {
                    C10257f.m5672b(C10241a.f31860b, "-->handler call mehtod ex. targetMethod: " + ((Object) null), e);
                    if (c10242a == null) {
                        return;
                    }
                    c10242a.mo5569a();
                    return;
                }
            }
            if (method == null) {
                if (c10242a == null) {
                    return;
                }
                c10242a.mo5569a();
                return;
            }
            switch (list.size()) {
                case 0:
                    invoke = method.invoke(this, new Object[0]);
                    break;
                case 1:
                    invoke = method.invoke(this, list.get(0));
                    break;
                case 2:
                    invoke = method.invoke(this, list.get(0), list.get(1));
                    break;
                case 3:
                    invoke = method.invoke(this, list.get(0), list.get(1), list.get(2));
                    break;
                case 4:
                    invoke = method.invoke(this, list.get(0), list.get(1), list.get(2), list.get(3));
                    break;
                case 5:
                    invoke = method.invoke(this, list.get(0), list.get(1), list.get(2), list.get(3), list.get(4));
                    break;
                default:
                    invoke = method.invoke(this, list.get(0), list.get(1), list.get(2), list.get(3), list.get(4), list.get(5));
                    break;
            }
            Class<?> returnType = method.getReturnType();
            C10257f.m5673b(C10241a.f31860b, "-->call, result: " + invoke + " | ReturnType: " + returnType.getName());
            if ("void".equals(returnType.getName()) || returnType == Void.class) {
                if (c10242a == null) {
                    return;
                }
                c10242a.mo5568a((Object) null);
            } else if (c10242a == null || !customCallback()) {
            } else {
                c10242a.mo5567a(invoke != null ? invoke.toString() : null);
            }
        }

        public boolean customCallback() {
            return false;
        }
    }

    /* renamed from: a */
    public void m5726a(C10243b c10243b, String str) {
        this.f31861a.put(str, c10243b);
    }

    /* renamed from: a */
    public void mo5570a(String str, String str2, List<String> list, C10242a c10242a) {
        C10257f.m5673b(f31860b, "getResult---objName = " + str + " methodName = " + str2);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                list.set(i, URLDecoder.decode(list.get(i), "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        C10243b c10243b = this.f31861a.get(str);
        if (c10243b != null) {
            C10257f.m5673b(f31860b, "call----");
            c10243b.call(str2, list, c10242a);
            return;
        }
        C10257f.m5673b(f31860b, "not call----objName NOT FIND");
        if (c10242a == null) {
            return;
        }
        c10242a.mo5569a();
    }

    /* renamed from: a */
    public boolean mo5571a(WebView webView, String str) {
        C10257f.m5673b(f31860b, "-->canHandleUrl---url = " + str);
        if (str != null && Uri.parse(str).getScheme().equals("jsbridge")) {
            ArrayList arrayList = new ArrayList(Arrays.asList((str + "/#").split("/")));
            if (arrayList.size() < 6) {
                return false;
            }
            List<String> subList = arrayList.subList(4, arrayList.size() - 1);
            C10242a c10242a = new C10242a(webView, 4L, str);
            webView.getUrl();
            mo5570a((String) arrayList.get(2), (String) arrayList.get(3), subList, c10242a);
            return true;
        }
        return false;
    }
}
