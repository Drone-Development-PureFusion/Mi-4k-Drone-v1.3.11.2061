package android.support.p004v7.media;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.p004v7.media.MediaRouteProvider;
import android.support.p004v7.media.MediaRouteSelector;
import android.support.p004v7.media.MediaRouter;
import android.util.Log;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* renamed from: android.support.v7.media.MediaRouteProviderService */
/* loaded from: classes.dex */
public abstract class MediaRouteProviderService extends Service {
    private static final int PRIVATE_MSG_CLIENT_DIED = 1;
    public static final String SERVICE_INTERFACE = "android.media.MediaRouteProviderService";
    private MediaRouteDiscoveryRequest mCompositeDiscoveryRequest;
    private MediaRouteProvider mProvider;
    private static final String TAG = "MediaRouteProviderSrv";
    private static final boolean DEBUG = Log.isLoggable(TAG, 3);
    private final ArrayList<ClientRecord> mClients = new ArrayList<>();
    private final ReceiveHandler mReceiveHandler = new ReceiveHandler(this);
    private final Messenger mReceiveMessenger = new Messenger(this.mReceiveHandler);
    private final PrivateHandler mPrivateHandler = new PrivateHandler();
    private final ProviderCallback mProviderCallback = new ProviderCallback();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.media.MediaRouteProviderService$ClientRecord */
    /* loaded from: classes.dex */
    public final class ClientRecord implements IBinder.DeathRecipient {
        private final SparseArray<MediaRouteProvider.RouteController> mControllers = new SparseArray<>();
        public MediaRouteDiscoveryRequest mDiscoveryRequest;
        public final Messenger mMessenger;
        public final int mVersion;

        public ClientRecord(Messenger messenger, int i) {
            this.mMessenger = messenger;
            this.mVersion = i;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            MediaRouteProviderService.this.mPrivateHandler.obtainMessage(1, this.mMessenger).sendToTarget();
        }

        public boolean createRouteController(String str, int i) {
            MediaRouteProvider.RouteController onCreateRouteController;
            if (this.mControllers.indexOfKey(i) >= 0 || (onCreateRouteController = MediaRouteProviderService.this.mProvider.onCreateRouteController(str)) == null) {
                return false;
            }
            this.mControllers.put(i, onCreateRouteController);
            return true;
        }

        public void dispose() {
            int size = this.mControllers.size();
            for (int i = 0; i < size; i++) {
                this.mControllers.valueAt(i).onRelease();
            }
            this.mControllers.clear();
            this.mMessenger.getBinder().unlinkToDeath(this, 0);
            setDiscoveryRequest(null);
        }

        public MediaRouteProvider.RouteController getRouteController(int i) {
            return this.mControllers.get(i);
        }

        public boolean hasMessenger(Messenger messenger) {
            return this.mMessenger.getBinder() == messenger.getBinder();
        }

        public boolean register() {
            try {
                this.mMessenger.getBinder().linkToDeath(this, 0);
                return true;
            } catch (RemoteException e) {
                binderDied();
                return false;
            }
        }

        public boolean releaseRouteController(int i) {
            MediaRouteProvider.RouteController routeController = this.mControllers.get(i);
            if (routeController != null) {
                this.mControllers.remove(i);
                routeController.onRelease();
                return true;
            }
            return false;
        }

        public boolean setDiscoveryRequest(MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest) {
            if (this.mDiscoveryRequest == mediaRouteDiscoveryRequest || (this.mDiscoveryRequest != null && this.mDiscoveryRequest.equals(mediaRouteDiscoveryRequest))) {
                return false;
            }
            this.mDiscoveryRequest = mediaRouteDiscoveryRequest;
            return MediaRouteProviderService.this.updateCompositeDiscoveryRequest();
        }

