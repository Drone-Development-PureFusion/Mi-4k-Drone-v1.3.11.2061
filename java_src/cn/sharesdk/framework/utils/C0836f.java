package cn.sharesdk.framework.utils;

import android.text.TextUtils;
import android.util.Xml;
import java.util.HashMap;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
/* renamed from: cn.sharesdk.framework.utils.f */
/* loaded from: classes.dex */
public class C0836f {

    /* renamed from: cn.sharesdk.framework.utils.f$a */
    /* loaded from: classes.dex */
    private static class C0837a extends DefaultHandler {

        /* renamed from: a */
        private HashMap<String, Object> f1677a = new HashMap<>();

        /* renamed from: b */
        private HashMap<String, Object> f1678b;

        /* renamed from: a */
        public HashMap<String, Object> m37762a() {
            return this.f1677a;
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i, int i2) {
            String trim = String.valueOf(cArr, i, i2).trim();
            if (!TextUtils.isEmpty(trim) && this.f1678b != null) {
                this.f1678b.put("value", trim);
            }
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            this.f1678b = null;
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) {
            if (this.f1678b != null) {
                HashMap<String, Object> hashMap = new HashMap<>();
                this.f1678b.put(str2, hashMap);
                this.f1678b = hashMap;
            } else {
                this.f1678b = new HashMap<>();
                this.f1677a.put(str2, this.f1678b);
            }
            int length = attributes.getLength();
            for (int i = 0; i < length; i++) {
                this.f1678b.put(attributes.getLocalName(i), attributes.getValue(i));
            }
        }
    }

    /* renamed from: a */
    public HashMap<String, Object> m37763a(String str) {
        C0837a c0837a = new C0837a();
        Xml.parse(str, c0837a);
        return c0837a.m37762a();
    }
}
