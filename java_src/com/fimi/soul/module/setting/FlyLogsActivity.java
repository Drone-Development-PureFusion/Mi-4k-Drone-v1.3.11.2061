package com.fimi.soul.module.setting;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.fimi.kernel.utils.C1685x;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.biz.p180h.HandlerC1863i;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.fimi.soul.module.droneTrack.PlayBackDroneTrackActivity;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.C3129m;
import com.fimi.soul.view.DialogC3245f;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p005b.p006a.p007a.p029b.C0494h;
/* loaded from: classes.dex */
public class FlyLogsActivity extends BaseActivity implements View.OnClickListener {

    /* renamed from: p */
    public static final int f10141p = 10;

    /* renamed from: a */
    ImageView f10142a;

    /* renamed from: b */
    TextView f10143b;

    /* renamed from: c */
    TextView f10144c;

    /* renamed from: d */
    TextView f10145d;

    /* renamed from: e */
    TextView f10146e;

    /* renamed from: f */
    Button f10147f;

    /* renamed from: g */
    Button f10148g;

    /* renamed from: h */
    ListView f10149h;

    /* renamed from: k */
    RelativeLayout f10152k;

    /* renamed from: l */
    RelativeLayout f10153l;

    /* renamed from: m */
    LinearLayout f10154m;

    /* renamed from: n */
    ImageButton f10155n;

    /* renamed from: o */
    ImageButton f10156o;

    /* renamed from: q */
    private C2913e f10157q;

    /* renamed from: s */
    private ArrayList<C2918f> f10159s;

    /* renamed from: i */
    ArrayList<C2918f> f10150i = new ArrayList<>();

    /* renamed from: j */
    List<C2918f> f10151j = new ArrayList();

    /* renamed from: r */
    private Handler f10158r = new HandlerC1863i(this);

    /* renamed from: t */
    private HashMap<String, List<C2918f>> f10160t = new HashMap<>();

