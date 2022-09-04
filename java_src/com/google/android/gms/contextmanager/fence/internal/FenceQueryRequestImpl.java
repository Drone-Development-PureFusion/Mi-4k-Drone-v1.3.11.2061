package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.fence.FenceQueryRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
/* loaded from: classes2.dex */
public class FenceQueryRequestImpl extends FenceQueryRequest {
    public static final Parcelable.Creator<FenceQueryRequestImpl> CREATOR = new C4743h();

    /* renamed from: a */
    private final int f17364a;

    /* renamed from: b */
    private final QueryFenceOperation f17365b;

    /* loaded from: classes2.dex */
    public static class QueryFenceOperation extends AbstractSafeParcelable {
        public static final Parcelable.Creator<QueryFenceOperation> CREATOR = new C4752o();

        /* renamed from: a */
        private final int f17366a;

        /* renamed from: b */
        private final int f17367b;

        /* renamed from: c */
        private final List<String> f17368c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public QueryFenceOperation(int i, int i2, List<String> list) {
            this.f17366a = i;
            this.f17367b = i2;
            this.f17368c = list;
        }

        private QueryFenceOperation(int i, List<String> list) {
            this(1, i, list);
        }

        /* renamed from: a */
        public static QueryFenceOperation m22974a(int i, List<String> list) {
            return new QueryFenceOperation(i, list);
        }

        /* renamed from: a */
        public int m22975a() {
            return this.f17367b;
        }

        /* renamed from: b */
        public List<String> m22973b() {
            return this.f17368c;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public int m22972c() {
            return this.f17366a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C4752o.m22892a(this, parcel, i);
        }
    }

    public FenceQueryRequestImpl() {
        this(1, QueryFenceOperation.m22974a(1, null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FenceQueryRequestImpl(int i, QueryFenceOperation queryFenceOperation) {
        this.f17364a = i;
        this.f17365b = queryFenceOperation;
    }

    public FenceQueryRequestImpl(Collection<String> collection) {
        this(1, QueryFenceOperation.m22974a(2, new ArrayList(collection)));
    }

    public FenceQueryRequestImpl(String... strArr) {
        this(1, QueryFenceOperation.m22974a(2, Arrays.asList(strArr)));
    }

    /* renamed from: b */
    public int m22977b() {
        return this.f17364a;
    }

    /* renamed from: c */
    public QueryFenceOperation m22976c() {
        return this.f17365b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4743h.m22914a(this, parcel, i);
    }
}
