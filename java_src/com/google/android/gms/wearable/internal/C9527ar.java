package com.google.android.gms.wearable.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.util.Log;
import com.google.android.gms.common.C4648j;
import com.google.android.gms.common.C4657m;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC4600p;
import com.google.android.gms.common.internal.AbstractC4638w;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.drive.AbstractC4808e;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.ail;
import com.google.android.gms.wearable.AbstractC9441a;
import com.google.android.gms.wearable.AbstractC9453c;
import com.google.android.gms.wearable.AbstractC9458e;
import com.google.android.gms.wearable.AbstractC9467i;
import com.google.android.gms.wearable.AbstractC9630m;
import com.google.android.gms.wearable.AbstractC9636p;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.C9627j;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.internal.AbstractC9621y;
import com.google.android.gms.wearable.internal.C9505aq;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
/* renamed from: com.google.android.gms.wearable.internal.ar */
/* loaded from: classes2.dex */
public class C9527ar extends AbstractC4638w<AbstractC9621y> {

    /* renamed from: a */
    private final ExecutorService f30029a;

    /* renamed from: e */
    private final C9624z<Object> f30030e;

    /* renamed from: f */
    private final C9624z<Object> f30031f;

    /* renamed from: g */
    private final C9624z<AbstractC9453c.AbstractC9454a> f30032g;

    /* renamed from: h */
    private final C9624z<AbstractC9458e.AbstractC9460b> f30033h;

    /* renamed from: i */
    private final C9624z<AbstractC9630m.AbstractC9632b> f30034i;

    /* renamed from: j */
    private final C9624z<AbstractC9636p.AbstractC9639c> f30035j;

    /* renamed from: k */
    private final C9624z<Object> f30036k;

    /* renamed from: l */
    private final C9624z<AbstractC9441a.AbstractC9444c> f30037l;

    /* renamed from: m */
    private C4657m f30038m;

    public C9527ar(Context context, Looper looper, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c, C4626s c4626s) {
        this(context, looper, abstractC4491b, abstractC4492c, c4626s, Executors.newCachedThreadPool(), C4657m.m23326a(context));
    }

    C9527ar(Context context, Looper looper, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c, C4626s c4626s, ExecutorService executorService, C4657m c4657m) {
        super(context, looper, 14, c4626s, abstractC4491b, abstractC4492c);
        this.f30030e = new C9624z<>();
        this.f30031f = new C9624z<>();
        this.f30032g = new C9624z<>();
        this.f30033h = new C9624z<>();
        this.f30034i = new C9624z<>();
        this.f30035j = new C9624z<>();
        this.f30036k = new C9624z<>();
        this.f30037l = new C9624z<>();
        this.f30029a = (ExecutorService) C4588d.m23627a(executorService);
        this.f30038m = c4657m;
    }

    /* renamed from: a */
    public static Intent m7980a(Context context) {
        Intent intent = new Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
        return context.getPackageManager().resolveActivity(intent, 65536) != null ? intent : new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
    }

    /* renamed from: a */
    private FutureTask<Boolean> m7978a(final ParcelFileDescriptor parcelFileDescriptor, final byte[] bArr) {
        return new FutureTask<>(new Callable<Boolean>() { // from class: com.google.android.gms.wearable.internal.ar.1
            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public Boolean call() {
                if (Log.isLoggable("WearableClient", 3)) {
                    String valueOf = String.valueOf(parcelFileDescriptor);
                    Log.d("WearableClient", new StringBuilder(String.valueOf(valueOf).length() + 36).append("processAssets: writing data to FD : ").append(valueOf).toString());
                }
                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
                try {
                    try {
                        autoCloseOutputStream.write(bArr);
                        autoCloseOutputStream.flush();
                        if (Log.isLoggable("WearableClient", 3)) {
                            String valueOf2 = String.valueOf(parcelFileDescriptor);
                            Log.d("WearableClient", new StringBuilder(String.valueOf(valueOf2).length() + 27).append("processAssets: wrote data: ").append(valueOf2).toString());
                        }
                        try {
                            if (Log.isLoggable("WearableClient", 3)) {
                                String valueOf3 = String.valueOf(parcelFileDescriptor);
                                Log.d("WearableClient", new StringBuilder(String.valueOf(valueOf3).length() + 24).append("processAssets: closing: ").append(valueOf3).toString());
                            }
                            autoCloseOutputStream.close();
                            return true;
                        } catch (IOException e) {
                            return true;
                        }
                    } catch (IOException e2) {
                        String valueOf4 = String.valueOf(parcelFileDescriptor);
                        Log.w("WearableClient", new StringBuilder(String.valueOf(valueOf4).length() + 36).append("processAssets: writing data failed: ").append(valueOf4).toString());
                        return false;
                    }
                } finally {
                    try {
                        if (Log.isLoggable("WearableClient", 3)) {
                            String valueOf5 = String.valueOf(parcelFileDescriptor);
                            Log.d("WearableClient", new StringBuilder(String.valueOf(valueOf5).length() + 24).append("processAssets: closing: ").append(valueOf5).toString());
                        }
                        autoCloseOutputStream.close();
                    } catch (IOException e3) {
                    }
                }
            }
        });
    }

