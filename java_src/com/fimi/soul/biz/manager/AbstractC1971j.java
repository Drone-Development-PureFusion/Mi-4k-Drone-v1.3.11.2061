package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.p185m.AbstractC1945k;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.SuggestBean;
import com.fimi.soul.utils.C3083ak;
import com.fimi.soul.utils.NetUtil;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;
/* renamed from: com.fimi.soul.biz.manager.j */
/* loaded from: classes.dex */
public abstract class AbstractC1971j implements Handler.Callback {

    /* renamed from: b */
    public String f5463b;

    /* renamed from: c */
    public String f5464c;

    /* renamed from: d */
    public String f5465d;

    /* renamed from: g */
    private Context f5468g;

    /* renamed from: a */
    List<NameValuePair> f5462a = new ArrayList();

    /* renamed from: e */
    public PlaneMsg f5466e = null;

    /* renamed from: h */
    private Handler f5469h = new Handler(this);

    /* renamed from: f */
    public HashMap<Integer, AbstractC1945k> f5467f = new HashMap<>();

    /* renamed from: com.fimi.soul.biz.manager.j$a */
    /* loaded from: classes.dex */
    class RunnableC1972a implements Runnable {

        /* renamed from: a */
        int f5470a;

        /* renamed from: b */
        Object f5471b;

        /* renamed from: c */
        AbstractC1945k f5472c;

        public RunnableC1972a(int i, Object obj, AbstractC1945k abstractC1945k) {
            this.f5470a = i;
            this.f5471b = obj;
            this.f5472c = abstractC1945k;
        }

        @Override // java.lang.Runnable
        public void run() {
            PlaneMsg planeMsg = null;
            try {
                planeMsg = AbstractC1971j.this.m33369b(this.f5471b);
            } catch (Exception e) {
                e.printStackTrace();
            }
            Message obtainMessage = AbstractC1971j.this.f5469h.obtainMessage();
            obtainMessage.what = this.f5470a;
            obtainMessage.obj = planeMsg;
            AbstractC1971j.this.f5469h.sendMessage(obtainMessage);
        }
    }

    public AbstractC1971j(Context context) {
        this.f5468g = context;
    }

    /* renamed from: a */
    public String m33372a() {
        return this.f5465d;
    }

    /* renamed from: a */
    public void m33370a(Object obj) {
        Field[] declaredFields;
        for (Field field : obj.getClass().getDeclaredFields()) {
            String name = field.getName();
            String obj2 = field.getGenericType().toString();
            Method method = obj.getClass().getMethod("get" + (name.substring(0, 1).toUpperCase() + name.substring(1)), new Class[0]);
            if (obj2 == null || !"java.util.List<java.lang.String>".equals(obj2)) {
                String str = (String) method.invoke(obj, new Object[0]);
                if (str != null && str.length() > 0) {
                    this.f5462a.add(new BasicNameValuePair(field.getName(), str));
                }
            } else {
                List<String> list = (List) method.invoke(obj, new Object[0]);
                if (list != null && list.size() > 0) {
                    StringBuffer stringBuffer = new StringBuffer();
                    for (String str2 : list) {
                        stringBuffer.append(str2);
                        stringBuffer.append(";");
                    }
                    this.f5462a.add(new BasicNameValuePair("paramlist", stringBuffer.toString().substring(0, stringBuffer.length() - 1)));
                }
            }
        }
    }

    /* renamed from: b */
    public PlaneMsg m33369b(Object obj) {
        SuggestBean suggestBean = (SuggestBean) obj;
        this.f5462a.add(new BasicNameValuePair("userID", suggestBean.getUserID()));
        this.f5462a.add(new BasicNameValuePair("model", suggestBean.getModel()));
        this.f5462a.add(new BasicNameValuePair("content", suggestBean.getContent()));
        if (suggestBean.getContact() != null && !"".equals(suggestBean.getContact())) {
            this.f5462a.add(new BasicNameValuePair("contact", suggestBean.getContact()));
        }
        this.f5462a.add(new BasicNameValuePair("commandCode", suggestBean.getCommandCode()));
        List<String> list = suggestBean.getList();
        if (list != null && list.size() > 0) {
            StringBuffer stringBuffer = new StringBuffer();
            for (String str : list) {
                stringBuffer.append(str);
                stringBuffer.append(";");
            }
            this.f5462a.add(new BasicNameValuePair("paramlist", stringBuffer.toString().substring(0, stringBuffer.length() - 1)));
        }
        String m29406b = NetUtil.m29406b(C1756a.f4551j, this.f5462a, this.f5468g);
        if (m29406b == null || m29406b.length() == 0) {
            Log.e("error:", "respMsg is null");
            return null;
        }
        Log.i("Response:[%s]", m29406b);
        try {
            new JSONObject(m29406b);
            this.f5466e = (PlaneMsg) C3083ak.m29323b(PlaneMsg.class, m29406b);
        } catch (Exception e) {
            Log.i("Exception:[%s]", e.getMessage());
        }
        this.f5462a = null;
        return this.f5466e;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.obj != null) {
            this.f5467f.get(Integer.valueOf(message.what)).mo28106a((PlaneMsg) message.obj, null);
            return true;
        }
        return true;
    }
}
