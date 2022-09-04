package com.google.android.gms.appinvite;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.common.internal.C4588d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
/* renamed from: com.google.android.gms.appinvite.c */
/* loaded from: classes.dex */
public final class C3968c {

    /* renamed from: a */
    private static final String[] f15320a = {"jpg", "jpeg", "png"};

    /* renamed from: com.google.android.gms.appinvite.c$a */
    /* loaded from: classes.dex */
    public static final class C3969a {

        /* renamed from: a */
        public static final int f15321a = 100;

        /* renamed from: b */
        public static final int f15322b = 512000;

        /* renamed from: c */
        public static final int f15323c = 2;

        /* renamed from: d */
        public static final int f15324d = 20;

        /* renamed from: e */
        private final Intent f15325e = new Intent("com.google.android.gms.appinvite.ACTION_APP_INVITE");

        /* renamed from: f */
        private String f15326f;

        /* renamed from: g */
        private String f15327g;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.google.android.gms.appinvite.c$a$a */
        /* loaded from: classes.dex */
        public @interface AbstractC3970a {

            /* renamed from: a */
            public static final int f15328a = 1;

            /* renamed from: b */
            public static final int f15329b = 2;
        }

        public C3969a(@NonNull CharSequence charSequence) {
            C4588d.m23627a(charSequence);
            this.f15325e.putExtra("com.google.android.gms.appinvite.TITLE", charSequence);
            this.f15325e.setPackage("com.google.android.gms");
        }

        /* renamed from: a */
        public Intent m25893a() {
            if (!TextUtils.isEmpty(this.f15326f)) {
                C4588d.m23624a(this.f15327g, (Object) "Email html content must be set when email subject is set.");
                C4588d.m23618b(this.f15325e.getData() == null, "Custom image must not be set when email html content is set.");
                C4588d.m23618b(TextUtils.isEmpty(this.f15325e.getCharSequenceExtra("com.google.android.gms.appinvite.BUTTON_TEXT")), "Call to action text must not be set when email html content is set.");
                this.f15325e.putExtra("com.google.android.gms.appinvite.EMAIL_SUBJECT", this.f15326f);
                this.f15325e.putExtra("com.google.android.gms.appinvite.EMAIL_CONTENT", this.f15327g);
            } else if (!TextUtils.isEmpty(this.f15327g)) {
                throw new IllegalArgumentException("Email subject must be set when email html content is set.");
            }
            return this.f15325e;
        }

        /* renamed from: a */
        public C3969a m25892a(int i) {
            this.f15325e.putExtra("com.google.android.gms.appinvite.appMinimumVersionCode", i);
            return this;
        }

        /* renamed from: a */
        public C3969a m25891a(int i, String str) {
            switch (i) {
                case 1:
                    this.f15325e.putExtra("com.google.android.gms.appinvite.iosTargetApplication", str);
                    break;
                case 2:
                    this.f15325e.putExtra("com.google.android.gms.appinvite.androidTargetApplication", str);
                    break;
                default:
                    throw new IllegalArgumentException("targetPlatform must be either PROJECT_PLATFORM_IOS or PROJECT_PLATFORM_ANDROID.");
            }
            return this;
        }

        /* renamed from: a */
        public C3969a m25890a(Account account) {
            if (account == null || !"com.google".equals(account.type)) {
                this.f15325e.removeExtra("com.google.android.gms.appinvite.ACCOUNT_NAME");
            } else {
                this.f15325e.putExtra("com.google.android.gms.appinvite.ACCOUNT_NAME", account);
            }
            return this;
        }

        /* renamed from: a */
        public C3969a m25889a(Uri uri) {
            if (uri != null) {
                this.f15325e.putExtra("com.google.android.gms.appinvite.DEEP_LINK_URL", uri);
            } else {
                this.f15325e.removeExtra("com.google.android.gms.appinvite.DEEP_LINK_URL");
            }
            return this;
        }

