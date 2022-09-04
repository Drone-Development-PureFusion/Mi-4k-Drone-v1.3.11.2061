package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.facebook.common.util.UriUtil;
import com.fimi.kernel.C1576a;
import com.google.android.gms.ads.internal.BinderC3698q;
import com.google.android.gms.ads.internal.formats.AbstractC3603i;
import com.google.android.gms.ads.internal.formats.BinderC3597c;
import com.google.android.gms.ads.internal.formats.BinderC3600f;
import com.google.android.gms.ads.internal.formats.C3595a;
import com.google.android.gms.ads.internal.formats.C3605j;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.C4696s;
import com.google.android.gms.internal.C8123zt;
import com.google.android.gms.internal.abi;
import com.google.android.gms.internal.acc;
import com.google.android.gms.internal.acn;
import com.google.android.gms.p232c.BinderC4173f;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@aaa
/* renamed from: com.google.android.gms.internal.zu */
/* loaded from: classes.dex */
public class CallableC8128zu implements Callable<abi> {

    /* renamed from: a */
    private static final long f26527a = TimeUnit.SECONDS.toMillis(60);

    /* renamed from: b */
    private final Context f26528b;

    /* renamed from: c */
    private final acc f26529c;

    /* renamed from: d */
    private final BinderC3698q f26530d;

    /* renamed from: e */
    private final C7667ro f26531e;

    /* renamed from: f */
    private final C8123zt f26532f;

    /* renamed from: h */
    private final abi.C6129a f26534h;

    /* renamed from: i */
    private final C7801un f26535i;

    /* renamed from: m */
    private JSONObject f26539m;

    /* renamed from: g */
    private final Object f26533g = new Object();

    /* renamed from: j */
    private boolean f26536j = false;

    /* renamed from: k */
    private int f26537k = -2;

    /* renamed from: l */
    private List<String> f26538l = null;

