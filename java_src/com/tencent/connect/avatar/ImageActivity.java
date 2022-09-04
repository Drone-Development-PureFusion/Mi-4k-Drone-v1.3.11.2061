package com.tencent.connect.avatar;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.p001v4.view.ViewCompat;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.connect.UserInfo;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.open.SocialConstants;
import com.tencent.open.p265b.C10266d;
import com.tencent.open.utils.Global;
import com.tencent.open.utils.HttpUtils;
import com.tencent.open.utils.Util;
import com.tencent.p263mm.sdk.contact.RContact;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class ImageActivity extends Activity {

    /* renamed from: a */
    RelativeLayout f31221a;

    /* renamed from: b */
    private QQToken f31222b;

    /* renamed from: c */
    private String f31223c;

    /* renamed from: d */
    private Handler f31224d;

    /* renamed from: e */
    private C10136c f31225e;

    /* renamed from: f */
    private Button f31226f;

    /* renamed from: g */
    private Button f31227g;

    /* renamed from: h */
    private C10135b f31228h;

    /* renamed from: i */
    private TextView f31229i;

    /* renamed from: j */
    private ProgressBar f31230j;

    /* renamed from: r */
    private String f31238r;

    /* renamed from: s */
    private Bitmap f31239s;

    /* renamed from: k */
    private int f31231k = 0;

    /* renamed from: l */
    private boolean f31232l = false;

    /* renamed from: m */
    private long f31233m = 0;

    /* renamed from: n */
    private int f31234n = 0;

    /* renamed from: o */
    private final int f31235o = 640;

    /* renamed from: p */
    private final int f31236p = 640;

    /* renamed from: q */
    private Rect f31237q = new Rect();

    /* renamed from: t */
    private final View.OnClickListener f31240t = new View.OnClickListener() { // from class: com.tencent.connect.avatar.ImageActivity.2
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ImageActivity.this.f31230j.setVisibility(0);
            ImageActivity.this.f31227g.setEnabled(false);
            ImageActivity.this.f31227g.setTextColor(Color.rgb(21, 21, 21));
            ImageActivity.this.f31226f.setEnabled(false);
            ImageActivity.this.f31226f.setTextColor(Color.rgb(36, 94, 134));
            new Thread(new Runnable() { // from class: com.tencent.connect.avatar.ImageActivity.2.1
                @Override // java.lang.Runnable
                public void run() {
                    ImageActivity.this.m6110c();
                }
            }).start();
            if (ImageActivity.this.f31232l) {
                ImageActivity.this.m6117a("10657", 0L);
                return;
            }
            ImageActivity.this.m6117a("10655", System.currentTimeMillis() - ImageActivity.this.f31233m);
            if (!ImageActivity.this.f31225e.f31261b) {
                return;
            }
            ImageActivity.this.m6117a("10654", 0L);
        }
    };

    /* renamed from: u */
    private final View.OnClickListener f31241u = new View.OnClickListener() { // from class: com.tencent.connect.avatar.ImageActivity.3
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ImageActivity.this.m6117a("10656", System.currentTimeMillis() - ImageActivity.this.f31233m);
            ImageActivity.this.setResult(0);
            ImageActivity.this.m6107d();
        }
    };

    /* renamed from: v */
    private final IUiListener f31242v = new IUiListener() { // from class: com.tencent.connect.avatar.ImageActivity.5
        @Override // com.tencent.tauth.IUiListener
        public void onCancel() {
        }

        @Override // com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            int i;
            ImageActivity.this.f31227g.setEnabled(true);
            ImageActivity.this.f31227g.setTextColor(-1);
            ImageActivity.this.f31226f.setEnabled(true);
            ImageActivity.this.f31226f.setTextColor(-1);
            ImageActivity.this.f31230j.setVisibility(8);
            JSONObject jSONObject = (JSONObject) obj;
            try {
                i = jSONObject.getInt("ret");
            } catch (JSONException e) {
                e.printStackTrace();
                i = -1;
            }
            if (i != 0) {
                ImageActivity.this.m6118a("设置出错了，请重新登录再尝试下呢：）", 1);
                C10266d.m5641a().m5639a(ImageActivity.this.f31222b.getOpenId(), ImageActivity.this.f31222b.getAppId(), Constants.VIA_SET_AVATAR_SUCCEED, "12", Constants.VIA_ACT_TYPE_NINETEEN, "1");
                return;
            }
            ImageActivity.this.m6118a("设置成功", 0);
            ImageActivity.this.m6117a("10658", 0L);
            C10266d.m5641a().m5639a(ImageActivity.this.f31222b.getOpenId(), ImageActivity.this.f31222b.getAppId(), Constants.VIA_SET_AVATAR_SUCCEED, "12", "3", "0");
            ImageActivity imageActivity = ImageActivity.this;
            if (ImageActivity.this.f31223c != null && !"".equals(ImageActivity.this.f31223c)) {
                Intent intent = new Intent();
                intent.setClassName(imageActivity, ImageActivity.this.f31223c);
                if (imageActivity.getPackageManager().resolveActivity(intent, 0) != null) {
                    imageActivity.startActivity(intent);
                }
            }
            ImageActivity.this.m6127a(0, jSONObject.toString(), null, null);
            ImageActivity.this.m6107d();
        }

        @Override // com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            ImageActivity.this.f31227g.setEnabled(true);
            ImageActivity.this.f31227g.setTextColor(-1);
            ImageActivity.this.f31226f.setEnabled(true);
            ImageActivity.this.f31226f.setTextColor(-1);
            ImageActivity.this.f31226f.setText("重试");
            ImageActivity.this.f31230j.setVisibility(8);
            ImageActivity.this.f31232l = true;
            ImageActivity.this.m6118a(uiError.errorMessage, 1);
            ImageActivity.this.m6117a("10660", 0L);
        }
    };

    /* renamed from: w */
    private final IUiListener f31243w = new IUiListener() { // from class: com.tencent.connect.avatar.ImageActivity.6
        /* renamed from: a */
        private void m6092a(int i) {
            if (ImageActivity.this.f31231k < 2) {
                ImageActivity.this.m6104e();
            }
        }

        @Override // com.tencent.tauth.IUiListener
        public void onCancel() {
        }

        @Override // com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            int i = -1;
            try {
                i = jSONObject.getInt("ret");
                if (i == 0) {
                    final String string = jSONObject.getString(RContact.COL_NICKNAME);
                    ImageActivity.this.f31224d.post(new Runnable() { // from class: com.tencent.connect.avatar.ImageActivity.6.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ImageActivity.this.m6108c(string);
                        }
                    });
                    ImageActivity.this.m6117a("10659", 0L);
                } else {
                    ImageActivity.this.m6117a("10661", 0L);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (i != 0) {
                m6092a(i);
            }
        }

        @Override // com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            m6092a(0);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class QQAvatarImp extends BaseApi {
        public QQAvatarImp(QQToken qQToken) {
            super(qQToken);
        }

        public void setAvator(Bitmap bitmap, IUiListener iUiListener) {
            Bundle composeCGIParams = composeCGIParams();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 40, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            bitmap.recycle();
            BaseApi.TempRequestListener tempRequestListener = new BaseApi.TempRequestListener(iUiListener);
            composeCGIParams.putByteArray(SocialConstants.PARAM_AVATAR_URI, byteArray);
            HttpUtils.requestAsync(this.mToken, Global.getContext(), "user/set_user_face", composeCGIParams, "POST", tempRequestListener);
            C10266d.m5641a().m5639a(this.mToken.getOpenId(), this.mToken.getAppId(), Constants.VIA_SET_AVATAR_SUCCEED, "12", Constants.VIA_ACT_TYPE_NINETEEN, "0");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tencent.connect.avatar.ImageActivity$a */
    /* loaded from: classes2.dex */
    public class C10133a extends View {
        public C10133a(Context context) {
            super(context);
        }

        /* renamed from: a */
        public void m6091a(Button button) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable m6112b = ImageActivity.this.m6112b("com.tencent.plus.blue_normal.png");
            Drawable m6112b2 = ImageActivity.this.m6112b("com.tencent.plus.blue_down.png");
            Drawable m6112b3 = ImageActivity.this.m6112b("com.tencent.plus.blue_disable.png");
            stateListDrawable.addState(View.PRESSED_ENABLED_STATE_SET, m6112b2);
            stateListDrawable.addState(View.ENABLED_FOCUSED_STATE_SET, m6112b);
            stateListDrawable.addState(View.ENABLED_STATE_SET, m6112b);
            stateListDrawable.addState(View.FOCUSED_STATE_SET, m6112b);
            stateListDrawable.addState(View.EMPTY_STATE_SET, m6112b3);
            button.setBackgroundDrawable(stateListDrawable);
        }

        /* renamed from: b */
        public void m6090b(Button button) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable m6112b = ImageActivity.this.m6112b("com.tencent.plus.gray_normal.png");
            Drawable m6112b2 = ImageActivity.this.m6112b("com.tencent.plus.gray_down.png");
            Drawable m6112b3 = ImageActivity.this.m6112b("com.tencent.plus.gray_disable.png");
            stateListDrawable.addState(View.PRESSED_ENABLED_STATE_SET, m6112b2);
            stateListDrawable.addState(View.ENABLED_FOCUSED_STATE_SET, m6112b);
            stateListDrawable.addState(View.ENABLED_STATE_SET, m6112b);
            stateListDrawable.addState(View.FOCUSED_STATE_SET, m6112b);
            stateListDrawable.addState(View.EMPTY_STATE_SET, m6112b3);
            button.setBackgroundDrawable(stateListDrawable);
        }
    }

    /* renamed from: a */
    private Bitmap m6119a(String str) {
        int i = 1;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        Uri parse = Uri.parse(str);
        InputStream openInputStream = getContentResolver().openInputStream(parse);
        if (openInputStream == null) {
            return null;
        }
        BitmapFactory.decodeStream(openInputStream, null, options);
        openInputStream.close();
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        while (i2 * i3 > 4194304) {
            i2 /= 2;
            i3 /= 2;
            i *= 2;
        }
        options.inJustDecodeBounds = false;
        options.inSampleSize = i;
        return BitmapFactory.decodeStream(getContentResolver().openInputStream(parse), null, options);
    }

    /* renamed from: a */
    private View m6128a() {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -1);
        ViewGroup.LayoutParams layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
        this.f31221a = new RelativeLayout(this);
        this.f31221a.setLayoutParams(layoutParams);
        this.f31221a.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(layoutParams3);
        this.f31221a.addView(relativeLayout);
        this.f31225e = new C10136c(this);
        this.f31225e.setLayoutParams(layoutParams2);
        this.f31225e.setScaleType(ImageView.ScaleType.MATRIX);
        relativeLayout.addView(this.f31225e);
        this.f31228h = new C10135b(this);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(layoutParams2);
        layoutParams4.addRule(14, -1);
        layoutParams4.addRule(15, -1);
        this.f31228h.setLayoutParams(layoutParams4);
        relativeLayout.addView(this.f31228h);
        LinearLayout linearLayout = new LinearLayout(this);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, C10134a.m6086a(this, 80.0f));
        layoutParams5.addRule(14, -1);
        linearLayout.setLayoutParams(layoutParams5);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        this.f31221a.addView(linearLayout);
        ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(C10134a.m6086a(this, 24.0f), C10134a.m6086a(this, 24.0f)));
        imageView.setImageDrawable(m6112b("com.tencent.plus.logo.png"));
        linearLayout.addView(imageView);
        this.f31229i = new TextView(this);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(layoutParams3);
        layoutParams6.leftMargin = C10134a.m6086a(this, 7.0f);
        this.f31229i.setLayoutParams(layoutParams6);
        this.f31229i.setEllipsize(TextUtils.TruncateAt.END);
        this.f31229i.setSingleLine();
        this.f31229i.setTextColor(-1);
        this.f31229i.setTextSize(24.0f);
        this.f31229i.setVisibility(8);
        linearLayout.addView(this.f31229i);
        RelativeLayout relativeLayout2 = new RelativeLayout(this);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, C10134a.m6086a(this, 60.0f));
        layoutParams7.addRule(12, -1);
        layoutParams7.addRule(9, -1);
        relativeLayout2.setLayoutParams(layoutParams7);
        relativeLayout2.setBackgroundDrawable(m6112b("com.tencent.plus.bar.png"));
        int m6086a = C10134a.m6086a(this, 10.0f);
        relativeLayout2.setPadding(m6086a, m6086a, m6086a, 0);
        this.f31221a.addView(relativeLayout2);
        C10133a c10133a = new C10133a(this);
        int m6086a2 = C10134a.m6086a(this, 14.0f);
        int m6086a3 = C10134a.m6086a(this, 7.0f);
        this.f31227g = new Button(this);
        this.f31227g.setLayoutParams(new RelativeLayout.LayoutParams(C10134a.m6086a(this, 78.0f), C10134a.m6086a(this, 45.0f)));
        this.f31227g.setText("取消");
        this.f31227g.setTextColor(-1);
        this.f31227g.setTextSize(18.0f);
        this.f31227g.setPadding(m6086a2, m6086a3, m6086a2, m6086a3);
        c10133a.m6090b(this.f31227g);
        relativeLayout2.addView(this.f31227g);
        this.f31226f = new Button(this);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(C10134a.m6086a(this, 78.0f), C10134a.m6086a(this, 45.0f));
        layoutParams8.addRule(11, -1);
        this.f31226f.setLayoutParams(layoutParams8);
        this.f31226f.setTextColor(-1);
        this.f31226f.setTextSize(18.0f);
        this.f31226f.setPadding(m6086a2, m6086a3, m6086a2, m6086a3);
        this.f31226f.setText("选取");
        c10133a.m6091a(this.f31226f);
        relativeLayout2.addView(this.f31226f);
        TextView textView = new TextView(this);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(layoutParams3);
        layoutParams9.addRule(13, -1);
        textView.setLayoutParams(layoutParams9);
        textView.setText("移动和缩放");
        textView.setPadding(0, C10134a.m6086a(this, 3.0f), 0, 0);
        textView.setTextSize(18.0f);
        textView.setTextColor(-1);
        relativeLayout2.addView(textView);
        this.f31230j = new ProgressBar(this);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(layoutParams3);
        layoutParams10.addRule(14, -1);
        layoutParams10.addRule(15, -1);
        this.f31230j.setLayoutParams(layoutParams10);
        this.f31230j.setVisibility(8);
        this.f31221a.addView(this.f31230j);
        return this.f31221a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m6127a(int i, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.putExtra(Constants.KEY_ERROR_CODE, i);
        intent.putExtra(Constants.KEY_ERROR_MSG, str2);
        intent.putExtra(Constants.KEY_ERROR_DETAIL, str3);
        intent.putExtra(Constants.KEY_RESPONSE, str);
        setResult(-1, intent);
    }

    /* renamed from: a */
    private void m6126a(Bitmap bitmap) {
        new QQAvatarImp(this.f31222b).setAvator(bitmap, this.f31242v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m6118a(final String str, final int i) {
        this.f31224d.post(new Runnable() { // from class: com.tencent.connect.avatar.ImageActivity.4
            @Override // java.lang.Runnable
            public void run() {
                ImageActivity.this.m6111b(str, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public Drawable m6112b(String str) {
        Drawable drawable;
        IOException e;
        try {
            InputStream open = getAssets().open(str);
            drawable = Drawable.createFromStream(open, str);
            try {
                open.close();
            } catch (IOException e2) {
                e = e2;
                e.printStackTrace();
                return drawable;
            }
        } catch (IOException e3) {
            drawable = null;
            e = e3;
        }
        return drawable;
    }

    /* renamed from: b */
    private void m6116b() {
        try {
            this.f31239s = m6119a(this.f31238r);
        } catch (IOException e) {
            e.printStackTrace();
            m6111b(Constants.MSG_IMAGE_ERROR, 1);
            m6127a(-5, null, Constants.MSG_IMAGE_ERROR, e.getMessage());
            m6107d();
        }
        if (this.f31239s == null) {
            throw new IOException("cannot read picture: '" + this.f31238r + "'!");
        }
        this.f31225e.setImageBitmap(this.f31239s);
        this.f31226f.setOnClickListener(this.f31240t);
        this.f31227g.setOnClickListener(this.f31241u);
        this.f31221a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.tencent.connect.avatar.ImageActivity.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                ImageActivity.this.f31221a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                ImageActivity.this.f31237q = ImageActivity.this.f31228h.m6085a();
                ImageActivity.this.f31225e.m6081a(ImageActivity.this.f31237q);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m6111b(String str, int i) {
        Toast makeText = Toast.makeText(this, str, 1);
        LinearLayout linearLayout = (LinearLayout) makeText.getView();
        ((TextView) linearLayout.getChildAt(0)).setPadding(8, 0, 0, 0);
        ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(C10134a.m6086a(this, 16.0f), C10134a.m6086a(this, 16.0f)));
        if (i == 0) {
            imageView.setImageDrawable(m6112b("com.tencent.plus.ic_success.png"));
        } else {
            imageView.setImageDrawable(m6112b("com.tencent.plus.ic_error.png"));
        }
        linearLayout.addView(imageView, 0);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        makeText.setView(linearLayout);
        makeText.setGravity(17, 0, 0);
        makeText.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m6110c() {
        Matrix imageMatrix = this.f31225e.getImageMatrix();
        float[] fArr = new float[9];
        imageMatrix.getValues(fArr);
        float f = fArr[2];
        float f2 = fArr[5];
        float f3 = fArr[0];
        float width = 640.0f / this.f31237q.width();
        int i = (int) ((this.f31237q.left - f) / f3);
        int i2 = (int) ((this.f31237q.top - f2) / f3);
        Matrix matrix = new Matrix();
        matrix.set(imageMatrix);
        matrix.postScale(width, width);
        int i3 = (int) (650.0f / f3);
        Bitmap createBitmap = Bitmap.createBitmap(this.f31239s, i, i2, Math.min(this.f31239s.getWidth() - i, i3), Math.min(this.f31239s.getHeight() - i2, i3), matrix, true);
        Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, 640, 640);
        createBitmap.recycle();
        m6126a(createBitmap2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m6108c(String str) {
        String m6105d = m6105d(str);
        if (!"".equals(m6105d)) {
            this.f31229i.setText(m6105d);
            this.f31229i.setVisibility(0);
        }
    }

    /* renamed from: d */
    private String m6105d(String str) {
        return str.replaceAll("&gt;", ">").replaceAll("&lt;", "<").replaceAll("&quot;", "\"").replaceAll("&#39;", "'").replaceAll("&amp;", "&");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m6107d() {
        finish();
        if (this.f31234n != 0) {
            overridePendingTransition(0, this.f31234n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m6104e() {
        this.f31231k++;
        new UserInfo(this, this.f31222b).getUserInfo(this.f31243w);
    }

    /* renamed from: a */
    public void m6117a(String str, long j) {
        Util.reportBernoulli(this, str, j, this.f31222b.getAppId());
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        setResult(0);
        m6107d();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setRequestedOrientation(1);
        setContentView(m6128a());
        this.f31224d = new Handler();
        Bundle bundleExtra = getIntent().getBundleExtra(Constants.KEY_PARAMS);
        this.f31238r = bundleExtra.getString(SocialConstants.PARAM_AVATAR_URI);
        this.f31223c = bundleExtra.getString("return_activity");
        String string = bundleExtra.getString("appid");
        String string2 = bundleExtra.getString("access_token");
        long j = bundleExtra.getLong("expires_in");
        String string3 = bundleExtra.getString("openid");
        this.f31234n = bundleExtra.getInt("exitAnim");
        this.f31222b = new QQToken(string);
        this.f31222b.setAccessToken(string2, ((j - System.currentTimeMillis()) / 1000) + "");
        this.f31222b.setOpenId(string3);
        m6116b();
        m6104e();
        this.f31233m = System.currentTimeMillis();
        m6117a("10653", 0L);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f31225e.setImageBitmap(null);
        if (this.f31239s == null || this.f31239s.isRecycled()) {
            return;
        }
        this.f31239s.recycle();
    }
}
