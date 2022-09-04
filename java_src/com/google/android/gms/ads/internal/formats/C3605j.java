package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.ads.internal.BinderC3698q;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.AbstractC3603i;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.AbstractC7813uu;
import com.google.android.gms.internal.AbstractC7877vt;
import com.google.android.gms.internal.AbstractC7980wy;
import com.google.android.gms.internal.C7667ro;
import com.google.android.gms.internal.C7788uf;
import com.google.android.gms.internal.C8123zt;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.acz;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
@aaa
/* renamed from: com.google.android.gms.ads.internal.formats.j */
/* loaded from: classes.dex */
public class C3605j implements AbstractC3603i {

    /* renamed from: b */
    private final BinderC3698q f14134b;

    /* renamed from: c */
    private final Context f14135c;
    @Nullable

    /* renamed from: d */
    private final JSONObject f14136d;
    @Nullable

    /* renamed from: e */
    private final C8123zt f14137e;
    @Nullable

    /* renamed from: f */
    private final AbstractC3603i.AbstractC3604a f14138f;

    /* renamed from: g */
    private final C7667ro f14139g;
    @Nullable

    /* renamed from: h */
    private final VersionInfoParcel f14140h;

    /* renamed from: i */
    private boolean f14141i;

    /* renamed from: j */
    private acy f14142j;

    /* renamed from: k */
    private String f14143k;
    @Nullable

    /* renamed from: l */
    private String f14144l;

    /* renamed from: a */
    private final Object f14133a = new Object();

    /* renamed from: m */
    private WeakReference<View> f14145m = null;

    /* renamed from: com.google.android.gms.ads.internal.formats.j$3 */
    /* loaded from: classes2.dex */
    class C36083 extends C8123zt.AbstractC8127a {
        C36083() {
        }

