package com.baidu.tts.p114m;

import android.text.TextUtils;
import com.baidu.tts.p102f.EnumC1177i;
import com.baidu.tts.p115n.AbstractC1241a;
import java.io.UnsupportedEncodingException;
/* renamed from: com.baidu.tts.m.i */
/* loaded from: classes.dex */
public class C1238i extends AbstractC1241a<C1238i> {

    /* renamed from: a */
    private String f3083a;

    /* renamed from: b */
    private String f3084b;

    /* renamed from: c */
    private String f3085c = "0";

    /* renamed from: d */
    private EnumC1177i f3086d;

    /* renamed from: e */
    private String f3087e;

    public C1238i(String str, String str2) {
        m36136b(str);
        m36132d(str2);
    }

    /* renamed from: a */
    public void m36140a() {
        if (!TextUtils.isEmpty(this.f3087e)) {
            this.f3083a = this.f3087e + this.f3083a;
        }
    }

    /* renamed from: a */
    public void m36139a(EnumC1177i enumC1177i) {
        this.f3086d = enumC1177i;
    }

    /* renamed from: a */
    public void m36138a(String str) {
        this.f3087e = str;
    }

    /* renamed from: b */
    public String m36137b() {
        return this.f3087e;
    }

    /* renamed from: b */
    public void m36136b(String str) {
        this.f3083a = str;
    }

    /* renamed from: c */
    public String m36135c() {
        return this.f3083a;
    }

    /* renamed from: c */
    public void m36134c(String str) {
        this.f3084b = str;
    }

    /* renamed from: d */
    public String m36133d() {
        return this.f3084b;
    }

    /* renamed from: d */
    public void m36132d(String str) {
        if (str == null) {
            str = "0";
        }
        this.f3085c = str;
    }

    /* renamed from: e */
    public byte[] m36131e() {
        try {
            return this.f3083a.getBytes(this.f3084b);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: f */
    public String m36130f() {
        return this.f3085c;
    }

    /* renamed from: g */
    public EnumC1177i m36129g() {
        return this.f3086d;
    }
}
