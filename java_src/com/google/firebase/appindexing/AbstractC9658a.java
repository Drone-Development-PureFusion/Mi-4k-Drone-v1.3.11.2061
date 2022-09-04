package com.google.firebase.appindexing;

import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.C4588d;
import com.google.firebase.appindexing.internal.ActionImpl;
import com.google.firebase.appindexing.internal.C9710k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* renamed from: com.google.firebase.appindexing.a */
/* loaded from: classes.dex */
public interface AbstractC9658a {

    /* renamed from: com.google.firebase.appindexing.a$a */
    /* loaded from: classes.dex */
    public static class C9659a {

        /* renamed from: a */
        public static final String f30243a = "ActivateAction";

        /* renamed from: b */
        public static final String f30244b = "AddAction";

        /* renamed from: c */
        public static final String f30245c = "BookmarkAction";

        /* renamed from: d */
        public static final String f30246d = "CommentAction";

        /* renamed from: e */
        public static final String f30247e = "LikeAction";

        /* renamed from: f */
        public static final String f30248f = "ListenAction";

        /* renamed from: g */
        public static final String f30249g = "SendAction";

        /* renamed from: h */
        public static final String f30250h = "ShareAction";

        /* renamed from: i */
        public static final String f30251i = "ViewAction";

        /* renamed from: j */
        public static final String f30252j = "WatchAction";

        /* renamed from: k */
        public static final String f30253k = "http://schema.org/ActiveActionStatus";

        /* renamed from: l */
        public static final String f30254l = "http://schema.org/CompletedActionStatus";

        /* renamed from: m */
        public static final String f30255m = "http://schema.org/FailedActionStatus";

        /* renamed from: n */
        private final String f30256n;

        /* renamed from: o */
        private String f30257o;

        /* renamed from: p */
        private String f30258p;

        /* renamed from: q */
        private String f30259q;

        /* renamed from: r */
        private ActionImpl.MetadataImpl f30260r = AbstractC9661b.f30262a;

        /* renamed from: s */
        private String f30261s;

        @Retention(RetentionPolicy.CLASS)
        /* renamed from: com.google.firebase.appindexing.a$a$a */
        /* loaded from: classes.dex */
        public @interface AbstractC9660a {
        }

        public C9659a(String str) {
            this.f30256n = str;
        }

        /* renamed from: a */
        public C9659a m7532a(@NonNull AbstractC9661b.C9662a c9662a) {
            C4588d.m23627a(c9662a);
            this.f30260r = c9662a.m7526a();
            return this;
        }

        /* renamed from: a */
        public C9659a m7531a(@AbstractC9660a String str) {
            C4588d.m23627a(str);
            this.f30261s = str;
            return this;
        }

        /* renamed from: a */
        public C9659a m7530a(@NonNull String str, @NonNull String str2) {
            C4588d.m23627a(str);
            C9710k.m7395a(str2);
            this.f30257o = str;
            this.f30258p = str2;
            return this;
        }

        /* renamed from: a */
        public C9659a m7528a(@NonNull String str, @NonNull String str2, @NonNull String str3) {
            C4588d.m23627a(str);
            C9710k.m7395a(str2);
            C9710k.m7394b(str3);
            this.f30257o = str;
            this.f30258p = str2;
            this.f30259q = str3;
            return this;
        }

        /* renamed from: a */
        public AbstractC9658a m7533a() {
            C4588d.m23626a(this.f30257o, (Object) "setObject is required before calling build().");
            C4588d.m23626a(this.f30258p, (Object) "setObject is required before calling build().");
            return new ActionImpl(this.f30256n, this.f30257o, this.f30258p, this.f30259q, this.f30260r, this.f30261s);
        }
    }

    /* renamed from: com.google.firebase.appindexing.a$b */
    /* loaded from: classes.dex */
    public interface AbstractC9661b {

        /* renamed from: a */
        public static final ActionImpl.MetadataImpl f30262a = new C9662a().m7526a();

        /* renamed from: com.google.firebase.appindexing.a$b$a */
        /* loaded from: classes.dex */
        public static class C9662a {

            /* renamed from: a */
            private boolean f30263a = true;

            /* renamed from: b */
            private boolean f30264b = false;

            /* renamed from: a */
            public C9662a m7525a(boolean z) {
                this.f30263a = z;
                return this;
            }

            /* renamed from: a */
            public ActionImpl.MetadataImpl m7526a() {
                return new ActionImpl.MetadataImpl(this.f30263a, null, null, null, false);
            }
        }
    }
}