    /* renamed from: com.google.android.gms.internal.zu$a */
    /* loaded from: classes2.dex */
    public interface AbstractC8136a<T extends AbstractC3603i.AbstractC3604a> {
        /* renamed from: a */
        T mo12708a(CallableC8128zu callableC8128zu, JSONObject jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.zu$b */
    /* loaded from: classes2.dex */
    public class C8137b {

        /* renamed from: a */
        public AbstractC7877vt f26566a;

        C8137b() {
        }
    }

    public CallableC8128zu(Context context, BinderC3698q binderC3698q, acc accVar, C7667ro c7667ro, abi.C6129a c6129a, C7801un c7801un) {
        this.f26528b = context;
        this.f26530d = binderC3698q;
        this.f26529c = accVar;
        this.f26534h = c6129a;
        this.f26531e = c7667ro;
        this.f26535i = c7801un;
        this.f26532f = m12757a(context, c6129a, binderC3698q, c7667ro);
        this.f26532f.m12778a();
    }

    /* renamed from: a */
    private AbstractC3603i.AbstractC3604a m12753a(AbstractC8136a abstractC8136a, JSONObject jSONObject, String str) {
        if (m12742b() || abstractC8136a == null || jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("tracking_urls_and_actions");
        String[] m12736c = m12736c(jSONObject2, "impression_tracking_urls");
        this.f26538l = m12736c == null ? null : Arrays.asList(m12736c);
        this.f26539m = jSONObject2.optJSONObject("active_view");
        AbstractC3603i.AbstractC3604a mo12708a = abstractC8136a.mo12708a(this, jSONObject);
        if (mo12708a == null) {
            abr.b("Failed to retrieve ad assets.");
            return null;
        }
        mo12708a.mo27381a(new C3605j(this.f26528b, this.f26530d, this.f26532f, this.f26531e, jSONObject, mo12708a, this.f26534h.f20920a.f14495k, str));
        return mo12708a;
    }

    /* renamed from: a */
    private aco<BinderC3597c> m12743a(JSONObject jSONObject, final boolean z, boolean z2) {
        final String string = z ? jSONObject.getString("url") : jSONObject.optString("url");
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        final boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        if (!TextUtils.isEmpty(string)) {
            return z2 ? new acm(new BinderC3597c(null, Uri.parse(string), optDouble)) : this.f26529c.m18244a(string, new acc.AbstractC6182a<BinderC3597c>() { // from class: com.google.android.gms.internal.zu.6
                @Override // com.google.android.gms.internal.acc.AbstractC6182a
                /* renamed from: a */
                public BinderC3597c mo12729b() {
                    CallableC8128zu.this.m12758a(2, z);
                    return null;
                }

                @Override // com.google.android.gms.internal.acc.AbstractC6182a
                @TargetApi(19)
                /* renamed from: a */
                public BinderC3597c mo12728b(InputStream inputStream) {
                    Bitmap bitmap;
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inDensity = (int) (160.0d * optDouble);
                    if (!optBoolean) {
                        options.inPreferredConfig = Bitmap.Config.RGB_565;
                    }
                    try {
                        bitmap = BitmapFactory.decodeStream(inputStream, null, options);
                    } catch (Exception e) {
                        abr.b("Error grabbing image.", e);
                        bitmap = null;
                    }
                    if (bitmap == null) {
                        CallableC8128zu.this.m12758a(2, z);
                        return null;
                    }
                    if (C4696s.m23106h()) {
                        int width = bitmap.getWidth();
                        abr.m18409e(new StringBuilder(61).append("Decoded image w: ").append(width).append(" h:").append(bitmap.getHeight()).append(" bytes: ").append(bitmap.getAllocationByteCount()).toString());
                    }
                    return new BinderC3597c(new BitmapDrawable(Resources.getSystem(), bitmap), Uri.parse(string), optDouble);
                }
            });
        }
        m12758a(0, z);
        return new acm(null);
    }

    /* renamed from: a */
    private JSONObject m12750a(final String str) {
        if (m12742b()) {
            return null;
        }
        final acl aclVar = new acl();
        final C8137b c8137b = new C8137b();
        this.f26532f.m12776a(new C8123zt.AbstractC8127a() { // from class: com.google.android.gms.internal.zu.1
            @Override // com.google.android.gms.internal.C8123zt.AbstractC8127a
            /* renamed from: a */
            public void mo12735a() {
                aclVar.m18209b((acl) null);
            }

            @Override // com.google.android.gms.internal.C8123zt.AbstractC8127a
            /* renamed from: a */
            public void mo12734a(final AbstractC7980wy abstractC7980wy) {
                AbstractC7877vt abstractC7877vt = new AbstractC7877vt() { // from class: com.google.android.gms.internal.zu.1.1
                    @Override // com.google.android.gms.internal.AbstractC7877vt
                    /* renamed from: a */
                    public void mo12713a(acy acyVar, Map<String, String> map) {
                        abstractC7980wy.mo13110b("/nativeAdPreProcess", c8137b.f26566a);
                        try {
                            String str2 = map.get("success");
                            if (!TextUtils.isEmpty(str2)) {
                                aclVar.m18209b((acl) new JSONObject(str2).getJSONArray("ads").getJSONObject(0));
                                return;
                            }
                        } catch (JSONException e) {
                            abr.b("Malformed native JSON response.", e);
                        }
                        CallableC8128zu.this.m12759a(0);
                        C4588d.m23622a(CallableC8128zu.this.m12742b(), "Unable to set the ad state error!");
                        aclVar.m18209b((acl) null);
                    }
                };
                c8137b.f26566a = abstractC7877vt;
                abstractC7980wy.mo13113a("/nativeAdPreProcess", abstractC7877vt);
                try {
                    JSONObject jSONObject = new JSONObject(CallableC8128zu.this.f26534h.f20921b.f14567c);
                    jSONObject.put("ads_id", str);
                    abstractC7980wy.mo13111a("google.afma.nativeAds.preProcessJsonGmsg", jSONObject);
                } catch (JSONException e) {
                    abr.d("Exception occurred while invoking javascript", e);
                    aclVar.m18209b((acl) null);
                }
            }
        });
        return (JSONObject) aclVar.get(f26527a, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    private void m12755a(AbstractC3603i.AbstractC3604a abstractC3604a) {
        if (!(abstractC3604a instanceof BinderC3600f)) {
            return;
        }
        final BinderC3600f binderC3600f = (BinderC3600f) abstractC3604a;
        C8137b c8137b = new C8137b();
        final AbstractC7877vt abstractC7877vt = new AbstractC7877vt() { // from class: com.google.android.gms.internal.zu.3
            @Override // com.google.android.gms.internal.AbstractC7877vt
            /* renamed from: a */
            public void mo12713a(acy acyVar, Map<String, String> map) {
                CallableC8128zu.this.m12754a(binderC3600f, map.get(UriUtil.LOCAL_ASSET_SCHEME));
            }
        };
        c8137b.f26566a = abstractC7877vt;
        this.f26532f.m12776a(new C8123zt.AbstractC8127a() { // from class: com.google.android.gms.internal.zu.4
            @Override // com.google.android.gms.internal.C8123zt.AbstractC8127a
            /* renamed from: a */
            public void mo12734a(AbstractC7980wy abstractC7980wy) {
                abstractC7980wy.mo13113a("/nativeAdCustomClick", abstractC7877vt);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m12754a(AbstractC7835vd abstractC7835vd, String str) {
        try {
            AbstractC7845vh m27051c = this.f26530d.m27051c(abstractC7835vd.mo13338l());
            if (m27051c == null) {
                return;
            }
            m27051c.mo13321a(abstractC7835vd, str);
        } catch (RemoteException e) {
            abr.d(new StringBuilder(String.valueOf(str).length() + 40).append("Failed to call onCustomClick for asset ").append(str).append(".").toString(), e);
        }
    }

    /* renamed from: b */
    private abi m12741b(AbstractC3603i.AbstractC3604a abstractC3604a) {
        int i;
        synchronized (this.f26533g) {
            i = this.f26537k;
            if (abstractC3604a == null && this.f26537k == -2) {
                i = 0;
            }
        }
        return new abi(this.f26534h.f20920a.f14487c, null, this.f26534h.f20921b.f14568d, i, this.f26534h.f20921b.f14570f, this.f26538l, this.f26534h.f20921b.f14576l, this.f26534h.f20921b.f14575k, this.f26534h.f20920a.f14493i, false, null, null, null, null, null, 0L, this.f26534h.f20923d, this.f26534h.f20921b.f14571g, this.f26534h.f20925f, this.f26534h.f20926g, this.f26534h.f20921b.f14579o, this.f26539m, i != -2 ? null : abstractC3604a, null, null, null, this.f26534h.f20921b.f14555F, this.f26534h.f20921b.f14556G, null, this.f26534h.f20921b.f14559J, this.f26534h.f20921b.f14563N);
    }

    /* renamed from: b */
    private Integer m12737b(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException e) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static List<Drawable> m12739b(List<BinderC3597c> list) {
        ArrayList arrayList = new ArrayList();
        for (BinderC3597c binderC3597c : list) {
            arrayList.add((Drawable) BinderC4173f.m25294a(binderC3597c.mo13407a()));
        }
        return arrayList;
    }

    /* renamed from: c */
    private String[] m12736c(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        String[] strArr = new String[optJSONArray.length()];
        for (int i = 0; i < optJSONArray.length(); i++) {
            strArr[i] = optJSONArray.getString(i);
        }
        return strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @Override // java.util.concurrent.Callable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public abi call() {
        try {
            this.f26532f.m12774b();
            String uuid = UUID.randomUUID().toString();
            JSONObject m12750a = m12750a(uuid);
            AbstractC3603i.AbstractC3604a m12753a = m12753a(m12748a(m12750a), m12750a, uuid);
            m12755a(m12753a);
            return m12741b(m12753a);
        } catch (InterruptedException e) {
            if (!this.f26536j) {
                m12759a(0);
            }
            return m12741b((AbstractC3603i.AbstractC3604a) null);
        } catch (CancellationException e2) {
            if (!this.f26536j) {
            }
            return m12741b((AbstractC3603i.AbstractC3604a) null);
        } catch (ExecutionException e3) {
            if (!this.f26536j) {
            }
            return m12741b((AbstractC3603i.AbstractC3604a) null);
        } catch (TimeoutException e4) {
            abr.d("Timeout when loading native ad.", e4);
            if (!this.f26536j) {
            }
            return m12741b((AbstractC3603i.AbstractC3604a) null);
        } catch (JSONException e5) {
            abr.d("Malformed native JSON response.", e5);
            if (!this.f26536j) {
            }
            return m12741b((AbstractC3603i.AbstractC3604a) null);
        }
    }

    /* renamed from: a */
    public aco<acy> m12747a(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return new acm(null);
        }
        if (!TextUtils.isEmpty(optJSONObject.optString("vast_xml"))) {
            return m12756a(this.f26528b, this.f26531e, this.f26534h, this.f26535i, this.f26530d).m12719a(optJSONObject);
        }
        abr.d("Required field 'vast_xml' is missing");
        return new acm(null);
    }

    /* renamed from: a */
    public aco<BinderC3597c> m12745a(JSONObject jSONObject, String str, boolean z, boolean z2) {
        JSONObject jSONObject2 = z ? jSONObject.getJSONObject(str) : jSONObject.optJSONObject(str);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return m12743a(jSONObject2, z, z2);
    }

    /* renamed from: a */
    C8123zt m12757a(Context context, abi.C6129a c6129a, BinderC3698q binderC3698q, C7667ro c7667ro) {
        return new C8123zt(context, c6129a, binderC3698q, c7667ro);
    }

    /* renamed from: a */
    protected AbstractC8136a m12748a(JSONObject jSONObject) {
        if (m12742b() || jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("template_id");
        boolean z = this.f26534h.f20920a.f14510z != null ? this.f26534h.f20920a.f14510z.f14075b : false;
        boolean z2 = this.f26534h.f20920a.f14510z != null ? this.f26534h.f20920a.f14510z.f14077d : false;
        if ("2".equals(string)) {
            return new C8145zw(z, z2);
        }
        if ("1".equals(string)) {
            return new C8146zx(z, z2);
        }
        if ("3".equals(string)) {
            final String string2 = jSONObject.getString("custom_template_id");
            final acl aclVar = new acl();
            abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.internal.zu.2
                @Override // java.lang.Runnable
                public void run() {
                    aclVar.m18209b((acl) CallableC8128zu.this.f26530d.m27068F().get(string2));
                }
            });
            if (aclVar.get(f26527a, TimeUnit.MILLISECONDS) != null) {
                return new C8147zy(z);
            }
            String valueOf = String.valueOf(jSONObject.getString("custom_template_id"));
            abr.b(valueOf.length() != 0 ? "No handler for custom template: ".concat(valueOf) : new String("No handler for custom template: "));
        } else {
            m12759a(0);
        }
        return null;
    }

    /* renamed from: a */
    C8138zv m12756a(Context context, C7667ro c7667ro, abi.C6129a c6129a, C7801un c7801un, BinderC3698q binderC3698q) {
        return new C8138zv(context, c7667ro, c6129a, c7801un, binderC3698q);
    }

    /* renamed from: a */
    public List<aco<BinderC3597c>> m12744a(JSONObject jSONObject, String str, boolean z, boolean z2, boolean z3) {
        JSONArray jSONArray = z ? jSONObject.getJSONArray(str) : jSONObject.optJSONArray(str);
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null || jSONArray.length() == 0) {
            m12758a(0, z);
            return arrayList;
        }
        int length = z3 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            arrayList.add(m12743a(jSONObject2, z, z2));
        }
        return arrayList;
    }

    /* renamed from: a */
    public Future<BinderC3597c> m12746a(JSONObject jSONObject, String str, boolean z) {
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        boolean optBoolean = jSONObject2.optBoolean("require", true);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return m12743a(jSONObject2, optBoolean, z);
    }

    /* renamed from: a */
    public void m12759a(int i) {
        synchronized (this.f26533g) {
            this.f26536j = true;
            this.f26537k = i;
        }
    }

    /* renamed from: a */
    public void m12758a(int i, boolean z) {
        if (z) {
            m12759a(i);
        }
    }

    /* renamed from: b */
    public aco<C3595a> m12738b(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return new acm(null);
        }
        final String optString = optJSONObject.optString("text");
        final int optInt = optJSONObject.optInt("text_size", -1);
        final Integer m12737b = m12737b(optJSONObject, "text_color");
        final Integer m12737b2 = m12737b(optJSONObject, "bg_color");
        final int optInt2 = optJSONObject.optInt("animation_ms", 1000);
        final int optInt3 = optJSONObject.optInt("presentation_ms", 4000);
        final int i = (this.f26534h.f20920a.f14510z == null || this.f26534h.f20920a.f14510z.f14074a < 2) ? 1 : this.f26534h.f20920a.f14510z.f14078e;
        List<aco<BinderC3597c>> arrayList = new ArrayList<>();
        if (optJSONObject.optJSONArray(C1576a.f3872b) != null) {
            arrayList = m12744a(optJSONObject, C1576a.f3872b, false, false, true);
        } else {
            arrayList.add(m12745a(optJSONObject, "image", false, false));
        }
        return acn.m18207a(acn.m18206a(arrayList), new acn.AbstractC6190a<List<BinderC3597c>, C3595a>() { // from class: com.google.android.gms.internal.zu.5
            @Override // com.google.android.gms.internal.acn.AbstractC6190a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public C3595a mo12733a(List<BinderC3597c> list) {
                C3595a c3595a;
                if (list != null) {
                    try {
                        if (!list.isEmpty()) {
                            c3595a = new C3595a(optString, CallableC8128zu.m12739b(list), m12737b2, m12737b, optInt > 0 ? Integer.valueOf(optInt) : null, optInt3 + optInt2, i);
                            return c3595a;
                        }
                    } catch (RemoteException e) {
                        abr.b("Could not get attribution icon", e);
                        return null;
                    }
                }
                c3595a = null;
                return c3595a;
            }
        });
    }

    /* renamed from: b */
    public boolean m12742b() {
        boolean z;
        synchronized (this.f26533g) {
            z = this.f26536j;
        }
        return z;
    }
}