    /* renamed from: b */
    private Runnable m7949b(final ahl.AbstractC6344b<Status> abstractC6344b, final String str, final Uri uri, final long j, final long j2) {
        C4588d.m23627a(abstractC6344b);
        C4588d.m23627a(str);
        C4588d.m23627a(uri);
        C4588d.m23617b(j >= 0, "startOffset is negative: %s", Long.valueOf(j));
        C4588d.m23617b(j2 >= -1, "invalid length: %s", Long.valueOf(j2));
        return new Runnable() { // from class: com.google.android.gms.wearable.internal.ar.3
            @Override // java.lang.Runnable
            public void run() {
                ParcelFileDescriptor parcelFileDescriptor;
                if (Log.isLoggable("WearableClient", 2)) {
                    Log.v("WearableClient", "Executing sendFileToChannelTask");
                }
                if (!"file".equals(uri.getScheme())) {
                    Log.w("WearableClient", "Channel.sendFile used with non-file URI");
                    abstractC6344b.mo7412c(new Status(10, "Channel.sendFile used with non-file URI"));
                    return;
                }
                File file = new File(uri.getPath());
                try {
                    try {
                        parcelFileDescriptor = ParcelFileDescriptor.open(file, AbstractC4808e.f17570a_);
                        try {
                            ((AbstractC9621y) C9527ar.this.G()).mo7682a(new C9505aq.BinderC9523r(abstractC6344b), str, parcelFileDescriptor, j, j2);
                        } catch (RemoteException e) {
                            Log.w("WearableClient", "Channel.sendFile failed.", e);
                            abstractC6344b.mo7412c(new Status(8));
                            try {
                                parcelFileDescriptor.close();
                            } catch (IOException e2) {
                                Log.w("WearableClient", "Failed to close sourceFd", e2);
                            }
                        }
                    } finally {
                        try {
                            parcelFileDescriptor.close();
                        } catch (IOException e3) {
                            Log.w("WearableClient", "Failed to close sourceFd", e3);
                        }
                    }
                } catch (FileNotFoundException e4) {
                    String valueOf = String.valueOf(file);
                    Log.w("WearableClient", new StringBuilder(String.valueOf(valueOf).length() + 46).append("File couldn't be opened for Channel.sendFile: ").append(valueOf).toString());
                    abstractC6344b.mo7412c(new Status(13));
                }
            }
        };
    }

