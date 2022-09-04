package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.customtabs.CustomTabsCallback;
import android.support.customtabs.CustomTabsClient;
import android.support.customtabs.CustomTabsServiceConnection;
import android.support.customtabs.CustomTabsSession;
import java.util.List;
@aaa
/* renamed from: com.google.android.gms.internal.ut */
/* loaded from: classes.dex */
public class C7811ut implements AbstractC7664rl {
    @Nullable

    /* renamed from: a */
    private CustomTabsSession f25947a;
    @Nullable

    /* renamed from: b */
    private CustomTabsClient f25948b;
    @Nullable

    /* renamed from: c */
    private CustomTabsServiceConnection f25949c;
    @Nullable

    /* renamed from: d */
    private AbstractC7812a f25950d;

    /* renamed from: com.google.android.gms.internal.ut$a */
    /* loaded from: classes2.dex */
    public interface AbstractC7812a {
        /* renamed from: a */
        void mo12935a();

        /* renamed from: b */
        void mo12934b();
    }

    /* renamed from: a */
    public static boolean m13414a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (queryIntentActivities == null || resolveActivity == null) {
            return false;
        }
        for (int i = 0; i < queryIntentActivities.size(); i++) {
            if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i).activityInfo.name)) {
                return resolveActivity.activityInfo.packageName.equals(C7662rj.m13812a(context));
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.AbstractC7664rl
    /* renamed from: a */
    public void mo13416a() {
        this.f25948b = null;
        this.f25947a = null;
        if (this.f25950d != null) {
            this.f25950d.mo12934b();
        }
    }

    /* renamed from: a */
    public void m13415a(Activity activity) {
        if (this.f25949c == null) {
            return;
        }
        activity.unbindService(this.f25949c);
        this.f25948b = null;
        this.f25947a = null;
        this.f25949c = null;
    }

    @Override // com.google.android.gms.internal.AbstractC7664rl
    /* renamed from: a */
    public void mo13412a(CustomTabsClient customTabsClient) {
        this.f25948b = customTabsClient;
        this.f25948b.warmup(0L);
        if (this.f25950d != null) {
            this.f25950d.mo12935a();
        }
    }

    /* renamed from: a */
    public void m13411a(AbstractC7812a abstractC7812a) {
        this.f25950d = abstractC7812a;
    }

    /* renamed from: a */
    public boolean m13413a(Uri uri, Bundle bundle, List<Bundle> list) {
        CustomTabsSession m13410b;
        if (this.f25948b == null || (m13410b = m13410b()) == null) {
            return false;
        }
        return m13410b.mayLaunchUrl(uri, bundle, list);
    }

    @Nullable
    /* renamed from: b */
    public CustomTabsSession m13410b() {
        if (this.f25948b == null) {
            this.f25947a = null;
        } else if (this.f25947a == null) {
            this.f25947a = this.f25948b.newSession((CustomTabsCallback) null);
        }
        return this.f25947a;
    }

    /* renamed from: b */
    public void m13409b(Activity activity) {
        String m13812a;
        if (this.f25948b == null && (m13812a = C7662rj.m13812a(activity)) != null) {
            this.f25949c = new C7663rk(this);
            CustomTabsClient.bindCustomTabsService(activity, m13812a, this.f25949c);
        }
    }
}
