package com.fimi.soul.module.p209b;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDK;
import com.mob.tools.utils.BitmapHelper;
import com.mob.tools.utils.C10109R;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
/* renamed from: com.fimi.soul.module.b.b */
/* loaded from: classes.dex */
public class C2510b {

    /* renamed from: a */
    private HashMap<String, Object> f8163a = new HashMap<>();

    public C2510b() {
        this.f8163a.put("customers", new ArrayList());
        this.f8163a.put("hiddenPlatforms", new HashMap());
    }

    /* renamed from: a */
    public String m31470a() {
        if (this.f8163a.containsKey("text")) {
            return String.valueOf(this.f8163a.get("text"));
        }
        return null;
    }

    /* renamed from: a */
    public void m31469a(float f) {
        this.f8163a.put("latitude", Float.valueOf(f));
    }

    /* renamed from: a */
    public void m31468a(Context context) {
        int i;
        boolean z = false;
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.putAll(this.f8163a);
        ShareSDK.initSDK(context.getApplicationContext());
        ShareSDK.logDemoEvent(1, null);
        try {
            i = C10109R.parseInt(String.valueOf(hashMap.remove("theme")));
        } catch (Throwable th) {
            i = 0;
        }
        AbstractC2513e m31422b = EnumC2512d.m31423a(i).m31422b();
        m31422b.m31413a(hashMap);
        m31422b.m31412a(hashMap.containsKey("dialogMode") ? ((Boolean) hashMap.remove("dialogMode")).booleanValue() : false);
        if (hashMap.containsKey("silent")) {
            z = ((Boolean) hashMap.remove("silent")).booleanValue();
        }
        m31422b.m31408b(z);
        m31422b.m31414a((ArrayList) hashMap.remove("customers"));
        m31422b.m31409b((HashMap) hashMap.remove("hiddenPlatforms"));
        m31422b.m31417a((PlatformActionListener) hashMap.remove("callback"));
        m31422b.m31416a((AbstractC2515f) hashMap.remove("customizeCallback"));
        if (hashMap.containsKey("disableSSO") && ((Boolean) hashMap.remove("disableSSO")).booleanValue()) {
            m31422b.m31421a();
        }
        m31422b.m31420a(context.getApplicationContext());
    }

    /* renamed from: a */
    public void m31467a(Bitmap bitmap, String str, View.OnClickListener onClickListener) {
        C2477a c2477a = new C2477a();
        c2477a.f8034b = bitmap;
        c2477a.f8033a = str;
        c2477a.f8035c = onClickListener;
        ((ArrayList) C10109R.forceCast(this.f8163a.get("customers"))).add(c2477a);
    }

    /* renamed from: a */
    public void m31466a(View view) {
        try {
            this.f8163a.put("viewToShare", BitmapHelper.captureView(view, view.getWidth(), view.getHeight()));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m31465a(PlatformActionListener platformActionListener) {
        this.f8163a.put("callback", platformActionListener);
    }

    /* renamed from: a */
    public void m31464a(EnumC2512d enumC2512d) {
        this.f8163a.put("theme", Integer.valueOf(enumC2512d.m31424a()));
    }

    /* renamed from: a */
    public void m31463a(AbstractC2515f abstractC2515f) {
        this.f8163a.put("customizeCallback", abstractC2515f);
    }

    /* renamed from: a */
    public void m31462a(String str) {
        this.f8163a.put("address", str);
    }

    /* renamed from: a */
    public void m31461a(boolean z) {
        this.f8163a.put("silent", Boolean.valueOf(z));
    }

    /* renamed from: a */
    public void m31460a(String[] strArr) {
        this.f8163a.put("imageArray", strArr);
    }

    /* renamed from: b */
    public PlatformActionListener m31459b() {
        return (PlatformActionListener) C10109R.forceCast(this.f8163a.get("callback"));
    }

    /* renamed from: b */
    public void m31458b(float f) {
        this.f8163a.put("longitude", Float.valueOf(f));
    }

    /* renamed from: b */
    public void m31457b(String str) {
        this.f8163a.put("title", str);
    }

    /* renamed from: c */
    public AbstractC2515f m31456c() {
        return (AbstractC2515f) C10109R.forceCast(this.f8163a.get("customizeCallback"));
    }

    /* renamed from: c */
    public void m31455c(String str) {
        this.f8163a.put("titleUrl", str);
    }

    /* renamed from: d */
    public void m31454d() {
        this.f8163a.put("disableSSO", true);
    }

    /* renamed from: d */
    public void m31453d(String str) {
        this.f8163a.put("text", str);
    }

    @Deprecated
    /* renamed from: e */
    public void m31452e() {
        this.f8163a.put("dialogMode", true);
    }

    /* renamed from: e */
    public void m31451e(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f8163a.put("imagePath", str);
        }
    }

    /* renamed from: f */
    public void m31450f() {
        this.f8163a.put("isShareTencentWeibo", true);
    }

    /* renamed from: f */
    public void m31449f(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f8163a.put("imageUrl", str);
        }
    }

    /* renamed from: g */
    public void m31448g(String str) {
        this.f8163a.put("url", str);
    }

    /* renamed from: h */
    public void m31447h(String str) {
        this.f8163a.put("filePath", str);
    }

    /* renamed from: i */
    public void m31446i(String str) {
        this.f8163a.put("comment", str);
    }

    /* renamed from: j */
    public void m31445j(String str) {
        this.f8163a.put("site", str);
    }

    /* renamed from: k */
    public void m31444k(String str) {
        this.f8163a.put("siteUrl", str);
    }

    /* renamed from: l */
    public void m31443l(String str) {
        this.f8163a.put("venueName", str);
    }

    /* renamed from: m */
    public void m31442m(String str) {
        this.f8163a.put("venueDescription", str);
    }

    /* renamed from: n */
    public void m31441n(String str) {
        this.f8163a.put(Constants.PARAM_PLATFORM, str);
    }

    /* renamed from: o */
    public void m31440o(String str) {
        this.f8163a.put("installurl", str);
    }

    /* renamed from: p */
    public void m31439p(String str) {
        this.f8163a.put("executeurl", str);
    }

    /* renamed from: q */
    public void m31438q(String str) {
        this.f8163a.put("musicUrl", str);
    }

    /* renamed from: r */
    public void m31437r(String str) {
        this.f8163a.put("url", str);
        this.f8163a.put("shareType", 6);
    }

    /* renamed from: s */
    public void m31436s(String str) {
        ((HashMap) C10109R.forceCast(this.f8163a.get("hiddenPlatforms"))).put(str, str);
    }
}
