package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.games.multiplayer.AbstractC5942d;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.games.multiplayer.turnbased.d */
/* loaded from: classes2.dex */
public abstract class AbstractC5966d {

    /* renamed from: com.google.android.gms.games.multiplayer.turnbased.d$a */
    /* loaded from: classes2.dex */
    public static final class C5968a {

        /* renamed from: a */
        int f20269a;

        /* renamed from: b */
        ArrayList<String> f20270b;

        /* renamed from: c */
        Bundle f20271c;

        /* renamed from: d */
        int f20272d;

        private C5968a() {
            this.f20269a = -1;
            this.f20270b = new ArrayList<>();
            this.f20271c = null;
            this.f20272d = 2;
        }

        /* renamed from: a */
        public C5968a m19310a(int i) {
            C4588d.m23618b(i == -1 || i > 0, "Variant must be a positive integer or TurnBasedMatch.MATCH_VARIANT_ANY");
            this.f20269a = i;
            return this;
        }

        /* renamed from: a */
        public C5968a m19309a(Bundle bundle) {
            this.f20271c = bundle;
            return this;
        }

        /* renamed from: a */
        public C5968a m19308a(String str) {
            C4588d.m23627a(str);
            this.f20270b.add(str);
            return this;
        }

        /* renamed from: a */
        public C5968a m19307a(ArrayList<String> arrayList) {
            C4588d.m23627a(arrayList);
            this.f20270b.addAll(arrayList);
            return this;
        }

        /* renamed from: a */
        public AbstractC5966d m19311a() {
            return new C5969e(this);
        }
    }

    /* renamed from: a */
    public static Bundle m19313a(int i, int i2, long j) {
        Bundle bundle = new Bundle();
        bundle.putInt(AbstractC5942d.f20194i, i);
        bundle.putInt(AbstractC5942d.f20195j, i2);
        bundle.putLong(AbstractC5942d.f20189d, j);
        return bundle;
    }

    /* renamed from: e */
    public static C5968a m19312e() {
        return new C5968a();
    }

    /* renamed from: a */
    public abstract int mo19306a();

    /* renamed from: b */
    public abstract int mo19305b();

    /* renamed from: c */
    public abstract String[] mo19304c();

    /* renamed from: d */
    public abstract Bundle mo19303d();
}
