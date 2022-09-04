package com.google.android.gms.common.data;

import java.util.NoSuchElementException;
/* renamed from: com.google.android.gms.common.data.n */
/* loaded from: classes2.dex */
public class C4535n<T> extends C4530i<T> {

    /* renamed from: c */
    private T f16915c;

    public C4535n(AbstractC4522b<T> abstractC4522b) {
        super(abstractC4522b);
    }

    @Override // com.google.android.gms.common.data.C4530i, java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException(new StringBuilder(46).append("Cannot advance the iterator beyond ").append(this.f16907b).toString());
        }
        this.f16907b++;
        if (this.f16907b == 0) {
            this.f16915c = this.f16906a.mo9715a(0);
            if (!(this.f16915c instanceof AbstractC4531j)) {
                String valueOf = String.valueOf(this.f16915c.getClass());
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 44).append("DataBuffer reference of type ").append(valueOf).append(" is not movable").toString());
            }
        } else {
            ((AbstractC4531j) this.f16915c).m23846a(this.f16907b);
        }
        return this.f16915c;
    }
}
