package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.games.multiplayer.AbstractC5942d;
import java.util.ArrayList;
import java.util.Arrays;
/* renamed from: com.google.android.gms.games.multiplayer.realtime.d */
/* loaded from: classes2.dex */
public abstract class AbstractC5955d {

    /* renamed from: com.google.android.gms.games.multiplayer.realtime.d$a */
    /* loaded from: classes2.dex */
    public static final class C5957a {

        /* renamed from: a */
        final AbstractC5961h f20218a;

        /* renamed from: b */
        AbstractC5960g f20219b;

        /* renamed from: c */
        AbstractC5951a f20220c;

        /* renamed from: d */
        String f20221d;

        /* renamed from: e */
        int f20222e;

        /* renamed from: f */
        ArrayList<String> f20223f;

        /* renamed from: g */
        Bundle f20224g;

        private C5957a(AbstractC5961h abstractC5961h) {
            this.f20221d = null;
            this.f20222e = -1;
            this.f20223f = new ArrayList<>();
            this.f20218a = (AbstractC5961h) C4588d.m23626a(abstractC5961h, "Must provide a RoomUpdateListener");
        }

        /* renamed from: a */
        public C5957a m19395a(int i) {
            C4588d.m23618b(i == -1 || i > 0, "Variant must be a positive integer or Room.ROOM_VARIANT_ANY");
            this.f20222e = i;
            return this;
        }

        /* renamed from: a */
        public C5957a m19394a(Bundle bundle) {
            this.f20224g = bundle;
            return this;
        }

        /* renamed from: a */
        public C5957a m19393a(AbstractC5951a abstractC5951a) {
            this.f20220c = abstractC5951a;
            return this;
        }

        /* renamed from: a */
        public C5957a m19392a(AbstractC5960g abstractC5960g) {
            this.f20219b = abstractC5960g;
            return this;
        }

        /* renamed from: a */
        public C5957a m19391a(String str) {
            C4588d.m23627a(str);
            this.f20221d = str;
            return this;
        }

        /* renamed from: a */
        public C5957a m19390a(ArrayList<String> arrayList) {
            C4588d.m23627a(arrayList);
            this.f20223f.addAll(arrayList);
            return this;
        }

        /* renamed from: a */
        public C5957a m19389a(String... strArr) {
            C4588d.m23627a(strArr);
            this.f20223f.addAll(Arrays.asList(strArr));
            return this;
        }

        /* renamed from: a */
        public AbstractC5955d m19396a() {
            return new C5958e(this);
        }
    }

    /* renamed from: a */
    public static Bundle m19398a(int i, int i2, long j) {
        Bundle bundle = new Bundle();
        bundle.putInt(AbstractC5942d.f20194i, i);
        bundle.putInt(AbstractC5942d.f20195j, i2);
        bundle.putLong(AbstractC5942d.f20189d, j);
        return bundle;
    }

    /* renamed from: a */
    public static C5957a m19397a(AbstractC5961h abstractC5961h) {
        return new C5957a(abstractC5961h);
    }

    /* renamed from: a */
    public abstract AbstractC5961h mo19388a();

    /* renamed from: b */
    public abstract String mo19387b();

    /* renamed from: c */
    public abstract AbstractC5960g mo19386c();

    /* renamed from: d */
    public abstract AbstractC5951a mo19385d();

    /* renamed from: e */
    public abstract int mo19384e();

    /* renamed from: f */
    public abstract String[] mo19383f();

    /* renamed from: g */
    public abstract Bundle mo19382g();
}
