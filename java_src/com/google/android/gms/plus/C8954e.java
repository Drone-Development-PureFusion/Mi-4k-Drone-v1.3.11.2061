package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p001v4.view.accessibility.AccessibilityEventCompat;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import com.google.android.gms.plus.p249a.p250a.AbstractC8923a;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.google.android.gms.plus.e */
/* loaded from: classes.dex */
public final class C8954e {

    /* renamed from: a */
    public static final String f28480a = "com.google.android.apps.plus.CONTENT_URL";

    /* renamed from: b */
    public static final String f28481b = "com.google.android.apps.plus.CONTENT_DEEP_LINK_ID";

    /* renamed from: c */
    public static final String f28482c = "com.google.android.apps.plus.CONTENT_DEEP_LINK_METADATA";

    /* renamed from: d */
    public static final String f28483d = "title";

    /* renamed from: e */
    public static final String f28484e = "description";

    /* renamed from: f */
    public static final String f28485f = "thumbnailUrl";

    /* renamed from: g */
    public static final String f28486g = "com.google.android.apps.plus.GOOGLE_INTERACTIVE_POST";

    /* renamed from: h */
    public static final String f28487h = "com.google.android.apps.plus.CALL_TO_ACTION";

    /* renamed from: i */
    public static final String f28488i = "label";

    /* renamed from: j */
    public static final String f28489j = "url";

    /* renamed from: k */
    public static final String f28490k = "deepLinkId";

    /* renamed from: l */
    public static final String f28491l = "com.google.android.apps.plus.SENDER_ID";

    /* renamed from: m */
    public static final String f28492m = "deep_link_id";

    /* renamed from: com.google.android.gms.plus.e$a */
    /* loaded from: classes2.dex */
    public static class C8955a {

        /* renamed from: a */
        private final Context f28493a;

        /* renamed from: b */
        private final Intent f28494b = new Intent().setAction("android.intent.action.SEND");

        /* renamed from: c */
        private boolean f28495c;

        /* renamed from: d */
        private ArrayList<Uri> f28496d;

        public C8955a(Activity activity) {
            this.f28493a = activity;
            this.f28494b.addFlags(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END);
            if (activity == null || activity.getComponentName() == null) {
                return;
            }
            this.f28495c = true;
        }

        public C8955a(Context context) {
            this.f28493a = context;
        }

        /* renamed from: a */
        public Intent m9692a() {
            boolean z = true;
            boolean z2 = this.f28496d != null && this.f28496d.size() > 1;
            boolean equals = "android.intent.action.SEND_MULTIPLE".equals(this.f28494b.getAction());
            boolean booleanExtra = this.f28494b.getBooleanExtra(C8954e.f28486g, false);
            C4588d.m23622a(!z2 || !booleanExtra, "Call-to-action buttons are only available for URLs.");
            C4588d.m23622a(!booleanExtra || this.f28494b.hasExtra(C8954e.f28480a), "The content URL is required for interactive posts.");
            if (booleanExtra && !this.f28494b.hasExtra(C8954e.f28480a) && !this.f28494b.hasExtra(C8954e.f28481b)) {
                z = false;
            }
            C4588d.m23622a(z, "Must set content URL or content deep-link ID to use a call-to-action button.");
            if (this.f28494b.hasExtra(C8954e.f28481b)) {
                C4588d.m23622a(C8954e.m9695a(this.f28494b.getStringExtra(C8954e.f28481b)), "The specified deep-link ID was malformed.");
            }
            if (!z2 && equals) {
                this.f28494b.setAction("android.intent.action.SEND");
                if (this.f28496d == null || this.f28496d.isEmpty()) {
                    this.f28494b.removeExtra("android.intent.extra.STREAM");
                } else {
                    this.f28494b.putExtra("android.intent.extra.STREAM", this.f28496d.get(0));
                }
                this.f28496d = null;
            }
            if (z2 && !equals) {
                this.f28494b.setAction("android.intent.action.SEND_MULTIPLE");
                if (this.f28496d == null || this.f28496d.isEmpty()) {
                    this.f28494b.removeExtra("android.intent.extra.STREAM");
                } else {
                    this.f28494b.putParcelableArrayListExtra("android.intent.extra.STREAM", this.f28496d);
                }
            }
            if ("com.google.android.gms.plus.action.SHARE_INTERNAL_GOOGLE".equals(this.f28494b.getAction())) {
                this.f28494b.setPackage("com.google.android.gms");
                return this.f28494b;
            } else if (this.f28494b.hasExtra("android.intent.extra.STREAM")) {
                this.f28494b.setPackage("com.google.android.apps.plus");
                return this.f28494b;
            } else {
                this.f28494b.setAction("com.google.android.gms.plus.action.SHARE_GOOGLE");
                this.f28494b.setPackage("com.google.android.gms");
                return this.f28494b;
            }
        }

        /* renamed from: a */
        public C8955a m9691a(Uri uri) {
            this.f28496d = null;
            this.f28494b.putExtra("android.intent.extra.STREAM", uri);
            return this;
        }

