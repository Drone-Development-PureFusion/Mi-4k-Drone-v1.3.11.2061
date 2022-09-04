package p005b.p006a.p007a.p029b.p045i.p047b;

import com.xiaomi.mipush.sdk.Constants;
import java.util.List;
/* renamed from: b.a.a.b.i.b.g */
/* loaded from: classes.dex */
public class C0573g extends C0569c {

    /* renamed from: i */
    List<String> f970i;

    /* JADX INFO: Access modifiers changed from: protected */
    public C0573g(int i, Object obj) {
        super(i, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0573g(Object obj) {
        super(1, obj);
    }

    /* renamed from: a */
    public void m38830a(List<String> list) {
        this.f970i = list;
    }

    @Override // p005b.p006a.p007a.p029b.p045i.p047b.C0569c, p005b.p006a.p007a.p029b.p045i.p047b.C0570d
    public boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof C0573g)) {
            C0573g c0573g = (C0573g) obj;
            return this.f970i != null ? this.f970i.equals(c0573g.f970i) : c0573g.f970i == null;
        }
        return false;
    }

    /* renamed from: g */
    public List<String> m38829g() {
        return this.f970i;
    }

    @Override // p005b.p006a.p007a.p029b.p045i.p047b.C0569c, p005b.p006a.p007a.p029b.p045i.p047b.C0570d
    public int hashCode() {
        return super.hashCode();
    }

    @Override // p005b.p006a.p007a.p029b.p045i.p047b.C0570d
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.f970i == null) {
            stringBuffer.append("KeyWord(" + this.f954g + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f949b + ")");
        } else {
            stringBuffer.append("KeyWord(" + this.f954g + ", " + this.f949b + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f970i + ")");
        }
        stringBuffer.append(f());
        return stringBuffer.toString();
    }
}
