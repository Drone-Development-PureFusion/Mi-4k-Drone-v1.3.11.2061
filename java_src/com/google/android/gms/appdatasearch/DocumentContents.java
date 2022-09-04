package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
/* loaded from: classes2.dex */
public class DocumentContents extends AbstractSafeParcelable {
    public static final C3954b CREATOR = new C3954b();

    /* renamed from: a */
    final int f15227a;

    /* renamed from: b */
    final DocumentSection[] f15228b;

    /* renamed from: c */
    public final String f15229c;

    /* renamed from: d */
    public final boolean f15230d;

    /* renamed from: e */
    public final Account f15231e;

    /* renamed from: com.google.android.gms.appdatasearch.DocumentContents$a */
    /* loaded from: classes2.dex */
    public static class C3948a {

        /* renamed from: a */
        private List<DocumentSection> f15232a;

        /* renamed from: b */
        private String f15233b;

        /* renamed from: c */
        private boolean f15234c;

        /* renamed from: d */
        private Account f15235d;

        /* renamed from: a */
        public C3948a m25956a(Account account) {
            this.f15235d = account;
            return this;
        }

        /* renamed from: a */
        public C3948a m25955a(DocumentSection documentSection) {
            if (this.f15232a == null && documentSection != null) {
                this.f15232a = new ArrayList();
            }
            if (documentSection != null) {
                this.f15232a.add(documentSection);
            }
            return this;
        }

        /* renamed from: a */
        public C3948a m25954a(String str) {
            this.f15233b = str;
            return this;
        }

        /* renamed from: a */
        public C3948a m25953a(boolean z) {
            this.f15234c = z;
            return this;
        }

        /* renamed from: a */
        public DocumentContents m25957a() {
            return new DocumentContents(this.f15233b, this.f15234c, this.f15235d, this.f15232a != null ? (DocumentSection[]) this.f15232a.toArray(new DocumentSection[this.f15232a.size()]) : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DocumentContents(int i, DocumentSection[] documentSectionArr, String str, boolean z, Account account) {
        this.f15227a = i;
        this.f15228b = documentSectionArr;
        this.f15229c = str;
        this.f15230d = z;
        this.f15231e = account;
    }

    DocumentContents(String str, boolean z, Account account, DocumentSection... documentSectionArr) {
        this(1, documentSectionArr, str, z, account);
        if (documentSectionArr != null) {
            BitSet bitSet = new BitSet(C3960h.m25910a());
            for (DocumentSection documentSection : documentSectionArr) {
                int i = documentSection.f15245e;
                if (i != -1) {
                    if (bitSet.get(i)) {
                        String valueOf = String.valueOf(C3960h.m25909a(i));
                        throw new IllegalArgumentException(valueOf.length() != 0 ? "Duplicate global search section type ".concat(valueOf) : new String("Duplicate global search section type "));
                    }
                    bitSet.set(i);
                }
            }
        }
    }

    /* renamed from: a */
    public DocumentSection[] m25958a() {
        return this.f15228b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof DocumentContents) {
            DocumentContents documentContents = (DocumentContents) obj;
            return C4585c.m23634a(this.f15229c, documentContents.f15229c) && C4585c.m23634a(Boolean.valueOf(this.f15230d), Boolean.valueOf(documentContents.f15230d)) && C4585c.m23634a(this.f15231e, documentContents.f15231e) && Arrays.equals(m25958a(), documentContents.m25958a());
        }
        return false;
    }

    public int hashCode() {
        return C4585c.m23633a(this.f15229c, Boolean.valueOf(this.f15230d), this.f15231e, Integer.valueOf(Arrays.hashCode(this.f15228b)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3954b c3954b = CREATOR;
        C3954b.m25926a(this, parcel, i);
    }
}
