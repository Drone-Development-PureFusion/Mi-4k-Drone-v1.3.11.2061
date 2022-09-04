package com.google.firebase.p251a;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresPermission;
import android.support.annotation.Size;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.measurement.internal.C8668aj;
/* renamed from: com.google.firebase.a.a */
/* loaded from: classes2.dex */
public final class C9654a {

    /* renamed from: a */
    private final C8668aj f30185a;

    /* renamed from: com.google.firebase.a.a$a */
    /* loaded from: classes2.dex */
    public static class C9655a {

        /* renamed from: b */
        public static final String f30186b = "add_payment_info";

        /* renamed from: c */
        public static final String f30187c = "add_to_cart";

        /* renamed from: d */
        public static final String f30188d = "add_to_wishlist";

        /* renamed from: e */
        public static final String f30189e = "app_open";

        /* renamed from: f */
        public static final String f30190f = "begin_checkout";

        /* renamed from: g */
        public static final String f30191g = "ecommerce_purchase";

        /* renamed from: h */
        public static final String f30192h = "generate_lead";

        /* renamed from: i */
        public static final String f30193i = "join_group";

        /* renamed from: j */
        public static final String f30194j = "level_up";

        /* renamed from: k */
        public static final String f30195k = "login";

        /* renamed from: l */
        public static final String f30196l = "post_score";

        /* renamed from: m */
        public static final String f30197m = "present_offer";

        /* renamed from: n */
        public static final String f30198n = "purchase_refund";

        /* renamed from: o */
        public static final String f30199o = "search";

        /* renamed from: p */
        public static final String f30200p = "select_content";

        /* renamed from: q */
        public static final String f30201q = "share";

        /* renamed from: r */
        public static final String f30202r = "sign_up";

        /* renamed from: s */
        public static final String f30203s = "spend_virtual_currency";

        /* renamed from: t */
        public static final String f30204t = "tutorial_begin";

        /* renamed from: u */
        public static final String f30205u = "tutorial_complete";

        /* renamed from: v */
        public static final String f30206v = "unlock_achievement";

        /* renamed from: w */
        public static final String f30207w = "view_item";

        /* renamed from: x */
        public static final String f30208x = "view_item_list";

        /* renamed from: y */
        public static final String f30209y = "view_search_results";

        /* renamed from: z */
        public static final String f30210z = "earn_virtual_currency";

        protected C9655a() {
        }
    }

    /* renamed from: com.google.firebase.a.a$b */
    /* loaded from: classes2.dex */
    public static class C9656b {

        /* renamed from: A */
        public static final String f30211A = "shipping";

        /* renamed from: B */
        public static final String f30212B = "transaction_id";

        /* renamed from: C */
        public static final String f30213C = "search_term";

        /* renamed from: D */
        public static final String f30214D = "tax";

        /* renamed from: E */
        public static final String f30215E = "value";

        /* renamed from: F */
        public static final String f30216F = "virtual_currency_name";

        /* renamed from: b */
        public static final String f30217b = "achievement_id";

        /* renamed from: c */
        public static final String f30218c = "character";

        /* renamed from: d */
        public static final String f30219d = "travel_class";

        /* renamed from: e */
        public static final String f30220e = "content_type";

        /* renamed from: f */
        public static final String f30221f = "currency";

        /* renamed from: g */
        public static final String f30222g = "coupon";

        /* renamed from: h */
        public static final String f30223h = "start_date";

        /* renamed from: i */
        public static final String f30224i = "end_date";

        /* renamed from: j */
        public static final String f30225j = "flight_number";

        /* renamed from: k */
        public static final String f30226k = "group_id";

        /* renamed from: l */
        public static final String f30227l = "item_category";

        /* renamed from: m */
        public static final String f30228m = "item_id";

        /* renamed from: n */
        public static final String f30229n = "item_location_id";

        /* renamed from: o */
        public static final String f30230o = "item_name";

        /* renamed from: p */
        public static final String f30231p = "location";

        /* renamed from: q */
        public static final String f30232q = "level";

        /* renamed from: r */
        public static final String f30233r = "sign_up_method";

        /* renamed from: s */
        public static final String f30234s = "number_of_nights";

        /* renamed from: t */
        public static final String f30235t = "number_of_passengers";

        /* renamed from: u */
        public static final String f30236u = "number_of_rooms";

        /* renamed from: v */
        public static final String f30237v = "destination";

        /* renamed from: w */
        public static final String f30238w = "origin";

        /* renamed from: x */
        public static final String f30239x = "price";

        /* renamed from: y */
        public static final String f30240y = "quantity";

        /* renamed from: z */
        public static final String f30241z = "score";

        protected C9656b() {
        }
    }

    /* renamed from: com.google.firebase.a.a$c */
    /* loaded from: classes2.dex */
    public static class C9657c {

        /* renamed from: b */
        public static final String f30242b = "sign_up_method";

        protected C9657c() {
        }
    }

    public C9654a(C8668aj c8668aj) {
        C4588d.m23627a(c8668aj);
        this.f30185a = c8668aj;
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    /* renamed from: a */
    public static C9654a m7539a(Context context) {
        return C8668aj.m10727a(context).m10690n();
    }

    /* renamed from: a */
    public void m7540a(long j) {
        this.f30185a.m10691m().m10915a(j);
    }

    /* renamed from: a */
    public void m7538a(String str) {
        this.f30185a.m10691m().m10912a(str);
    }

    /* renamed from: a */
    public void m7537a(@Size(max = 32, min = 1) @NonNull String str, Bundle bundle) {
        this.f30185a.m10691m().m10911a(str, bundle);
    }

    /* renamed from: a */
    public void m7536a(@Size(max = 24, min = 1) @NonNull String str, @Size(max = 36) @Nullable String str2) {
        this.f30185a.m10691m().m10910a(str, str2);
    }

    /* renamed from: a */
    public void m7535a(boolean z) {
        this.f30185a.m10691m().m10906a(z);
    }

    /* renamed from: b */
    public void m7534b(long j) {
        this.f30185a.m10691m().m10905b(j);
    }
}
