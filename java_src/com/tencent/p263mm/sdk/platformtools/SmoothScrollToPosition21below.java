package com.tencent.p263mm.sdk.platformtools;

import android.widget.ListView;
import com.tencent.p263mm.sdk.platformtools.BackwardSupportUtil;
/* renamed from: com.tencent.mm.sdk.platformtools.SmoothScrollToPosition21below */
/* loaded from: classes2.dex */
class SmoothScrollToPosition21below implements BackwardSupportUtil.SmoothScrollFactory.IScroll {
    @Override // com.tencent.p263mm.sdk.platformtools.BackwardSupportUtil.SmoothScrollFactory.IScroll
    public void doScroll(ListView listView) {
        listView.setSelection(0);
    }

    @Override // com.tencent.p263mm.sdk.platformtools.BackwardSupportUtil.SmoothScrollFactory.IScroll
    public void doScroll(ListView listView, int i) {
        listView.setSelection(i);
    }
}
