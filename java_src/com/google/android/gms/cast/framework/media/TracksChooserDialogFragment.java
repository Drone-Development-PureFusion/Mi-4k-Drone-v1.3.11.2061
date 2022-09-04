package com.google.android.gms.cast.framework.media;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.p001v4.app.DialogFragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TextView;
import com.google.android.gms.C3424R;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.framework.C4251c;
import com.google.android.gms.cast.framework.C4253d;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class TracksChooserDialogFragment extends DialogFragment {

    /* renamed from: a */
    private List<MediaTrack> f16307a;

    /* renamed from: b */
    private List<MediaTrack> f16308b;

    /* renamed from: c */
    private long[] f16309c;

    /* renamed from: d */
    private Dialog f16310d;

    /* renamed from: a */
    private static int m24636a(List<MediaTrack> list, long[] jArr, int i) {
        if (jArr == null || list == null) {
            return i;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            for (long j : jArr) {
                if (j == list.get(i2).m25033b()) {
                    return i2;
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    private MediaTrack m24644a() {
        return new MediaTrack.C4200a(-1L, 1).m25014c(getActivity().getString(C3424R.C3427string.cast_tracks_chooser_dialog_none)).m25019a(2).m25018a("").m25020a();
    }

    /* renamed from: a */
    public static TracksChooserDialogFragment m24642a(MediaInfo mediaInfo, long[] jArr) {
        List<MediaTrack> m25137g;
        if (mediaInfo == null || (m25137g = mediaInfo.m25137g()) == null) {
            return null;
        }
        ArrayList<MediaTrack> m24637a = m24637a(m25137g, 2);
        ArrayList<MediaTrack> m24637a2 = m24637a(m25137g, 1);
        if (m24637a.isEmpty() && m24637a2.isEmpty()) {
            return null;
        }
        TracksChooserDialogFragment tracksChooserDialogFragment = new TracksChooserDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("extra_tracks_type_audio", m24637a);
        bundle.putParcelableArrayList("extra_tracks_type_text", m24637a2);
        bundle.putLongArray("extra_active_track_ids", jArr);
        tracksChooserDialogFragment.setArguments(bundle);
        return tracksChooserDialogFragment;
    }

    @NonNull
    /* renamed from: a */
    private static ArrayList<MediaTrack> m24637a(List<MediaTrack> list, int i) {
        ArrayList<MediaTrack> arrayList = new ArrayList<>();
        if (list != null) {
            for (MediaTrack mediaTrack : list) {
                if (mediaTrack.m25030c() == i) {
                    arrayList.add(mediaTrack);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m24643a(View view, View$OnClickListenerC4342h view$OnClickListenerC4342h, View$OnClickListenerC4342h view$OnClickListenerC4342h2) {
        ListView listView = (ListView) view.findViewById(C3424R.C3426id.text_list_view);
        ListView listView2 = (ListView) view.findViewById(C3424R.C3426id.audio_list_view);
        TextView textView = (TextView) view.findViewById(C3424R.C3426id.text_empty_message);
        TextView textView2 = (TextView) view.findViewById(C3424R.C3426id.audio_empty_message);
        listView.setAdapter((ListAdapter) view$OnClickListenerC4342h);
        listView2.setAdapter((ListAdapter) view$OnClickListenerC4342h2);
        TabHost tabHost = (TabHost) view.findViewById(C3424R.C3426id.tab_host);
        tabHost.setup();
        TabHost.TabSpec newTabSpec = tabHost.newTabSpec("textTab");
        if (view$OnClickListenerC4342h.getCount() == 0) {
            listView.setVisibility(4);
            newTabSpec.setContent(C3424R.C3426id.text_empty_message);
        } else {
            textView.setVisibility(4);
            newTabSpec.setContent(C3424R.C3426id.text_list_view);
        }
        newTabSpec.setIndicator(getActivity().getString(C3424R.C3427string.cast_tracks_chooser_dialog_subtitles));
        tabHost.addTab(newTabSpec);
        TabHost.TabSpec newTabSpec2 = tabHost.newTabSpec("audioTab");
        if (view$OnClickListenerC4342h2.getCount() == 0) {
            listView2.setVisibility(4);
            newTabSpec2.setContent(C3424R.C3426id.audio_empty_message);
        } else {
            textView2.setVisibility(4);
            newTabSpec2.setContent(C3424R.C3426id.audio_list_view);
        }
        newTabSpec2.setIndicator(getActivity().getString(C3424R.C3427string.cast_tracks_chooser_dialog_audio));
        tabHost.addTab(newTabSpec2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m24638a(View$OnClickListenerC4342h view$OnClickListenerC4342h, View$OnClickListenerC4342h view$OnClickListenerC4342h2) {
        C4298c m24853a;
        ArrayList arrayList = new ArrayList();
        MediaTrack m24478a = view$OnClickListenerC4342h.m24478a();
        if (m24478a.m25033b() != -1) {
            arrayList.add(m24478a);
        }
        MediaTrack m24478a2 = view$OnClickListenerC4342h2.m24478a();
        if (m24478a2 != null) {
            arrayList.add(m24478a2);
        }
        C4253d m24715b = C4251c.m24868a(getContext()).m24862b().m24715b();
        if (m24715b != null && m24715b.o() && (m24853a = m24715b.m24853a()) != null) {
            long[] jArr = new long[arrayList.size()];
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= arrayList.size()) {
                    break;
                }
                jArr[i2] = ((MediaTrack) arrayList.get(i2)).m25033b();
                i = i2 + 1;
            }
            m24853a.m24551a(jArr);
        }
        if (this.f16310d != null) {
            this.f16310d.cancel();
            this.f16310d = null;
        }
    }

    @Override // android.support.p001v4.app.DialogFragment, android.support.p001v4.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        this.f16307a = getArguments().getParcelableArrayList("extra_tracks_type_text");
        this.f16307a.add(0, m24644a());
        this.f16308b = getArguments().getParcelableArrayList("extra_tracks_type_audio");
        this.f16309c = getArguments().getLongArray("extra_active_track_ids");
    }

    @Override // android.support.p001v4.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        int m24636a = m24636a(this.f16307a, this.f16309c, 0);
        int m24636a2 = m24636a(this.f16308b, this.f16309c, -1);
        final View$OnClickListenerC4342h view$OnClickListenerC4342h = new View$OnClickListenerC4342h(getActivity(), this.f16307a, m24636a);
        final View$OnClickListenerC4342h view$OnClickListenerC4342h2 = new View$OnClickListenerC4342h(getActivity(), this.f16308b, m24636a2);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View inflate = getActivity().getLayoutInflater().inflate(C3424R.layout.cast_tracks_chooser_dialog_layout, (ViewGroup) null);
        m24643a(inflate, view$OnClickListenerC4342h, view$OnClickListenerC4342h2);
        builder.setView(inflate).setPositiveButton(getActivity().getString(C3424R.C3427string.cast_tracks_chooser_dialog_ok), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.cast.framework.media.TracksChooserDialogFragment.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                TracksChooserDialogFragment.this.m24638a(view$OnClickListenerC4342h, view$OnClickListenerC4342h2);
            }
        }).setNegativeButton(C3424R.C3427string.cast_tracks_chooser_dialog_cancel, new DialogInterface.OnClickListener() { // from class: com.google.android.gms.cast.framework.media.TracksChooserDialogFragment.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (TracksChooserDialogFragment.this.f16310d != null) {
                    TracksChooserDialogFragment.this.f16310d.cancel();
                    TracksChooserDialogFragment.this.f16310d = null;
                }
            }
        });
        if (this.f16310d != null) {
            this.f16310d.cancel();
            this.f16310d = null;
        }
        this.f16310d = builder.create();
        return this.f16310d;
    }

    @Override // android.support.p001v4.app.DialogFragment, android.support.p001v4.app.Fragment
    public void onDestroyView() {
        if (getDialog() != null && getRetainInstance()) {
            getDialog().setDismissMessage(null);
        }
        super.onDestroyView();
    }
}