        /* renamed from: a */
        public C8955a m9690a(AbstractC8923a abstractC8923a, List<AbstractC8923a> list) {
            this.f28494b.putExtra(C8954e.f28491l, abstractC8923a != null ? abstractC8923a.mo9441y() : "0");
            int size = list != null ? list.size() : 0;
            if (size == 0) {
                this.f28494b.removeExtra("com.google.android.apps.plus.RECIPIENT_IDS");
                this.f28494b.removeExtra("com.google.android.apps.plus.RECIPIENT_DISPLAY_NAMES");
            } else {
                ArrayList<String> arrayList = new ArrayList<>(size);
                ArrayList<String> arrayList2 = new ArrayList<>(size);
                for (AbstractC8923a abstractC8923a2 : list) {
                    arrayList.add(abstractC8923a2.mo9441y());
                    arrayList2.add(abstractC8923a2.mo9445u());
                }
                this.f28494b.putStringArrayListExtra("com.google.android.apps.plus.RECIPIENT_IDS", arrayList);
                this.f28494b.putStringArrayListExtra("com.google.android.apps.plus.RECIPIENT_DISPLAY_NAMES", arrayList2);
            }
            return this;
        }

        /* renamed from: a */
        public C8955a m9689a(CharSequence charSequence) {
            this.f28494b.putExtra("android.intent.extra.TEXT", charSequence);
            return this;
        }

        /* renamed from: a */
        public C8955a m9688a(String str) {
            this.f28494b.setType(str);
            return this;
        }

        /* renamed from: a */
        public C8955a m9687a(String str, Uri uri, String str2) {
            C4588d.m23622a(this.f28495c, "Must include the launching activity with PlusShare.Builder constructor before setting call-to-action");
            C4588d.m23618b(uri != null && !TextUtils.isEmpty(uri.toString()), "Must provide a call to action URL");
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString(C8954e.f28488i, str);
            }
            bundle.putString("url", uri.toString());
            if (!TextUtils.isEmpty(str2)) {
                C4588d.m23622a(C8954e.m9695a(str2), "The specified deep-link ID was malformed.");
                bundle.putString(C8954e.f28490k, str2);
            }
            this.f28494b.putExtra(C8954e.f28487h, bundle);
            this.f28494b.putExtra(C8954e.f28486g, true);
            this.f28494b.setType("text/plain");
            return this;
        }

        /* renamed from: a */
        public C8955a m9686a(String str, String str2, String str3, Uri uri) {
            C4588d.m23618b(this.f28495c, "Must include the launching activity with PlusShare.Builder constructor before setting deep links");
            C4588d.m23618b(!TextUtils.isEmpty(str), "The deepLinkId parameter is required.");
            Bundle m9693a = C8954e.m9693a(str2, str3, uri);
            this.f28494b.putExtra(C8954e.f28481b, str);
            this.f28494b.putExtra(C8954e.f28482c, m9693a);
            this.f28494b.setType("text/plain");
            return this;
        }

        /* renamed from: b */
        public C8955a m9685b(Uri uri) {
            Uri uri2 = (Uri) this.f28494b.getParcelableExtra("android.intent.extra.STREAM");
            if (uri2 == null) {
                return m9691a(uri);
            }
            if (this.f28496d == null) {
                this.f28496d = new ArrayList<>();
            }
            this.f28496d.add(uri2);
            this.f28496d.add(uri);
            return this;
        }

        /* renamed from: b */
        public C8955a m9684b(String str) {
            return m9686a(str, null, null, null);
        }

        /* renamed from: c */
        public C8955a m9683c(Uri uri) {
            String str = null;
            if (uri != null) {
                str = uri.toString();
            }
            if (TextUtils.isEmpty(str)) {
                this.f28494b.removeExtra(C8954e.f28480a);
            } else {
                this.f28494b.putExtra(C8954e.f28480a, str);
            }
            return this;
        }
    }

    @Deprecated
    protected C8954e() {
        throw new AssertionError();
    }

    /* renamed from: a */
    public static Bundle m9693a(String str, String str2, Uri uri) {
        Bundle bundle = new Bundle();
        bundle.putString("title", str);
        bundle.putString("description", str2);
        if (uri != null) {
            bundle.putString(f28485f, uri.toString());
        }
        return bundle;
    }

    /* renamed from: a */
    public static AbstractC8923a m9694a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("MinimalPerson ID must not be empty.");
        }
        if (!TextUtils.isEmpty(str2)) {
            return new PersonEntity(str2, str, null, 0, null);
        }
        throw new IllegalArgumentException("Display name must not be empty.");
    }

    /* renamed from: a */
    public static String m9696a(Intent intent) {
        if (intent == null || intent.getData() == null) {
            return null;
        }
        return intent.getData().getQueryParameter(f28492m);
    }

    /* renamed from: a */
    protected static boolean m9695a(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.e("GooglePlusPlatform", "The provided deep-link ID is empty.");
            return false;
        } else if (!str.contains(" ")) {
            return true;
        } else {
            Log.e("GooglePlusPlatform", "Spaces are not allowed in deep-link IDs.");
            return false;
        }
    }
}