        @Override // com.google.android.gms.internal.C8123zt.AbstractC8127a
        /* renamed from: a */
        public void mo12734a(final AbstractC7980wy abstractC7980wy) {
            abstractC7980wy.mo13113a("/loadHtml", new AbstractC7877vt() { // from class: com.google.android.gms.ads.internal.formats.j.3.1
                @Override // com.google.android.gms.internal.AbstractC7877vt
                /* renamed from: a */
                public void mo12713a(acy acyVar, final Map<String, String> map) {
                    C3605j.this.f14142j.mo18084l().m18174a(new acz.AbstractC6197a() { // from class: com.google.android.gms.ads.internal.formats.j.3.1.1
                        @Override // com.google.android.gms.internal.acz.AbstractC6197a
                        /* renamed from: a */
                        public void mo12714a(acy acyVar2, boolean z) {
                            C3605j.this.f14143k = (String) map.get("id");
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("messageType", "htmlLoaded");
                                jSONObject.put("id", C3605j.this.f14143k);
                                abstractC7980wy.mo13109b("sendMessageToNativeJs", jSONObject);
                            } catch (JSONException e) {
                                abr.b("Unable to dispatch sendMessageToNativeJs event", e);
                            }
                        }
                    });
                    String str = map.get("overlayHtml");
                    String str2 = map.get("baseUrl");
                    if (TextUtils.isEmpty(str2)) {
                        C3605j.this.f14142j.loadData(str, "text/html", "UTF-8");
                    } else {
                        C3605j.this.f14142j.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                    }
                }
            });
            abstractC7980wy.mo13113a("/showOverlay", new AbstractC7877vt() { // from class: com.google.android.gms.ads.internal.formats.j.3.2
                @Override // com.google.android.gms.internal.AbstractC7877vt
                /* renamed from: a */
                public void mo12713a(acy acyVar, Map<String, String> map) {
                    C3605j.this.f14142j.mo18105b().setVisibility(0);
                }
            });
            abstractC7980wy.mo13113a("/hideOverlay", new AbstractC7877vt() { // from class: com.google.android.gms.ads.internal.formats.j.3.3
                @Override // com.google.android.gms.internal.AbstractC7877vt
                /* renamed from: a */
                public void mo12713a(acy acyVar, Map<String, String> map) {
                    C3605j.this.f14142j.mo18105b().setVisibility(8);
                }
            });
            C3605j.this.f14142j.mo18084l().m18167a("/hideOverlay", new AbstractC7877vt() { // from class: com.google.android.gms.ads.internal.formats.j.3.4
                @Override // com.google.android.gms.internal.AbstractC7877vt
                /* renamed from: a */
                public void mo12713a(acy acyVar, Map<String, String> map) {
                    C3605j.this.f14142j.mo18105b().setVisibility(8);
                }
            });
            C3605j.this.f14142j.mo18084l().m18167a("/sendMessageToSdk", new AbstractC7877vt() { // from class: com.google.android.gms.ads.internal.formats.j.3.5
                @Override // com.google.android.gms.internal.AbstractC7877vt
                /* renamed from: a */
                public void mo12713a(acy acyVar, Map<String, String> map) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        for (String str : map.keySet()) {
                            jSONObject.put(str, map.get(str));
                        }
                        jSONObject.put("id", C3605j.this.f14143k);
                        abstractC7980wy.mo13109b("sendMessageToNativeJs", jSONObject);
                    } catch (JSONException e) {
                        abr.b("Unable to dispatch sendMessageToNativeJs event", e);
                    }
                }
            });
        }
    }

    public C3605j(Context context, BinderC3698q binderC3698q, @Nullable C8123zt c8123zt, C7667ro c7667ro, @Nullable JSONObject jSONObject, @Nullable AbstractC3603i.AbstractC3604a abstractC3604a, @Nullable VersionInfoParcel versionInfoParcel, @Nullable String str) {
        this.f14135c = context;
        this.f14134b = binderC3698q;
        this.f14137e = c8123zt;
        this.f14139g = c7667ro;
        this.f14136d = jSONObject;
        this.f14138f = abstractC3604a;
        this.f14140h = versionInfoParcel;
        this.f14144l = str;
    }

    /* renamed from: a */
    public C3596b mo27376a(View.OnClickListener onClickListener) {
        C3595a mo27379m = this.f14138f.mo27379m();
        if (mo27379m == null) {
            return null;
        }
        C3596b c3596b = new C3596b(this.f14135c, mo27379m);
        c3596b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        c3596b.m27386a().setOnClickListener(onClickListener);
        c3596b.m27386a().setContentDescription(C7788uf.f25812bQ.m13486c());
        return c3596b;
    }

    @Nullable
    /* renamed from: a */
    AbstractC7813uu m27367a(Object obj) {
        if (obj instanceof IBinder) {
            return AbstractC7813uu.AbstractBinderC7814a.m13408a((IBinder) obj);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.formats.AbstractC3603i
    /* renamed from: a */
    public void mo27378a() {
        C4588d.m23620b("recordImpression must be called on the main UI thread.");
        m27366a(true);
        try {
            final JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f14136d);
            jSONObject.put("ads_id", this.f14144l);
            this.f14137e.m12776a(new C8123zt.AbstractC8127a() { // from class: com.google.android.gms.ads.internal.formats.j.2
                @Override // com.google.android.gms.internal.C8123zt.AbstractC8127a
                /* renamed from: a */
                public void mo12734a(AbstractC7980wy abstractC7980wy) {
                    abstractC7980wy.mo13111a("google.afma.nativeAds.handleImpressionPing", jSONObject);
                }
            });
        } catch (JSONException e) {
            abr.b("Unable to create impression JSON.", e);
        }
        this.f14134b.m27060a(this);
    }

    @Override // com.google.android.gms.ads.internal.formats.AbstractC3603i
    /* renamed from: a */
    public void mo27377a(MotionEvent motionEvent) {
        this.f14139g.m13787a(motionEvent);
    }

    @Override // com.google.android.gms.ads.internal.formats.AbstractC3603i
    /* renamed from: a */
    public void mo27375a(View view) {
        synchronized (this.f14133a) {
            if (this.f14141i) {
                return;
            }
            if (!view.isShown()) {
                return;
            }
            if (!view.getGlobalVisibleRect(new Rect(), null)) {
                return;
            }
            mo27378a();
        }
    }

    /* renamed from: a */
    public void m27374a(View view, AbstractC3601g abstractC3601g) {
        AbstractC7813uu m27367a;
        if (!(this.f14138f instanceof BinderC3598d)) {
            return;
        }
        BinderC3598d binderC3598d = (BinderC3598d) this.f14138f;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (binderC3598d.m27385o() != null) {
            ((FrameLayout) view).addView(binderC3598d.m27385o(), layoutParams);
            this.f14134b.m27061a(abstractC3601g);
        } else if (binderC3598d.mo13389b() == null || binderC3598d.mo13389b().size() <= 0 || (m27367a = m27367a(binderC3598d.mo13389b().get(0))) == null) {
        } else {
            try {
                AbstractC4170e mo13407a = m27367a.mo13407a();
                if (mo13407a == null) {
                    return;
                }
                ImageView m27358i = m27358i();
                m27358i.setImageDrawable((Drawable) BinderC4173f.m25294a(mo13407a));
                m27358i.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                ((FrameLayout) view).addView(m27358i, layoutParams);
            } catch (RemoteException e) {
                abr.d("Could not get drawable from image");
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.formats.AbstractC3603i
    /* renamed from: a */
    public void mo27373a(View view, String str, @Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable JSONObject jSONObject3) {
        C4588d.m23620b("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(UriUtil.LOCAL_ASSET_SCHEME, str);
            jSONObject4.put("template", this.f14138f.mo27380k());
            final JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("ad", this.f14136d);
            jSONObject5.put("click", jSONObject4);
            jSONObject5.put("has_custom_click_handler", this.f14134b.m27051c(this.f14138f.mo13338l()) != null);
            if (jSONObject != null) {
                jSONObject5.put("view_rectangles", jSONObject);
            }
            if (jSONObject2 != null) {
                jSONObject5.put("click_point", jSONObject2);
            }
            if (jSONObject3 != null) {
                jSONObject5.put("native_view_rectangle", jSONObject3);
            }
            try {
                JSONObject optJSONObject = this.f14136d.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                jSONObject4.put("click_signals", this.f14139g.m13793a().mo14121a(this.f14135c, optJSONObject.optString("click_string"), view));
            } catch (Exception e) {
                abr.b("Exception obtaining click signals", e);
            }
            jSONObject5.put("ads_id", this.f14144l);
            this.f14137e.m12776a(new C8123zt.AbstractC8127a() { // from class: com.google.android.gms.ads.internal.formats.j.1
                @Override // com.google.android.gms.internal.C8123zt.AbstractC8127a
                /* renamed from: a */
                public void mo12734a(AbstractC7980wy abstractC7980wy) {
                    abstractC7980wy.mo13111a("google.afma.nativeAds.handleClickGmsg", jSONObject5);
                }
            });
        } catch (JSONException e2) {
            abr.b("Unable to create click JSON.", e2);
        }
    }

    @Override // com.google.android.gms.ads.internal.formats.AbstractC3603i
    /* renamed from: a */
    public void mo27372a(View view, Map<String, WeakReference<View>> map) {
        view.setOnTouchListener(null);
        view.setClickable(false);
        view.setOnClickListener(null);
        for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
            View view2 = entry.getValue().get();
            if (view2 != null) {
                view2.setOnTouchListener(null);
                view2.setClickable(false);
                view2.setOnClickListener(null);
            }
        }
    }

    /* renamed from: a */
    public void mo27371a(View view, Map<String, WeakReference<View>> map, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        if (!C7788uf.f25809bN.m13486c().booleanValue()) {
            return;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
            View view2 = entry.getValue().get();
            if (view2 != null) {
                view2.setOnTouchListener(onTouchListener);
                view2.setClickable(true);
                view2.setOnClickListener(onClickListener);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.formats.AbstractC3603i
    /* renamed from: a */
    public void mo27370a(View view, Map<String, WeakReference<View>> map, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C4588d.m23620b("performClick must be called on the main UI thread.");
        for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
            if (view.equals(entry.getValue().get())) {
                mo27373a(view, entry.getKey(), jSONObject, jSONObject2, jSONObject3);
                return;
            }
        }
        if ("2".equals(this.f14138f.mo27380k())) {
            mo27373a(view, "2099", jSONObject, jSONObject2, jSONObject3);
        } else if ("1".equals(this.f14138f.mo27380k())) {
            mo27373a(view, "1099", jSONObject, jSONObject2, jSONObject3);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m27366a(boolean z) {
        this.f14141i = z;
    }

    @Override // com.google.android.gms.ads.internal.formats.AbstractC3603i
    /* renamed from: b */
    public void mo27365b(View view) {
        this.f14145m = new WeakReference<>(view);
    }

    /* renamed from: d */
    public acy mo27363d() {
        this.f14142j = m27359h();
        this.f14142j.mo18105b().setVisibility(8);
        this.f14137e.m12776a(new C36083());
        return this.f14142j;
    }

    @Override // com.google.android.gms.ads.internal.formats.AbstractC3603i
    /* renamed from: e */
    public View mo27362e() {
        if (this.f14145m != null) {
            return this.f14145m.get();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.formats.AbstractC3603i
    /* renamed from: f */
    public Context mo27361f() {
        return this.f14135c;
    }

    /* renamed from: g */
    public void m27360g() {
        if (!(this.f14138f instanceof BinderC3598d)) {
            return;
        }
        this.f14134b.m27067G();
    }

    /* renamed from: h */
    acy m27359h() {
        return C3779u.m26889f().m18143a(this.f14135c, AdSizeParcel.m27638a(this.f14135c), false, false, this.f14139g, this.f14140h);
    }

    /* renamed from: i */
    ImageView m27358i() {
        return new ImageView(this.f14135c);
    }
}
