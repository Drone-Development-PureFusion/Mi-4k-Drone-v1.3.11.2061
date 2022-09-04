package com.google.android.gms.internal;

import android.app.Activity;
import android.support.p001v4.app.Fragment;
import android.support.p001v4.app.FragmentActivity;
import android.support.p001v4.app.FragmentTransaction;
import android.view.View;
import com.google.android.gms.C3424R;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.framework.C4253d;
import com.google.android.gms.cast.framework.media.C4298c;
import com.google.android.gms.cast.framework.media.TracksChooserDialogFragment;
import com.google.android.gms.cast.framework.media.p234a.AbstractC4294a;
import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes2.dex */
public class afs extends AbstractC4294a {

    /* renamed from: a */
    private final View f21492a;

    /* renamed from: b */
    private final WeakReference<Activity> f21493b;

    /* renamed from: c */
    private final String f21494c;

    /* renamed from: d */
    private final String f21495d;

    /* renamed from: e */
    private final View.OnClickListener f21496e = new View.OnClickListener() { // from class: com.google.android.gms.internal.afs.1
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C4298c a;
            Activity activity = (Activity) afs.this.f21493b.get();
            if (activity != null && (a = afs.this.a()) != null && a.m24515t() && (activity instanceof FragmentActivity)) {
                FragmentActivity fragmentActivity = (FragmentActivity) activity;
                FragmentTransaction beginTransaction = fragmentActivity.getSupportFragmentManager().beginTransaction();
                Fragment findFragmentByTag = fragmentActivity.getSupportFragmentManager().findFragmentByTag("TRACKS_CHOOSER_DIALOG_TAG");
                if (findFragmentByTag != null) {
                    beginTransaction.remove(findFragmentByTag);
                }
                beginTransaction.addToBackStack(null);
                TracksChooserDialogFragment m24642a = TracksChooserDialogFragment.m24642a(a.m24527h(), a.m24529g().m25047j());
                if (m24642a == null) {
                    return;
                }
                m24642a.show(beginTransaction, "TRACKS_CHOOSER_DIALOG_TAG");
            }
        }
    };

    public afs(View view, Activity activity) {
        this.f21492a = view;
        this.f21494c = activity.getString(C3424R.C3427string.cast_closed_captions);
        this.f21495d = activity.getString(C3424R.C3427string.cast_closed_captions_unavailable);
        this.f21493b = new WeakReference<>(activity);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m17721a(MediaInfo mediaInfo) {
        if (mediaInfo == null) {
            return false;
        }
        List<MediaTrack> m25137g = mediaInfo.m25137g();
        if (m25137g == null || m25137g.isEmpty()) {
            return false;
        }
        for (MediaTrack mediaTrack : m25137g) {
            if (mediaTrack.m25030c() == 2 || mediaTrack.m25030c() == 1) {
                return true;
            }
            while (r3.hasNext()) {
            }
        }
        return false;
    }

    /* renamed from: e */
    private void m17718e() {
        C4298c a = a();
        if (a == null || !a.m24515t() || !m17721a(a.m24527h()) || a.m24514u()) {
            this.f21492a.setEnabled(false);
            this.f21492a.setContentDescription(this.f21495d);
            return;
        }
        this.f21492a.setEnabled(true);
        this.f21492a.setContentDescription(this.f21494c);
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: a */
    public void mo17672a(C4253d c4253d) {
        super.mo17672a(c4253d);
        this.f21492a.setOnClickListener(this.f21496e);
        m17718e();
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: b */
    public void mo17671b() {
        this.f21492a.setOnClickListener(null);
        super.mo17671b();
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: c */
    public void mo17670c() {
        m17718e();
    }

    @Override // com.google.android.gms.cast.framework.media.p234a.AbstractC4294a
    /* renamed from: d */
    public void mo17680d() {
        this.f21492a.setEnabled(false);
    }
}