    /* renamed from: com.fimi.soul.module.setting.FlyLogsActivity$a */
    /* loaded from: classes.dex */
    class C2867a implements Comparator<C2918f> {
        C2867a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C2918f c2918f, C2918f c2918f2) {
            if (c2918f2.m29935y() > c2918f.m29935y()) {
                return 1;
            }
            return c2918f.m29935y() == c2918f2.m29935y() ? 0 : -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m30151a(ArrayList<C2918f> arrayList) {
        Object obj;
        Object obj2 = null;
        int i = 0;
        while (i < arrayList.size()) {
            C2918f c2918f = arrayList.get(i);
            String[] split = c2918f.m29939u().split(" ");
            String str = " ";
            if (split.length > 0) {
                str = split[0];
            }
            if (!str.equals(obj2)) {
                C2918f c2918f2 = new C2918f();
                c2918f2.m29957e(str);
                c2918f2.m29974a(0);
                c2918f2.m29955f(c2918f.m29938v());
                c2918f2.m29968b(0);
                c2918f2.m29964b(true);
                arrayList.add(i, c2918f2);
                obj = str;
            } else {
                obj = obj2;
            }
            i++;
            obj2 = obj;
        }
    }

    /* renamed from: d */
    private void m30145d() {
        this.f10157q = new C2913e(this, this.f10150i, this.f10149h);
        this.f10149h.setAdapter((ListAdapter) this.f10157q);
        this.f10149h.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: com.fimi.soul.module.setting.FlyLogsActivity.2
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
                C2918f c2918f = (C2918f) adapterView.getItemAtPosition(i);
                if (c2918f == null || !c2918f.m29977A()) {
                    FlyLogsActivity.this.f10157q.m29985a(true);
                    FlyLogsActivity.this.f10152k.setVisibility(0);
                    FlyLogsActivity.this.f10153l.setVisibility(4);
                    FlyLogsActivity.this.f10154m.setVisibility(0);
                    return false;
                }
                return true;
            }
        });
        this.f10149h.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.fimi.soul.module.setting.FlyLogsActivity.3
            @Override // android.widget.AdapterView.OnItemClickListener
            @SuppressLint({"StringFormatMatches"})
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C2918f c2918f = (C2918f) adapterView.getItemAtPosition(i);
                if (c2918f == null || !c2918f.m29977A()) {
                    if (!FlyLogsActivity.this.f10157q.m29996a()) {
                        if (c2918f.m29939u().contains(".sf") || c2918f.m29939u().contains(".fc")) {
                            return;
                        }
                        Intent intent = new Intent(FlyLogsActivity.this, PlayBackDroneTrackActivity.class);
                        C2918f c2918f2 = (C2918f) FlyLogsActivity.this.f10157q.getItem(i);
                        if (c2918f2 == null || c2918f2.m29938v() == null) {
                            return;
                        }
                        intent.putExtra("path", c2918f2.m29938v());
                        FlyLogsActivity.this.startActivity(intent);
                        return;
                    }
                    C2918f c2918f3 = (C2918f) FlyLogsActivity.this.f10157q.getItem(i);
                    if (!c2918f3.f10436h) {
                        FlyLogsActivity.this.f10151j.add(c2918f3);
                    } else {
                        int size = FlyLogsActivity.this.f10151j.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            } else if (c2918f3.m29938v().equals(FlyLogsActivity.this.f10151j.get(size).m29938v())) {
                                FlyLogsActivity.this.f10151j.remove(size);
                                break;
                            } else {
                                size--;
                            }
                        }
                    }
                    FlyLogsActivity.this.f10157q.m29995a(i);
                    FlyLogsActivity.this.f10144c.setText(String.format(FlyLogsActivity.this.getResources().getString(C1704R.C1707string.has_select_num, Integer.valueOf(FlyLogsActivity.this.f10151j.size())), new Object[0]));
                    if (FlyLogsActivity.this.f10157q.getCount() == FlyLogsActivity.this.f10151j.size()) {
                        FlyLogsActivity.this.f10147f.setText(C1704R.C1707string.undo_select_all);
                    } else {
                        FlyLogsActivity.this.f10147f.setText(C1704R.C1707string.select_all);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public C2913e m30155a() {
        return this.f10157q;
    }

    /* renamed from: a */
    ArrayList<C2918f> m30152a(String str, ArrayList<C2918f> arrayList) {
        File[] listFiles;
        FileInputStream fileInputStream;
        long size;
        File file = (str == null || "".equals(str)) ? new File(C3129m.m29053n()) : new File(str);
        if (file != null && file.exists()) {
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    m30152a(file2.getAbsolutePath(), arrayList);
                } else {
                    C2918f c2918f = new C2918f();
                    c2918f.m29957e(file2.getName());
                    c2918f.m29974a(0);
                    c2918f.m29955f(file2.getAbsolutePath());
                    c2918f.m29968b(0);
                    try {
                        fileInputStream = new FileInputStream(new File(c2918f.m29938v()));
                        size = fileInputStream.getChannel().size() / FimiMediaMeta.AV_CH_SIDE_RIGHT;
                    } catch (ParseException e) {
                        e.printStackTrace();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    if (size > 0) {
                        c2918f.m29973a(new File(c2918f.m29938v()).length());
                        if (file2.getName().contains(".fc")) {
                            c2918f.m29972a(file2.getName().replace("&synced", "").replace(".fc", ""));
                            if (c2918f.m29956f() > 1) {
                                size += c2918f.m29958e() / FimiMediaMeta.AV_CH_SIDE_RIGHT;
                            }
                        }
                        if (size > FimiMediaMeta.AV_CH_SIDE_RIGHT) {
                            c2918f.m29953g(String.format("%s %s", new DecimalFormat("######0.00").format(size / 1024.0d).replace(Constants.ACCEPT_TIME_SEPARATOR_SP, "."), "M"));
                        } else {
                            c2918f.m29953g(String.format("%d %s", Integer.valueOf((int) size), "K"));
                        }
                        fileInputStream.close();
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
                        String replace = file2.getName().replace(".txt", "").replace("&synced", "").replace(".sf", "").replace(".fc", "").replace(".pb", "");
                        String[] split = replace.split(" ");
                        if (split != null && split.length > 0) {
                            String replace2 = split[1].replace('-', C0494h.f680A);
                            if (!replace2.contains(":") && replace2.length() > 4) {
                                replace2 = replace2.substring(0, 2) + ":" + replace2.substring(2, 4) + ":" + replace2.substring(4, replace2.length());
                            }
                            replace = split[0] + " " + replace2;
                        }
                        c2918f.m29967b(simpleDateFormat.parse(replace).getTime());
                        arrayList.add(c2918f);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public ArrayList<C2918f> m30150b() {
        return this.f10159s;
    }

    /* renamed from: c */
    public ArrayList<C2918f> m30147c() {
        return this.f10150i;
    }

    @Override // android.view.View.OnClickListener
    @SuppressLint({"StringFormatMatches"})
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.back_btn /* 2131755442 */:
                finish();
                return;
            case C1704R.C1706id.unall_btn /* 2131755804 */:
                this.f10152k.setVisibility(8);
                this.f10153l.setVisibility(0);
                this.f10154m.setVisibility(8);
                this.f10157q.m29985a(false);
                this.f10157q.m29979c(false);
                this.f10157q.notifyDataSetChanged();
                this.f10151j.clear();
                return;
            case C1704R.C1706id.all_btn /* 2131755806 */:
                if (this.f10157q.m29984b()) {
                    this.f10151j.clear();
                    this.f10157q.m29979c(false);
                    this.f10147f.setText(C1704R.C1707string.select_all);
                } else {
                    this.f10147f.setText(C1704R.C1707string.undo_select_all);
                    this.f10157q.m29979c(true);
                    this.f10151j.clear();
                    if (this.f10150i != null && this.f10150i.size() > 0) {
                        Iterator<C2918f> it2 = this.f10150i.iterator();
                        while (it2.hasNext()) {
                            this.f10151j.add(it2.next());
                        }
                    }
                }
                this.f10144c.setText(String.format(getResources().getString(C1704R.C1707string.has_select_num, Integer.valueOf(this.f10151j.size())), new Object[0]));
                return;
            case C1704R.C1706id.del_btn /* 2131755809 */:
                if (this.f10151j == null || this.f10151j.size() <= 0) {
                    Toast.makeText(this, getString(C1704R.C1707string.make_sure_selected), 1).show();
                    return;
                } else {
                    new DialogC3245f.C3246a(this).m28641a(getString(C1704R.C1707string.ensure_delete_selected)).m28633c(17).m28634b(getString(C1704R.C1707string.delete), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.setting.FlyLogsActivity.5
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            if (FlyLogsActivity.this.f10151j != null && FlyLogsActivity.this.f10151j.size() > 0) {
                                for (int size = FlyLogsActivity.this.f10151j.size() - 1; size >= 0; size--) {
                                    File file = new File(FlyLogsActivity.this.f10151j.get(size).m29938v());
                                    if (file.exists()) {
                                        file.delete();
                                    }
                                    File parentFile = file.getParentFile();
                                    if (parentFile != null && parentFile.isDirectory() && parentFile.listFiles().length == 0) {
                                        C2918f c2918f = new C2918f();
                                        c2918f.m29957e(file.getName().split(" ")[0]);
                                        c2918f.m29974a(0);
                                        c2918f.m29955f(file.getPath());
                                        c2918f.m29968b(0);
                                        c2918f.m29964b(true);
                                        FlyLogsActivity.this.f10151j.add(c2918f);
                                    }
                                }
                                FlyLogsActivity.this.f10157q.m29982b(FlyLogsActivity.this.f10151j);
                            }
                            FlyLogsActivity.this.f10157q.m29985a(false);
                            FlyLogsActivity.this.f10153l.setVisibility(0);
                            FlyLogsActivity.this.f10154m.setVisibility(8);
                            FlyLogsActivity.this.f10152k.setVisibility(8);
                            FlyLogsActivity.this.f10157q.m29979c(false);
                            FlyLogsActivity.this.f10151j.clear();
                        }
                    }).m28640a(getString(C1704R.C1707string.cancel), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.setting.FlyLogsActivity.4
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            FlyLogsActivity.this.f10152k.setVisibility(0);
                            FlyLogsActivity.this.f10154m.setVisibility(0);
                            FlyLogsActivity.this.f10153l.setVisibility(4);
                        }
                    }).m28644a(getResources().getColor(C1704R.color.dialog_ensure_hot)).m28645a().show();
                    return;
                }
            case C1704R.C1706id.upload_btn /* 2131755811 */:
                if (this.f10151j == null || this.f10151j.size() <= 0) {
                    Toast.makeText(this, getString(C1704R.C1707string.make_sure_upload_selected), 1).show();
                    return;
                } else {
                    new DialogC3245f.C3246a(this).m28641a(getString(C1704R.C1707string.ensure_upload_selected)).m28633c(17).m28634b(getString(C1704R.C1707string.fly_upload_all_file), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.setting.FlyLogsActivity.7
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            if (FlyLogsActivity.this.f10151j != null && FlyLogsActivity.this.f10151j.size() > 0) {
                                for (C2918f c2918f : FlyLogsActivity.this.f10151j) {
                                    if (c2918f.m29937w() == 0) {
                                        FlyLogsActivity.this.f10157q.m29983b(c2918f);
                                    }
                                }
                            }
                            FlyLogsActivity.this.f10157q.m29985a(false);
                            FlyLogsActivity.this.f10153l.setVisibility(0);
                            FlyLogsActivity.this.f10154m.setVisibility(8);
                            FlyLogsActivity.this.f10152k.setVisibility(8);
                            FlyLogsActivity.this.f10157q.m29979c(false);
                            FlyLogsActivity.this.f10151j.clear();
                        }
                    }).m28640a(getString(C1704R.C1707string.cancel), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.setting.FlyLogsActivity.6
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            FlyLogsActivity.this.f10152k.setVisibility(0);
                            FlyLogsActivity.this.f10154m.setVisibility(0);
                            FlyLogsActivity.this.f10153l.setVisibility(4);
                        }
                    }).m28644a(getResources().getColor(C1704R.color.dialog_ensure_hot)).m28645a().show();
                    return;
                }
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1704R.layout.fly_logs_layout);
        this.f10142a = (ImageView) findViewById(C1704R.C1706id.back_btn);
        this.f10142a.setOnClickListener(this);
        this.f10143b = (TextView) findViewById(C1704R.C1706id.fly_log_title);
        this.f10149h = (ListView) findViewById(C1704R.C1706id.log_list);
        this.f10149h.setOverScrollMode(2);
        this.f10144c = (TextView) findViewById(C1704R.C1706id.del_title);
        this.f10147f = (Button) findViewById(C1704R.C1706id.all_btn);
        this.f10148g = (Button) findViewById(C1704R.C1706id.unall_btn);
        this.f10147f.setOnClickListener(this);
        this.f10148g.setOnClickListener(this);
        this.f10155n = (ImageButton) findViewById(C1704R.C1706id.del_btn);
        this.f10155n.setOnClickListener(this);
        this.f10156o = (ImageButton) findViewById(C1704R.C1706id.upload_btn);
        this.f10156o.setOnClickListener(this);
        this.f10146e = (TextView) findViewById(C1704R.C1706id.upload_des);
        this.f10145d = (TextView) findViewById(C1704R.C1706id.del_des);
        this.f10152k = (RelativeLayout) findViewById(C1704R.C1706id.del_layout);
        this.f10153l = (RelativeLayout) findViewById(C1704R.C1706id.title_layout);
        this.f10154m = (LinearLayout) findViewById(C1704R.C1706id.bottom_layout);
        C3103au.m29234a(getAssets(), getWindow().getDecorView());
        C3103au.m29232a(getAssets(), this.f10143b, this.f10144c, this.f10145d, this.f10146e);
        getWindow().addFlags(128);
        m30145d();
        this.f10159s = (ArrayList) this.f10150i.clone();
        C1685x.m34455b(new Runnable() { // from class: com.fimi.soul.module.setting.FlyLogsActivity.1
            @Override // java.lang.Runnable
            public void run() {
                FlyLogsActivity.this.f10159s = FlyLogsActivity.this.m30152a(C3129m.m29054m(), FlyLogsActivity.this.f10159s);
                Collections.sort(FlyLogsActivity.this.f10159s, new C2867a());
                FlyLogsActivity.this.m30151a(FlyLogsActivity.this.f10159s);
                FlyLogsActivity.this.f10158r.sendEmptyMessage(10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }
}
