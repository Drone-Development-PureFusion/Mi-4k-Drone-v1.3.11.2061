package com.fimi.soul.biz.camera.entity;

import com.fimi.soul.biz.camera.C1827d;
/* loaded from: classes.dex */
public class X11StorageTask extends X11Task {
    public X11StorageTask(C1827d c1827d) {
        super(c1827d);
    }

    @Override // com.fimi.soul.biz.camera.entity.X11Task
    protected void doNext() {
        getContext().m33989u().m34046d(getCurrentKey());
    }
}
