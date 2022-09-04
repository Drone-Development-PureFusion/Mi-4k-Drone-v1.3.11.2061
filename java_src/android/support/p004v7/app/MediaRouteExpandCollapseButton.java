package android.support.p004v7.app;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.support.p001v4.content.ContextCompat;
import android.support.p004v7.mediarouter.C0203R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
/* renamed from: android.support.v7.app.MediaRouteExpandCollapseButton */
/* loaded from: classes.dex */
class MediaRouteExpandCollapseButton extends ImageButton {
    private final AnimationDrawable mCollapseAnimationDrawable;
    private final String mCollapseGroupDescription;
    private final AnimationDrawable mExpandAnimationDrawable;
    private final String mExpandGroupDescription;
    private boolean mIsGroupExpanded;
    private View.OnClickListener mListener;

    public MediaRouteExpandCollapseButton(Context context) {
        this(context, null);
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mExpandAnimationDrawable = (AnimationDrawable) ContextCompat.getDrawable(context, C0203R.C0204drawable.ic_expand);
        this.mCollapseAnimationDrawable = (AnimationDrawable) ContextCompat.getDrawable(context, C0203R.C0204drawable.ic_collapse);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(MediaRouterThemeHelper.getControllerColor(context, i), PorterDuff.Mode.SRC_IN);
        this.mExpandAnimationDrawable.setColorFilter(porterDuffColorFilter);
        this.mCollapseAnimationDrawable.setColorFilter(porterDuffColorFilter);
        this.mExpandGroupDescription = context.getString(C0203R.C0206string.mr_controller_expand_group);
        this.mCollapseGroupDescription = context.getString(C0203R.C0206string.mr_controller_collapse_group);
        setImageDrawable(this.mExpandAnimationDrawable.getFrame(0));
        setContentDescription(this.mExpandGroupDescription);
        super.setOnClickListener(new View.OnClickListener() { // from class: android.support.v7.app.MediaRouteExpandCollapseButton.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MediaRouteExpandCollapseButton.this.mIsGroupExpanded = !MediaRouteExpandCollapseButton.this.mIsGroupExpanded;
                if (MediaRouteExpandCollapseButton.this.mIsGroupExpanded) {
                    MediaRouteExpandCollapseButton.this.setImageDrawable(MediaRouteExpandCollapseButton.this.mExpandAnimationDrawable);
                    MediaRouteExpandCollapseButton.this.mExpandAnimationDrawable.start();
                    MediaRouteExpandCollapseButton.this.setContentDescription(MediaRouteExpandCollapseButton.this.mCollapseGroupDescription);
                } else {
                    MediaRouteExpandCollapseButton.this.setImageDrawable(MediaRouteExpandCollapseButton.this.mCollapseAnimationDrawable);
                    MediaRouteExpandCollapseButton.this.mCollapseAnimationDrawable.start();
                    MediaRouteExpandCollapseButton.this.setContentDescription(MediaRouteExpandCollapseButton.this.mExpandGroupDescription);
                }
                if (MediaRouteExpandCollapseButton.this.mListener != null) {
                    MediaRouteExpandCollapseButton.this.mListener.onClick(view);
                }
            }
        });
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.mListener = onClickListener;
    }
}
