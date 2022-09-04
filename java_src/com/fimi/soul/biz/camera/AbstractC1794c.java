package com.fimi.soul.biz.camera;

import android.os.AsyncTask;
import android.os.Message;
import android.util.Log;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.p158b.AbstractC1632e;
import com.fimi.kernel.p158b.EnumC1626d;
import com.fimi.kernel.p158b.p160b.C1609c;
import com.fimi.kernel.p158b.p161c.AbstractC1622a;
import com.fimi.kernel.p158b.p161c.AbstractC1625d;
import com.fimi.kernel.p158b.p163e.C1634b;
import com.fimi.kernel.utils.C1663g;
import com.fimi.kernel.utils.C1680u;
import com.fimi.kernel.utils.C1685x;
import com.fimi.p140a.C1514f;
import com.fimi.p140a.p142b.EnumC1495b;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.camera.entity.X11ApWifiConfig;
import com.fimi.soul.biz.camera.entity.X11FileInfo;
import com.fimi.soul.biz.camera.entity.X11FileSystem;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.camera.entity.X11SystemConfig;
import com.fimi.soul.biz.camera.p172a.C1781b;
import com.fimi.soul.biz.camera.p173b.AbstractC1789c;
import com.fimi.soul.biz.camera.p173b.AbstractC1790d;
import com.fimi.soul.biz.camera.p173b.AbstractC1791e;
import com.fimi.soul.biz.camera.p173b.AbstractC1792f;
import com.fimi.soul.biz.camera.p173b.AbstractC1793g;
import com.fimi.soul.biz.camera.p174c.AbstractC1808a;
import com.fimi.soul.biz.p170b.C1760b;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.entity.CameraMountState;
import com.fimi.soul.entity.CameraValue;
import com.fimi.soul.module.droneFragment.ShowDroneUiFragment;
import com.fimi.soul.utils.C3082aj;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.C3123g;
import com.fimi.soul.utils.C3129m;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* renamed from: com.fimi.soul.biz.camera.c */
/* loaded from: classes.dex */
public abstract class AbstractC1794c extends AbstractC1779a implements AbstractC1793g {

    /* renamed from: d */
    private static final int f4661d = 1024;

    /* renamed from: e */
    private static final int f4662e = 1025;

    /* renamed from: f */
    private static final int f4663f = 2048;

    /* renamed from: g */
    private static final int f4664g = 2049;

    /* renamed from: h */
    private static final int f4665h = 4096;

    /* renamed from: i */
    private static int f4666i = -1;

    /* renamed from: x */
    private static final long f4667x = 1500;

    /* renamed from: E */
    private AbstractC1625d f4672E;

    /* renamed from: I */
    private AbstractC1790d f4676I;

    /* renamed from: a */
    C1827d f4677a;

    /* renamed from: o */
    private AbstractC1792f<X11RespCmd> f4685o;

    /* renamed from: p */
    private AbstractC1625d f4686p;

    /* renamed from: q */
    private AbstractC1622a f4687q;

    /* renamed from: r */
    private DataOutputStream f4688r;

    /* renamed from: s */
    private AbstractC1791e f4689s;

    /* renamed from: u */
    private AbstractC1806c f4691u;

    /* renamed from: v */
    private AbstractC1807d f4692v;

    /* renamed from: w */
    private C1609c f4693w;

    /* renamed from: k */
    private EnumC1804a f4681k = EnumC1804a.Normal;

    /* renamed from: t */
    private StringBuilder f4690t = new StringBuilder();

    /* renamed from: y */
    private long f4694y = System.currentTimeMillis();

    /* renamed from: z */
    private boolean f4695z = false;

    /* renamed from: A */
    private boolean f4668A = true;

    /* renamed from: B */
    private boolean f4669B = false;

    /* renamed from: C */
    private boolean f4670C = true;

    /* renamed from: c */
    ExecutorService f4679c = Executors.newSingleThreadExecutor();

    /* renamed from: F */
    private long f4673F = 0;

    /* renamed from: G */
    private String f4674G = null;

    /* renamed from: H */
    private CameraMountState f4675H = CameraMountState.IDLE;

    /* renamed from: D */
    private C2083a f4671D = DroidPlannerApp.m34272h().f4493a;

    /* renamed from: l */
    private X11SystemConfig f4682l = new X11SystemConfig();

    /* renamed from: j */
    private X11ApWifiConfig f4680j = new X11ApWifiConfig();

    /* renamed from: m */
    private X11FileSystem f4683m = new X11FileSystem();

