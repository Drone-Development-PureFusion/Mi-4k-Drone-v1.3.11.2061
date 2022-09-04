package com.p120c.p121a.p129b.p132b;

import android.annotation.TargetApi;
import android.graphics.BitmapFactory;
import android.os.Build;
import com.p120c.p121a.p129b.C1311c;
import com.p120c.p121a.p129b.p130a.C1300e;
import com.p120c.p121a.p129b.p130a.EnumC1299d;
import com.p120c.p121a.p129b.p130a.EnumC1303h;
import com.p120c.p121a.p129b.p134d.AbstractC1326b;
/* renamed from: com.c.a.b.b.c */
/* loaded from: classes.dex */
public class C1310c {

    /* renamed from: a */
    private final String f3296a;

    /* renamed from: b */
    private final String f3297b;

    /* renamed from: c */
    private final String f3298c;

    /* renamed from: d */
    private final C1300e f3299d;

    /* renamed from: e */
    private final EnumC1299d f3300e;

    /* renamed from: f */
    private final EnumC1303h f3301f;

    /* renamed from: g */
    private final AbstractC1326b f3302g;

    /* renamed from: h */
    private final Object f3303h;

    /* renamed from: i */
    private final boolean f3304i;

    /* renamed from: j */
    private final BitmapFactory.Options f3305j = new BitmapFactory.Options();

    public C1310c(String str, String str2, String str3, C1300e c1300e, EnumC1303h enumC1303h, AbstractC1326b abstractC1326b, C1311c c1311c) {
        this.f3296a = str;
        this.f3297b = str2;
        this.f3298c = str3;
        this.f3299d = c1300e;
        this.f3300e = c1311c.m35863j();
        this.f3301f = enumC1303h;
        this.f3302g = abstractC1326b;
        this.f3303h = c1311c.m35855n();
        this.f3304i = c1311c.m35857m();
        m35896a(c1311c.m35861k(), this.f3305j);
    }

    /* renamed from: a */
    private void m35896a(BitmapFactory.Options options, BitmapFactory.Options options2) {
        options2.inDensity = options.inDensity;
        options2.inDither = options.inDither;
        options2.inInputShareable = options.inInputShareable;
        options2.inJustDecodeBounds = options.inJustDecodeBounds;
        options2.inPreferredConfig = options.inPreferredConfig;
        options2.inPurgeable = options.inPurgeable;
        options2.inSampleSize = options.inSampleSize;
        options2.inScaled = options.inScaled;
        options2.inScreenDensity = options.inScreenDensity;
        options2.inTargetDensity = options.inTargetDensity;
        options2.inTempStorage = options.inTempStorage;
        if (Build.VERSION.SDK_INT >= 10) {
            m35894b(options, options2);
        }
        if (Build.VERSION.SDK_INT >= 11) {
            m35892c(options, options2);
        }
    }

    @TargetApi(10)
    /* renamed from: b */
    private void m35894b(BitmapFactory.Options options, BitmapFactory.Options options2) {
        options2.inPreferQualityOverSpeed = options.inPreferQualityOverSpeed;
    }

    @TargetApi(11)
    /* renamed from: c */
    private void m35892c(BitmapFactory.Options options, BitmapFactory.Options options2) {
        options2.inBitmap = options.inBitmap;
        options2.inMutable = options.inMutable;
    }

    /* renamed from: a */
    public String m35897a() {
        return this.f3296a;
    }

    /* renamed from: b */
    public String m35895b() {
        return this.f3297b;
    }

    /* renamed from: c */
    public String m35893c() {
        return this.f3298c;
    }

    /* renamed from: d */
    public C1300e m35891d() {
        return this.f3299d;
    }

    /* renamed from: e */
    public EnumC1299d m35890e() {
        return this.f3300e;
    }

    /* renamed from: f */
    public EnumC1303h m35889f() {
        return this.f3301f;
    }

    /* renamed from: g */
    public AbstractC1326b m35888g() {
        return this.f3302g;
    }

    /* renamed from: h */
    public Object m35887h() {
        return this.f3303h;
    }

    /* renamed from: i */
    public boolean m35886i() {
        return this.f3304i;
    }

    /* renamed from: j */
    public BitmapFactory.Options m35885j() {
        return this.f3305j;
    }
}
