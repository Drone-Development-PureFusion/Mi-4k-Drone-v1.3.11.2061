package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.internal.aao;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
@aaa
/* loaded from: classes.dex */
public class aab {
    @Nullable

    /* renamed from: a */
    public Bundle f20647a;
    @Nullable

    /* renamed from: b */
    public Bundle f20648b;
    @Nullable

    /* renamed from: d */
    public Location f20650d;
    @Nullable

    /* renamed from: e */
    public aao.C6117a f20651e;
    @Nullable

    /* renamed from: f */
    public String f20652f;
    @Nullable

    /* renamed from: g */
    public String f20653g;

    /* renamed from: h */
    public AdRequestInfoParcel f20654h;

    /* renamed from: i */
    public aak f20655i;

    /* renamed from: j */
    public JSONObject f20656j = new JSONObject();
    @Nullable

    /* renamed from: c */
    public List<String> f20649c = new ArrayList();

    /* renamed from: a */
    public aab m18701a(Location location) {
        this.f20650d = location;
        return this;
    }

    /* renamed from: a */
    public aab m18700a(Bundle bundle) {
        this.f20648b = bundle;
        return this;
    }

    /* renamed from: a */
    public aab m18699a(AdRequestInfoParcel adRequestInfoParcel) {
        this.f20654h = adRequestInfoParcel;
        return this;
    }

    /* renamed from: a */
    public aab m18698a(aak aakVar) {
        this.f20655i = aakVar;
        return this;
    }

    /* renamed from: a */
    public aab m18697a(aao.C6117a c6117a) {
        this.f20651e = c6117a;
        return this;
    }

    /* renamed from: a */
    public aab m18696a(String str) {
        this.f20653g = str;
        return this;
    }

    /* renamed from: a */
    public aab m18695a(List<String> list) {
        if (list == null) {
            this.f20649c.clear();
        }
        this.f20649c = list;
        return this;
    }

    /* renamed from: a */
    public aab m18694a(JSONObject jSONObject) {
        this.f20656j = jSONObject;
        return this;
    }

    /* renamed from: b */
    public aab m18693b(Bundle bundle) {
        this.f20647a = bundle;
        return this;
    }

    /* renamed from: b */
    public aab m18692b(String str) {
        this.f20652f = str;
        return this;
    }
}
