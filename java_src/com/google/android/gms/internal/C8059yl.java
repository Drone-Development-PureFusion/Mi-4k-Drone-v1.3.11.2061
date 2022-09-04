package com.google.android.gms.internal;

import org.json.JSONException;
import org.json.JSONObject;
@aaa
/* renamed from: com.google.android.gms.internal.yl */
/* loaded from: classes.dex */
public class C8059yl {

    /* renamed from: a */
    private final boolean f26403a;

    /* renamed from: b */
    private final boolean f26404b;

    /* renamed from: c */
    private final boolean f26405c;

    /* renamed from: d */
    private final boolean f26406d;

    /* renamed from: e */
    private final boolean f26407e;

    /* renamed from: com.google.android.gms.internal.yl$a */
    /* loaded from: classes2.dex */
    public static final class C8061a {

        /* renamed from: a */
        private boolean f26408a;

        /* renamed from: b */
        private boolean f26409b;

        /* renamed from: c */
        private boolean f26410c;

        /* renamed from: d */
        private boolean f26411d;

        /* renamed from: e */
        private boolean f26412e;

        /* renamed from: a */
        public C8061a m12904a(boolean z) {
            this.f26408a = z;
            return this;
        }

        /* renamed from: a */
        public C8059yl m12906a() {
            return new C8059yl(this);
        }

        /* renamed from: b */
        public C8061a m12902b(boolean z) {
            this.f26409b = z;
            return this;
        }

        /* renamed from: c */
        public C8061a m12900c(boolean z) {
            this.f26410c = z;
            return this;
        }

        /* renamed from: d */
        public C8061a m12898d(boolean z) {
            this.f26411d = z;
            return this;
        }

        /* renamed from: e */
        public C8061a m12896e(boolean z) {
            this.f26412e = z;
            return this;
        }
    }

    private C8059yl(C8061a c8061a) {
        this.f26403a = c8061a.f26408a;
        this.f26404b = c8061a.f26409b;
        this.f26405c = c8061a.f26410c;
        this.f26406d = c8061a.f26411d;
        this.f26407e = c8061a.f26412e;
    }

    /* renamed from: a */
    public JSONObject m12907a() {
        try {
            return new JSONObject().put("sms", this.f26403a).put("tel", this.f26404b).put("calendar", this.f26405c).put("storePicture", this.f26406d).put("inlineVideo", this.f26407e);
        } catch (JSONException e) {
            abr.b("Error occured while obtaining the MRAID capabilities.", e);
            return null;
        }
    }
}
