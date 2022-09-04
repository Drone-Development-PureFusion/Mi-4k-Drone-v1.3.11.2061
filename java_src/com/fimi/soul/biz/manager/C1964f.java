package com.fimi.soul.biz.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.fimi.kernel.utils.C1685x;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.p184l.C1919f;
import com.fimi.soul.biz.p184l.C1920g;
import com.fimi.soul.biz.p184l.C1922h;
import com.fimi.soul.biz.p185m.AbstractC1939e;
import com.fimi.soul.biz.p185m.AbstractC1945k;
import com.fimi.soul.entity.FdsMsg;
import com.fimi.soul.entity.PlaneMsg;
import com.xiaomi.infra.galaxy.fds.android.model.ObjectMetadata;
import com.xiaomi.infra.galaxy.fds.android.model.ProgressListener;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* renamed from: com.fimi.soul.biz.manager.f */
/* loaded from: classes.dex */
public class C1964f implements Handler.Callback, C1920g.AbstractC1921a {

    /* renamed from: a */
    private static C1964f f5426a = null;

    /* renamed from: b */
    private static final int f5427b = 0;

    /* renamed from: c */
    private static final int f5428c = 1;

    /* renamed from: d */
    private static final int f5429d = 2;

    /* renamed from: e */
    private static final int f5430e = 3;

    /* renamed from: f */
    private static final int f5431f = 4;

    /* renamed from: g */
    private static final int f5432g = 5;

    /* renamed from: i */
    private C1920g f5434i;

    /* renamed from: j */
    private Handler f5435j;

    /* renamed from: l */
    private Context f5437l;

    /* renamed from: h */
    private List<C1922h> f5433h = new CopyOnWriteArrayList();

    /* renamed from: k */
    private HashMap<Integer, AbstractC1945k> f5436k = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fimi.soul.biz.manager.f$a */
    /* loaded from: classes.dex */
    public class RunnableC1965a extends ProgressListener implements Runnable {

        /* renamed from: a */
        ObjectMetadata f5438a;

        /* renamed from: b */
        int f5439b;

        /* renamed from: d */
        private InputStream f5441d;

        /* renamed from: e */
        private File f5442e;

        public RunnableC1965a(int i, InputStream inputStream, File file, ObjectMetadata objectMetadata) {
            this.f5439b = i;
            this.f5441d = inputStream;
            this.f5442e = file;
            this.f5438a = objectMetadata;
        }

        @Override // com.xiaomi.infra.galaxy.fds.android.model.ProgressListener
        public void onProgress(long j, long j2) {
            FdsMsg fdsMsg = new FdsMsg();
            fdsMsg.setTotal(j2);
            fdsMsg.setTransferred(j);
            if (this.f5442e != null) {
                fdsMsg.setFilePath(this.f5442e.getAbsolutePath());
            }
            Message obtainMessage = C1964f.this.f5435j.obtainMessage();
            obtainMessage.what = this.f5439b;
            obtainMessage.obj = fdsMsg;
            Bundle bundle = new Bundle();
            if (this.f5442e != null) {
                bundle.putString("file_path", this.f5442e.getAbsolutePath());
            }
            obtainMessage.setData(bundle);
            C1964f.this.f5435j.sendMessage(obtainMessage);
        }

        @Override // java.lang.Runnable
        public void run() {
            PlaneMsg planeMsg;
            Message obtainMessage = C1964f.this.f5435j.obtainMessage();
            if (this.f5439b == 0) {
                planeMsg = C1964f.this.f5434i.m33531a(this.f5442e);
            } else if (this.f5439b == 1) {
                planeMsg = C1964f.this.f5434i.m33529a(this.f5441d, this.f5438a);
            } else if (this.f5439b == 2) {
                planeMsg = C1964f.this.f5434i.m33533a();
            } else if (this.f5439b == 3) {
                planeMsg = C1964f.this.f5434i.m33528a(this.f5441d, this.f5438a, this);
            } else if (this.f5439b == 4) {
                planeMsg = C1964f.this.f5434i.m33526b(this.f5442e, this);
            } else {
                if (this.f5439b == 5 && C1964f.this.f5433h != null && C1964f.this.f5433h.size() > 0) {
                    for (C1922h c1922h : C1964f.this.f5433h) {
                        if (c1922h.f5341j.getName().equals(this.f5442e.getName())) {
                            FdsMsg fdsMsg = new FdsMsg();
                            PlaneMsg planeMsg2 = new PlaneMsg();
                            C1919f m33513e = c1922h.m33513e();
                            if (m33513e != null) {
                                fdsMsg.setBucketName(C1756a.f4556o);
                                fdsMsg.setObjectName(m33513e.m33536c());
                                fdsMsg.setUrl(m33513e.m33534d());
                                planeMsg2.setSuccess(true);
                                planeMsg2.setData(fdsMsg);
                                planeMsg2.setFile(this.f5442e);
                                planeMsg = planeMsg2;
                            } else {
                                planeMsg2.setSuccess(false);
                                planeMsg = planeMsg2;
                            }
                        }
                    }
                }
                planeMsg = null;
            }
            obtainMessage.what = this.f5439b;
            obtainMessage.obj = planeMsg;
            C1964f.this.f5435j.sendMessage(obtainMessage);
        }
    }

