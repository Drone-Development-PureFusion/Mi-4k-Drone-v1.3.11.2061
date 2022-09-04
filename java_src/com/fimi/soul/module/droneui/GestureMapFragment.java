package com.fimi.soul.module.droneui;

import android.gesture.GestureOverlayView;
import android.graphics.Point;
import android.os.Bundle;
import android.support.p001v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.utils.C3098ar;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class GestureMapFragment extends Fragment implements GestureOverlayView.OnGestureListener {

    /* renamed from: a */
    private static final int f9453a = 15;

    /* renamed from: b */
    private static final int f9454b = 2;

    /* renamed from: c */
    private double f9455c;

    /* renamed from: d */
    private GestureOverlayView f9456d;

    /* renamed from: e */
    private AbstractC2740a f9457e;

    /* renamed from: com.fimi.soul.module.droneui.GestureMapFragment$a */
    /* loaded from: classes.dex */
    public interface AbstractC2740a {
        /* renamed from: a */
        void m30449a(List<Point> list);
    }

    /* renamed from: a */
    private int m30456a(double d) {
        return (int) Math.round(getResources().getDisplayMetrics().density * d);
    }

    /* renamed from: a */
    private void m30453a(List<Point> list) {
        float[] fArr = this.f9456d.getGesture().getStrokes().get(0).points;
        for (int i = 0; i < fArr.length; i += 2) {
            list.add(new Point((int) fArr[i], (int) fArr[i + 1]));
        }
    }

    /* renamed from: d */
    private List<Point> m30450d() {
        ArrayList arrayList = new ArrayList();
        m30453a(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    public void m30457a() {
        this.f9456d.setEnabled(true);
    }

    /* renamed from: a */
    public void m30455a(GestureOverlayView gestureOverlayView) {
        this.f9456d = gestureOverlayView;
    }

    /* renamed from: a */
    public void m30454a(AbstractC2740a abstractC2740a) {
        this.f9457e = abstractC2740a;
    }

    /* renamed from: b */
    public void m30452b() {
        this.f9456d.setEnabled(false);
    }

    /* renamed from: c */
    public GestureOverlayView m30451c() {
        return this.f9456d;
    }

    @Override // android.support.p001v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1704R.layout.fragment_gesture_map, viewGroup, false);
        this.f9456d = (GestureOverlayView) inflate.findViewById(C1704R.C1706id.overlay1);
        this.f9456d.addOnGestureListener(this);
        this.f9456d.setEnabled(false);
        this.f9456d.setGestureStrokeWidth(m30456a(2.0d));
        this.f9455c = m30456a(15.0d);
        return inflate;
    }

    @Override // android.gesture.GestureOverlayView.OnGestureListener
    public void onGesture(GestureOverlayView gestureOverlayView, MotionEvent motionEvent) {
    }

    @Override // android.gesture.GestureOverlayView.OnGestureListener
    public void onGestureCancelled(GestureOverlayView gestureOverlayView, MotionEvent motionEvent) {
    }

    @Override // android.gesture.GestureOverlayView.OnGestureListener
    public void onGestureEnded(GestureOverlayView gestureOverlayView, MotionEvent motionEvent) {
        this.f9456d.setEnabled(false);
        List<Point> m30450d = m30450d();
        if (m30450d.size() > 1) {
            m30450d = C3098ar.m29279a(m30450d, this.f9455c);
        }
        this.f9457e.m30449a(m30450d);
    }

    @Override // android.gesture.GestureOverlayView.OnGestureListener
    public void onGestureStarted(GestureOverlayView gestureOverlayView, MotionEvent motionEvent) {
    }
}