        /* renamed from: a */
        public C3969a m25888a(CharSequence charSequence) {
            if (charSequence == null || charSequence.length() <= 100) {
                this.f15325e.putExtra("com.google.android.gms.appinvite.MESSAGE", charSequence);
                return this;
            }
            throw new IllegalArgumentException(String.format("Message must be %d chars or less.", 100));
        }

        /* renamed from: a */
        public C3969a m25887a(String str) {
            this.f15326f = str;
            return this;
        }

        /* renamed from: a */
        public C3969a m25886a(Map<String, String> map) {
            if (map != null) {
                this.f15325e.putExtra("com.google.android.gms.appinvite.REFERRAL_PARAMETERS_URI", C3968c.m25894b(map));
            } else {
                this.f15325e.removeExtra("com.google.android.gms.appinvite.REFERRAL_PARAMETERS_URI");
            }
            return this;
        }

        /* renamed from: b */
        public C3969a m25885b(Uri uri) {
            boolean z = false;
            C4588d.m23627a(uri);
            C4588d.m23618b(uri.isAbsolute(), "Image uri is not an absolute uri. Did you forget to add a scheme to the Uri?");
            String lowerCase = uri.getScheme().toLowerCase();
            boolean z2 = lowerCase.equals("android.resource") || lowerCase.equals("content") || lowerCase.equals("file");
            C4588d.m23618b(z2 || lowerCase.equals(UriUtil.HTTP_SCHEME) || lowerCase.equals(UriUtil.HTTPS_SCHEME), "Image uri must be a content URI with scheme \"android.resource\", \"content\" or \"file\", or a network url with scheme \"http\" or \"https\".");
            if (!z2) {
                String uri2 = uri.toString();
                String substring = uri2.substring(uri2.lastIndexOf("/") + 1, uri2.length());
                String lowerCase2 = substring == null ? null : substring.lastIndexOf(".") == -1 ? null : substring.substring(substring.lastIndexOf(".") + 1, substring.length()).toLowerCase();
                if (TextUtils.isEmpty(lowerCase2) || C3968c.m25895b(lowerCase2)) {
                    z = true;
                }
                C4588d.m23618b(z, String.valueOf(lowerCase2).concat(" images are not supported. Only jpg, jpeg, or png images are supported."));
            }
            this.f15325e.setData(uri.buildUpon().scheme(lowerCase).build());
            if (z2) {
                this.f15325e.addFlags(1);
            }
            return this;
        }

        /* renamed from: b */
        public C3969a m25884b(CharSequence charSequence) {
            if (charSequence == null || charSequence.length() < 2 || charSequence.length() > 20) {
                throw new IllegalArgumentException(String.format("Text must be between %d and %d chars in length.", 2, 20));
            }
            this.f15325e.putExtra("com.google.android.gms.appinvite.BUTTON_TEXT", charSequence);
            return this;
        }

        /* renamed from: b */
        public C3969a m25883b(String str) {
            if (str == null || str.getBytes().length <= 512000) {
                this.f15327g = str;
                return this;
            }
            throw new IllegalArgumentException(String.format("Email html content must be %d bytes or less.", 512000));
        }

        /* renamed from: c */
        public C3969a m25882c(String str) {
            this.f15325e.putExtra("com.google.android.gms.appinvite.GOOGLE_ANALYTICS_TRACKING_ID", str);
            return this;
        }
    }

    private C3968c() {
    }

    /* renamed from: a */
    public static String[] m25898a(int i, @NonNull Intent intent) {
        if (i == -1) {
            return intent.getStringArrayExtra("com.google.android.gms.appinvite.RESULT_INVITATION_IDS");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static Bundle m25894b(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, map.get(str));
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m25895b(String str) {
        for (int i = 0; i < f15320a.length; i++) {
            if (f15320a[i].equals(str)) {
                return true;
            }
        }
        return false;
    }
}
