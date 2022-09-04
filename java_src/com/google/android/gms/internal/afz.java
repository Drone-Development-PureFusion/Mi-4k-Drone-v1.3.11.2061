package com.google.android.gms.internal;

import android.widget.TextView;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.framework.media.C4298c;
import com.google.android.gms.cast.framework.media.p234a.AbstractC4294a;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class afz extends AbstractC4294a {

    /* renamed from: a */
    private final TextView f21529a;

    /* renamed from: b */
    private final List<String> f21530b = new ArrayList();

    public afz(TextView textView, List<String> list) {
        this.f21529a = textView;
        this.f21530b.addAll(list);
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: c */
    public void mo17670c() {
        MediaInfo m25051f;
        MediaMetadata m25139e;
        C4298c a = a();
        if (a == null || !a.m24515t() || (m25051f = a.m24529g().m25051f()) == null || (m25139e = m25051f.m25139e()) == null) {
            return;
        }
        for (String str : this.f21530b) {
            if (m25139e.m25120a(str)) {
                this.f21529a.setText(m25139e.m25112b(str));
                return;
            }
        }
    }
}
