package com.fimi.soul.media.gallery;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.support.p001v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.imagepipeline.image.ImageInfo;
import com.fimi.kernel.utils.C1656c;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.biz.camera.entity.X11FileInfo;
import com.fimi.soul.utils.C3075ad;
import com.fimi.soul.view.photodraweeview.AbstractC3312d;
import com.fimi.soul.view.photodraweeview.PhotoDraweeView;
/* loaded from: classes.dex */
public class DroneImageDetailFragment extends Fragment {

    /* renamed from: b */
    private String f7792b;

    /* renamed from: d */
    private String f7794d;

    /* renamed from: e */
    private PhotoDraweeView f7795e;

    /* renamed from: f */
    private ProgressBar f7796f;

    /* renamed from: h */
    private AbstractC3312d f7798h;

    /* renamed from: a */
    private int f7791a = 0;

    /* renamed from: c */
    private boolean f7793c = false;

    /* renamed from: g */
    private Bitmap f7797g = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.fimi.soul.media.gallery.DroneImageDetailFragment$a */
    /* loaded from: classes.dex */
    public class C2369a extends BaseControllerListener<ImageInfo> {
        private C2369a() {
        }

        @Override // com.facebook.drawee.controller.BaseControllerListener, com.facebook.drawee.controller.ControllerListener
        /* renamed from: a */
        public void onFinalImageSet(String str, ImageInfo imageInfo, Animatable animatable) {
            super.onFinalImageSet(str, imageInfo, animatable);
            DroneImageDetailFragment.this.f7796f.setVisibility(8);
            if (imageInfo == null || DroneImageDetailFragment.this.f7795e == null) {
                return;
            }
            DroneImageDetailFragment.this.f7795e.mo28348a(imageInfo.getWidth(), imageInfo.getHeight());
        }

        @Override // com.facebook.drawee.controller.BaseControllerListener, com.facebook.drawee.controller.ControllerListener
        public void onFailure(String str, Throwable th) {
            super.onFailure(str, th);
            DroneImageDetailFragment.this.f7796f.setVisibility(8);
        }
    }

    /* renamed from: a */
    public static DroneImageDetailFragment m31738a(String str) {
        return new DroneImageDetailFragment();
    }

    /* renamed from: a */
    public int m31742a() {
        return this.f7791a;
    }

    /* renamed from: a */
    public void m31741a(int i) {
        this.f7791a = i;
    }

    /* renamed from: a */
    public void m31739a(AbstractC3312d abstractC3312d) {
        this.f7798h = abstractC3312d;
    }

    /* renamed from: b */
    public void m31737b() {
        if (this.f7792b.contains("&&")) {
            this.f7792b = this.f7792b.split("&&")[0];
        }
        if (this.f7794d != null) {
            C3075ad.m29362a(this.f7795e, this.f7794d, this.f7792b, new C2369a());
        } else {
            C3075ad.m29363a(this.f7795e, this.f7792b, new C2369a());
        }
        this.f7793c = true;
    }

    /* renamed from: b */
    public void m31735b(String str) {
        this.f7792b = str;
    }

    /* renamed from: c */
    public PhotoDraweeView m31734c() {
        return this.f7795e;
    }

    /* renamed from: c */
    public void m31733c(String str) {
        this.f7794d = str;
    }

    /* renamed from: d */
    public String m31732d() {
        return this.f7792b;
    }

    /* renamed from: e */
    public String m31731e() {
        return this.f7794d;
    }

    @Override // android.support.p001v4.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f7795e.getLayoutParams().height = C1656c.m34817d(getActivity()).heightPixels;
        this.f7795e.getLayoutParams().width = C1656c.m34817d(getActivity()).widthPixels;
        if (this.f7798h != null) {
            this.f7795e.setOnPhotoTapListener(this.f7798h);
        }
        if (this.f7793c) {
            m31737b();
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.support.p001v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1704R.layout.image_detail_fragment, viewGroup, false);
        this.f7796f = (ProgressBar) inflate.findViewById(C1704R.C1706id.loading);
        if (this.f7792b == null || this.f7792b.endsWith(X11FileInfo.FILE_TYPE_MP4)) {
            this.f7796f.setVisibility(8);
        } else {
            this.f7796f.setVisibility(0);
        }
        this.f7795e = (PhotoDraweeView) inflate.findViewById(C1704R.C1706id.image);
        return inflate;
    }

    @Override // android.support.p001v4.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f7797g = null;
        System.gc();
    }

    @Override // android.support.p001v4.app.Fragment
    public void onStop() {
        super.onStop();
        if (this.f7797g != null && !this.f7797g.isRecycled()) {
            this.f7797g.recycle();
        }
        System.gc();
    }
}
