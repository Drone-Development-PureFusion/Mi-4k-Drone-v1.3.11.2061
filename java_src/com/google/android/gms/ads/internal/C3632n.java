package com.google.android.gms.ads.internal;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.fimi.kernel.C1576a;
import com.google.android.gms.ads.internal.ViewTreeObserver$OnGlobalLayoutListenerC3590f;
import com.google.android.gms.ads.internal.formats.BinderC3598d;
import com.google.android.gms.ads.internal.formats.BinderC3599e;
import com.google.android.gms.internal.AbstractC7813uu;
import com.google.android.gms.internal.AbstractC7877vt;
import com.google.android.gms.internal.AbstractC8017xu;
import com.google.android.gms.internal.AbstractC8020xv;
import com.google.android.gms.internal.C7996xl;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abi;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.acz;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
import com.google.firebase.p251a.C9654a;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@aaa
/* renamed from: com.google.android.gms.ads.internal.n */
/* loaded from: classes.dex */
public class C3632n {
    @Nullable
    /* renamed from: a */
    public static View m27291a(@Nullable abi abiVar) {
        if (abiVar == null) {
            abr.b("AdState is null");
            return null;
        } else if (m27277b(abiVar) && abiVar.f20895b != null) {
            return abiVar.f20895b.mo18105b();
        } else {
            try {
                AbstractC4170e mo12977a = abiVar.f20909p != null ? abiVar.f20909p.mo12977a() : null;
                if (mo12977a != null) {
                    return (View) BinderC4173f.m25294a(mo12977a);
                }
                abr.d("View in mediation adapter is null.");
                return null;
            } catch (RemoteException e) {
                abr.d("Could not get View from mediation adapter.", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    private static BinderC3598d m27283a(AbstractC8017xu abstractC8017xu) {
        return new BinderC3598d(abstractC8017xu.mo13016a(), abstractC8017xu.mo13014b(), abstractC8017xu.mo13012c(), abstractC8017xu.mo13010d(), abstractC8017xu.mo13009e(), abstractC8017xu.mo13008f(), abstractC8017xu.mo13007g(), abstractC8017xu.mo13006h(), null, abstractC8017xu.mo13002l(), null, null);
    }

    /* renamed from: a */
    private static BinderC3599e m27281a(AbstractC8020xv abstractC8020xv) {
        return new BinderC3599e(abstractC8020xv.mo13000a(), abstractC8020xv.mo12998b(), abstractC8020xv.mo12996c(), abstractC8020xv.mo12994d(), abstractC8020xv.mo12993e(), abstractC8020xv.mo12992f(), null, abstractC8020xv.mo12988j());
    }

    /* renamed from: a */
    static AbstractC7877vt m27282a(@Nullable final AbstractC8017xu abstractC8017xu, @Nullable final AbstractC8020xv abstractC8020xv, final ViewTreeObserver$OnGlobalLayoutListenerC3590f.C3594a c3594a) {
        return new AbstractC7877vt() { // from class: com.google.android.gms.ads.internal.n.5
            @Override // com.google.android.gms.internal.AbstractC7877vt
            /* renamed from: a */
            public void mo12713a(acy acyVar, Map<String, String> map) {
                View mo18105b = acyVar.mo18105b();
                if (mo18105b == null) {
                    return;
                }
                try {
                    if (AbstractC8017xu.this != null) {
                        if (!AbstractC8017xu.this.mo13003k()) {
                            AbstractC8017xu.this.mo13015a(BinderC4173f.m25293a(mo18105b));
                            c3594a.m27394a();
                        } else {
                            C3632n.m27276b(acyVar);
                        }
                    } else if (abstractC8020xv != null) {
                        if (!abstractC8020xv.mo12989i()) {
                            abstractC8020xv.mo12999a(BinderC4173f.m25293a(mo18105b));
                            c3594a.m27394a();
                        } else {
                            C3632n.m27276b(acyVar);
                        }
                    }
                } catch (RemoteException e) {
                    abr.d("Unable to call handleClick on mapper", e);
                }
            }
        };
    }

    /* renamed from: a */
    static AbstractC7877vt m27279a(final CountDownLatch countDownLatch) {
        return new AbstractC7877vt() { // from class: com.google.android.gms.ads.internal.n.3
            @Override // com.google.android.gms.internal.AbstractC7877vt
            /* renamed from: a */
            public void mo12713a(acy acyVar, Map<String, String> map) {
                countDownLatch.countDown();
                acyVar.mo18105b().setVisibility(0);
            }
        };
    }

    /* renamed from: a */
    private static String m27293a(@Nullable Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap == null) {
            abr.d("Bitmap is null. Returning empty string");
            return "";
        }
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        String valueOf = String.valueOf("data:image/png;base64,");
        String valueOf2 = String.valueOf(encodeToString);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: a */
    static String m27284a(@Nullable AbstractC7813uu abstractC7813uu) {
        if (abstractC7813uu == null) {
            abr.d("Image is null. Returning empty string");
            return "";
        }
        try {
            Uri mo13406b = abstractC7813uu.mo13406b();
            if (mo13406b != null) {
                return mo13406b.toString();
            }
        } catch (RemoteException e) {
            abr.d("Unable to get image uri. Trying data uri next");
        }
        return m27274b(abstractC7813uu);
    }

    /* renamed from: a */
    public static void m27290a(@Nullable abi abiVar, ViewTreeObserver$OnGlobalLayoutListenerC3590f.C3594a c3594a) {
        AbstractC8020xv abstractC8020xv = null;
        if (abiVar == null || !m27277b(abiVar)) {
            return;
        }
        acy acyVar = abiVar.f20895b;
        View mo18105b = acyVar != null ? acyVar.mo18105b() : null;
        if (mo18105b == null) {
            abr.d("AdWebView is null");
            return;
        }
        try {
            List<String> list = abiVar.f20908o != null ? abiVar.f20908o.f26230o : null;
            if (list == null || list.isEmpty()) {
                abr.d("No template ids present in mediation response");
                return;
            }
            AbstractC8017xu mo12960h = abiVar.f20909p != null ? abiVar.f20909p.mo12960h() : null;
            if (abiVar.f20909p != null) {
                abstractC8020xv = abiVar.f20909p.mo12959i();
            }
            if (list.contains("2") && mo12960h != null) {
                mo12960h.mo13013b(BinderC4173f.m25293a(mo18105b));
                if (!mo12960h.mo13004j()) {
                    mo12960h.mo13005i();
                }
                acyVar.mo18084l().m18167a("/nativeExpressViewClicked", m27282a(mo12960h, (AbstractC8020xv) null, c3594a));
            } else if (!list.contains("1") || abstractC8020xv == null) {
                abr.d("No matching template id and mapper");
            } else {
                abstractC8020xv.mo12997b(BinderC4173f.m25293a(mo18105b));
                if (!abstractC8020xv.mo12990h()) {
                    abstractC8020xv.mo12991g();
                }
                acyVar.mo18084l().m18167a("/nativeExpressViewClicked", m27282a((AbstractC8017xu) null, abstractC8020xv, c3594a));
            }
        } catch (RemoteException e) {
            abr.d("Error occurred while recording impression and registering for clicks", e);
        }
    }

    /* renamed from: a */
    private static void m27288a(final acy acyVar, final BinderC3598d binderC3598d, final String str) {
        acyVar.mo18084l().m18174a(new acz.AbstractC6197a() { // from class: com.google.android.gms.ads.internal.n.1
            @Override // com.google.android.gms.internal.acz.AbstractC6197a
            /* renamed from: a */
            public void mo12714a(acy acyVar2, boolean z) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("headline", BinderC3598d.this.mo13390a());
                    jSONObject.put("body", BinderC3598d.this.mo13388c());
                    jSONObject.put("call_to_action", BinderC3598d.this.mo13386e());
                    jSONObject.put(C9654a.C9656b.f30239x, BinderC3598d.this.mo13383h());
                    jSONObject.put("star_rating", String.valueOf(BinderC3598d.this.mo13385f()));
                    jSONObject.put("store", BinderC3598d.this.mo13384g());
                    jSONObject.put("icon", C3632n.m27284a(BinderC3598d.this.mo13387d()));
                    JSONArray jSONArray = new JSONArray();
                    List<Object> mo13389b = BinderC3598d.this.mo13389b();
                    if (mo13389b != null) {
                        for (Object obj : mo13389b) {
                            jSONArray.put(C3632n.m27284a(C3632n.m27273b(obj)));
                        }
                    }
                    jSONObject.put(C1576a.f3872b, jSONArray);
                    jSONObject.put("extras", C3632n.m27278b(BinderC3598d.this.mo13380n(), str));
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("assets", jSONObject);
                    jSONObject2.put("template_id", "2");
                    acyVar.mo13111a("google.afma.nativeExpressAds.loadAssets", jSONObject2);
                } catch (JSONException e) {
                    abr.d("Exception occurred when loading assets", e);
                }
            }
        });
    }

    /* renamed from: a */
    private static void m27287a(final acy acyVar, final BinderC3599e binderC3599e, final String str) {
        acyVar.mo18084l().m18174a(new acz.AbstractC6197a() { // from class: com.google.android.gms.ads.internal.n.2
            @Override // com.google.android.gms.internal.acz.AbstractC6197a
            /* renamed from: a */
            public void mo12714a(acy acyVar2, boolean z) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("headline", BinderC3599e.this.mo13364a());
                    jSONObject.put("body", BinderC3599e.this.mo13362c());
                    jSONObject.put("call_to_action", BinderC3599e.this.mo13360e());
                    jSONObject.put("advertiser", BinderC3599e.this.mo13359f());
                    jSONObject.put("logo", C3632n.m27284a(BinderC3599e.this.mo13361d()));
                    JSONArray jSONArray = new JSONArray();
                    List<Object> mo13363b = BinderC3599e.this.mo13363b();
                    if (mo13363b != null) {
                        for (Object obj : mo13363b) {
                            jSONArray.put(C3632n.m27284a(C3632n.m27273b(obj)));
                        }
                    }
                    jSONObject.put(C1576a.f3872b, jSONArray);
                    jSONObject.put("extras", C3632n.m27278b(BinderC3599e.this.mo13357h(), str));
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("assets", jSONObject);
                    jSONObject2.put("template_id", "1");
                    acyVar.mo13111a("google.afma.nativeExpressAds.loadAssets", jSONObject2);
                } catch (JSONException e) {
                    abr.d("Exception occurred when loading assets", e);
                }
            }
        });
    }

