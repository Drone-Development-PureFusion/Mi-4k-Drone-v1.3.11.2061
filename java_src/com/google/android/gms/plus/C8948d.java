package com.google.android.gms.plus;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.FrameLayout;
/* renamed from: com.google.android.gms.plus.d */
/* loaded from: classes2.dex */
public class C8948d extends FrameLayout {

    /* renamed from: a */
    public static final String f28476a = "PlusOneDummyView";

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.plus.d$a */
    /* loaded from: classes2.dex */
    public static class C8950a implements AbstractC8953d {

        /* renamed from: a */
        private Context f28477a;

        private C8950a(Context context) {
            this.f28477a = context;
        }

        @Override // com.google.android.gms.plus.C8948d.AbstractC8953d
        /* renamed from: a */
        public Drawable mo9697a(int i) {
            return this.f28477a.getResources().getDrawable(17301508);
        }

        @Override // com.google.android.gms.plus.C8948d.AbstractC8953d
        /* renamed from: a */
        public boolean mo9698a() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.plus.d$b */
    /* loaded from: classes2.dex */
    public static class C8951b implements AbstractC8953d {

        /* renamed from: a */
        private Context f28478a;

        private C8951b(Context context) {
            this.f28478a = context;
        }

        @Override // com.google.android.gms.plus.C8948d.AbstractC8953d
        /* renamed from: a */
        public Drawable mo9697a(int i) {
            String str;
            try {
                Resources resources = this.f28478a.createPackageContext("com.google.android.gms", 4).getResources();
                switch (i) {
                    case 0:
                        str = "ic_plusone_small";
                        break;
                    case 1:
                        str = "ic_plusone_medium";
                        break;
                    case 2:
                        str = "ic_plusone_tall";
                        break;
                    default:
                        str = "ic_plusone_standard";
                        break;
                }
                return resources.getDrawable(resources.getIdentifier(str, "drawable", "com.google.android.gms"));
            } catch (PackageManager.NameNotFoundException e) {
                return null;
            }
        }

        @Override // com.google.android.gms.plus.C8948d.AbstractC8953d
        /* renamed from: a */
        public boolean mo9698a() {
            try {
                this.f28478a.createPackageContext("com.google.android.gms", 4).getResources();
                return true;
            } catch (PackageManager.NameNotFoundException e) {
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.plus.d$c */
    /* loaded from: classes2.dex */
    public static class C8952c implements AbstractC8953d {

        /* renamed from: a */
        private Context f28479a;

        private C8952c(Context context) {
            this.f28479a = context;
        }

        @Override // com.google.android.gms.plus.C8948d.AbstractC8953d
        /* renamed from: a */
        public Drawable mo9697a(int i) {
            String str;
            switch (i) {
                case 0:
                    str = "ic_plusone_small_off_client";
                    break;
                case 1:
                    str = "ic_plusone_medium_off_client";
                    break;
                case 2:
                    str = "ic_plusone_tall_off_client";
                    break;
                default:
                    str = "ic_plusone_standard_off_client";
                    break;
            }
            return this.f28479a.getResources().getDrawable(this.f28479a.getResources().getIdentifier(str, "drawable", this.f28479a.getPackageName()));
        }

        @Override // com.google.android.gms.plus.C8948d.AbstractC8953d
        /* renamed from: a */
        public boolean mo9698a() {
            return (this.f28479a.getResources().getIdentifier("ic_plusone_small_off_client", "drawable", this.f28479a.getPackageName()) == 0 || this.f28479a.getResources().getIdentifier("ic_plusone_medium_off_client", "drawable", this.f28479a.getPackageName()) == 0 || this.f28479a.getResources().getIdentifier("ic_plusone_tall_off_client", "drawable", this.f28479a.getPackageName()) == 0 || this.f28479a.getResources().getIdentifier("ic_plusone_standard_off_client", "drawable", this.f28479a.getPackageName()) == 0) ? false : true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.plus.d$d */
    /* loaded from: classes2.dex */
    public interface AbstractC8953d {
        /* renamed from: a */
        Drawable mo9697a(int i);

        /* renamed from: a */
        boolean mo9698a();
    }

    public C8948d(Context context, int i) {
        super(context);
        Button button = new Button(context);
        button.setEnabled(false);
        button.setBackgroundDrawable(m9700a().mo9697a(i));
        Point m9699a = m9699a(i);
        addView(button, new FrameLayout.LayoutParams(m9699a.x, m9699a.y, 17));
    }

    /* renamed from: a */
    private Point m9699a(int i) {
        int i2 = 24;
        int i3 = 20;
        Point point = new Point();
        switch (i) {
            case 0:
                i3 = 14;
                break;
            case 1:
                i2 = 32;
                break;
            case 2:
                i2 = 50;
                break;
            default:
                i2 = 38;
                i3 = 24;
                break;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float applyDimension = TypedValue.applyDimension(1, i2, displayMetrics);
        float applyDimension2 = TypedValue.applyDimension(1, i3, displayMetrics);
        point.x = (int) (applyDimension + 0.5d);
        point.y = (int) (applyDimension2 + 0.5d);
        return point;
    }

    /* renamed from: a */
    private AbstractC8953d m9700a() {
        AbstractC8953d c8951b = new C8951b(getContext());
        if (!c8951b.mo9698a()) {
            c8951b = new C8952c(getContext());
        }
        return !c8951b.mo9698a() ? new C8950a(getContext()) : c8951b;
    }
}
