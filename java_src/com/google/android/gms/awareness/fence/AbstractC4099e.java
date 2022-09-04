package com.google.android.gms.awareness.fence;

import android.app.PendingIntent;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl;
import com.google.android.gms.contextmanager.fence.internal.UpdateFenceOperation;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.awareness.fence.e */
/* loaded from: classes2.dex */
public interface AbstractC4099e {

    /* renamed from: com.google.android.gms.awareness.fence.e$a */
    /* loaded from: classes2.dex */
    public static class C4100a {

        /* renamed from: a */
        private final ArrayList<UpdateFenceOperation> f15642a = new ArrayList<>();

        /* renamed from: a */
        public C4100a m25487a(PendingIntent pendingIntent) {
            C4588d.m23627a(pendingIntent);
            this.f15642a.add(UpdateFenceOperation.m22952a(pendingIntent));
            return this;
        }

        /* renamed from: a */
        public C4100a m25486a(String str) {
            C4588d.m23625a(str);
            this.f15642a.add(UpdateFenceOperation.m22950a(str));
            return this;
        }

        /* renamed from: a */
        public C4100a m25485a(String str, AwarenessFence awarenessFence, PendingIntent pendingIntent) {
            C4588d.m23625a(str);
            C4588d.m23627a(awarenessFence);
            C4588d.m23627a(pendingIntent);
            this.f15642a.add(UpdateFenceOperation.m22949a(str, (ContextFenceStub) awarenessFence, pendingIntent));
            return this;
        }

        /* renamed from: a */
        public AbstractC4099e m25488a() {
            return new FenceUpdateRequestImpl(this.f15642a);
        }
    }
}
