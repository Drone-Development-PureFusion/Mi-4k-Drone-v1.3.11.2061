package com.fimi.soul.media.gallery;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.p001v4.view.ViewPager;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import cn.sharesdk.framework.ShareSDK;
import com.fimi.kernel.p158b.p160b.C1600b;
import com.fimi.kernel.p158b.p160b.C1609c;
import com.fimi.kernel.utils.C1679t;
import com.fimi.kernel.utils.C1681v;
import com.fimi.kernel.utils.C1688z;
import com.fimi.kernel.view.dialog.AbstractC1697a;
import com.fimi.kernel.view.progress.ProgressView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.camera.C1783b;
import com.fimi.soul.biz.camera.C1827d;
import com.fimi.soul.biz.camera.C1831e;
import com.fimi.soul.biz.camera.entity.X11FileInfo;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.camera.p173b.AbstractC1792f;
import com.fimi.soul.biz.manager.C1982p;
import com.fimi.soul.entity.ShareInfo;
import com.fimi.soul.entity.WifiDistanceFile;
import com.fimi.soul.media.player.FermiPlayerActivity;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.fimi.soul.p168b.C1735f;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.C3129m;
import com.fimi.soul.view.C3210b;
import com.fimi.soul.view.DialogC3245f;
import com.fimi.soul.view.HackyViewPager;
import com.fimi.soul.view.photodraweeview.AbstractC3312d;
import com.google.firebase.p253b.C9755a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class DroneImagePagerActivity extends BaseActivity implements View.OnClickListener, C1600b.AbstractC1606d, C1609c.AbstractC1613b, AbstractC1792f<X11RespCmd> {

    /* renamed from: a */
    public static final String f7800a = "image_index";

    /* renamed from: b */
    public static final String f7801b = "extra_type";

    /* renamed from: c */
    public static final String f7802c = "image_urls";

    /* renamed from: d */
    public static final String f7803d = "image_drone_media";

    /* renamed from: e */
    public static final String f7804e = "image_drone_local";

    /* renamed from: f */
    public static final String f7805f = "video_duration";

    /* renamed from: m */
    private static final String f7806m = "STATE_POSITION";

    /* renamed from: A */
    private ImageButton f7807A;

    /* renamed from: B */
    private ImageButton f7808B;

    /* renamed from: C */
    private DroneImagePagerAdapter f7809C;

    /* renamed from: D */
    private C1609c f7810D;

    /* renamed from: E */
    private C1600b f7811E;

    /* renamed from: F */
    private ProgressView f7812F;

    /* renamed from: G */
    private C1982p f7813G;

    /* renamed from: H */
    private Button f7814H;

    /* renamed from: I */
    private Button f7815I;

    /* renamed from: J */
    private TextView f7816J;

    /* renamed from: K */
    private TextView f7817K;

    /* renamed from: L */
    private TextView f7818L;

    /* renamed from: M */
    private int f7819M;

    /* renamed from: N */
    private List<WifiDistanceFile> f7820N;

    /* renamed from: i */
    C1681v f7823i;

    /* renamed from: n */
    private C1827d f7827n;

    /* renamed from: p */
    private HackyViewPager f7829p;

    /* renamed from: q */
    private int f7830q;

    /* renamed from: r */
    private TextView f7831r;

    /* renamed from: s */
    private View f7832s;

    /* renamed from: t */
    private View f7833t;

    /* renamed from: u */
    private View f7834u;

    /* renamed from: w */
    private ArrayList<String> f7836w;

    /* renamed from: x */
    private ArrayList<String> f7837x;

    /* renamed from: y */
    private ArrayList<String> f7838y;

    /* renamed from: z */
    private ImageButton f7839z;

    /* renamed from: o */
    private boolean f7828o = false;

    /* renamed from: v */
    private boolean f7835v = true;

    /* renamed from: g */
    public String f7821g = "";

    /* renamed from: h */
    public String f7822h = "";

    /* renamed from: j */
    String f7824j = C1756a.f4523P;

    /* renamed from: k */
    String f7825k = C1756a.f4524Q;

    /* renamed from: l */
    boolean f7826l = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public String m31728a(int i) {
        if (this.f7836w == null || this.f7836w.size() <= 0) {
            return "";
        }
        String str = this.f7836w.get(i).toString();
        return str.contains("THUMB_") ? this.f7836w.get(i).substring(this.f7836w.get(i).lastIndexOf("/") + 1).replace("THUMB_", "") : str.contains("_THM") ? this.f7836w.get(i).substring(this.f7836w.get(i).lastIndexOf("/") + 1) : this.f7836w.get(i).substring(this.f7836w.get(i).lastIndexOf("/") + 1);
    }

    /* renamed from: a */
    private void m31729a() {
        this.f7831r = (TextView) this.f7833t.findViewById(C1704R.C1706id.tv_pageName);
        this.f7831r.setVisibility(0);
        C3103au.m29232a(getAssets(), this.f7831r);
        this.f7830q = getIntent().getIntExtra("image_index", 0);
        this.f7829p = (HackyViewPager) findViewById(C1704R.C1706id.pager);
        if (this.f7828o) {
            this.f7809C = new DroneImagePagerAdapter(getSupportFragmentManager(), this.f7836w, this.f7837x);
        } else {
            this.f7809C = new DroneImagePagerAdapter(getSupportFragmentManager(), this.f7836w);
        }
        this.f7809C.m31685a(this.f7829p);
        this.f7809C.m31684a(new AbstractC3312d() { // from class: com.fimi.soul.media.gallery.DroneImagePagerActivity.7
            @Override // com.fimi.soul.view.photodraweeview.AbstractC3312d
            /* renamed from: a */
            public void mo28347a(View view, float f, float f2) {
                DroneImagePagerActivity.this.f7811E = DroneImagePagerActivity.this.f7810D.m34996a(DroneImagePagerActivity.this, DroneImagePagerActivity.this.m31704i());
                if (DroneImagePagerActivity.this.f7811E == null) {
                    DroneImagePagerActivity.this.f7835v = !DroneImagePagerActivity.this.f7835v;
                    DroneImagePagerActivity.this.m31715c(DroneImagePagerActivity.this.f7835v);
                    DroneImagePagerActivity.this.m31718b(DroneImagePagerActivity.this.f7835v);
                }
            }
        });
        this.f7829p.setAdapter(this.f7809C);
        this.f7829p.setOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.fimi.soul.media.gallery.DroneImagePagerActivity.8
            @Override // android.support.p001v4.view.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // android.support.p001v4.view.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                Log.v("mPager", "arg0=" + i);
                if (i2 == 0 && f == C9755a.f30449c && DroneImagePagerActivity.this.f7809C.m31686a(i) != null) {
                    DroneImagePagerActivity.this.f7809C.m31686a(i).m31737b();
                }
            }

            @Override // android.support.p001v4.view.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                DroneImagePagerActivity.this.f7835v = true;
                String m31728a = DroneImagePagerActivity.this.m31728a(i);
                DroneImagePagerActivity.this.f7831r.setText(m31728a);
                DroneImagePagerActivity.this.m31720b();
                if (m31728a.endsWith(X11FileInfo.FILE_TYPE_MP4) || m31728a.endsWith(".mp4")) {
                    DroneImagePagerActivity.this.f7808B.setVisibility(0);
                } else {
                    DroneImagePagerActivity.this.f7808B.setVisibility(8);
                }
                DroneImagePagerActivity.this.m31710f();
            }
        });
        this.f7829p.setCurrentItem(this.f7830q);
        this.f7831r.setText(m31728a(this.f7830q));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m31720b() {
        View findViewById = this.f7832s.findViewById(C1704R.C1706id.ll_bottomDownload);
        View findViewById2 = this.f7832s.findViewById(C1704R.C1706id.ll_bottomShare);
        this.f7839z = (ImageButton) this.f7833t.findViewById(C1704R.C1706id.btn_back);
        this.f7807A = (ImageButton) this.f7832s.findViewById(C1704R.C1706id.btn_bottomDownload);
        ImageButton imageButton = (ImageButton) this.f7832s.findViewById(C1704R.C1706id.btn_bottomShare);
        ImageButton imageButton2 = (ImageButton) this.f7832s.findViewById(C1704R.C1706id.btn_bottomDelete);
        this.f7814H.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.media.gallery.DroneImagePagerActivity.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                String m29066b = C3129m.m29066b(DroneImagePagerActivity.this.m31708g());
                if (DroneImagePagerActivity.this.f7811E == null || DroneImagePagerActivity.this.f7811E.m35024g() == C1600b.EnumC1602a.Completed) {
                    return;
                }
                File file = new File(m29066b.replace("file://", "").replace(X11FileInfo.FILE_TYPE_MP4, ".mp4"));
                if (file.exists()) {
                    file.delete();
                }
                DroneImagePagerActivity.this.f7829p.setScrollble(true);
                DroneImagePagerActivity.this.f7810D.m34995a(DroneImagePagerActivity.this.f7811E);
                DroneImagePagerActivity.this.m31715c(false);
                DroneImagePagerActivity.this.m31722a(false);
                DroneImagePagerActivity.this.m31718b(false);
                DroneImagePagerActivity.this.m31720b();
            }
        });
        this.f7815I.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.media.gallery.DroneImagePagerActivity.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (DroneImagePagerActivity.this.f7811E != null) {
                    DroneImagePagerActivity.this.f7811E.m35035c();
                    DroneImagePagerActivity.this.f7815I.setVisibility(8);
                    DroneImagePagerActivity.this.f7814H.setVisibility(0);
                }
            }
        });
        if (this.f7828o && !C1783b.m34151c(m31708g().replace(X11FileInfo.FILE_TYPE_MP4, ".mp4"))) {
            findViewById2.setVisibility(8);
            findViewById.setVisibility(0);
            m31715c(true);
            m31718b(true);
            this.f7807A.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.media.gallery.DroneImagePagerActivity.11
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (DroneImagePagerActivity.this.f7823i.m34546a().getBoolean(DroneImagePagerActivity.this.f7824j, false)) {
                        DroneImagePagerActivity.this.m31714d();
                    } else {
                        DroneImagePagerActivity.this.m31717c();
                    }
                }
            });
            imageButton2.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.media.gallery.DroneImagePagerActivity.12
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    new DialogC3245f.C3246a(DroneImagePagerActivity.this).m28641a(DroneImagePagerActivity.this.getString(C1704R.C1707string.ensure_delete_file)).m28644a(DroneImagePagerActivity.this.getResources().getColor(C1704R.color.dialog_ensure_hot)).m28634b(DroneImagePagerActivity.this.getString(C1704R.C1707string.delete), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.media.gallery.DroneImagePagerActivity.12.2
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            DroneImagePagerActivity.this.f7827n.m33988v().m34020c(((WifiDistanceFile) DroneImagePagerActivity.this.f7820N.get(DroneImagePagerActivity.this.f7829p.getCurrentItem())).getAbsolutePath());
                        }
                    }).m28640a(DroneImagePagerActivity.this.getString(C1704R.C1707string.cancel), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.media.gallery.DroneImagePagerActivity.12.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    }).m28645a().show();
                }
            });
        } else if (!this.f7828o || !C1783b.m34151c(m31708g().replace(X11FileInfo.FILE_TYPE_MP4, ".mp4"))) {
            String m31704i = m31704i();
            if (m31704i.endsWith(X11FileInfo.FILE_TYPE_MP4) || m31704i.endsWith(".mp4")) {
                findViewById2.setVisibility(8);
            } else {
                findViewById2.setVisibility(0);
            }
            findViewById.setVisibility(8);
            m31718b(true);
            m31715c(true);
            imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.media.gallery.DroneImagePagerActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (C3103au.m29221b(DroneImagePagerActivity.this)) {
                        DroneImagePagerActivity.this.m31712e();
                    } else {
                        C1688z.m34449a(DroneImagePagerActivity.this, (int) C1704R.C1707string.login_result_net, 1000);
                    }
                }
            });
            imageButton2.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.media.gallery.DroneImagePagerActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    new DialogC3245f.C3246a(DroneImagePagerActivity.this).m28641a(DroneImagePagerActivity.this.getString(C1704R.C1707string.ensure_delete_file)).m28644a(DroneImagePagerActivity.this.getResources().getColor(C1704R.color.dialog_ensure_hot)).m28634b(DroneImagePagerActivity.this.getString(C1704R.C1707string.delete), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.media.gallery.DroneImagePagerActivity.3.2
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            File file = new File(DroneImagePagerActivity.this.m31704i().replace("file://", ""));
                            if (file.isFile() && file.exists()) {
                                file.delete();
                            }
                            Intent intent = new Intent();
                            intent.putExtra("del_file", DroneImagePagerActivity.this.m31704i());
                            DroneImagePagerActivity.this.setResult(1, intent);
                            DroneImagePagerActivity.this.finish();
                        }
                    }).m28640a(DroneImagePagerActivity.this.getString(C1704R.C1707string.cancel), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.media.gallery.DroneImagePagerActivity.3.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    }).m28645a().show();
                }
            });
        } else {
            this.f7834u.setVisibility(8);
            if (m31708g().endsWith(X11FileInfo.FILE_TYPE_MP4)) {
                findViewById2.setVisibility(8);
            } else {
                findViewById2.setVisibility(0);
            }
            findViewById.setVisibility(8);
            imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.media.gallery.DroneImagePagerActivity.13
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (C3103au.m29221b(DroneImagePagerActivity.this)) {
                        DroneImagePagerActivity.this.m31712e();
                    } else {
                        C1688z.m34449a(DroneImagePagerActivity.this, (int) C1704R.C1707string.login_result_net, 1000);
                    }
                }
            });
            imageButton2.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.media.gallery.DroneImagePagerActivity.14
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    new DialogC3245f.C3246a(DroneImagePagerActivity.this).m28641a(DroneImagePagerActivity.this.getString(C1704R.C1707string.ensure_delete_file)).m28644a(DroneImagePagerActivity.this.getResources().getColor(C1704R.color.dialog_ensure_hot)).m28634b(DroneImagePagerActivity.this.getString(C1704R.C1707string.delete), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.media.gallery.DroneImagePagerActivity.14.2
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            DroneImagePagerActivity.this.f7827n.m33988v().m34020c(((WifiDistanceFile) DroneImagePagerActivity.this.f7820N.get(DroneImagePagerActivity.this.f7829p.getCurrentItem())).getAbsolutePath());
                        }
                    }).m28640a(DroneImagePagerActivity.this.getString(C1704R.C1707string.cancel), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.media.gallery.DroneImagePagerActivity.14.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    }).m28645a().show();
                }
            });
        }
        this.f7839z.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.media.gallery.DroneImagePagerActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DroneImagePagerActivity.this.f7826l = true;
                DroneImagePagerActivity.this.finish();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m31717c() {
        this.f7832s.setVisibility(8);
        this.f7834u.setVisibility(0);
        this.f7816J.setText(String.format(getString(C1704R.C1707string.download_file_phone), m31708g()));
        this.f7817K.setText("0%");
        this.f7818L.setText("0.00 KB/s");
        this.f7812F.setMaxCount((float) this.f7820N.get(this.f7829p.getCurrentItem()).getSize());
        this.f7812F.setCurrentCount(0.0f);
        String m31704i = m31704i();
        this.f7810D.m34991a(m31704i, this.f7838y.get(this.f7829p.getCurrentItem()), this.f7820N.get(this.f7829p.getCurrentItem()).getSize(), false, m31704i.contains("_THM.MP4") ? C3129m.m29066b(m31704i.substring(m31704i.lastIndexOf(47) + 1)).replace(X11FileInfo.FILE_TYPE_MP4, ".mp4") : C3129m.m29066b(m31708g()).replace(X11FileInfo.FILE_TYPE_MP4, ".mp4"));
        this.f7810D.m34993a((C1609c.AbstractC1613b) this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m31714d() {
        new C3210b().mo28741a((Context) this, getString(C1704R.C1707string.download_delete_file), getString(C1704R.C1707string.cancel), getString(C1704R.C1707string.delete), (Boolean) false, getString(C1704R.C1707string.remerber_me_choose), new AbstractC1697a() { // from class: com.fimi.soul.media.gallery.DroneImagePagerActivity.5
            @Override // com.fimi.kernel.view.dialog.AbstractC1697a
            /* renamed from: a */
            public void mo31689a(int i) {
            }

            @Override // com.fimi.kernel.view.dialog.AbstractC1697a
            /* renamed from: a */
            public void mo31688a(int i, Boolean bool) {
                if (i == -2) {
                    if (bool.booleanValue()) {
                        DroneImagePagerActivity.this.f7823i.m34546a().edit().putBoolean(DroneImagePagerActivity.this.f7824j, false).commit();
                        DroneImagePagerActivity.this.f7823i.m34546a().edit().putBoolean(DroneImagePagerActivity.this.f7825k, false).commit();
                    } else {
                        DroneImagePagerActivity.this.f7823i.m34546a().edit().putBoolean(DroneImagePagerActivity.this.f7824j, true).commit();
                        DroneImagePagerActivity.this.f7823i.m34546a().edit().putBoolean(DroneImagePagerActivity.this.f7825k, false).commit();
                    }
                } else if (i == -1) {
                    if (bool.booleanValue()) {
                        DroneImagePagerActivity.this.f7823i.m34546a().edit().putBoolean(DroneImagePagerActivity.this.f7824j, false).commit();
                        DroneImagePagerActivity.this.f7823i.m34546a().edit().putBoolean(DroneImagePagerActivity.this.f7825k, true).commit();
                    } else {
                        DroneImagePagerActivity.this.f7823i.m34546a().edit().putBoolean(DroneImagePagerActivity.this.f7824j, true).commit();
                        DroneImagePagerActivity.this.f7823i.m34546a().edit().putBoolean(DroneImagePagerActivity.this.f7825k, true).commit();
                    }
                }
                DroneImagePagerActivity.this.m31717c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m31712e() {
        ShareInfo shareInfo = new ShareInfo();
        if (this.f7828o) {
            shareInfo.setUrl(C1783b.m34149d(m31708g()));
        } else {
            shareInfo.setUrl(this.f7836w.get(this.f7829p.getCurrentItem()).replace("file://", ""));
        }
        this.f7813G.m33329a(new C1982p.AbstractC1994b() { // from class: com.fimi.soul.media.gallery.DroneImagePagerActivity.6
            @Override // com.fimi.soul.biz.manager.C1982p.AbstractC1994b
            /* renamed from: a */
            public void mo31687a(int i) {
                DroneImagePagerActivity.this.f7829p.setDrawingCacheEnabled(false);
            }
        });
        this.f7813G.m33327a(shareInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m31710f() {
        m31722a(false);
        this.f7810D = C1609c.m34997a(getApplicationContext());
        this.f7810D.m34993a((C1609c.AbstractC1613b) this);
        this.f7811E = this.f7810D.m34996a(this, m31704i());
        if (this.f7811E != null && (this.f7811E.m35024g() == C1600b.EnumC1602a.Wait || this.f7811E.m35024g() == C1600b.EnumC1602a.Downloading)) {
            m31722a(true);
            this.f7815I.setVisibility(4);
            this.f7814H.setVisibility(0);
            long m35020i = this.f7811E.m35020i();
            long m35016k = this.f7811E.m35016k();
            this.f7812F.setMaxCount((float) m35020i);
            this.f7812F.setCurrentCount((float) m35016k);
            this.f7816J.setText(String.format(getString(C1704R.C1707string.download_file_phone), m31708g()));
            this.f7817K.setText((m35016k / (m35020i / 100)) + "%");
            this.f7818L.setText("0.00 KB/s");
            this.f7811E.m35051a((C1600b.AbstractC1606d) this);
        } else if (this.f7811E == null) {
        } else {
            if (this.f7811E.m35024g() != C1600b.EnumC1602a.Pause && this.f7811E.m35024g() != C1600b.EnumC1602a.Error) {
                return;
            }
            m31722a(true);
            this.f7815I.setVisibility(0);
            this.f7814H.setVisibility(8);
            long m35020i2 = this.f7811E.m35020i();
            long m35016k2 = this.f7811E.m35016k();
            this.f7812F.setMaxCount((float) m35020i2);
            this.f7812F.setCurrentCount((float) m35016k2);
            this.f7816J.setText(String.format(getString(C1704R.C1707string.download_file_phone), m31708g()));
            this.f7817K.setText((m35016k2 / (m35020i2 / 100)) + "%");
            this.f7818L.setText("");
            this.f7811E.m35051a((C1600b.AbstractC1606d) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public String m31708g() {
        return m31728a(this.f7829p.getCurrentItem());
    }

    /* renamed from: h */
    private String m31706h() {
        if (this.f7836w == null || this.f7836w.size() <= 0) {
            return "";
        }
        String str = this.f7836w.get(this.f7829p.getCurrentItem()).toString();
        return str.substring(str.lastIndexOf(47) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public String m31704i() {
        String str = this.f7836w.get(this.f7829p.getCurrentItem());
        return str.contains("&&") ? str.split("&&")[1] : str;
    }

    /* renamed from: j */
    private void m31702j() {
        for (int i = 0; i < this.f7836w.size(); i++) {
            String m31728a = m31728a(i);
            if (C1783b.m34155b(m31728a)) {
                String format = String.format("file://%s", C1783b.m34147e(m31728a));
                Log.d("Good", "Downloaded:" + format);
                this.f7836w.set(i, format);
            }
        }
    }

    @Override // com.fimi.kernel.p158b.p160b.C1600b.AbstractC1606d
    /* renamed from: a */
    public void mo31727a(C1600b.EnumC1602a enumC1602a, C1600b c1600b) {
        if (this.f7828o && !this.f7826l) {
            String m35022h = c1600b.m35022h();
            if (m35022h.contains("_THM.MP4") || m35022h.contains("_THM.mp4")) {
                if (!m35022h.equals(C3129m.m29066b(m31706h().replace(X11FileInfo.FILE_TYPE_MP4, ".mp4")))) {
                    return;
                }
            } else if (!m35022h.equals(C3129m.m29066b(m31708g().replace(X11FileInfo.FILE_TYPE_MP4, ".mp4")))) {
                return;
            }
            if (enumC1602a == C1600b.EnumC1602a.Completed) {
                m31722a(false);
                this.f7829p.setScrollble(true);
                m31720b();
                this.f7812F.setCurrentCount(0.0f);
                this.f7816J.setText("0%");
                if (this.f7823i.m34546a().getBoolean(this.f7825k, false)) {
                    this.f7827n.m33988v().m34020c(m31708g());
                }
                C1609c.m34997a((Context) this).m34995a(this.f7811E);
                return;
            }
            this.f7812F.setMaxCount((float) c1600b.m35020i());
            this.f7812F.setCurrentCount((float) c1600b.m35016k());
            long m35014l = c1600b.m35014l();
            if (m35014l >= 0 && m35014l < 102400) {
                this.f7818L.setText(C1679t.m34552b((float) (m35014l / FimiMediaMeta.AV_CH_SIDE_RIGHT), 2) + " KB/s");
            } else if (m35014l >= 102400 && m35014l < 1024000) {
                this.f7818L.setText(((int) (m35014l / FimiMediaMeta.AV_CH_SIDE_RIGHT)) + " KB/s");
            } else if (m35014l >= 1024000) {
                this.f7818L.setText(C1679t.m34552b(((float) m35014l) / 1048576.0f, 2) + " MB/s");
            }
            this.f7817K.setText((c1600b.m35016k() / (c1600b.m35020i() / 100)) + "%");
        }
    }

    @Override // com.fimi.kernel.p158b.p160b.C1609c.AbstractC1613b
    /* renamed from: a */
    public void mo30332a(List<C1600b> list, boolean z, C1600b c1600b) {
        if (c1600b != null) {
            this.f7811E = c1600b;
            if (isFinishing()) {
                return;
            }
            this.f7811E.m35051a((C1600b.AbstractC1606d) this);
        }
    }

    /* renamed from: a */
    protected void m31722a(boolean z) {
        if (z) {
            this.f7832s.setVisibility(8);
            this.f7834u.setVisibility(0);
            return;
        }
        this.f7832s.setVisibility(0);
        this.f7834u.setVisibility(4);
    }

    @Override // com.fimi.soul.biz.camera.p173b.AbstractC1792f
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo28055a(boolean z, X11RespCmd x11RespCmd) {
        if (!z || !this.f7828o) {
            if (z || !this.f7828o) {
                return;
            }
            switch (x11RespCmd.getMsg_id()) {
                case C1831e.f4791R /* 1281 */:
                    C1688z.m34447a(this, getResources().getString(C1704R.C1707string.del_fail), C1688z.f4191b);
                    return;
                default:
                    return;
            }
        }
        switch (x11RespCmd.getMsg_id()) {
            case C1831e.f4791R /* 1281 */:
                if (this.f7837x.get(this.f7829p.getCurrentItem()) != null) {
                    File file = new File(this.f7837x.get(this.f7829p.getCurrentItem()).replace("file://", ""));
                    if (file.exists()) {
                        file.delete();
                    }
                }
                this.f7827n.a(true);
                Intent intent = new Intent();
                Bundle bundle = new Bundle();
                if (this.f7820N.size() > this.f7829p.getCurrentItem()) {
                    bundle.putSerializable(C1756a.f4522O, this.f7820N.get(this.f7829p.getCurrentItem()));
                }
                intent.putExtras(bundle);
                setResult(2, intent);
                finish();
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    protected void m31718b(boolean z) {
        this.f7832s.setVisibility(z ? 0 : 8);
    }

    /* renamed from: c */
    protected void m31715c(boolean z) {
        this.f7833t.setVisibility(z ? 0 : 8);
    }

    @Override // com.fimi.soul.base.BaseFimiActivity, android.app.Activity
    public void finish() {
        overridePendingTransition(17432576, 17432577);
        super.finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1704R.layout.activity_image_pager);
        ShareSDK.initSDK(this);
        this.f7808B = (ImageButton) findViewById(C1704R.C1706id.playButton);
        getWindow().setFlags(128, 128);
        this.f7827n = (C1827d) C1783b.m34166a().m34150d();
        this.f7827n.a(this);
        findViewById(C1704R.C1706id.prll_tab_top).setBackgroundResource(C1704R.color.light_black_80);
        findViewById(C1704R.C1706id.ll_progressBottom).setBackgroundResource(C1704R.color.light_black_80);
        this.f7833t = findViewById(C1704R.C1706id.rl_tab_top);
        this.f7833t.setOnClickListener(this);
        this.f7832s = findViewById(C1704R.C1706id.ll_actionBottom);
        this.f7832s.setOnClickListener(this);
        this.f7832s.setBackgroundResource(C1704R.C1705drawable.title_bottom_share_bg);
        this.f7834u = findViewById(C1704R.C1706id.ll_progressBottom);
        this.f7816J = (TextView) findViewById(C1704R.C1706id.file_name_tv);
        this.f7817K = (TextView) findViewById(C1704R.C1706id.file_percent_tv);
        this.f7818L = (TextView) findViewById(C1704R.C1706id.down_speed);
        this.f7814H = (Button) findViewById(C1704R.C1706id.btn_cancel);
        this.f7815I = (Button) findViewById(C1704R.C1706id.btn_start);
        C3103au.m29232a(getAssets(), this.f7814H, this.f7815I, this.f7816J, this.f7817K, this.f7818L);
        this.f7812F = (ProgressView) this.f7834u.findViewById(C1704R.C1706id.pv_progress);
        this.f7812F.setFrontColor(-42978);
        this.f7820N = C1735f.f4402a;
        this.f7836w = getIntent().getStringArrayListExtra("image_urls");
        this.f7837x = getIntent().getStringArrayListExtra(f7804e);
        this.f7828o = getIntent().getBooleanExtra(f7803d, false);
        this.f7838y = getIntent().getStringArrayListExtra(f7805f);
        if (getIntent().getIntExtra(f7801b, 1) == 2) {
            this.f7808B.setVisibility(0);
        } else {
            this.f7808B.setVisibility(8);
        }
        if (bundle != null) {
            this.f7830q = bundle.getInt(f7806m);
        }
        this.f7813G = new C1982p(this);
        m31729a();
        m31720b();
        m31710f();
        this.f7808B.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.media.gallery.DroneImagePagerActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DroneImagePagerActivity.this.f7822h = (String) DroneImagePagerActivity.this.f7836w.get(DroneImagePagerActivity.this.f7829p.getCurrentItem());
                if (DroneImagePagerActivity.this.f7837x != null) {
                    DroneImagePagerActivity.this.f7821g = (String) DroneImagePagerActivity.this.f7837x.get(DroneImagePagerActivity.this.f7829p.getCurrentItem());
                }
                Intent intent = new Intent(DroneImagePagerActivity.this, FermiPlayerActivity.class);
                if (DroneImagePagerActivity.this.f7822h != null) {
                    intent.putExtra("SP_KEY_PLAYER_ADDR_VideoDialogFragment", DroneImagePagerActivity.this.f7822h.split("&&")[0]);
                } else {
                    intent.putExtra("SP_KEY_PLAYER_ADDR_VideoDialogFragment", DroneImagePagerActivity.this.f7837x);
                }
                intent.putExtra(FermiPlayerActivity.SP_KEY_PLAYER_IS_REMOTE_ADDR, DroneImagePagerActivity.this.f7821g);
                intent.putExtra(FermiPlayerActivity.PLAY_NOW, true);
                intent.putExtra(FermiPlayerActivity.ONLINEFILE, DroneImagePagerActivity.this.f7828o);
                DroneImagePagerActivity.this.startActivity(intent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 121) {
            this.f7826l = true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f7811E == null || this.f7811E.m35024g() != C1600b.EnumC1602a.Pause) {
            this.f7815I.setVisibility(8);
            this.f7814H.setVisibility(0);
            return;
        }
        this.f7815I.setVisibility(0);
        this.f7814H.setVisibility(8);
        long m35020i = this.f7811E.m35020i();
        long m35016k = this.f7811E.m35016k();
        this.f7812F.setMaxCount((float) m35020i);
        this.f7812F.setCurrentCount((float) m35016k);
        this.f7816J.setText(String.format(getString(C1704R.C1707string.download_file_phone), m31708g()));
        this.f7817K.setText((m35016k / (m35020i / 100)) + "%");
    }

    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt(f7806m, this.f7829p.getCurrentItem());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.f7823i = C1681v.m34543a(this);
    }
}
