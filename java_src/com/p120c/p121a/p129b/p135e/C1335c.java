package com.p120c.p121a.p129b.p135e;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.p120c.p121a.p129b.p130a.C1300e;
import com.p120c.p121a.p129b.p130a.EnumC1303h;
/* renamed from: com.c.a.b.e.c */
/* loaded from: classes.dex */
public class C1335c implements AbstractC1333a {

    /* renamed from: a */
    protected final String f3444a;

    /* renamed from: b */
    protected final C1300e f3445b;

    /* renamed from: c */
    protected final EnumC1303h f3446c;

    public C1335c(C1300e c1300e, EnumC1303h enumC1303h) {
        this(null, c1300e, enumC1303h);
    }

    public C1335c(String str, C1300e c1300e, EnumC1303h enumC1303h) {
        if (c1300e == null) {
            throw new IllegalArgumentException("imageSize must not be null");
        }
        if (enumC1303h == null) {
            throw new IllegalArgumentException("scaleType must not be null");
        }
        this.f3444a = str;
        this.f3445b = c1300e;
        this.f3446c = enumC1303h;
    }

    @Override // com.p120c.p121a.p129b.p135e.AbstractC1333a
    /* renamed from: a */
    public int mo35686a() {
        return this.f3445b.m35911a();
    }

    @Override // com.p120c.p121a.p129b.p135e.AbstractC1333a
    /* renamed from: a */
    public boolean mo35685a(Bitmap bitmap) {
        return true;
    }

    @Override // com.p120c.p121a.p129b.p135e.AbstractC1333a
    /* renamed from: a */
    public boolean mo35683a(Drawable drawable) {
        return true;
    }

    @Override // com.p120c.p121a.p129b.p135e.AbstractC1333a
    /* renamed from: b */
    public int mo35681b() {
        return this.f3445b.m35908b();
    }

    @Override // com.p120c.p121a.p129b.p135e.AbstractC1333a
    /* renamed from: c */
    public EnumC1303h mo35680c() {
        return this.f3446c;
    }

    @Override // com.p120c.p121a.p129b.p135e.AbstractC1333a
    /* renamed from: d */
    public View mo35679d() {
        return null;
    }

    @Override // com.p120c.p121a.p129b.p135e.AbstractC1333a
    /* renamed from: e */
    public boolean mo35678e() {
        return false;
    }

    @Override // com.p120c.p121a.p129b.p135e.AbstractC1333a
    /* renamed from: f */
    public int mo35677f() {
        return TextUtils.isEmpty(this.f3444a) ? super.hashCode() : this.f3444a.hashCode();
    }
}