    /* renamed from: b */
    private Runnable m7948b(final ahl.AbstractC6344b<Status> abstractC6344b, final String str, final Uri uri, final boolean z) {
        C4588d.m23627a(abstractC6344b);
        C4588d.m23627a(str);
        C4588d.m23627a(uri);
        return new Runnable() { // from class: com.google.android.gms.wearable.internal.ar.2
            @Override // java.lang.Runnable
            public void run() {
                if (Log.isLoggable("WearableClient", 2)) {
                    Log.v("WearableClient", "Executing receiveFileFromChannelTask");
                }
                if (!"file".equals(uri.getScheme())) {
                    Log.w("WearableClient", "Channel.receiveFile used with non-file URI");
                    abstractC6344b.mo7412c(new Status(10, "Channel.receiveFile used with non-file URI"));
                    return;
                }
                File file = new File(uri.getPath());
                try {
                    ParcelFileDescriptor open = ParcelFileDescriptor.open(file, (z ? 33554432 : 0) | 671088640);
                    try {
                        try {
                            ((AbstractC9621y) C9527ar.this.G()).mo7683a(new C9505aq.BinderC9526u(abstractC6344b), str, open);
                            try {
                                open.close();
                            } catch (IOException e) {
                                Log.w("WearableClient", "Failed to close targetFd", e);
                            }
                        } catch (RemoteException e2) {
                            Log.w("WearableClient", "Channel.receiveFile failed.", e2);
                            abstractC6344b.mo7412c(new Status(8));
                            try {
                                open.close();
                            } catch (IOException e3) {
                                Log.w("WearableClient", "Failed to close targetFd", e3);
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            open.close();
                        } catch (IOException e4) {
                            Log.w("WearableClient", "Failed to close targetFd", e4);
                        }
                        throw th;
                    }
                } catch (FileNotFoundException e5) {
                    String valueOf = String.valueOf(file);
                    Log.w("WearableClient", new StringBuilder(String.valueOf(valueOf).length() + 49).append("File couldn't be opened for Channel.receiveFile: ").append(valueOf).toString());
                    abstractC6344b.mo7412c(new Status(13));
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public AbstractC9621y mo7440b(IBinder iBinder) {
        return AbstractC9621y.AbstractBinderC9622a.m7698a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    protected String mo7443a() {
        return "com.google.android.gms.wearable.BIND";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public void mo7981a(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (Log.isLoggable("WearableClient", 2)) {
            Log.d("WearableClient", new StringBuilder(41).append("onPostInitHandler: statusCode ").append(i).toString());
        }
        if (i == 0) {
            this.f30030e.m7649a(iBinder);
            this.f30031f.m7649a(iBinder);
            this.f30032g.m7649a(iBinder);
            this.f30033h.m7649a(iBinder);
            this.f30034i.m7649a(iBinder);
            this.f30035j.m7649a(iBinder);
            this.f30036k.m7649a(iBinder);
            this.f30037l.m7649a(iBinder);
        }
        super.a(i, iBinder, bundle, i2);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p, com.google.android.gms.common.api.C4467a.AbstractC4477f
    /* renamed from: a */
    public void mo7977a(@NonNull AbstractC4600p.AbstractC4606f abstractC4606f) {
        int i = 0;
        if (!mo7943w()) {
            try {
                Bundle bundle = B().getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
                if (bundle != null) {
                    i = bundle.getInt("com.google.android.wearable.api.version", 0);
                }
                if (i < C4648j.f17166c) {
                    Log.w("WearableClient", new StringBuilder(80).append("Android Wear out of date. Requires API version ").append(C4648j.f17166c).append(" but found ").append(i).toString());
                    a(abstractC4606f, new ConnectionResult(6, PendingIntent.getActivity(B(), 0, m7980a(B()), 0)));
                    return;
                }
            } catch (PackageManager.NameNotFoundException e) {
                a(abstractC4606f, new ConnectionResult(16));
                return;
            }
        }
        super.a(abstractC4606f);
    }

    /* renamed from: a */
    public void m7976a(ahl.AbstractC6344b<C9627j> abstractC6344b) {
        ((AbstractC9621y) G()).mo7678b(new C9505aq.BinderC9517l(abstractC6344b));
    }

    /* renamed from: a */
    public void m7975a(ahl.AbstractC6344b<AbstractC9441a.AbstractC9445d> abstractC6344b, int i) {
        ((AbstractC9621y) G()).mo7695a(new C9505aq.BinderC9511f(abstractC6344b), i);
    }

    /* renamed from: a */
    public void m7974a(ahl.AbstractC6344b<AbstractC9458e.AbstractC9459a> abstractC6344b, Uri uri) {
        ((AbstractC9621y) G()).mo7694a(new C9505aq.BinderC9516k(abstractC6344b), uri);
    }

    /* renamed from: a */
    public void m7973a(ahl.AbstractC6344b<C9627j> abstractC6344b, Uri uri, int i) {
        ((AbstractC9621y) G()).mo7693a(new C9505aq.BinderC9517l(abstractC6344b), uri, i);
    }

    /* renamed from: a */
    public void m7972a(ahl.AbstractC6344b<AbstractC9458e.AbstractC9463e> abstractC6344b, Asset asset) {
        ((AbstractC9621y) G()).mo7692a(new C9505aq.BinderC9518m(abstractC6344b), asset);
    }

    /* renamed from: a */
    public void m7971a(ahl.AbstractC6344b<AbstractC9458e.AbstractC9459a> abstractC6344b, PutDataRequest putDataRequest) {
        for (Map.Entry<String, Asset> entry : putDataRequest.m8119c().entrySet()) {
            Asset value = entry.getValue();
            if (value.m8145a() == null && value.m8140b() == null && value.m8139c() == null && value.m8138d() == null) {
                String valueOf = String.valueOf(putDataRequest.m8128a());
                String valueOf2 = String.valueOf(value);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 33 + String.valueOf(valueOf2).length()).append("Put for ").append(valueOf).append(" contains invalid asset: ").append(valueOf2).toString());
            }
        }
        PutDataRequest m8127a = PutDataRequest.m8127a(putDataRequest.m8128a());
        m8127a.m8122a(putDataRequest.m8121b());
        if (putDataRequest.m8113f()) {
            m8127a.m8111g();
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Asset> entry2 : putDataRequest.m8119c().entrySet()) {
            Asset value2 = entry2.getValue();
            if (value2.m8145a() != null) {
                try {
                    ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                    if (Log.isLoggable("WearableClient", 3)) {
                        String valueOf3 = String.valueOf(value2);
                        String valueOf4 = String.valueOf(createPipe[0]);
                        String valueOf5 = String.valueOf(createPipe[1]);
                        Log.d("WearableClient", new StringBuilder(String.valueOf(valueOf3).length() + 61 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length()).append("processAssets: replacing data with FD in asset: ").append(valueOf3).append(" read:").append(valueOf4).append(" write:").append(valueOf5).toString());
                    }
                    m8127a.m8124a(entry2.getKey(), Asset.m8143a(createPipe[0]));
                    FutureTask<Boolean> m7978a = m7978a(createPipe[1], value2.m8145a());
                    arrayList.add(m7978a);
                    this.f30029a.submit(m7978a);
                } catch (IOException e) {
                    String valueOf6 = String.valueOf(putDataRequest);
                    throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf6).length() + 60).append("Unable to create ParcelFileDescriptor for asset in request: ").append(valueOf6).toString(), e);
                }
            } else if (value2.m8138d() != null) {
                try {
                    m8127a.m8124a(entry2.getKey(), Asset.m8143a(B().getContentResolver().openFileDescriptor(value2.m8138d(), "r")));
                } catch (FileNotFoundException e2) {
                    new C9505aq.BinderC9522q(abstractC6344b, arrayList).mo7713a(new PutDataResponse(4005, null));
                    String valueOf7 = String.valueOf(value2.m8138d());
                    Log.w("WearableClient", new StringBuilder(String.valueOf(valueOf7).length() + 28).append("Couldn't resolve asset URI: ").append(valueOf7).toString());
                    return;
                }
            } else {
                m8127a.m8124a(entry2.getKey(), value2);
            }
        }
        ((AbstractC9621y) G()).mo7690a(new C9505aq.BinderC9522q(abstractC6344b, arrayList), m8127a);
    }

    /* renamed from: a */
    public void m7970a(ahl.AbstractC6344b<Status> abstractC6344b, AbstractC9441a.AbstractC9444c abstractC9444c) {
        this.f30037l.m7648a(this, abstractC6344b, abstractC9444c);
    }

    /* renamed from: a */
    public void m7969a(ahl.AbstractC6344b<Status> abstractC6344b, AbstractC9441a.AbstractC9444c abstractC9444c, ail<AbstractC9441a.AbstractC9444c> ailVar, IntentFilter[] intentFilterArr) {
        this.f30037l.m7647a(this, abstractC6344b, abstractC9444c, BinderC9531as.m7925e(ailVar, intentFilterArr));
    }

    /* renamed from: a */
    public void m7968a(ahl.AbstractC6344b<Status> abstractC6344b, AbstractC9453c.AbstractC9454a abstractC9454a, ail<AbstractC9453c.AbstractC9454a> ailVar, String str, IntentFilter[] intentFilterArr) {
        if (str == null) {
            this.f30032g.m7647a(this, abstractC6344b, abstractC9454a, BinderC9531as.m7927d(ailVar, intentFilterArr));
            return;
        }
        this.f30032g.m7647a(this, abstractC6344b, new C9500al(str, abstractC9454a), BinderC9531as.m7938a(ailVar, str, intentFilterArr));
    }

    /* renamed from: a */
    public void m7967a(ahl.AbstractC6344b<Status> abstractC6344b, AbstractC9453c.AbstractC9454a abstractC9454a, String str) {
        if (str == null) {
            this.f30032g.m7648a(this, abstractC6344b, abstractC9454a);
            return;
        }
        this.f30032g.m7648a(this, abstractC6344b, new C9500al(str, abstractC9454a));
    }

    /* renamed from: a */
    public void m7966a(ahl.AbstractC6344b<Status> abstractC6344b, AbstractC9458e.AbstractC9460b abstractC9460b) {
        this.f30033h.m7648a(this, abstractC6344b, abstractC9460b);
    }

    /* renamed from: a */
    public void m7965a(ahl.AbstractC6344b<Status> abstractC6344b, AbstractC9458e.AbstractC9460b abstractC9460b, ail<AbstractC9458e.AbstractC9460b> ailVar, IntentFilter[] intentFilterArr) {
        this.f30033h.m7647a(this, abstractC6344b, abstractC9460b, BinderC9531as.m7937a(ailVar, intentFilterArr));
    }

    /* renamed from: a */
    public void m7964a(ahl.AbstractC6344b<AbstractC9458e.AbstractC9463e> abstractC6344b, AbstractC9467i abstractC9467i) {
        m7972a(abstractC6344b, Asset.m8142a(abstractC9467i.mo7794c()));
    }

    /* renamed from: a */
    public void m7963a(ahl.AbstractC6344b<Status> abstractC6344b, AbstractC9630m.AbstractC9632b abstractC9632b) {
        this.f30034i.m7648a(this, abstractC6344b, abstractC9632b);
    }

    /* renamed from: a */
    public void m7962a(ahl.AbstractC6344b<Status> abstractC6344b, AbstractC9630m.AbstractC9632b abstractC9632b, ail<AbstractC9630m.AbstractC9632b> ailVar, IntentFilter[] intentFilterArr) {
        this.f30034i.m7647a(this, abstractC6344b, abstractC9632b, BinderC9531as.m7934b(ailVar, intentFilterArr));
    }

    /* renamed from: a */
    public void m7961a(ahl.AbstractC6344b<Status> abstractC6344b, AbstractC9636p.AbstractC9639c abstractC9639c) {
        this.f30035j.m7648a(this, abstractC6344b, abstractC9639c);
    }

    /* renamed from: a */
    public void m7960a(ahl.AbstractC6344b<Status> abstractC6344b, AbstractC9636p.AbstractC9639c abstractC9639c, ail<AbstractC9636p.AbstractC9639c> ailVar, IntentFilter[] intentFilterArr) {
        this.f30035j.m7647a(this, abstractC6344b, abstractC9639c, BinderC9531as.m7929c(ailVar, intentFilterArr));
    }

    /* renamed from: a */
    public void m7959a(ahl.AbstractC6344b<AbstractC9441a.AbstractC9442a> abstractC6344b, String str) {
        ((AbstractC9621y) G()).mo7664d(new C9505aq.BinderC9506a(abstractC6344b), str);
    }

    /* renamed from: a */
    public void m7958a(ahl.AbstractC6344b<AbstractC9441a.AbstractC9446e> abstractC6344b, String str, int i) {
        ((AbstractC9621y) G()).mo7684a(new C9505aq.BinderC9512g(abstractC6344b), str, i);
    }

    /* renamed from: a */
    public void m7957a(ahl.AbstractC6344b<Status> abstractC6344b, String str, Uri uri, long j, long j2) {
        try {
            this.f30029a.execute(m7949b(abstractC6344b, str, uri, j, j2));
        } catch (RuntimeException e) {
            abstractC6344b.mo7412c(new Status(8));
            throw e;
        }
    }

    /* renamed from: a */
    public void m7956a(ahl.AbstractC6344b<Status> abstractC6344b, String str, Uri uri, boolean z) {
        try {
            this.f30029a.execute(m7948b(abstractC6344b, str, uri, z));
        } catch (RuntimeException e) {
            abstractC6344b.mo7412c(new Status(8));
            throw e;
        }
    }

    /* renamed from: a */
    public void m7955a(ahl.AbstractC6344b<AbstractC9453c.AbstractC9456c> abstractC6344b, String str, String str2) {
        ((AbstractC9621y) G()).mo7681a(new C9505aq.BinderC9521p(abstractC6344b), str, str2);
    }

    /* renamed from: a */
    public void m7954a(ahl.AbstractC6344b<AbstractC9630m.AbstractC9633c> abstractC6344b, String str, String str2, byte[] bArr) {
        ((AbstractC9621y) G()).mo7680a(new C9505aq.BinderC9525t(abstractC6344b), str, str2, bArr);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: b */
    protected String mo7441b() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    /* renamed from: b */
    public void m7953b(ahl.AbstractC6344b<AbstractC9636p.AbstractC9638b> abstractC6344b) {
        ((AbstractC9621y) G()).mo7669c(new C9505aq.BinderC9519n(abstractC6344b));
    }

    /* renamed from: b */
    public void m7952b(ahl.AbstractC6344b<AbstractC9458e.AbstractC9461c> abstractC6344b, Uri uri, int i) {
        ((AbstractC9621y) G()).mo7675b(new C9505aq.BinderC9510e(abstractC6344b), uri, i);
    }

    /* renamed from: b */
    public void m7951b(ahl.AbstractC6344b<AbstractC9441a.AbstractC9448g> abstractC6344b, String str) {
        ((AbstractC9621y) G()).mo7662e(new C9505aq.BinderC9524s(abstractC6344b), str);
    }

    /* renamed from: b */
    public void m7950b(ahl.AbstractC6344b<Status> abstractC6344b, String str, int i) {
        ((AbstractC9621y) G()).mo7671b(new C9505aq.BinderC9509d(abstractC6344b), str, i);
    }

    /* renamed from: c */
    public void m7947c(ahl.AbstractC6344b<AbstractC9636p.AbstractC9637a> abstractC6344b) {
        ((AbstractC9621y) G()).mo7665d(new C9505aq.BinderC9515j(abstractC6344b));
    }

    /* renamed from: c */
    public void m7946c(ahl.AbstractC6344b<Status> abstractC6344b, String str) {
        ((AbstractC9621y) G()).mo7660f(new C9505aq.BinderC9508c(abstractC6344b), str);
    }

    /* renamed from: d */
    public void m7945d(ahl.AbstractC6344b<Channel.AbstractC9426a> abstractC6344b, String str) {
        BinderC9574bl binderC9574bl = new BinderC9574bl();
        ((AbstractC9621y) G()).mo7686a(new C9505aq.BinderC9513h(abstractC6344b, binderC9574bl), binderC9574bl, str);
    }

    /* renamed from: e */
    public void m7944e(ahl.AbstractC6344b<Channel.AbstractC9427b> abstractC6344b, String str) {
        BinderC9574bl binderC9574bl = new BinderC9574bl();
        ((AbstractC9621y) G()).mo7673b(new C9505aq.BinderC9514i(abstractC6344b, binderC9574bl), binderC9574bl, str);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p, com.google.android.gms.common.api.C4467a.AbstractC4477f
    /* renamed from: w */
    public boolean mo7943w() {
        return !this.f30038m.m23322a(B().getPackageManager(), "com.google.android.wearable.app.cn");
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: y */
    protected String mo7942y() {
        return this.f30038m.m23322a(B().getPackageManager(), "com.google.android.wearable.app.cn") ? "com.google.android.wearable.app.cn" : "com.google.android.gms";
    }
}