    /* renamed from: b */
    C1772d f4678b = C1772d.m34208a();

    /* renamed from: n */
    private List<AbstractC1792f<X11RespCmd>> f4684n = new ArrayList();

    /* renamed from: com.fimi.soul.biz.camera.c$a */
    /* loaded from: classes.dex */
    public enum EnumC1804a {
        IDLE,
        Normal,
        Recoding,
        ContinueCapturing,
        PhotoShoting
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fimi.soul.biz.camera.c$b */
    /* loaded from: classes.dex */
    public class AsyncTaskC1805b extends AsyncTask<String, Void, X11RespCmd> {
        AsyncTaskC1805b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public X11RespCmd doInBackground(String... strArr) {
            X11RespCmd m34111b = AbstractC1794c.this.m34111b(strArr[0]);
            if (m34111b != null && m34111b.getMsg_id() == 1282) {
                Map<String, List<X11FileInfo>> fileList = AbstractC1794c.this.f4683m.getFileList();
                if (m34111b.getListing() != null) {
                    try {
                        HashMap hashMap = new HashMap();
                        for (LinkedTreeMap linkedTreeMap : (List) m34111b.getListing()) {
                            for (String str : linkedTreeMap.keySet()) {
                                hashMap.put(str, linkedTreeMap.get(str));
                            }
                        }
                        List<X11FileInfo> m34120a = AbstractC1794c.this.m34120a(hashMap);
                        if (m34120a != null) {
                            fileList.put(AbstractC1794c.this.f4683m.getCurPath(), m34120a);
                        }
                    } catch (Exception e) {
                    }
                    AbstractC1794c.this.m34119a(false);
                }
            }
            return m34111b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public void onPostExecute(X11RespCmd x11RespCmd) {
            AbstractC1794c.this.m34124a(x11RespCmd);
        }
    }

    /* renamed from: com.fimi.soul.biz.camera.c$c */
    /* loaded from: classes.dex */
    public interface AbstractC1806c {
        /* renamed from: a */
        void m34055a(String str, long j, long j2);
    }

    /* renamed from: com.fimi.soul.biz.camera.c$d */
    /* loaded from: classes.dex */
    public interface AbstractC1807d {
        /* renamed from: a */
        void mo31105a(EnumC1804a enumC1804a, EnumC1804a enumC1804a2);
    }

