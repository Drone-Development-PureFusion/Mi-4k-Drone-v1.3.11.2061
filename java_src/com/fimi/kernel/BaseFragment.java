package com.fimi.kernel;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.p001v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fimi.kernel.p164c.AbstractC1643a;
import com.fimi.kernel.utils.C1685x;
import com.fimi.kernel.view.AbstractC1692b;
/* loaded from: classes.dex */
public abstract class BaseFragment extends Fragment {

    /* renamed from: a */
    private Handler f3869a;

    /* renamed from: com.fimi.kernel.BaseFragment$a */
    /* loaded from: classes.dex */
    class HandlerC1571a extends Handler {
        HandlerC1571a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            BaseFragment.this.mo30522a(message);
            super.handleMessage(message);
        }
    }

    /* renamed from: a */
    public AbstractC1692b m35106a() {
        return C1642c.m34889b();
    }

    /* renamed from: a */
    public void mo30522a(Message message) {
    }

    /* renamed from: a */
    public void m35105a(Runnable runnable) {
        C1685x.m34457a(runnable);
    }

    /* renamed from: b */
    public AbstractC1643a m35104b() {
        return C1642c.m34887c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public Handler m35103c() {
        return this.f3869a;
    }

    @Override // android.support.p001v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.f3869a = new HandlerC1571a();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
