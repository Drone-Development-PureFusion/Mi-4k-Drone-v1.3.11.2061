package com.google.android.gms.ads.internal.formats;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.aaa;
import java.util.List;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;
@aaa
/* renamed from: com.google.android.gms.ads.internal.formats.a */
/* loaded from: classes.dex */
public class C3595a {

    /* renamed from: e */
    private final String f14084e;

    /* renamed from: f */
    private final List<Drawable> f14085f;

    /* renamed from: g */
    private final int f14086g;

    /* renamed from: h */
    private final int f14087h;

    /* renamed from: i */
    private final int f14088i;

    /* renamed from: j */
    private final int f14089j;

    /* renamed from: k */
    private final int f14090k;

    /* renamed from: c */
    private static final int f14082c = Color.rgb(12, (int) Opcodes.FRETURN, 206);

    /* renamed from: d */
    private static final int f14083d = Color.rgb(204, 204, 204);

    /* renamed from: a */
    static final int f14080a = f14083d;

    /* renamed from: b */
    static final int f14081b = f14082c;

    public C3595a(String str, List<Drawable> list, Integer num, Integer num2, Integer num3, int i, int i2) {
        this.f14084e = str;
        this.f14085f = list;
        this.f14086g = num != null ? num.intValue() : f14080a;
        this.f14087h = num2 != null ? num2.intValue() : f14081b;
        this.f14088i = num3 != null ? num3.intValue() : 12;
        this.f14089j = i;
        this.f14090k = i2;
    }

    /* renamed from: a */
    public String m27393a() {
        return this.f14084e;
    }

    /* renamed from: b */
    public List<Drawable> m27392b() {
        return this.f14085f;
    }

    /* renamed from: c */
    public int m27391c() {
        return this.f14086g;
    }

    /* renamed from: d */
    public int m27390d() {
        return this.f14087h;
    }

    /* renamed from: e */
    public int m27389e() {
        return this.f14088i;
    }

    /* renamed from: f */
    public int m27388f() {
        return this.f14089j;
    }

    /* renamed from: g */
    public int m27387g() {
        return this.f14090k;
    }
}
