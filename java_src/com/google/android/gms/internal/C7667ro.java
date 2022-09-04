package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p263mm.sdk.platformtools.LocaleUtil;
import com.xiaomi.mipush.sdk.Constants;
/* renamed from: com.google.android.gms.internal.ro */
/* loaded from: classes.dex */
public class C7667ro {

    /* renamed from: e */
    private static final String[] f25456e = {"/aclk", "/pcs/click"};

    /* renamed from: a */
    private String f25457a = "googleads.g.doubleclick.net";

    /* renamed from: b */
    private String f25458b = "/pagead/ads";

    /* renamed from: c */
    private String f25459c = "ad.doubleclick.net";

    /* renamed from: d */
    private String[] f25460d = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: f */
    private AbstractC7495oq f25461f;

    public C7667ro(AbstractC7495oq abstractC7495oq) {
        this.f25461f = abstractC7495oq;
    }

    /* renamed from: a */
    private Uri m13789a(Uri uri, Context context, String str, boolean z, View view) {
        try {
            boolean m13784b = m13784b(uri);
            if (m13784b) {
                if (uri.toString().contains("dc_ms=")) {
                    throw new C7668rp("Parameter already exists: dc_ms");
                }
            } else if (uri.getQueryParameter(LocaleUtil.MALAY) != null) {
                throw new C7668rp("Query parameter already exists: ms");
            }
            String mo14121a = z ? this.f25461f.mo14121a(context, str, view) : this.f25461f.mo14123a(context);
            return m13784b ? m13782b(uri, "dc_ms", mo14121a) : m13788a(uri, LocaleUtil.MALAY, mo14121a);
        } catch (UnsupportedOperationException e) {
            throw new C7668rp("Provided Uri is not in a valid state");
        }
    }

    /* renamed from: a */
    private Uri m13788a(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl");
        }
        return indexOf != -1 ? Uri.parse(uri2.substring(0, indexOf + 1) + str + "=" + str2 + "&" + uri2.substring(indexOf + 1)) : uri.buildUpon().appendQueryParameter(str, str2).build();
    }

    /* renamed from: b */
    private Uri m13782b(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf(";adurl");
        if (indexOf != -1) {
            return Uri.parse(uri2.substring(0, indexOf + 1) + str + "=" + str2 + ";" + uri2.substring(indexOf + 1));
        }
        String encodedPath = uri.getEncodedPath();
        int indexOf2 = uri2.indexOf(encodedPath);
        return Uri.parse(uri2.substring(0, encodedPath.length() + indexOf2) + ";" + str + "=" + str2 + ";" + uri2.substring(encodedPath.length() + indexOf2));
    }

    /* renamed from: a */
    public Uri m13791a(Uri uri, Context context) {
        return m13789a(uri, context, null, false, null);
    }

    /* renamed from: a */
    public Uri m13790a(Uri uri, Context context, View view) {
        try {
            return m13789a(uri, context, uri.getQueryParameter("ai"), true, view);
        } catch (UnsupportedOperationException e) {
            throw new C7668rp("Provided Uri is not in a valid state");
        }
    }

    /* renamed from: a */
    public AbstractC7495oq m13793a() {
        return this.f25461f;
    }

    /* renamed from: a */
    public void m13787a(MotionEvent motionEvent) {
        this.f25461f.mo14119a(motionEvent);
    }

    /* renamed from: a */
    public void m13786a(String str) {
        this.f25460d = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
    }

    /* renamed from: a */
    public void m13785a(String str, String str2) {
        this.f25457a = str;
        this.f25458b = str2;
    }

    /* renamed from: a */
    public boolean m13792a(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            if (!uri.getHost().equals(this.f25457a)) {
                return false;
            }
            return uri.getPath().equals(this.f25458b);
        } catch (NullPointerException e) {
            return false;
        }
    }

    @Deprecated
    /* renamed from: b */
    public Uri m13783b(Uri uri, Context context) {
        return m13790a(uri, context, (View) null);
    }

    /* renamed from: b */
    public boolean m13784b(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            return uri.getHost().equals(this.f25459c);
        } catch (NullPointerException e) {
            return false;
        }
    }

    /* renamed from: c */
    public boolean m13781c(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            String host = uri.getHost();
            for (String str : this.f25460d) {
                if (host.endsWith(str)) {
                    return true;
                }
            }
            return false;
        } catch (NullPointerException e) {
            return false;
        }
    }

    /* renamed from: d */
    public boolean m13780d(Uri uri) {
        if (m13781c(uri)) {
            for (String str : f25456e) {
                if (uri.getPath().endsWith(str)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
