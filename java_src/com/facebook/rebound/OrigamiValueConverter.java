package com.facebook.rebound;

import com.google.firebase.p253b.C9755a;
/* loaded from: classes.dex */
public class OrigamiValueConverter {
    public static double frictionFromOrigamiValue(double d) {
        return d == C9755a.f30449c ? C9755a.f30449c : ((d - 8.0d) * 3.0d) + 25.0d;
    }

    public static double origamiValueFromFriction(double d) {
        return d == C9755a.f30449c ? C9755a.f30449c : ((d - 25.0d) / 3.0d) + 8.0d;
    }

    public static double origamiValueFromTension(double d) {
        return d == C9755a.f30449c ? C9755a.f30449c : ((d - 194.0d) / 3.62d) + 30.0d;
    }

    public static double tensionFromOrigamiValue(double d) {
        return d == C9755a.f30449c ? C9755a.f30449c : ((d - 30.0d) * 3.62d) + 194.0d;
    }
}
