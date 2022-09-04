package com.google.android.gms.games.multiplayer;

import com.google.android.gms.games.Player;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.games.multiplayer.i */
/* loaded from: classes2.dex */
public final class C5947i {
    private C5947i() {
    }

    /* renamed from: a */
    public static String m19445a(ArrayList<Participant> arrayList, String str) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Participant participant = arrayList.get(i);
            Player mo19471k = participant.mo19471k();
            if (mo19471k != null && mo19471k.mo20734c().equals(str)) {
                return participant.mo19472j();
            }
        }
        return null;
    }
}
