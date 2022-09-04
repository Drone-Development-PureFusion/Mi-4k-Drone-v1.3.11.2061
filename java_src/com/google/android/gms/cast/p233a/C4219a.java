package com.google.android.gms.cast.p233a;

import com.google.android.gms.cast.C4201a;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.internal.agm;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.cast.a.a */
/* loaded from: classes2.dex */
public final class C4219a {

    /* renamed from: a */
    public static final int f16057a = 2150;

    /* renamed from: b */
    public static final int f16058b = 2151;

    /* renamed from: c */
    public static final int f16059c = 0;

    /* renamed from: d */
    public static final int f16060d = 1;

    /* renamed from: e */
    public static final int f16061e = 2;

    /* renamed from: f */
    public static final int f16062f = 3;

    /* renamed from: g */
    public static final int f16063g = 4;

    /* renamed from: h */
    public static final int f16064h = 5;

    /* renamed from: i */
    public static final int f16065i = 6;

    /* renamed from: j */
    public static final int f16066j = 0;

    /* renamed from: k */
    public static final int f16067k = 1;

    /* renamed from: l */
    public static final int f16068l = 2;

    /* renamed from: m */
    public static final int f16069m = 0;

    /* renamed from: n */
    public static final int f16070n = 1;

    /* renamed from: o */
    public static final int f16071o = 2;

    /* renamed from: p */
    public static final int f16072p = 3;

    /* renamed from: q */
    public static final int f16073q = 4;

    /* renamed from: r */
    private final agm f16074r;

    /* renamed from: com.google.android.gms.cast.a.a$a */
    /* loaded from: classes2.dex */
    public interface AbstractC4220a extends AbstractC4502m {
        /* renamed from: b */
        C4219a mo17627b();
    }

    /* renamed from: com.google.android.gms.cast.a.a$b */
    /* loaded from: classes2.dex */
    public interface AbstractC4221b extends AbstractC4502m {
        /* renamed from: b */
        String mo17626b();

        /* renamed from: c */
        long mo17625c();

        /* renamed from: d */
        JSONObject mo17624d();
    }

    /* renamed from: com.google.android.gms.cast.a.a$c */
    /* loaded from: classes2.dex */
    public interface AbstractC4222c {
        /* renamed from: a */
        void m24958a(AbstractC4223b abstractC4223b, AbstractC4223b abstractC4223b2);

        /* renamed from: a */
        void m24957a(String str, JSONObject jSONObject);
    }

    public C4219a(agm agmVar) {
        this.f16074r = agmVar;
    }

    /* renamed from: a */
    public static AbstractC4494i<AbstractC4220a> m24979a(AbstractC4489g abstractC4489g, String str) {
        return m24978a(new agm(abstractC4489g, str, C4201a.f16032l));
    }

    /* renamed from: a */
    static AbstractC4494i<AbstractC4220a> m24978a(agm agmVar) {
        return agmVar.m17662a(new C4219a(agmVar));
    }

    /* renamed from: a */
    private AbstractC4494i<AbstractC4221b> m24976a(String str, int i, JSONObject jSONObject) {
        return this.f16074r.m17656a(str, i, jSONObject);
    }

    /* renamed from: a */
    public synchronized AbstractC4223b m24981a() {
        return this.f16074r.m17646e();
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4221b> m24975a(String str, JSONObject jSONObject) {
        return m24976a(str, 3, jSONObject);
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC4221b> m24974a(JSONObject jSONObject) {
        return m24976a(m24973b(), 3, jSONObject);
    }

    /* renamed from: a */
    public void m24980a(AbstractC4222c abstractC4222c) {
        this.f16074r.m17663a(abstractC4222c);
    }

    /* renamed from: a */
    public void m24977a(String str) {
        this.f16074r.a(str);
    }

    /* renamed from: b */
    public AbstractC4494i<AbstractC4221b> m24972b(String str, JSONObject jSONObject) {
        return m24976a(str, 4, jSONObject);
    }

    /* renamed from: b */
    public AbstractC4494i<AbstractC4221b> m24971b(JSONObject jSONObject) {
        return m24976a(m24973b(), 4, jSONObject);
    }

    /* renamed from: b */
    public String m24973b() {
        return this.f16074r.m17645f();
    }

    /* renamed from: c */
    public AbstractC4494i<AbstractC4221b> m24969c(String str, JSONObject jSONObject) {
        return m24976a(str, 6, jSONObject);
    }

    /* renamed from: c */
    public AbstractC4494i<AbstractC4221b> m24968c(JSONObject jSONObject) {
        return m24976a(m24973b(), 6, jSONObject);
    }

    /* renamed from: c */
    public void m24970c() {
        this.f16074r.m17648d();
    }

    /* renamed from: d */
    public AbstractC4494i<AbstractC4221b> m24966d(String str, JSONObject jSONObject) {
        return m24976a(str, 5, jSONObject);
    }

    /* renamed from: d */
    public AbstractC4494i<AbstractC4221b> m24965d(JSONObject jSONObject) {
        return m24976a(m24973b(), 5, jSONObject);
    }

    /* renamed from: d */
    public boolean m24967d() {
        return this.f16074r.m17644g();
    }

    /* renamed from: e */
    public AbstractC4494i<AbstractC4221b> m24964e(String str, JSONObject jSONObject) {
        return m24976a(str, 2, jSONObject);
    }

    /* renamed from: e */
    public AbstractC4494i<AbstractC4221b> m24963e(JSONObject jSONObject) {
        return m24976a(m24973b(), 2, jSONObject);
    }

    /* renamed from: f */
    public AbstractC4494i<AbstractC4221b> m24962f(String str, JSONObject jSONObject) {
        return this.f16074r.m17651b(str, jSONObject);
    }

    /* renamed from: f */
    public AbstractC4494i<AbstractC4221b> m24961f(JSONObject jSONObject) {
        return m24962f(m24973b(), jSONObject);
    }

    /* renamed from: g */
    public void m24960g(String str, JSONObject jSONObject) {
        this.f16074r.m17654a(str, jSONObject);
    }

    /* renamed from: g */
    public void m24959g(JSONObject jSONObject) {
        m24960g(m24973b(), jSONObject);
    }
}
