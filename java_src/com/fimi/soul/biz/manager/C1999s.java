package com.fimi.soul.biz.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.fimi.kernel.utils.C1685x;
import com.fimi.soul.biz.manager.AbstractC1971j;
import com.fimi.soul.biz.p185m.AbstractC1939e;
import com.fimi.soul.biz.p185m.AbstractC1945k;
import com.fimi.soul.entity.FdsMsg;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.SuggestBean;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.fimi.soul.biz.manager.s */
/* loaded from: classes.dex */
public class C1999s extends AbstractC1971j {

    /* renamed from: g */
    public ArrayList<Bitmap> f5577g = new ArrayList<>();

    /* renamed from: h */
    private Context f5578h;

    public C1999s(Context context) {
        super(context);
        this.f5578h = context;
    }

    /* renamed from: a */
    public PlaneMsg m33308a(final SuggestBean suggestBean, final AbstractC1945k abstractC1945k) {
        this.f5467f.put(1, abstractC1945k);
        C1964f m33399a = C1964f.m33399a(this.f5578h);
        if (this.f5577g == null || this.f5577g.size() <= 0 || "0".equals(suggestBean.getUserID())) {
            C1685x.m34455b(new AbstractC1971j.RunnableC1972a(1, suggestBean, abstractC1945k));
        } else {
            final int size = this.f5577g.size();
            Iterator<Bitmap> it2 = this.f5577g.iterator();
            while (it2.hasNext()) {
                Bitmap next = it2.next();
                m33399a.m33398a(next, new AbstractC1939e() { // from class: com.fimi.soul.biz.manager.s.1
                    @Override // com.fimi.soul.biz.p185m.AbstractC1939e
                    /* renamed from: a */
                    public void mo31276a(long j, long j2, String str) {
                    }

                    @Override // com.fimi.soul.biz.p185m.AbstractC1945k
                    /* renamed from: a */
                    public void mo28106a(PlaneMsg planeMsg, File file) {
                        if (!planeMsg.isSuccess()) {
                            Log.i("suguest fds :", "false");
                            return;
                        }
                        suggestBean.getList().add(((FdsMsg) planeMsg.getData()).getUrl());
                        if (suggestBean.getList().size() != size) {
                            return;
                        }
                        C1685x.m34455b(new AbstractC1971j.RunnableC1972a(1, suggestBean, abstractC1945k));
                    }
                });
                if (next != null && next.isRecycled()) {
                    next.recycle();
                }
            }
        }
        return this.f5466e;
    }

    /* renamed from: a */
    public void m33309a(Bitmap bitmap) {
        this.f5577g.add(bitmap);
    }

    /* renamed from: b */
    public PlaneMsg m33306b(SuggestBean suggestBean, AbstractC1945k abstractC1945k) {
        this.f5467f.put(1, abstractC1945k);
        C1685x.m34455b(new AbstractC1971j.RunnableC1972a(1, suggestBean, abstractC1945k));
        return this.f5466e;
    }

    /* renamed from: b */
    public ArrayList<Bitmap> m33307b() {
        return this.f5577g;
    }
}
