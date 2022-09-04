package com.xiaomi.market.sdk;

import android.app.DownloadManager;
import android.content.Context;
import android.database.Cursor;
import android.os.HandlerThread;
import com.fimi.kernel.C1576a;
import java.io.File;
/* renamed from: com.xiaomi.market.sdk.m */
/* loaded from: classes.dex */
public class C10448m {

    /* renamed from: aJ */
    public static C10448m f32491aJ;

    /* renamed from: aK */
    private C10458w f32492aK;

    /* renamed from: aL */
    private C10452q f32493aL;

    /* renamed from: aN */
    private File f32495aN;

    /* renamed from: aO */
    private DownloadManager f32496aO;
    private Context mContext;

    /* renamed from: aM */
    private long f32494aM = -1;

    /* renamed from: aP */
    private HandlerThread f32497aP = new HandlerThread("Worker Thread");

    /* renamed from: aQ */
    private HandlerC10449n f32498aQ = new HandlerC10449n(this, this.f32497aP.getLooper());

    private C10448m(Context context) {
        this.mContext = context;
        this.f32496aO = (DownloadManager) this.mContext.getSystemService(C1576a.f3871a);
        this.f32497aP.start();
    }

    /* renamed from: i */
    public static C10448m m5094i(Context context) {
        if (f32491aJ == null) {
            f32491aJ = new C10448m(context);
        }
        return f32491aJ;
    }

    /* renamed from: a */
    public void m5107a(long j) {
        if (this.f32494aM <= 0 || this.f32494aM == j) {
            this.f32498aQ.m5089m();
        }
    }

    /* renamed from: a */
    public void m5100a(C10452q c10452q, C10458w c10458w) {
        if (c10458w == null || c10452q == null) {
            return;
        }
        this.f32492aK = c10458w;
        this.f32493aL = c10452q;
        this.f32498aQ.m5090l();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0033 A[DONT_GENERATE] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m5101a(C10452q c10452q) {
        long j;
        Cursor query = C10453r.m5083j(this.mContext).query(C10447l.f32483aE, C10447l.f32487aI, "package_name=?", new String[]{c10452q.packageName}, null, null, null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    j = query.getLong(query.getColumnIndex(C10447l.f32484aF));
                    if (j != -1) {
                        return false;
                    }
                    if (query != null) {
                        query.close();
                    }
                    DownloadManager.Query query2 = new DownloadManager.Query();
                    query2.setFilterById(j);
                    query = this.f32496aO.query(query2);
                    int i = -1;
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                i = query.getInt(query.getColumnIndexOrThrow("status"));
                            }
                        } finally {
                            if (query != null) {
                                query.close();
                            }
                        }
                    }
                    if (i == 4 || i == 1 || i == 2) {
                        if (query != null) {
                            query.close();
                        }
                        return true;
                    }
                    if (query != null) {
                        query.close();
                    }
                    return false;
                }
            } finally {
                if (query != null) {
                    query.close();
                }
            }
        }
        j = -1;
        if (j != -1) {
        }
    }
}
