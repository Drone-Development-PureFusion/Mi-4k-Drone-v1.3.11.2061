package p282m.framework.p285ui.widget.asyncview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.fimi.kernel.C1576a;
import java.util.Random;
import p282m.framework.p284b.C10956e;
import p282m.framework.p284b.C10958f;
/* renamed from: m.framework.ui.widget.asyncview.AsyncImageView */
/* loaded from: classes2.dex */
public class AsyncImageView extends ImageView implements Handler.Callback, AbstractC10959a, AbstractC10960b {

    /* renamed from: a */
    public static final int f35337a = 17170445;

    /* renamed from: b */
    private static Bitmap f35338b = null;

    /* renamed from: c */
    private static final int f35339c = 1;

    /* renamed from: d */
    private static final Random f35340d = new Random();

    /* renamed from: e */
    private static String f35341e;

    /* renamed from: f */
    private String f35342f;

    /* renamed from: g */
    private int f35343g;

    /* renamed from: h */
    private AbstractC10968d f35344h;

    public AsyncImageView(Context context) {
        super(context);
        m2476a(context);
    }

    public AsyncImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2476a(context);
    }

    public AsyncImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2476a(context);
    }

    /* renamed from: a */
    private Bitmap m2477a(int i) {
        switch (i) {
            case f35337a /* 17170445 */:
                if (f35338b == null) {
                    f35338b = BitmapFactory.decodeResource(getResources(), f35337a);
                }
                return f35338b;
            default:
                return BitmapFactory.decodeResource(getResources(), i);
        }
    }

    /* renamed from: a */
    private void m2476a(Context context) {
        C10956e.m2500a();
        if (TextUtils.isEmpty(f35341e)) {
            f35341e = C10958f.m2486a(getContext(), C1576a.f3872b);
        }
        C10961c.m2471a(f35341e);
        setOnImageGotListener(C10969e.f35372a);
    }

    /* renamed from: a */
    public void m2475a(String str) {
        mo2474a(str, 0);
    }

    @Override // p282m.framework.p285ui.widget.asyncview.AbstractC10959a
    /* renamed from: a */
    public void mo2474a(String str, int i) {
        this.f35342f = str;
        this.f35343g = i;
        if (C10958f.m2482a(str)) {
            setImageResource(i);
            return;
        }
        Bitmap m2467b = C10961c.m2467b(str);
        if (m2467b != null && !m2467b.isRecycled()) {
            setImageBitmap(m2467b);
            return;
        }
        if (i > 0) {
            setImageBitmap(m2477a(i));
        }
        C10961c.m2470a(str, this);
    }

    @Override // p282m.framework.p285ui.widget.asyncview.AbstractC10960b
    /* renamed from: a */
    public void mo2473a(String str, Bitmap bitmap) {
        if (this.f35344h != null) {
            bitmap = this.f35344h.mo2441a(this, bitmap, str);
        }
        Message message = new Message();
        message.what = 1;
        message.obj = new Object[]{str, bitmap};
        C10956e.m2496a(message, f35340d.nextInt(300), this);
    }

    @Override // p282m.framework.p285ui.widget.asyncview.AbstractC10959a
    public String getUrl() {
        return this.f35342f;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            Object obj = ((Object[]) message.obj)[0];
            Object obj2 = ((Object[]) message.obj)[1];
            if (obj2 == null || obj == null || !obj.equals(this.f35342f)) {
                setImageResource(this.f35343g);
            } else {
                setImageBitmap((Bitmap) obj2);
            }
        }
        return false;
    }

    public void setOnImageGotListener(AbstractC10968d abstractC10968d) {
        this.f35344h = abstractC10968d;
    }
}
