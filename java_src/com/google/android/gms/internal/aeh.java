package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.appdatasearch.AbstractC3963k;
import com.google.android.gms.appdatasearch.C3952a;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.p231b.AbstractC4151d;
import com.google.android.gms.p231b.C4146a;
import java.util.List;
/* loaded from: classes2.dex */
public final class aeh implements AbstractC3963k, AbstractC4151d {

    /* renamed from: a */
    private static final String f21340a = aeh.class.getSimpleName();

    @Deprecated
    /* renamed from: com.google.android.gms.internal.aeh$a */
    /* loaded from: classes.dex */
    private static final class C6224a implements AbstractC4151d.AbstractC4152a {

        /* renamed from: a */
        private aeh f21343a;

        /* renamed from: b */
        private AbstractC4494i<Status> f21344b;

        /* renamed from: c */
        private C4146a f21345c;

        C6224a(aeh aehVar, AbstractC4494i<Status> abstractC4494i, C4146a c4146a) {
            this.f21343a = aehVar;
            this.f21344b = abstractC4494i;
            this.f21345c = c4146a;
        }

        @Override // com.google.android.gms.p231b.AbstractC4151d.AbstractC4152a
        /* renamed from: a */
        public AbstractC4494i<Status> mo17879a() {
            return this.f21344b;
        }

        @Override // com.google.android.gms.p231b.AbstractC4151d.AbstractC4152a
        /* renamed from: a */
        public AbstractC4494i<Status> mo17878a(AbstractC4489g abstractC4489g) {
            return this.f21343a.m17887a(abstractC4489g, aef.m17899a(this.f21345c, System.currentTimeMillis(), abstractC4489g.mo17372b().getPackageName(), 2));
        }
    }

    /* renamed from: com.google.android.gms.internal.aeh$b */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC6225b<T extends AbstractC4502m> extends ahl.AbstractC6343a<T, aee> {
        public AbstractC6225b(AbstractC4489g abstractC4489g) {
            super(C3952a.f15295b, abstractC4489g);
        }

        /* renamed from: a */
        protected abstract void mo17877a(aeb aebVar);

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public final void mo7809a(aee aeeVar) {
            mo17877a(aeeVar.m17901h());
        }
    }