    public C1964f(Context context) {
        this.f5437l = null;
        this.f5434i = new C1920g(context);
        this.f5435j = new Handler(context.getMainLooper(), this);
        this.f5437l = context;
        this.f5434i.m33532a(this);
    }

    /* renamed from: a */
    public static C1964f m33399a(Context context) {
        if (f5426a == null) {
            f5426a = new C1964f(context);
        }
        return f5426a;
    }

    /* renamed from: a */
    public void m33400a() {
        if (this.f5433h == null || this.f5433h.size() <= 0) {
            return;
        }
        for (C1922h c1922h : this.f5433h) {
            c1922h.m33514d();
        }
        this.f5433h.clear();
    }

    /* renamed from: a */
    public void m33398a(Bitmap bitmap, AbstractC1939e abstractC1939e) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectMetadata objectMetadata = new ObjectMetadata();
        objectMetadata.setContentLength(byteArrayOutputStream.toByteArray().length);
        m33390a((InputStream) byteArrayInputStream, objectMetadata, abstractC1939e);
    }

    /* renamed from: a */
    public void m33397a(Bitmap bitmap, AbstractC1945k abstractC1945k) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectMetadata objectMetadata = new ObjectMetadata();
        objectMetadata.setContentLength(byteArrayOutputStream.toByteArray().length);
        m33389a(byteArrayInputStream, objectMetadata, abstractC1945k);
    }

    @Override // com.fimi.soul.biz.p184l.C1920g.AbstractC1921a
    /* renamed from: a */
    public void mo33396a(C1922h c1922h) {
        this.f5433h.add(c1922h);
    }

    /* renamed from: a */
    public void m33395a(AbstractC1945k abstractC1945k) {
        this.f5436k.put(2, abstractC1945k);
        C1685x.m34455b(new RunnableC1965a(2, null, null, null));
    }

    /* renamed from: a */
    public void m33393a(File file) {
        if (this.f5433h == null || this.f5433h.size() <= 0) {
            return;
        }
        for (C1922h c1922h : this.f5433h) {
            if (c1922h.f5341j.getName().equals(file.getName())) {
                c1922h.m33515c();
                return;
            }
        }
    }

    /* renamed from: a */
    public void m33392a(File file, AbstractC1939e abstractC1939e) {
        this.f5436k.put(4, abstractC1939e);
        C1685x.m34455b(new RunnableC1965a(4, null, file, null));
    }

    /* renamed from: a */
    public void m33391a(File file, AbstractC1945k abstractC1945k) {
        this.f5436k.put(0, abstractC1945k);
        C1685x.m34455b(new RunnableC1965a(0, null, file, null));
    }

    /* renamed from: a */
    public void m33390a(InputStream inputStream, ObjectMetadata objectMetadata, AbstractC1939e abstractC1939e) {
        this.f5436k.put(3, abstractC1939e);
        C1685x.m34455b(new RunnableC1965a(3, inputStream, null, objectMetadata));
    }

    /* renamed from: a */
    public void m33389a(InputStream inputStream, ObjectMetadata objectMetadata, AbstractC1945k abstractC1945k) {
        this.f5436k.put(1, abstractC1945k);
        C1685x.m34455b(new RunnableC1965a(1, inputStream, null, objectMetadata));
    }

    /* renamed from: b */
    public void m33387b(File file) {
        if (this.f5433h == null || this.f5433h.size() <= 0) {
            return;
        }
        for (C1922h c1922h : this.f5433h) {
            if (c1922h.f5341j.getName().equals(file.getName())) {
                c1922h.m33514d();
                this.f5433h.remove(c1922h);
                return;
            }
        }
    }

    /* renamed from: b */
    public void m33386b(File file, AbstractC1945k abstractC1945k) {
        this.f5436k.put(5, abstractC1945k);
        C1685x.m34455b(new RunnableC1965a(5, null, file, null));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.obj != null && (message.obj instanceof PlaneMsg)) {
            this.f5436k.get(Integer.valueOf(message.what)).mo28106a((PlaneMsg) message.obj, ((PlaneMsg) message.obj).getFile());
            return false;
        } else if (message.obj == null || !(message.obj instanceof FdsMsg)) {
            return false;
        } else {
            ((AbstractC1939e) this.f5436k.get(Integer.valueOf(message.what))).mo31276a(((FdsMsg) message.obj).getTransferred(), ((FdsMsg) message.obj).getTotal(), ((FdsMsg) message.obj).getFilePath());
            return false;
        }
    }
}