        public String toString() {
            return MediaRouteProviderService.getClientId(this.mMessenger);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.media.MediaRouteProviderService$PrivateHandler */
    /* loaded from: classes.dex */
    public final class PrivateHandler extends Handler {
        private PrivateHandler() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    MediaRouteProviderService.this.onBinderDied((Messenger) message.obj);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: android.support.v7.media.MediaRouteProviderService$ProviderCallback */
    /* loaded from: classes.dex */
    private final class ProviderCallback extends MediaRouteProvider.Callback {
        private ProviderCallback() {
        }

        @Override // android.support.p004v7.media.MediaRouteProvider.Callback
        public void onDescriptorChanged(MediaRouteProvider mediaRouteProvider, MediaRouteProviderDescriptor mediaRouteProviderDescriptor) {
            MediaRouteProviderService.this.sendDescriptorChanged(mediaRouteProviderDescriptor);
        }
    }

    /* renamed from: android.support.v7.media.MediaRouteProviderService$ReceiveHandler */
    /* loaded from: classes.dex */
    private static final class ReceiveHandler extends Handler {
        private final WeakReference<MediaRouteProviderService> mServiceRef;

        public ReceiveHandler(MediaRouteProviderService mediaRouteProviderService) {
            this.mServiceRef = new WeakReference<>(mediaRouteProviderService);
        }

        private boolean processMessage(int i, Messenger messenger, int i2, int i3, Object obj, Bundle bundle) {
            int i4 = 0;
            MediaRouteProviderService mediaRouteProviderService = this.mServiceRef.get();
            if (mediaRouteProviderService != null) {
                switch (i) {
                    case 1:
                        return mediaRouteProviderService.onRegisterClient(messenger, i2, i3);
                    case 2:
                        return mediaRouteProviderService.onUnregisterClient(messenger, i2);
                    case 3:
                        String string = bundle.getString(MediaRouteProviderProtocol.CLIENT_DATA_ROUTE_ID);
                        if (string == null) {
                            return false;
                        }
                        return mediaRouteProviderService.onCreateRouteController(messenger, i2, i3, string);
                    case 4:
                        return mediaRouteProviderService.onReleaseRouteController(messenger, i2, i3);
                    case 5:
                        return mediaRouteProviderService.onSelectRoute(messenger, i2, i3);
                    case 6:
                        if (bundle != null) {
                            i4 = bundle.getInt(MediaRouteProviderProtocol.CLIENT_DATA_UNSELECT_REASON, 0);
                        }
                        return mediaRouteProviderService.onUnselectRoute(messenger, i2, i3, i4);
                    case 7:
                        int i5 = bundle.getInt(MediaRouteProviderProtocol.CLIENT_DATA_VOLUME, -1);
                        if (i5 < 0) {
                            return false;
                        }
                        return mediaRouteProviderService.onSetRouteVolume(messenger, i2, i3, i5);
                    case 8:
                        int i6 = bundle.getInt(MediaRouteProviderProtocol.CLIENT_DATA_VOLUME, 0);
                        if (i6 == 0) {
                            return false;
                        }
                        return mediaRouteProviderService.onUpdateRouteVolume(messenger, i2, i3, i6);
                    case 9:
                        if (!(obj instanceof Intent)) {
                            return false;
                        }
                        return mediaRouteProviderService.onRouteControlRequest(messenger, i2, i3, (Intent) obj);
                    case 10:
                        if (obj != null && !(obj instanceof Bundle)) {
                            return false;
                        }
                        MediaRouteDiscoveryRequest fromBundle = MediaRouteDiscoveryRequest.fromBundle((Bundle) obj);
                        if (fromBundle == null || !fromBundle.isValid()) {
                            fromBundle = null;
                        }
                        return mediaRouteProviderService.onSetDiscoveryRequest(messenger, i2, fromBundle);
                    default:
                        return false;
                }
            }
            return false;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Messenger messenger = message.replyTo;
            if (!MediaRouteProviderProtocol.isValidRemoteMessenger(messenger)) {
                if (!MediaRouteProviderService.DEBUG) {
                    return;
                }
                Log.d(MediaRouteProviderService.TAG, "Ignoring message without valid reply messenger.");
                return;
            }
            int i = message.what;
            int i2 = message.arg1;
            int i3 = message.arg2;
            Object obj = message.obj;
            Bundle peekData = message.peekData();
            if (processMessage(i, messenger, i2, i3, obj, peekData)) {
                return;
            }
            if (MediaRouteProviderService.DEBUG) {
                Log.d(MediaRouteProviderService.TAG, MediaRouteProviderService.getClientId(messenger) + ": Message failed, what=" + i + ", requestId=" + i2 + ", arg=" + i3 + ", obj=" + obj + ", data=" + peekData);
            }
            MediaRouteProviderService.sendGenericFailure(messenger, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int findClient(Messenger messenger) {
        int size = this.mClients.size();
        for (int i = 0; i < size; i++) {
            if (this.mClients.get(i).hasMessenger(messenger)) {
                return i;
            }
        }
        return -1;
    }

    private ClientRecord getClient(Messenger messenger) {
        int findClient = findClient(messenger);
        if (findClient >= 0) {
            return this.mClients.get(findClient);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getClientId(Messenger messenger) {
        return "Client connection " + messenger.getBinder().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onBinderDied(Messenger messenger) {
        int findClient = findClient(messenger);
        if (findClient >= 0) {
            ClientRecord remove = this.mClients.remove(findClient);
            if (DEBUG) {
                Log.d(TAG, remove + ": Binder died");
            }
            remove.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onCreateRouteController(Messenger messenger, int i, int i2, String str) {
        ClientRecord client = getClient(messenger);
        if (client == null || !client.createRouteController(str, i2)) {
            return false;
        }
        if (DEBUG) {
            Log.d(TAG, client + ": Route controller created, controllerId=" + i2 + ", routeId=" + str);
        }
        sendGenericSuccess(messenger, i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onRegisterClient(Messenger messenger, int i, int i2) {
        if (i2 >= 1 && findClient(messenger) < 0) {
            ClientRecord clientRecord = new ClientRecord(messenger, i2);
            if (clientRecord.register()) {
                this.mClients.add(clientRecord);
                if (DEBUG) {
                    Log.d(TAG, clientRecord + ": Registered, version=" + i2);
                }
                if (i == 0) {
                    return true;
                }
                MediaRouteProviderDescriptor descriptor = this.mProvider.getDescriptor();
                sendReply(messenger, 2, i, 1, descriptor != null ? descriptor.asBundle() : null, null);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onReleaseRouteController(Messenger messenger, int i, int i2) {
        ClientRecord client = getClient(messenger);
        if (client == null || !client.releaseRouteController(i2)) {
            return false;
        }
        if (DEBUG) {
            Log.d(TAG, client + ": Route controller released, controllerId=" + i2);
        }
        sendGenericSuccess(messenger, i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onRouteControlRequest(final Messenger messenger, final int i, final int i2, final Intent intent) {
        MediaRouteProvider.RouteController routeController;
        final ClientRecord client = getClient(messenger);
        if (client != null && (routeController = client.getRouteController(i2)) != null) {
            MediaRouter.ControlRequestCallback controlRequestCallback = null;
            if (i != 0) {
                controlRequestCallback = new MediaRouter.ControlRequestCallback() { // from class: android.support.v7.media.MediaRouteProviderService.1
                    @Override // android.support.p004v7.media.MediaRouter.ControlRequestCallback
                    public void onError(String str, Bundle bundle) {
                        if (MediaRouteProviderService.DEBUG) {
                            Log.d(MediaRouteProviderService.TAG, client + ": Route control request failed, controllerId=" + i2 + ", intent=" + intent + ", error=" + str + ", data=" + bundle);
                        }
                        if (MediaRouteProviderService.this.findClient(messenger) >= 0) {
                            if (str == null) {
                                MediaRouteProviderService.sendReply(messenger, 4, i, 0, bundle, null);
                                return;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("error", str);
                            MediaRouteProviderService.sendReply(messenger, 4, i, 0, bundle, bundle2);
                        }
                    }

                    @Override // android.support.p004v7.media.MediaRouter.ControlRequestCallback
                    public void onResult(Bundle bundle) {
                        if (MediaRouteProviderService.DEBUG) {
                            Log.d(MediaRouteProviderService.TAG, client + ": Route control request succeeded, controllerId=" + i2 + ", intent=" + intent + ", data=" + bundle);
                        }
                        if (MediaRouteProviderService.this.findClient(messenger) >= 0) {
                            MediaRouteProviderService.sendReply(messenger, 3, i, 0, bundle, null);
                        }
                    }
                };
            }
            if (routeController.onControlRequest(intent, controlRequestCallback)) {
                if (DEBUG) {
                    Log.d(TAG, client + ": Route control request delivered, controllerId=" + i2 + ", intent=" + intent);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onSelectRoute(Messenger messenger, int i, int i2) {
        MediaRouteProvider.RouteController routeController;
        ClientRecord client = getClient(messenger);
        if (client == null || (routeController = client.getRouteController(i2)) == null) {
            return false;
        }
        routeController.onSelect();
        if (DEBUG) {
            Log.d(TAG, client + ": Route selected, controllerId=" + i2);
        }
        sendGenericSuccess(messenger, i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onSetDiscoveryRequest(Messenger messenger, int i, MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest) {
        ClientRecord client = getClient(messenger);
        if (client != null) {
            boolean discoveryRequest = client.setDiscoveryRequest(mediaRouteDiscoveryRequest);
            if (DEBUG) {
                Log.d(TAG, client + ": Set discovery request, request=" + mediaRouteDiscoveryRequest + ", actuallyChanged=" + discoveryRequest + ", compositeDiscoveryRequest=" + this.mCompositeDiscoveryRequest);
            }
            sendGenericSuccess(messenger, i);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onSetRouteVolume(Messenger messenger, int i, int i2, int i3) {
        MediaRouteProvider.RouteController routeController;
        ClientRecord client = getClient(messenger);
        if (client == null || (routeController = client.getRouteController(i2)) == null) {
            return false;
        }
        routeController.onSetVolume(i3);
        if (DEBUG) {
            Log.d(TAG, client + ": Route volume changed, controllerId=" + i2 + ", volume=" + i3);
        }
        sendGenericSuccess(messenger, i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onUnregisterClient(Messenger messenger, int i) {
        int findClient = findClient(messenger);
        if (findClient >= 0) {
            ClientRecord remove = this.mClients.remove(findClient);
            if (DEBUG) {
                Log.d(TAG, remove + ": Unregistered");
            }
            remove.dispose();
            sendGenericSuccess(messenger, i);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onUnselectRoute(Messenger messenger, int i, int i2, int i3) {
        MediaRouteProvider.RouteController routeController;
        ClientRecord client = getClient(messenger);
        if (client == null || (routeController = client.getRouteController(i2)) == null) {
            return false;
        }
        routeController.onUnselect(i3);
        if (DEBUG) {
            Log.d(TAG, client + ": Route unselected, controllerId=" + i2);
        }
        sendGenericSuccess(messenger, i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onUpdateRouteVolume(Messenger messenger, int i, int i2, int i3) {
        MediaRouteProvider.RouteController routeController;
        ClientRecord client = getClient(messenger);
        if (client == null || (routeController = client.getRouteController(i2)) == null) {
            return false;
        }
        routeController.onUpdateVolume(i3);
        if (DEBUG) {
            Log.d(TAG, client + ": Route volume updated, controllerId=" + i2 + ", delta=" + i3);
        }
        sendGenericSuccess(messenger, i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendDescriptorChanged(MediaRouteProviderDescriptor mediaRouteProviderDescriptor) {
        Bundle asBundle = mediaRouteProviderDescriptor != null ? mediaRouteProviderDescriptor.asBundle() : null;
        int size = this.mClients.size();
        for (int i = 0; i < size; i++) {
            ClientRecord clientRecord = this.mClients.get(i);
            sendReply(clientRecord.mMessenger, 5, 0, 0, asBundle, null);
            if (DEBUG) {
                Log.d(TAG, clientRecord + ": Sent descriptor change event, descriptor=" + mediaRouteProviderDescriptor);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sendGenericFailure(Messenger messenger, int i) {
        if (i != 0) {
            sendReply(messenger, 0, i, 0, null, null);
        }
    }

    private static void sendGenericSuccess(Messenger messenger, int i) {
        if (i != 0) {
            sendReply(messenger, 1, i, 0, null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sendReply(Messenger messenger, int i, int i2, int i3, Object obj, Bundle bundle) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = i2;
        obtain.arg2 = i3;
        obtain.obj = obj;
        obtain.setData(bundle);
        try {
            messenger.send(obtain);
        } catch (DeadObjectException e) {
        } catch (RemoteException e2) {
            Log.e(TAG, "Could not send message to " + getClientId(messenger), e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean updateCompositeDiscoveryRequest() {
        boolean z;
        MediaRouteSelector.Builder builder;
        MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest;
        MediaRouteSelector.Builder builder2 = null;
        int size = this.mClients.size();
        int i = 0;
        boolean z2 = false;
        MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest2 = null;
        while (i < size) {
            MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest3 = this.mClients.get(i).mDiscoveryRequest;
            if (mediaRouteDiscoveryRequest3 == null || (mediaRouteDiscoveryRequest3.getSelector().isEmpty() && !mediaRouteDiscoveryRequest3.isActiveScan())) {
                z = z2;
                builder = builder2;
                mediaRouteDiscoveryRequest = mediaRouteDiscoveryRequest2;
            } else {
                z = mediaRouteDiscoveryRequest3.isActiveScan() | z2;
                if (mediaRouteDiscoveryRequest2 == null) {
                    builder = builder2;
                    mediaRouteDiscoveryRequest = mediaRouteDiscoveryRequest3;
                } else {
                    builder = builder2 == null ? new MediaRouteSelector.Builder(mediaRouteDiscoveryRequest2.getSelector()) : builder2;
                    builder.addSelector(mediaRouteDiscoveryRequest3.getSelector());
                    mediaRouteDiscoveryRequest = mediaRouteDiscoveryRequest2;
                }
            }
            i++;
            mediaRouteDiscoveryRequest2 = mediaRouteDiscoveryRequest;
            builder2 = builder;
            z2 = z;
        }
        if (builder2 != null) {
            mediaRouteDiscoveryRequest2 = new MediaRouteDiscoveryRequest(builder2.build(), z2);
        }
        if (this.mCompositeDiscoveryRequest == mediaRouteDiscoveryRequest2 || (this.mCompositeDiscoveryRequest != null && this.mCompositeDiscoveryRequest.equals(mediaRouteDiscoveryRequest2))) {
            return false;
        }
        this.mCompositeDiscoveryRequest = mediaRouteDiscoveryRequest2;
        this.mProvider.setDiscoveryRequest(mediaRouteDiscoveryRequest2);
        return true;
    }

    public MediaRouteProvider getMediaRouteProvider() {
        return this.mProvider;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        MediaRouteProvider onCreateMediaRouteProvider;
        if (intent.getAction().equals("android.media.MediaRouteProviderService")) {
            if (this.mProvider == null && (onCreateMediaRouteProvider = onCreateMediaRouteProvider()) != null) {
                String packageName = onCreateMediaRouteProvider.getMetadata().getPackageName();
                if (!packageName.equals(getPackageName())) {
                    throw new IllegalStateException("onCreateMediaRouteProvider() returned a provider whose package name does not match the package name of the service.  A media route provider service can only export its own media route providers.  Provider package name: " + packageName + ".  Service package name: " + getPackageName() + ".");
                }
                this.mProvider = onCreateMediaRouteProvider;
                this.mProvider.setCallback(this.mProviderCallback);
            }
            if (this.mProvider != null) {
                return this.mReceiveMessenger.getBinder();
            }
        }
        return null;
    }

    public abstract MediaRouteProvider onCreateMediaRouteProvider();

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        if (this.mProvider != null) {
            this.mProvider.setCallback(null);
        }
        return super.onUnbind(intent);
    }
}
