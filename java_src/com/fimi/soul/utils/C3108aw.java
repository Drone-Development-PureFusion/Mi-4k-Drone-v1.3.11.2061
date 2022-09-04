package com.fimi.soul.utils;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.util.LruCache;
import com.android.volley.toolbox.C0949k;
@TargetApi(12)
/* renamed from: com.fimi.soul.utils.aw */
/* loaded from: classes.dex */
public class C3108aw implements C0949k.AbstractC0955b {

    /* renamed from: a */
    private static LruCache<String, Bitmap> f11593a;

    /* renamed from: b */
    private static C3108aw f11594b;

    public C3108aw() {
        f11593a = new LruCache<String, Bitmap>(((int) Runtime.getRuntime().maxMemory()) / 8) { // from class: com.fimi.soul.utils.aw.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.util.LruCache
            /* renamed from: a */
            public int sizeOf(String str, Bitmap bitmap) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        };
    }

    /* renamed from: a */
    public static C3108aw m29180a() {
        if (f11594b == null) {
            f11594b = new C3108aw();
        }
        return f11594b;
    }

    @Override // com.android.volley.toolbox.C0949k.AbstractC0955b
    /* renamed from: a */
    public Bitmap mo29179a(String str) {
        return f11593a.get(str);
    }

    /* renamed from: a */
    public void m29178a(String str, int i, int i2) {
        f11593a.remove(m29175b(str, i, i2));
    }

    @Override // com.android.volley.toolbox.C0949k.AbstractC0955b
    /* renamed from: a */
    public void mo29177a(String str, Bitmap bitmap) {
        f11593a.put(str, bitmap);
    }

    /* renamed from: b */
    public String m29175b(String str, int i, int i2) {
        return new StringBuilder(str.length() + 12).append("#W").append(i).append("#H").append(i2).append(str).toString();
    }

    /* renamed from: b */
    public void m29176b() {
        f11593a.evictAll();
    }
}
