package android.support.p004v7.widget;

import android.graphics.Outline;
import android.support.annotation.NonNull;
/* renamed from: android.support.v7.widget.ActionBarBackgroundDrawableV21 */
/* loaded from: classes.dex */
class ActionBarBackgroundDrawableV21 extends ActionBarBackgroundDrawable {
    public ActionBarBackgroundDrawableV21(ActionBarContainer actionBarContainer) {
        super(actionBarContainer);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@NonNull Outline outline) {
        if (this.mContainer.mIsSplit) {
            if (this.mContainer.mSplitBackground == null) {
                return;
            }
            this.mContainer.mSplitBackground.getOutline(outline);
        } else if (this.mContainer.mBackground == null) {
        } else {
            this.mContainer.mBackground.getOutline(outline);
        }
    }
}
