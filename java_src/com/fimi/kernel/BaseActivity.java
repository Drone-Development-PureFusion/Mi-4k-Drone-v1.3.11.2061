package com.fimi.kernel;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.p001v4.app.FragmentActivity;
import com.fimi.kernel.p158b.AbstractC1598b;
import com.fimi.kernel.p158b.EnumC1626d;
import com.fimi.kernel.p164c.AbstractC1643a;
import com.fimi.kernel.utils.C1685x;
import com.fimi.kernel.view.AbstractC1692b;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class BaseActivity extends FragmentActivity {
    private Handler activityInnerHandler;
    private Map<EnumC1626d, AbstractC1598b> networkManagerMap;

    /* renamed from: com.fimi.kernel.BaseActivity$a */
    /* loaded from: classes.dex */
    class HandlerC1570a extends Handler {
        HandlerC1570a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            BaseActivity.this.onHandleMessage(message);
            super.handleMessage(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Handler getHandler() {
        return this.activityInnerHandler;
    }

    protected AbstractC1643a getKeyValueStoreManager() {
        return C1642c.m34887c();
    }

    public AbstractC1598b getNetworkManager(EnumC1626d enumC1626d) {
        if (this.networkManagerMap == null) {
            this.networkManagerMap = new HashMap();
        }
        if (this.networkManagerMap.containsKey(enumC1626d)) {
            return this.networkManagerMap.get(enumC1626d);
        }
        AbstractC1598b abstractC1598b = (AbstractC1598b) C1642c.m34890a(enumC1626d);
        this.networkManagerMap.put(enumC1626d, abstractC1598b);
        return abstractC1598b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1692b getViewManager() {
        return C1642c.m34889b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1642c.m34892a((Activity) this);
        this.activityInnerHandler = new HandlerC1570a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        C1642c.m34888b(this);
        super.onDestroy();
    }

    public void onHandleMessage(Message message) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        C1642c.m34892a((Activity) this);
        super.onResume();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        C1642c.m34892a((Activity) this);
        super.onStart();
    }

    public void runInBackground(Runnable runnable) {
        C1685x.m34457a(runnable);
    }
}