    /* renamed from: a */
    private static void m27285a(acy acyVar, CountDownLatch countDownLatch) {
        acyVar.mo18084l().m18167a("/nativeExpressAssetsLoaded", m27279a(countDownLatch));
        acyVar.mo18084l().m18167a("/nativeExpressAssetsLoadingFailed", m27272b(countDownLatch));
    }

    /* renamed from: a */
    public static boolean m27286a(acy acyVar, C7996xl c7996xl, CountDownLatch countDownLatch) {
        boolean z = false;
        try {
            z = m27275b(acyVar, c7996xl, countDownLatch);
        } catch (RemoteException e) {
            abr.d("Unable to invoke load assets", e);
        } catch (RuntimeException e2) {
            countDownLatch.countDown();
            throw e2;
        }
        if (!z) {
            countDownLatch.countDown();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    /* renamed from: b */
    public static AbstractC7813uu m27273b(Object obj) {
        if (obj instanceof IBinder) {
            return AbstractC7813uu.AbstractBinderC7814a.m13408a((IBinder) obj);
        }
        return null;
    }

    /* renamed from: b */
    static AbstractC7877vt m27272b(final CountDownLatch countDownLatch) {
        return new AbstractC7877vt() { // from class: com.google.android.gms.ads.internal.n.4
            @Override // com.google.android.gms.internal.AbstractC7877vt
            /* renamed from: a */
            public void mo12713a(acy acyVar, Map<String, String> map) {
                abr.d("Adapter returned an ad, but assets substitution failed");
                countDownLatch.countDown();
                acyVar.destroy();
            }
        };
    }

    /* renamed from: b */
    private static String m27274b(AbstractC7813uu abstractC7813uu) {
        String m27293a;
        try {
            AbstractC4170e mo13407a = abstractC7813uu.mo13407a();
            if (mo13407a == null) {
                abr.d("Drawable is null. Returning empty string");
                m27293a = "";
            } else {
                Drawable drawable = (Drawable) BinderC4173f.m25294a(mo13407a);
                if (!(drawable instanceof BitmapDrawable)) {
                    abr.d("Drawable is not an instance of BitmapDrawable. Returning empty string");
                    m27293a = "";
                } else {
                    m27293a = m27293a(((BitmapDrawable) drawable).getBitmap());
                }
            }
            return m27293a;
        } catch (RemoteException e) {
            abr.d("Unable to get drawable. Returning empty string");
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static JSONObject m27278b(@Nullable Bundle bundle, String str) {
        JSONObject jSONObject = new JSONObject();
        if (bundle == null || TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject(str);
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (bundle.containsKey(next)) {
                if ("image".equals(jSONObject2.getString(next))) {
                    Object obj = bundle.get(next);
                    if (obj instanceof Bitmap) {
                        jSONObject.put(next, m27293a((Bitmap) obj));
                    } else {
                        abr.d("Invalid type. An image type extra should return a bitmap");
                    }
                } else if (bundle.get(next) instanceof Bitmap) {
                    abr.d("Invalid asset type. Bitmap should be returned only for image type");
                } else {
                    jSONObject.put(next, String.valueOf(bundle.get(next)));
                }
            }
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m27276b(acy acyVar) {
        View.OnClickListener mo18136F = acyVar.mo18136F();
        if (mo18136F != null) {
            mo18136F.onClick(acyVar.mo18105b());
        }
    }

    /* renamed from: b */
    public static boolean m27277b(@Nullable abi abiVar) {
        return (abiVar == null || !abiVar.f20907n || abiVar.f20908o == null || abiVar.f20908o.f26227l == null) ? false : true;
    }

    /* renamed from: b */
    private static boolean m27275b(acy acyVar, C7996xl c7996xl, CountDownLatch countDownLatch) {
        View mo18105b = acyVar.mo18105b();
        if (mo18105b == null) {
            abr.d("AdWebView is null");
            return false;
        }
        mo18105b.setVisibility(4);
        List<String> list = c7996xl.f26272b.f26230o;
        if (list == null || list.isEmpty()) {
            abr.d("No template ids present in mediation response");
            return false;
        }
        m27285a(acyVar, countDownLatch);
        AbstractC8017xu mo12960h = c7996xl.f26273c.mo12960h();
        AbstractC8020xv mo12959i = c7996xl.f26273c.mo12959i();
        if (list.contains("2") && mo12960h != null) {
            m27288a(acyVar, m27283a(mo12960h), c7996xl.f26272b.f26229n);
        } else if (!list.contains("1") || mo12959i == null) {
            abr.d("No matching template id and mapper");
            return false;
        } else {
            m27287a(acyVar, m27281a(mo12959i), c7996xl.f26272b.f26229n);
        }
        String str = c7996xl.f26272b.f26227l;
        String str2 = c7996xl.f26272b.f26228m;
        if (str2 != null) {
            acyVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
        } else {
            acyVar.loadData(str, "text/html", "UTF-8");
        }
        return true;
    }
}
