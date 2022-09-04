package com.xiaomi.network;

import java.util.ArrayList;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.network.b */
/* loaded from: classes.dex */
public class C10556b extends Fallback {

    /* renamed from: i */
    Fallback f32748i;

    /* renamed from: j */
    final /* synthetic */ Fallback f32749j;

    /* renamed from: k */
    final /* synthetic */ HostManager f32750k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10556b(HostManager hostManager, String str, Fallback fallback) {
        super(str);
        this.f32750k = hostManager;
        this.f32749j = fallback;
        this.f32748i = this.f32749j;
        this.f32728b = this.f32728b;
        if (this.f32749j != null) {
            this.f32732f = this.f32749j.f32732f;
        }
    }

    @Override // com.xiaomi.network.Fallback
    /* renamed from: a */
    public synchronized ArrayList<String> mo4737a(boolean z) {
        ArrayList<String> arrayList;
        arrayList = new ArrayList<>();
        if (this.f32748i != null) {
            arrayList.addAll(this.f32748i.mo4737a(true));
        }
        synchronized (HostManager.mReservedHosts) {
            ArrayList<String> arrayList2 = HostManager.mReservedHosts.get(this.f32728b);
            if (arrayList2 != null) {
                ArrayList<String> mo4737a = this.f32748i != null ? this.f32748i.mo4737a(false) : arrayList;
                Iterator<String> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    String next = it2.next();
                    if (mo4737a.indexOf(next) == -1) {
                        arrayList.add(next);
                    }
                }
                arrayList.remove(this.f32728b);
                arrayList.add(this.f32728b);
            }
        }
        return arrayList;
    }

    @Override // com.xiaomi.network.Fallback
    /* renamed from: a */
    public synchronized void mo4738a(String str, AccessHistory accessHistory) {
        if (this.f32748i != null) {
            this.f32748i.mo4738a(str, accessHistory);
        }
    }

    @Override // com.xiaomi.network.Fallback
    /* renamed from: b */
    public boolean mo4736b() {
        return false;
    }
}
