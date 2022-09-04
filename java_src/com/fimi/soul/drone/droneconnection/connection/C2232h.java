package com.fimi.soul.drone.droneconnection.connection;

import android.content.Context;
import com.fimi.soul.drone.droneconnection.connection.p198a.C2203a;
import com.fimi.soul.drone.droneconnection.connection.p199b.C2208a;
import com.fimi.soul.drone.droneconnection.connection.p200c.C2218b;
import com.fimi.soul.drone.p204h.C2279c;
/* renamed from: com.fimi.soul.drone.droneconnection.connection.h */
/* loaded from: classes.dex */
public class C2232h {

    /* renamed from: com.fimi.soul.drone.droneconnection.connection.h$a */
    /* loaded from: classes.dex */
    public enum EnumC2234a {
        USB(1) { // from class: com.fimi.soul.drone.droneconnection.connection.h.a.1
            @Override // com.fimi.soul.drone.droneconnection.connection.C2232h.EnumC2234a
            /* renamed from: b */
            public C2218b mo32605a(Context context) {
                return new C2218b(context);
            }
        },
        TCP(3) { // from class: com.fimi.soul.drone.droneconnection.connection.h.a.2
            @Override // com.fimi.soul.drone.droneconnection.connection.C2232h.EnumC2234a
            /* renamed from: b */
            public C2208a mo32605a(Context context) {
                return new C2208a(context);
            }
        };
        

        /* renamed from: c */
        private final int f7051c;

        EnumC2234a(int i) {
            this.f7051c = i;
            if (i == 3) {
                C2203a.m32716a(C2279c.f7267d);
            } else if (i != 1) {
            } else {
                C2203a.m32716a(C2279c.f7266c);
            }
        }

        /* renamed from: a */
        public int m32607a() {
            return this.f7051c;
        }

        /* renamed from: a */
        public abstract AbstractC2202a mo32605a(Context context);
    }
}
