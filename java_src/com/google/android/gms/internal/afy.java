package com.google.android.gms.internal;

import android.widget.TextView;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.framework.media.C4298c;
import com.google.android.gms.cast.framework.media.p234a.AbstractC4294a;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class afy extends AbstractC4294a {

    /* renamed from: a */
    private final TextView f21527a;

    /* renamed from: b */
    private final List<String> f21528b = new ArrayList();

    public afy(TextView textView, List<String> list) {
        this.f21527a = textView;
        this.f21528b.addAll(list);
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: c */
    public void mo17670c() {
        MediaQueueItem m24517r;
        MediaInfo m25089b;
        MediaMetadata m25139e;
        C4298c a = a();
        if (a == null || !a.m24515t() || (m24517r = a.m24517r()) == null || (m25089b = m24517r.m25089b()) == null || (m25139e = m25089b.m25139e()) == null) {
            return;
        }
        for (String str : this.f21528b) {
            if (m25139e.m25120a(str)) {
                this.f21527a.setText(m25139e.m25112b(str));
                return;
            }
        }
    }
}
