package com.p120c.p121a.p129b.p134d;

import com.facebook.common.util.UriUtil;
import java.io.InputStream;
import java.util.Locale;
/* renamed from: com.c.a.b.d.b */
/* loaded from: classes.dex */
public interface AbstractC1326b {

    /* renamed from: com.c.a.b.d.b$a */
    /* loaded from: classes.dex */
    public enum EnumC1327a {
        HTTP(UriUtil.HTTP_SCHEME),
        HTTPS(UriUtil.HTTPS_SCHEME),
        FILE("file"),
        CONTENT("content"),
        ASSETS("assets"),
        DRAWABLE("drawable"),
        UNKNOWN("");
        

        /* renamed from: h */
        private String f3388h;

        /* renamed from: i */
        private String f3389i;

        EnumC1327a(String str) {
            this.f3388h = str;
            this.f3389i = str + "://";
        }

        /* renamed from: a */
        public static EnumC1327a m35740a(String str) {
            EnumC1327a[] values;
            if (str != null) {
                for (EnumC1327a enumC1327a : values()) {
                    if (enumC1327a.m35737d(str)) {
                        return enumC1327a;
                    }
                }
            }
            return UNKNOWN;
        }

        /* renamed from: d */
        private boolean m35737d(String str) {
            return str.toLowerCase(Locale.US).startsWith(this.f3389i);
        }

        /* renamed from: b */
        public String m35739b(String str) {
            return this.f3389i + str;
        }

        /* renamed from: c */
        public String m35738c(String str) {
            if (!m35737d(str)) {
                throw new IllegalArgumentException(String.format("URI [%1$s] doesn't have expected scheme [%2$s]", str, this.f3388h));
            }
            return str.substring(this.f3389i.length());
        }
    }

    /* renamed from: a */
    InputStream mo35687a(String str, Object obj);
}
