package com.mob.commons.authorize;

import android.content.Context;
import com.mob.commons.C10054a;
import com.mob.commons.C10075e;
/* loaded from: classes2.dex */
public final class DeviceAuthorizer {
    public static synchronized String authorize(Context context, com.mob.commons.MobProduct mobProduct) {
        String m6345a;
        synchronized (DeviceAuthorizer.class) {
            C10075e.m6262a(mobProduct);
            C10057a c10057a = new C10057a();
            m6345a = (mobProduct == null || !C10054a.m6360h(context)) ? c10057a.m6345a(context) : c10057a.m6344a(context, mobProduct);
        }
        return m6345a;
    }

    public static String authorize(Context context, final MobProduct mobProduct) {
        return authorize(context, new com.mob.commons.MobProduct() { // from class: com.mob.commons.authorize.DeviceAuthorizer.1
            @Override // com.mob.commons.MobProduct
            public String getProductAppkey() {
                return MobProduct.this.getProductAppkey();
            }

            @Override // com.mob.commons.MobProduct
            public String getProductTag() {
                return MobProduct.this.getProductTag();
            }

            @Override // com.mob.commons.MobProduct
            public int getSdkver() {
                return MobProduct.this.getSdkver();
            }
        });
    }
}
