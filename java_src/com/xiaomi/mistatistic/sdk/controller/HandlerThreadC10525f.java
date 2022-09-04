package com.xiaomi.mistatistic.sdk.controller;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.mistatistic.sdk.controller.f */
/* loaded from: classes2.dex */
public class HandlerThreadC10525f extends HandlerThread {

    /* renamed from: a */
    final /* synthetic */ C10521b f32676a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerThreadC10525f(C10521b c10521b, String str) {
        super(str);
        this.f32676a = c10521b;
    }

    @Override // android.os.HandlerThread
    protected void onLooperPrepared() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        this.f32676a.f32670c = new Handler();
        ArrayList arrayList5 = null;
        arrayList = this.f32676a.f32671d;
        synchronized (arrayList) {
            arrayList2 = this.f32676a.f32671d;
            if (!arrayList2.isEmpty()) {
                arrayList3 = this.f32676a.f32671d;
                arrayList5 = (ArrayList) arrayList3.clone();
                arrayList4 = this.f32676a.f32671d;
                arrayList4.clear();
            }
        }
        if (arrayList5 != null) {
            Iterator it2 = arrayList5.iterator();
            while (it2.hasNext()) {
                ((AbstractC10524e) it2.next()).mo4784a();
            }
        }
        super.onLooperPrepared();
    }
}
