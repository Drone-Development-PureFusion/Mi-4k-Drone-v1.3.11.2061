package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Build;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.p158b.AbstractC1632e;
import com.fimi.kernel.p158b.EnumC1626d;
import com.fimi.kernel.p158b.p163e.C1634b;
import com.fimi.kernel.utils.C1688z;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.NetUtil;
import com.xiaomi.market.sdk.C10445j;
import java.util.ArrayList;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;
/* renamed from: com.fimi.soul.biz.manager.d */
/* loaded from: classes.dex */
public class C1960d {

    /* renamed from: a */
    private static C1960d f5411a = null;

    /* renamed from: b */
    private Context f5412b;

    /* renamed from: c */
    private C1634b f5413c;

    public C1960d(Context context) {
        this.f5413c = null;
        this.f5412b = context;
        this.f5413c = (C1634b) C1642c.m34890a(EnumC1626d.Volley);
    }

    /* renamed from: a */
    public static C1960d m33413a(Context context) {
        if (f5411a == null) {
            f5411a = new C1960d(context);
        }
        return f5411a;
    }

    /* renamed from: a */
    public void m33411a(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("commandCode", "commitCrashMsg"));
        arrayList.add(new BasicNameValuePair("versionCode", C3103au.m29205e(this.f5412b)));
        arrayList.add(new BasicNameValuePair(C10445j.f32478ax, C3103au.m29209d(this.f5412b)));
        arrayList.add(new BasicNameValuePair(C10445j.f32447W, this.f5412b.getPackageName()));
        arrayList.add(new BasicNameValuePair("crashTime", C3103au.m29222b(System.currentTimeMillis())));
        arrayList.add(new BasicNameValuePair("deviceName", C3103au.m29243a()));
        arrayList.add(new BasicNameValuePair("systemVersion", C3103au.m29224b()));
        arrayList.add(new BasicNameValuePair("sdkVersion", Build.VERSION.SDK_INT + ""));
        arrayList.add(new BasicNameValuePair("channel", "Android"));
        arrayList.add(new BasicNameValuePair("crashMsg", str));
        NetUtil.m29408a(arrayList, this.f5412b);
        this.f5413c.mo34912a(String.format("%s?%s", C1756a.f4551j, URLEncodedUtils.format(arrayList, "UTF-8")), new AbstractC1632e<String>() { // from class: com.fimi.soul.biz.manager.d.1
            @Override // com.fimi.kernel.p158b.AbstractC1632e
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo30004a(String str2) {
                if (str2 == null || str2.length() <= 0) {
                    return;
                }
                C1688z.m34450a(C1960d.this.f5412b, (int) C1704R.C1707string.commit_crash_msg);
            }

            @Override // com.fimi.kernel.p158b.AbstractC1632e
            /* renamed from: b  reason: avoid collision after fix types in other method */
            public void mo30002b(String str2) {
            }
        });
    }
}
