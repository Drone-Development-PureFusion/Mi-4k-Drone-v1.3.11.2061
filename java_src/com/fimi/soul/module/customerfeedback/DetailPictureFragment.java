package com.fimi.soul.module.customerfeedback;

import android.app.Activity;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.p001v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.imagepipeline.image.ImageInfo;
import com.fimi.kernel.utils.C1656c;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.utils.C3075ad;
import com.fimi.soul.view.photodraweeview.AbstractC3312d;
import com.fimi.soul.view.photodraweeview.PhotoDraweeView;
/* loaded from: classes.dex */
public class DetailPictureFragment extends Fragment {

    /* renamed from: a */
    public static final String f8315a = "UriKey";

    /* renamed from: b */
    private int f8316b;

    /* renamed from: c */
    private Uri f8317c;

    /* renamed from: d */
    private PhotoDraweeView f8318d;

    /* renamed from: e */
    private ProgressBar f8319e;

    /* renamed from: f */
    private AbstractC3312d f8320f;

    /* renamed from: g */
    private boolean f8321g;

    /* renamed from: h */
    private boolean f8322h;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.fimi.soul.module.customerfeedback.DetailPictureFragment$a */
    /* loaded from: classes.dex */
    public class C2546a extends BaseControllerListener<ImageInfo> {
        private C2546a() {
        }

        @Override // com.facebook.drawee.controller.BaseControllerListener, com.facebook.drawee.controller.ControllerListener
        /* renamed from: a */
        public void onFinalImageSet(String str, ImageInfo imageInfo, Animatable animatable) {
            super.onFinalImageSet(str, imageInfo, animatable);
            DetailPictureFragment.this.f8319e.setVisibility(8);
            if (imageInfo == null || DetailPictureFragment.this.f8318d == null) {
                return;
            }
            DetailPictureFragment.this.f8318d.mo28348a(imageInfo.getWidth(), imageInfo.getHeight());
        }

        @Override // com.facebook.drawee.controller.BaseControllerListener, com.facebook.drawee.controller.ControllerListener
        public void onFailure(String str, Throwable th) {
            super.onFailure(str, th);
            DetailPictureFragment.this.f8319e.setVisibility(8);
        }
    }

    /* renamed from: a */
    public static DetailPictureFragment m31273a(Uri uri) {
        DetailPictureFragment detailPictureFragment = new DetailPictureFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(f8315a, uri);
        detailPictureFragment.setArguments(bundle);
        return detailPictureFragment;
    }

    /* renamed from: a */
    public int m31275a() {
        return this.f8316b;
    }

    /* renamed from: a */
    public void m31274a(int i) {
        this.f8316b = i;
    }

    /* renamed from: a */
    public void m31271a(AbstractC3312d abstractC3312d) {
        if (abstractC3312d != null) {
            this.f8318d.setOnPhotoTapListener(abstractC3312d);
            this.f8320f = abstractC3312d;
        }
    }

    /* renamed from: b */
    public void m31270b() {
        if (this.f8317c == null || this.f8319e == null || this.f8318d == null || !this.f8322h) {
            return;
        }
        this.f8319e.setVisibility(0);
        C3075ad.m29363a(this.f8318d, this.f8317c.toString(), new C2546a());
        C2549a.m31251a().m31250a(this.f8317c);
        this.f8321g = true;
    }

    /* renamed from: b */
    public void m31269b(Uri uri) {
        this.f8317c = uri;
    }

    /* renamed from: c */
    public Uri m31267c() {
        return this.f8317c;
    }

    /* renamed from: d */
    public boolean m31266d() {
        return this.f8321g;
    }

    @Override // android.support.p001v4.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f8318d.getLayoutParams().height = C1656c.m34817d(getActivity()).heightPixels;
        this.f8318d.getLayoutParams().width = C1656c.m34817d(getActivity()).widthPixels;
    }

    @Override // android.support.p001v4.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override // android.support.p001v4.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f8317c = (Uri) arguments.getParcelable(f8315a);
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(C1704R.layout.feedback_image_detail_fragment, (ViewGroup) null);
        this.f8318d = (PhotoDraweeView) inflate.findViewById(C1704R.C1706id.image);
        this.f8319e = (ProgressBar) inflate.findViewById(C1704R.C1706id.loading);
        return inflate;
    }

    @Override // android.support.p001v4.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!getUserVisibleHint()) {
            this.f8322h = false;
            return;
        }
        this.f8322h = true;
        m31270b();
    }
}