    /* renamed from: com.google.android.gms.internal.aeh$c */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC6226c<T extends AbstractC4502m> extends AbstractC6225b<Status> {
        public AbstractC6226c(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public Status mo7807b(Status status) {
            return status;
        }
    }

    /* renamed from: com.google.android.gms.internal.aeh$d */
    /* loaded from: classes2.dex */
    public static final class BinderC6227d extends aed<Status> {
        public BinderC6227d(ahl.AbstractC6344b<Status> abstractC6344b) {
            super(abstractC6344b);
        }

        @Override // com.google.android.gms.internal.aed, com.google.android.gms.internal.aec
        /* renamed from: a */
        public void mo17874a(Status status) {
            this.f21339a.mo7413a(status);
        }
    }

    /* renamed from: a */
    public static Intent m17886a(String str, Uri uri) {
        m17882b(str, uri);
        if (m17884b(uri)) {
            return new Intent("android.intent.action.VIEW", uri);
        }
        if (m17881c(uri)) {
            return new Intent("android.intent.action.VIEW", m17894a(uri));
        }
        String valueOf = String.valueOf(uri);
        throw new RuntimeException(new StringBuilder(String.valueOf(valueOf).length() + 70).append("appIndexingUri is neither an HTTP(S) URL nor an \"android-app://\" URL: ").append(valueOf).toString());
    }

    /* renamed from: a */
    private static Uri m17894a(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(pathSegments.get(0));
        if (pathSegments.size() > 1) {
            builder.authority(pathSegments.get(1));
            int i = 2;
            while (true) {
                int i2 = i;
                if (i2 >= pathSegments.size()) {
                    break;
                }
                builder.appendPath(pathSegments.get(i2));
                i = i2 + 1;
            }
        } else {
            String str = f21340a;
            String valueOf = String.valueOf(uri);
            Log.e(str, new StringBuilder(String.valueOf(valueOf).length() + 88).append("The app URI must have the format: android-app://<package_name>/<scheme>/<path>. But got ").append(valueOf).toString());
        }
        builder.encodedQuery(uri.getEncodedQuery());
        builder.encodedFragment(uri.getEncodedFragment());
        return builder.build();
    }

    /* renamed from: a */
    private AbstractC4494i<Status> m17888a(AbstractC4489g abstractC4489g, C4146a c4146a, int i) {
        return m17887a(abstractC4489g, aef.m17899a(c4146a, System.currentTimeMillis(), abstractC4489g.mo17372b().getPackageName(), i));
    }

    /* renamed from: a */
    public static void m17885a(List<AbstractC4151d.C4153b> list) {
        if (list == null) {
            return;
        }
        for (AbstractC4151d.C4153b c4153b : list) {
            m17882b((String) null, c4153b.f15743a);
        }
    }

    /* renamed from: b */
    private static void m17882b(String str, Uri uri) {
        if (m17884b(uri)) {
            if (!uri.getHost().isEmpty()) {
                return;
            }
            String valueOf = String.valueOf(uri);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 98).append("AppIndex: The web URL must have a host (follow the format http(s)://<host>/<path>). Provided URI: ").append(valueOf).toString());
        } else if (!m17881c(uri)) {
            String valueOf2 = String.valueOf(uri);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf2).length() + 176).append("AppIndex: The URI scheme must either be 'http(s)' or 'android-app'. If the latter, it must follow the format 'android-app://<package_name>/<scheme>/<host_path>'. Provided URI: ").append(valueOf2).toString());
        } else if (str != null && !str.equals(uri.getHost())) {
            String valueOf3 = String.valueOf(uri);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf3).length() + 150).append("AppIndex: The android-app URI host must match the package name and follow the format android-app://<package_name>/<scheme>/<host_path>. Provided URI: ").append(valueOf3).toString());
        } else {
            List<String> pathSegments = uri.getPathSegments();
            if (!pathSegments.isEmpty() && !pathSegments.get(0).isEmpty()) {
                return;
            }
            String valueOf4 = String.valueOf(uri);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf4).length() + 128).append("AppIndex: The app URI scheme must exist and follow the format android-app://<package_name>/<scheme>/<host_path>). Provided URI: ").append(valueOf4).toString());
        }
    }

    /* renamed from: b */
    private static boolean m17884b(Uri uri) {
        String scheme = uri.getScheme();
        return UriUtil.HTTP_SCHEME.equals(scheme) || UriUtil.HTTPS_SCHEME.equals(scheme);
    }

    /* renamed from: c */
    private static boolean m17881c(Uri uri) {
        return "android-app".equals(uri.getScheme());
    }

    @Override // com.google.android.gms.p231b.AbstractC4151d
    /* renamed from: a */
    public AbstractC4151d.AbstractC4152a mo17889a(AbstractC4489g abstractC4489g, C4146a c4146a) {
        return new C6224a(this, m17888a(abstractC4489g, c4146a, 1), c4146a);
    }

    @Override // com.google.android.gms.p231b.AbstractC4151d
    /* renamed from: a */
    public AbstractC4494i<Status> mo17893a(AbstractC4489g abstractC4489g, Activity activity, Intent intent) {
        return m17887a(abstractC4489g, new UsageInfo.C3951a().m25932a(UsageInfo.m25940a(abstractC4489g.mo17372b().getPackageName(), intent)).m25934a(System.currentTimeMillis()).m25935a(0).m25930b(2).m25936a());
    }

    @Override // com.google.android.gms.p231b.AbstractC4151d
    /* renamed from: a */
    public AbstractC4494i<Status> mo17892a(AbstractC4489g abstractC4489g, Activity activity, Intent intent, String str, Uri uri, List<AbstractC4151d.C4153b> list) {
        String packageName = abstractC4489g.mo17372b().getPackageName();
        m17885a(list);
        return m17887a(abstractC4489g, new UsageInfo(packageName, intent, str, uri, null, list, 1));
    }

    @Override // com.google.android.gms.p231b.AbstractC4151d
    /* renamed from: a */
    public AbstractC4494i<Status> mo17891a(AbstractC4489g abstractC4489g, Activity activity, Uri uri) {
        return mo17893a(abstractC4489g, activity, m17886a(abstractC4489g.mo17372b().getPackageName(), uri));
    }

    @Override // com.google.android.gms.p231b.AbstractC4151d
    /* renamed from: a */
    public AbstractC4494i<Status> mo17890a(AbstractC4489g abstractC4489g, Activity activity, Uri uri, String str, Uri uri2, List<AbstractC4151d.C4153b> list) {
        String packageName = abstractC4489g.mo17372b().getPackageName();
        m17882b(packageName, uri);
        return mo17892a(abstractC4489g, activity, m17886a(packageName, uri), str, uri2, list);
    }

    /* renamed from: a */
    public AbstractC4494i<Status> m17887a(AbstractC4489g abstractC4489g, final UsageInfo... usageInfoArr) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC6226c<Status>(abstractC4489g) { // from class: com.google.android.gms.internal.aeh.1
            @Override // com.google.android.gms.internal.aeh.AbstractC6225b
            /* renamed from: a */
            protected void mo17877a(aeb aebVar) {
                aebVar.mo17910a(new BinderC6227d(this), (String) null, usageInfoArr);
            }
        });
    }

    @Override // com.google.android.gms.p231b.AbstractC4151d
    /* renamed from: b */
    public AbstractC4494i<Status> mo17883b(AbstractC4489g abstractC4489g, C4146a c4146a) {
        return m17888a(abstractC4489g, c4146a, 1);
    }

    @Override // com.google.android.gms.p231b.AbstractC4151d
    /* renamed from: c */
    public AbstractC4494i<Status> mo17880c(AbstractC4489g abstractC4489g, C4146a c4146a) {
        return m17888a(abstractC4489g, c4146a, 2);
    }
}
