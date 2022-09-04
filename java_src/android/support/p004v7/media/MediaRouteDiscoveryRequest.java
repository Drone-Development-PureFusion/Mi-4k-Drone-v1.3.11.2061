package android.support.p004v7.media;

import android.os.Bundle;
/* renamed from: android.support.v7.media.MediaRouteDiscoveryRequest */
/* loaded from: classes.dex */
public final class MediaRouteDiscoveryRequest {
    private static final String KEY_ACTIVE_SCAN = "activeScan";
    private static final String KEY_SELECTOR = "selector";
    private final Bundle mBundle;
    private MediaRouteSelector mSelector;

    private MediaRouteDiscoveryRequest(Bundle bundle) {
        this.mBundle = bundle;
    }

    public MediaRouteDiscoveryRequest(MediaRouteSelector mediaRouteSelector, boolean z) {
        if (mediaRouteSelector == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        this.mBundle = new Bundle();
        this.mSelector = mediaRouteSelector;
        this.mBundle.putBundle(KEY_SELECTOR, mediaRouteSelector.asBundle());
        this.mBundle.putBoolean(KEY_ACTIVE_SCAN, z);
    }

    private void ensureSelector() {
        if (this.mSelector == null) {
            this.mSelector = MediaRouteSelector.fromBundle(this.mBundle.getBundle(KEY_SELECTOR));
            if (this.mSelector != null) {
                return;
            }
            this.mSelector = MediaRouteSelector.EMPTY;
        }
    }

    public static MediaRouteDiscoveryRequest fromBundle(Bundle bundle) {
        if (bundle != null) {
            return new MediaRouteDiscoveryRequest(bundle);
        }
        return null;
    }

    public Bundle asBundle() {
        return this.mBundle;
    }

    public boolean equals(Object obj) {
        if (obj instanceof MediaRouteDiscoveryRequest) {
            MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest = (MediaRouteDiscoveryRequest) obj;
            return getSelector().equals(mediaRouteDiscoveryRequest.getSelector()) && isActiveScan() == mediaRouteDiscoveryRequest.isActiveScan();
        }
        return false;
    }

    public MediaRouteSelector getSelector() {
        ensureSelector();
        return this.mSelector;
    }

    public int hashCode() {
        return (isActiveScan() ? 1 : 0) ^ getSelector().hashCode();
    }

    public boolean isActiveScan() {
        return this.mBundle.getBoolean(KEY_ACTIVE_SCAN);
    }

    public boolean isValid() {
        ensureSelector();
        return this.mSelector.isValid();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DiscoveryRequest{ selector=").append(getSelector());
        sb.append(", activeScan=").append(isActiveScan());
        sb.append(", isValid=").append(isValid());
        sb.append(" }");
        return sb.toString();
    }
}