    public AbstractC1794c(AbstractC1789c abstractC1789c) {
        a(abstractC1789c);
        new C1760b();
        m34104d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public List<X11FileInfo> m34120a(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        for (String str : map.keySet()) {
            X11FileInfo x11FileInfo = new X11FileInfo();
            x11FileInfo.setName(str);
            if (!str.toUpperCase().contains("THM")) {
                x11FileInfo.setLocalPath(C3129m.m29070a() + "X1/");
                String curPath = m34093l().getCurPath();
                x11FileInfo.setAbsolutePath(curPath + "/" + str);
                x11FileInfo.setRemotePath(curPath.substring(curPath.indexOf("DCIM"), curPath.length()) + "/" + str);
                String[] split = map.get(str).split("\\|");
                x11FileInfo.setSize(Long.parseLong(split[0].replace(" bytes", "").trim()));
                x11FileInfo.setCreateDate(split[1]);
                arrayList.add(x11FileInfo);
            }
        }
        Collections.sort(arrayList, new Comparator<X11FileInfo>() { // from class: com.fimi.soul.biz.camera.c.5
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(X11FileInfo x11FileInfo2, X11FileInfo x11FileInfo3) {
                return x11FileInfo2.getCreateDate().replaceAll("[-\\s:]", "").compareTo(x11FileInfo3.getCreateDate().replaceAll("[-\\s:]", ""));
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m34143a(int i, byte[] bArr) {
        X11FileInfo curDownloadFile = m34093l().getCurDownloadFile();
        Log.d("Good", "len:" + i + "  path" + curDownloadFile.getLocalPath() + " name:" + curDownloadFile.getName() + "downloading:" + i);
        if (curDownloadFile != null) {
            try {
                String str = curDownloadFile.getLocalPath() + curDownloadFile.getName();
                if (i != -1) {
                    if (this.f4688r == null) {
                        this.f4673F = 0L;
                        File file = new File(curDownloadFile.getLocalPath());
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        File file2 = new File(str);
                        if (file2.exists()) {
                            C3103au.m29228a(file2);
                        }
                        file2.createNewFile();
                        this.f4688r = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(str)));
                    }
                    this.f4673F += i;
                    this.f4688r.write(bArr, 0, i);
                    if (this.f4691u != null) {
                        this.f4691u.m34055a(curDownloadFile.getName(), this.f4673F, curDownloadFile.getSize());
                    }
                    m34125a(curDownloadFile);
                    this.f4674G = str;
                }
            } catch (Exception e) {
                Log.d("Good", "ERROR" + e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m34124a(X11RespCmd x11RespCmd) {
        boolean z;
        if (x11RespCmd == null) {
            X11RespCmd x11RespCmd2 = new X11RespCmd();
            x11RespCmd2.setMsg_id(C1831e.f4837ak);
            Log.d("Good", "UNkown");
            if (this.f4685o == null) {
                return;
            }
            this.f4685o.mo28055a(false, x11RespCmd2);
            return;
        }
        this.f4690t.delete(0, this.f4690t.length());
        if (x11RespCmd.getRval() >= 0) {
            z = true;
        } else {
            m34106c(x11RespCmd);
            z = false;
        }
        if (x11RespCmd.isNotification()) {
            m34112b(x11RespCmd);
        } else {
            for (AbstractC1792f<X11RespCmd> abstractC1792f : this.f4684n) {
                abstractC1792f.mo28055a(z, x11RespCmd);
            }
        }
        if (x11RespCmd.getNotificationType() == X11RespCmd.NotificationType.PhotoTaken) {
            m34119a(true);
            if (C1642c.m34885e().m34538b().booleanValue()) {
                String obj = x11RespCmd.getParam().toString();
                if (!"".equalsIgnoreCase(obj)) {
                    this.f4693w = C1609c.m34997a(C1642c.m34893a());
                    this.f4693w.m34991a(String.format("http://%s//%s", C1831e.f4800a, obj.substring(obj.indexOf("DCIM"), obj.length())), "", 0L, true, C3129m.m29066b(obj.substring(obj.lastIndexOf("/") + 1, obj.length())));
                }
            }
        } else if (x11RespCmd.getNotificationType() == X11RespCmd.NotificationType.CardInsert) {
            C1663g.m34751b(new File(C3129m.m29053n()));
            m34110b(true);
        } else if (x11RespCmd.getNotificationType() == X11RespCmd.NotificationType.CardRemoved) {
            C1663g.m34751b(new File(C3129m.m29053n()));
            m34110b(false);
        } else if (x11RespCmd.getNotificationType() == X11RespCmd.NotificationType.FmLsEnd) {
            x11RespCmd.setNotificationType(X11RespCmd.NotificationType.FmLsEnd);
            m34122a(Boolean.valueOf(z), x11RespCmd);
            m34119a(false);
        } else if (x11RespCmd.getMsg_id() != 4 || !z) {
            if (x11RespCmd.getNotificationType() == X11RespCmd.NotificationType.StartingVideoRecord) {
                if (this.f4693w == null) {
                    this.f4693w = C1609c.m34997a(C1642c.m34893a());
                }
                this.f4693w.m34987d();
            } else if (x11RespCmd.getNotificationType() == X11RespCmd.NotificationType.VideoRecordComplete) {
                if (this.f4693w == null) {
                    this.f4693w = C1609c.m34997a(C1642c.m34893a());
                }
                this.f4693w.m34986e();
            }
        } else if (m34093l().getInfos() != null) {
            m34093l().getInfos().clear();
        }
        if (this.f4685o == null || x11RespCmd.getNotificationType() == X11RespCmd.NotificationType.FmLsEnd) {
            return;
        }
        this.f4685o.mo28055a(z, x11RespCmd);
    }

    /* renamed from: a */
    private void m34122a(final Boolean bool, final X11RespCmd x11RespCmd) {
        ((C1634b) C1642c.m34890a(EnumC1626d.Volley)).mo34907b(C1831e.m33973e(), new AbstractC1632e<String>() { // from class: com.fimi.soul.biz.camera.c.6
            @Override // com.fimi.kernel.p158b.AbstractC1632e
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo30004a(String str) {
                if (str == null || "".equals(str)) {
                    if (AbstractC1794c.this.f4685o == null) {
                        return;
                    }
                    AbstractC1794c.this.f4685o.mo28055a(false, x11RespCmd);
                    return;
                }
                String[] split = str.split("\n");
                ArrayList arrayList = new ArrayList();
                for (String str2 : split) {
                    String[] split2 = str2.split("\\|");
                    if (split2.length > 3) {
                        X11FileInfo x11FileInfo = new X11FileInfo();
                        String trim = split2[0].trim();
                        String trim2 = split2[1].trim();
                        String trim3 = split2[2].trim();
                        String trim4 = split2[3].trim();
                        x11FileInfo.setSize(Long.parseLong(trim));
                        x11FileInfo.setName(trim3);
                        String m29200f = C3103au.m29200f(trim2);
                        if (m29200f != null) {
                            x11FileInfo.setCreateDate(m29200f);
                        }
                        x11FileInfo.setLocalPath(C3129m.m29070a() + "X1/");
                        x11FileInfo.setAbsolutePath(C1831e.f4925cS + trim4 + trim3);
                        x11FileInfo.setRemotePath(trim4 + trim3);
                        arrayList.add(x11FileInfo);
                    }
                }
                if (arrayList != null && arrayList.size() > 0) {
                    AbstractC1794c.this.m34093l().setInfos(arrayList);
                }
                if (AbstractC1794c.this.f4685o == null) {
                    return;
                }
                AbstractC1794c.this.f4685o.mo28055a(bool.booleanValue(), x11RespCmd);
            }

            @Override // com.fimi.kernel.p158b.AbstractC1632e
            /* renamed from: b  reason: avoid collision after fix types in other method */
            public void mo30002b(String str) {
                if (AbstractC1794c.this.f4685o != null) {
                    AbstractC1794c.this.f4685o.mo28055a(false, x11RespCmd);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m34121a(String str) {
        if (str.contains("\"msg_id\":1282")) {
            new AsyncTaskC1805b().executeOnExecutor(this.f4679c, str);
            return;
        }
        X11RespCmd m34111b = m34111b(str);
        if (m34111b == null) {
            this.f4690t.append(str);
            m34111b = m34111b(this.f4690t.toString());
        }
        Log.i("progresss", "processCmdResult: " + str);
        m34124a(m34111b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public X11RespCmd m34111b(String str) {
        try {
            return (X11RespCmd) C3082aj.m29328a(str, new TypeToken<X11RespCmd<String>>() { // from class: com.fimi.soul.biz.camera.c.7
            }.getType());
        } catch (Exception e) {
            e.printStackTrace();
            try {
                return (X11RespCmd) C3082aj.m29328a(str, new TypeToken<X11RespCmd<List<String>>>() { // from class: com.fimi.soul.biz.camera.c.8
                }.getType());
            } catch (Exception e2) {
                e2.printStackTrace();
                try {
                    return (X11RespCmd) C3082aj.m29328a(str, new TypeToken<X11RespCmd<Object>>() { // from class: com.fimi.soul.biz.camera.c.9
                    }.getType());
                } catch (Exception e3) {
                    e3.printStackTrace();
                    return null;
                }
            }
        }
    }

    /* renamed from: b */
    private void m34112b(X11RespCmd x11RespCmd) {
        Log.d("Good", "Notification:" + x11RespCmd.getType());
        if (x11RespCmd.getMsg_id() == 7) {
            if (C1831e.f4840an.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(X11RespCmd.NotificationType.DisconnectHDMI);
            }
            if (C1831e.f4841ao.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(X11RespCmd.NotificationType.DisconnectShutDown);
            }
            if (C1831e.f4842ap.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(X11RespCmd.NotificationType.StartingVideoRecord);
            }
            if (C1831e.f4843aq.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(X11RespCmd.NotificationType.VideoRecordComplete);
            }
            if (C1831e.f4844ar.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(X11RespCmd.NotificationType.PhotoTaken);
                m34085t();
            }
            if (C1831e.f4845as.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(X11RespCmd.NotificationType.ContinueCaputureStarted);
                this.f4681k = EnumC1804a.ContinueCapturing;
            }
            if (C1831e.f4846at.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(X11RespCmd.NotificationType.ContinueCaptureStoped);
                m34085t();
            }
            if (C1831e.f4847au.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(X11RespCmd.NotificationType.ContinueCaputureStarted);
                m34085t();
            }
            if (C1831e.f4848av.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(X11RespCmd.NotificationType.ContiuneBurstCompleted);
                m34085t();
            }
            if (C1831e.f4850ax.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(X11RespCmd.NotificationType.LowBatteryWarning);
            }
            if (C1831e.f4849aw.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(X11RespCmd.NotificationType.LowStorageWarning);
            }
            if (C1831e.f4851ay.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(X11RespCmd.NotificationType.TimeLapseVideoStatus);
            }
            if (C1831e.f4852az.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(X11RespCmd.NotificationType.TimeLapsePhotoStatus);
            }
            if (C1831e.f4801aA.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(X11RespCmd.NotificationType.CameraConnectToPc);
            }
            if (C1831e.f4802aB.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(X11RespCmd.NotificationType.LogUpdated);
            }
            if (C1831e.f4803aC.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(X11RespCmd.NotificationType.PowerModeChange);
            }
            if (C1831e.f4804aD.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(X11RespCmd.NotificationType.VFStarted);
            }
            if (C1831e.f4805aE.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(X11RespCmd.NotificationType.VFStoped);
            }
            if (C1831e.f4806aF.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(X11RespCmd.NotificationType.AutoFileDelete);
            }
            if (C1831e.f4807aG.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(X11RespCmd.NotificationType.StorageRunOut);
            }
            if (C1831e.f4808aH.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(X11RespCmd.NotificationType.StorageIOError);
            }
            if (C1831e.f4809aI.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(X11RespCmd.NotificationType.LowSpeedCard);
            }
            if (C1831e.f4810aJ.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(X11RespCmd.NotificationType.MuxerIndexLimit);
            }
            if (C1831e.f4811aK.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(X11RespCmd.NotificationType.MuxerFileSizeLimit);
            }
            if (C1831e.f4812aL.equals(x11RespCmd.getType())) {
                C1642c.m34885e().m34527d(true);
                C1642c.m34885e().m34523e(true);
                x11RespCmd.setNotificationType(X11RespCmd.NotificationType.CardRemoved);
            }
            if (C1831e.f4813aM.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(X11RespCmd.NotificationType.CardInsert);
            }
            if (C1831e.f4815aO.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(X11RespCmd.NotificationType.PhotoFinish);
            }
            if (C1831e.f4814aN.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(X11RespCmd.NotificationType.CannotIssuePIV);
            }
            if (C1831e.f4826aZ.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(X11RespCmd.NotificationType.PutFileComplete);
            }
            if (C1831e.f4885bf.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(X11RespCmd.NotificationType.FmLsEnd);
            }
            if (C1831e.f4816aP.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(X11RespCmd.NotificationType.CARD_FILE_SYS_ERROR);
            }
            if (C1831e.f4817aQ.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(X11RespCmd.NotificationType.CARD_PARAM_ERR);
            }
            if (C1831e.f4818aR.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(X11RespCmd.NotificationType.CARD_NO_PROPOSE);
            }
            if (C1831e.f4819aS.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(X11RespCmd.NotificationType.CARD_NO_PROPOSE_AND_PARAM_ERR);
            }
            if (C1831e.f4820aT.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(X11RespCmd.NotificationType.CARD_WRITE_LOW);
            }
            if (C1831e.f4821aU.equals(x11RespCmd.getType())) {
                x11RespCmd.setNotificationType(X11RespCmd.NotificationType.CARD_WRITE_LOW_AND_PARAM_ERR);
            }
            if (!C1831e.f4822aV.equals(x11RespCmd.getType())) {
                return;
            }
            x11RespCmd.setNotificationType(X11RespCmd.NotificationType.CARD_SETROOT_ERROR);
        }
    }

    /* renamed from: c */
    private void m34106c(X11RespCmd x11RespCmd) {
        switch (x11RespCmd.getRval()) {
            case C1831e.f4897br /* -17 */:
                m34095j().setFreeKBSpace(0L);
                return;
            case -4:
            case -3:
                f4666i = -1;
                return;
            case -1:
                if (x11RespCmd.getMsg_id() != 5) {
                    return;
                }
                m34095j().setFreeKBSpace(0L);
                return;
            default:
                return;
        }
    }

    /* renamed from: t */
    private void m34085t() {
        this.f4681k = EnumC1804a.Normal;
    }

    /* renamed from: a */
    public void m34144a(int i) {
        f4666i = i;
        if (i > 0) {
            CameraValue.hasSession = true;
        } else {
            CameraValue.hasSession = false;
        }
    }

    @Override // com.fimi.kernel.AbstractC1584b
    /* renamed from: a */
    protected void mo30955a(Message message) {
        if (message.what == 1024) {
            X11FileInfo x11FileInfo = (X11FileInfo) message.obj;
            if (this.f4689s == null) {
                return;
            }
            this.f4689s.mo30333a(x11FileInfo.getLocalPath(), x11FileInfo.getName());
        } else if (message.what == 1025) {
            X11RespCmd x11RespCmd = new X11RespCmd();
            x11RespCmd.setMsg_id(C1831e.f4839am);
            Log.d("Good", "下载失败");
            if (this.f4685o == null) {
                return;
            }
            this.f4685o.mo28055a(false, x11RespCmd);
        } else if (message.what == 2048) {
            X11RespCmd x11RespCmd2 = new X11RespCmd();
            x11RespCmd2.setMsg_id(C1831e.f4835ai);
            Log.d("Good", "相机连接超时");
            if (this.f4670C && this.f4683m.getCurDirFileList() != null) {
                this.f4683m.getCurDirFileList().clear();
            }
            if (this.f4685o == null) {
                return;
            }
            this.f4685o.mo28055a(false, x11RespCmd2);
        } else if (message.what == 4096) {
            X11RespCmd x11RespCmd3 = new X11RespCmd();
            x11RespCmd3.setMsg_id(C1831e.f4838al);
            if (this.f4685o == null) {
                return;
            }
            this.f4685o.mo28055a(false, x11RespCmd3);
            boolean z = this.f4685o instanceof ShowDroneUiFragment;
            synchronized (this) {
                if (!z) {
                    if (this.f4676I != null) {
                        C3123g.m29090a().m29089a("onMount " + z);
                        this.f4676I.mo28242b(false, x11RespCmd3);
                    }
                }
            }
        } else if (message.what != f4664g) {
        } else {
            X11RespCmd x11RespCmd4 = new X11RespCmd();
            x11RespCmd4.setMsg_id(C1831e.f4836aj);
            if (this.f4685o == null) {
                return;
            }
            this.f4685o.mo28055a(false, x11RespCmd4);
            boolean z2 = this.f4685o instanceof ShowDroneUiFragment;
            synchronized (this) {
                if (!z2) {
                    if (this.f4676I != null) {
                        this.f4676I.mo28240c(false, x11RespCmd4);
                        C3123g.m29090a().m29089a(" onDisMount " + z2);
                    }
                }
            }
        }
    }

    @Override // com.fimi.soul.biz.camera.p173b.AbstractC1793g
    /* renamed from: a */
    public void mo34142a(AbstractC1622a abstractC1622a) {
        ((AbstractC1793g) b()).mo34142a(abstractC1622a);
    }

    @Override // com.fimi.soul.biz.camera.p173b.AbstractC1793g
    @Deprecated
    /* renamed from: a */
    public void mo34141a(AbstractC1625d abstractC1625d) {
        ((AbstractC1793g) b()).mo34141a(abstractC1625d);
    }

    /* renamed from: a */
    public synchronized void m34140a(AbstractC1790d abstractC1790d) {
        this.f4676I = abstractC1790d;
    }

    /* renamed from: a */
    public void m34139a(AbstractC1791e abstractC1791e) {
        this.f4689s = abstractC1791e;
    }

    /* renamed from: a */
    public void m34138a(AbstractC1792f<X11RespCmd> abstractC1792f) {
        this.f4685o = abstractC1792f;
    }

    /* renamed from: a */
    public void m34137a(EnumC1804a enumC1804a) {
        this.f4681k = enumC1804a;
    }

    /* renamed from: a */
    public void m34136a(AbstractC1806c abstractC1806c) {
        this.f4691u = abstractC1806c;
    }

    /* renamed from: a */
    public void m34135a(AbstractC1807d abstractC1807d) {
        this.f4692v = abstractC1807d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m34134a(AbstractC1808a abstractC1808a) {
        if (abstractC1808a != null) {
            this.f4684n.add(abstractC1808a);
        }
    }

    /* renamed from: a */
    public void m34126a(X11ApWifiConfig x11ApWifiConfig) {
        this.f4680j = x11ApWifiConfig;
    }

    /* renamed from: a */
    public void m34125a(X11FileInfo x11FileInfo) {
        if (x11FileInfo.getSize() == 0 || this.f4673F < x11FileInfo.getSize() || this.f4688r == null) {
            return;
        }
        Log.d("Good", "下载完毕:" + this.f4673F);
        try {
            this.f4688r.close();
            this.f4688r = null;
            String md5 = x11FileInfo.getMd5();
            File file = new File(x11FileInfo.getLocalPath() + x11FileInfo.getName());
            String m34548a = (file == null || !file.isFile() || !file.exists()) ? "" : C1680u.m34548a(file);
            Message message = new Message();
            if (md5 == null || m34548a.equals(md5)) {
                message.what = 1024;
                message.obj = x11FileInfo;
                m34093l().setCurDownloadFile(null);
            } else {
                file.delete();
                message.what = 1025;
            }
            a().sendMessageDelayed(message, 200L);
            this.f4673F = 0L;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public synchronized void m34123a(CameraMountState cameraMountState) {
        if (this.f4676I != null && cameraMountState != this.f4675H && (this.f4675H != CameraMountState.IDLE || cameraMountState != CameraMountState.DISMOUNT)) {
            boolean mo32905ac = this.f4671D.mo32905ac();
            if (C1514f.m35431a().m35429b() == EnumC1495b.X1BH) {
                mo32905ac = true;
            }
            if (mo32905ac && cameraMountState == CameraMountState.MOUNT) {
                C3123g.m29090a().m29089a("CameraMountState changeMountState 11 " + this.f4675H + " --->" + cameraMountState);
                this.f4675H = cameraMountState;
                a().sendEmptyMessage(4096);
            } else if (cameraMountState == CameraMountState.DISMOUNT) {
                C3123g.m29090a().m29089a(" CameraMountState changeMountState 22 " + this.f4675H + " --->" + cameraMountState);
                this.f4675H = cameraMountState;
                a().sendEmptyMessage(f4664g);
            }
        }
    }

    /* renamed from: a */
    public void m34119a(boolean z) {
        this.f4670C = z;
    }

    @Override // com.fimi.soul.biz.camera.p173b.AbstractC1789c
    /* renamed from: a */
    public void mo34118a(byte[] bArr) {
        b().mo34118a(bArr);
    }

    @Override // com.fimi.soul.biz.camera.p173b.AbstractC1793g
    /* renamed from: a */
    public void mo34117a(byte[] bArr, int i, int i2) {
        ((AbstractC1793g) b()).mo34117a(bArr, i, i2);
    }

    @Override // com.fimi.soul.biz.camera.p173b.AbstractC1793g
    /* renamed from: b */
    public void mo34116b(AbstractC1622a abstractC1622a) {
        ((AbstractC1793g) b()).mo34116b(abstractC1622a);
    }

    @Override // com.fimi.soul.biz.camera.p173b.AbstractC1793g
    @Deprecated
    /* renamed from: b */
    public void mo34115b(AbstractC1625d abstractC1625d) {
        ((AbstractC1793g) b()).mo34115b(abstractC1625d);
    }

    /* renamed from: b */
    public void m34110b(boolean z) {
        this.f4668A = z;
    }

    /* renamed from: c */
    public void m34108c(AbstractC1625d abstractC1625d) {
        ((AbstractC1793g) b()).mo34141a(this.f4672E);
        this.f4672E = abstractC1625d;
        ((AbstractC1793g) b()).mo34115b(this.f4672E);
    }

    /* renamed from: c */
    public void m34105c(boolean z) {
        this.f4669B = z;
    }

    /* renamed from: c */
    public boolean m34109c() {
        return this.f4670C;
    }

    /* renamed from: d */
    public void m34104d() {
        if (this.f4686p == null) {
            this.f4686p = new AbstractC1625d() { // from class: com.fimi.soul.biz.camera.c.1
                @Override // com.fimi.kernel.p158b.p161c.AbstractC1625d
                /* renamed from: a */
                public void mo28036a(String str) {
                    AbstractC1794c.this.m34121a(str);
                }
            };
            mo34115b(this.f4686p);
            a(new Runnable() { // from class: com.fimi.soul.biz.camera.c.2
                @Override // java.lang.Runnable
                public void run() {
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        try {
                            Thread.sleep(AbstractC1794c.f4667x);
                        } catch (InterruptedException e) {
                            e = e;
                        }
                        if (C1514f.m35431a().m35429b() == EnumC1495b.DRONE) {
                            if (!AbstractC1794c.this.f4669B) {
                                if (!AbstractC1794c.this.m34102e()) {
                                    AbstractC1794c.this.m34123a(CameraMountState.DISMOUNT);
                                }
                            } else if (AbstractC1794c.this.f4678b.m34184n()) {
                                AbstractC1794c.this.f4695z = AbstractC1794c.this.f4678b.m34185m();
                                if (!C1772d.m34208a().m34187k()) {
                                    AbstractC1794c.this.f4695z = C3103au.m29207d(C1831e.f4800a);
                                }
                            } else {
                                AbstractC1794c.this.f4695z = C3103au.m29207d(C1831e.f4800a);
                                AbstractC1794c.this.f4678b.m34204a(AbstractC1794c.this.f4695z);
                            }
                        } else if (C1514f.m35431a().m35429b() == EnumC1495b.X1BH) {
                            AbstractC1794c.this.f4695z = C3103au.m29207d(C1831e.f4800a);
                        }
                        if (AbstractC1794c.this.f4695z) {
                            int i3 = i2 + 1;
                            try {
                                if (AbstractC1794c.this.m34102e()) {
                                    AbstractC1794c.this.m34123a(CameraMountState.MOUNT);
                                    i2 = i3;
                                    i = 0;
                                } else if (((C1827d) C1783b.m34166a().m34150d()) != null) {
                                    ((C1827d) C1783b.m34166a().m34150d()).m33987w().m33996b();
                                    i2 = i3;
                                    i = 0;
                                } else {
                                    i2 = i3;
                                    i = 0;
                                }
                            } catch (InterruptedException e2) {
                                e = e2;
                                i2 = i3;
                                i = 0;
                                e.printStackTrace();
                            }
                        } else {
                            i++;
                            i2 = 0;
                        }
                        if (i > 1) {
                            if (AbstractC1794c.this.m34102e()) {
                                AbstractC1794c.this.m34144a(-1);
                            }
                            AbstractC1794c.this.m34123a(CameraMountState.DISMOUNT);
                        } else if (!AbstractC1794c.this.m34102e() && i2 > 1) {
                            if (System.currentTimeMillis() - AbstractC1794c.this.f4694y > 7500) {
                                AbstractC1794c.this.f4694y = System.currentTimeMillis();
                                AbstractC1794c.this.m34088q();
                            }
                            AbstractC1794c.this.a().sendEmptyMessageDelayed(2048, 500L);
                        } else if (AbstractC1794c.this.m34102e() && "".equalsIgnoreCase(AbstractC1794c.this.m34095j().getDvVersion())) {
                            AbstractC1794c.this.f4677a = (C1827d) C1783b.m34166a().m34150d();
                            AbstractC1794c.this.f4677a.m33989u().m34037k();
                        }
                    }
                }
            });
        }
        if (this.f4687q == null) {
            this.f4687q = new AbstractC1622a() { // from class: com.fimi.soul.biz.camera.c.3
                @Override // com.fimi.kernel.p158b.p161c.AbstractC1622a
                /* renamed from: a */
                public void mo34084a(int i, byte[] bArr) {
                    AbstractC1794c.this.m34143a(i, bArr);
                }
            };
            mo34142a(this.f4687q);
        }
    }

    /* renamed from: e */
    public boolean m34102e() {
        return f4666i > 0;
    }

    /* renamed from: f */
    public int m34100f() {
        return f4666i;
    }

    /* renamed from: g */
    public EnumC1804a m34098g() {
        return this.f4681k;
    }

    /* renamed from: h */
    public boolean m34097h() {
        return m34098g() != EnumC1804a.Normal;
    }

    /* renamed from: i */
    public boolean m34096i() {
        return this.f4668A;
    }

    /* renamed from: j */
    public X11SystemConfig m34095j() {
        return this.f4682l;
    }

    /* renamed from: k */
    public X11ApWifiConfig m34094k() {
        return this.f4680j;
    }

    /* renamed from: l */
    public X11FileSystem m34093l() {
        return this.f4683m;
    }

    /* renamed from: m */
    public AbstractC1807d m34092m() {
        return this.f4692v;
    }

    /* renamed from: n */
    public void m34091n() {
        if (b() != null && (b() instanceof C1781b)) {
            ((C1781b) b()).m34172b();
            Log.v("Good", "disConnect");
        }
    }

    /* renamed from: o */
    public boolean m34090o() {
        if (b() != null && (b() instanceof C1781b)) {
            return ((C1781b) b()).m34171c();
        }
        return false;
    }

    /* renamed from: p */
    public void m34089p() {
        C1685x.m34457a(new Runnable() { // from class: com.fimi.soul.biz.camera.c.4
            @Override // java.lang.Runnable
            public void run() {
                if (AbstractC1794c.this.b() instanceof C1781b) {
                    ((C1781b) AbstractC1794c.this.b()).m34169e();
                }
            }
        });
    }

    /* renamed from: q */
    public void m34088q() {
        if (b() != null && (b() instanceof C1781b)) {
            ((C1781b) b()).m34170d();
            Log.v("Good", "disConnect");
        }
    }

    /* renamed from: r */
    public synchronized void m34087r() {
        this.f4675H = CameraMountState.IDLE;
    }

    /* renamed from: s */
    public boolean m34086s() {
        return this.f4675H == CameraMountState.MOUNT;
    }
}
