package com.fimi.soul.drone;

import com.fimi.soul.drone.p205i.p206a.EnumC2293g;
/* renamed from: com.fimi.soul.drone.d */
/* loaded from: classes.dex */
public class C2104d {

    /* renamed from: com.fimi.soul.drone.d$a */
    /* loaded from: classes.dex */
    public enum EnumC2105a {
        UPDATEDRONEREPORT,
        UPDATEDRONEORDERREPORT,
        UPDATEDRONEOBJECTREPORT,
        UPDATEDRONEFINISHREPORT,
        UPDATEDRONEFINISHREPORTCRC,
        ORIENTATION,
        BATTERY,
        IMU_INFO,
        IMU_COMPASS,
        IMU_WORKSTATE,
        GUIDEDPOINT,
        PE,
        HOME,
        GPS,
        GPS_FIX,
        BATTERYINFO,
        RECEIVERWAYPOINTS,
        UPWAYPOINT,
        FOLLOWME,
        CURRENRT,
        ASSIGNWAYPOINT,
        RETURNASSIGNWAYPOINT,
        INTERESTWAYPOINT,
        RETURNINTERESTWAYPOIT,
        ExecuteWaypoint,
        REHOME,
        RELANDING,
        RETAKEUP,
        REHOVER,
        REPAUSE,
        RERECOVERY,
        REEXIST,
        EXCESE,
        ASSINGNOTIFY,
        INTERSTNOTIFY,
        FAILSAFE,
        HEARDDAY,
        INFO,
        MISSION_UPDATE,
        STATE,
        HOMEPOINT,
        RC_IN,
        FCVERSION2,
        RECEIVEFOLLOWME,
        EXCUTEING,
        EXISTING,
        RECEIVERPOINTS,
        BACK,
        SETSTART,
        PauseWaypoint,
        ResumeWaypoint,
        ExitWaypoint,
        Pauseretrast,
        REUPDATEBUTTON,
        SENDHOVERWAYPOINT,
        FCLICK,
        HCLICK,
        NOTIFYROUTE,
        Remotecontrol,
        backControl,
        SIMULATORINFO,
        UPDATELINE,
        DROWLINE,
        LINETEXTCOLOR,
        UPDATELASTMARKER,
        CLEARMARK,
        COMPASS,
        COMPASSY1,
        COMPASSY2,
        TTT,
        CLEANALLOBJ,
        REFRESHPHONEMEDIA,
        DELLALLPHONEMEDIA,
        UPDATEALLHISTORY,
        DELLALLHISTORY,
        CLEANCACHE,
        HEARDATA,
        HINELIST,
        CLOSEPOPUWIN,
        OPENPOPUWIN,
        GIMBAL_POSITION,
        REGIMBAL_ONEKEY,
        NOFLYZONE,
        FRASH_DISTANCE_DIR,
        SHOWLIST,
        OnRecivedCloudCameraCommandInfo,
        RELAY_FRASH_DISTANCE_SET,
        DRAWLINGUNCHECK,
        DRAHMARKER,
        CONNECTSUCESS,
        CALIREMOTESUSTOMBUTTON,
        RELEASECHAIN,
        CHANGEFLIGHTHEAD,
        NOTIFYPBATTERY,
        CLOSEDRAWCONTROL,
        OPENDRAWCONTROL,
        ChangeCameraOrMap,
        RETURN_HEIGHT,
        ERROR_CODE,
        DRONEERRORACTIONCODE,
        CHANGELOCATIONBUTTONOUT,
        CHANGELOCATIONBUTTONIN,
        DRONEACTION,
        RESETRC,
        CaliCompass,
        QuitCaliRemote,
        GimbalCalibration,
        NEW_HAND_OPERATE,
        SHOWCAMPASSCALI,
        NEWREMOTEMODEL,
        SHOWHEIGHTVIEW,
        HIDEHEIGHTVALUE,
        CANCALFLYACTION,
        CLEARDATA,
        READWAYPOINT,
        RESHWAYPOINT,
        SHOWINFORWINDOW,
        NOTIDRONEFLOOR,
        NOTIDRONEAIR,
        HIDEINFORWINDOW,
        DISPLAYLIMITCIRCLE,
        HIDEDISPLAYCIRCLE,
        READFLYTO,
        NEWFRONEMODEL,
        CLOSEFLYACTIONFRAGMENT,
        SHOWQUITDOUBLEINFRWINDOW,
        CLOSEOUTTIMEPROBAR,
        SHOWOUTTIMEPROBAR,
        DELETE_WAYPOINT,
        SHOWPOIOPERA,
        CREATEPOI,
        CHANGESTARTMARKER,
        NOTIFICHANGECIECLERIDUS,
        SHOWDOUBLEPOI,
        CLEARPOIDATA,
        READPOI,
        CLOSECARMERPOI,
        DRONEINFLOOR,
        NEWHOMEPOINT,
        SHOWTAKEPHOTOFRAGMENT,
        TAKEPHOTOBACKDATA,
        QUITTAKEPHOTOFLY,
        CLEARMARKERTAKEPHOTO,
        WXCETAKEPHOTOAGAIN,
        ENTRYTAKEPHOTOMODEL,
        CHANGETAKEPHOTOMARKERCOLOR,
        CAMERARECORD,
        CLEARDATATAKEPHOTO,
        CLEARTAKEPHOTO,
        XIAOMI_INSURENCE,
        PAIR_CODE,
        EV_VALUE,
        FLY_INSKY,
        DYNAMIC_RESULT,
        PowerBatteryProgress,
        Show9Grid,
        hide9Grid,
        CHECKDYNC4KSTATE,
        CHECKDYNC4KBACKKEY,
        CHECKDYNC4KSENDSTATE,
        CKECKDRONEVERSIONSTATE,
        ImperialUnits,
        ENDQUESTNOTIFY,
        BRIGHTNESS,
        EMERGENCY,
        HOME_LEFT,
        HOME_RIGHT,
        UPDATE_FLYZONE,
        CLOSEDRAWCONTROLClose,
        GIMAL_TUNE_PARAMETER,
        SHOW_FULL_SCREEN,
        HIDE_FULL_SCREEN,
        SHOW_FULL_SCREEN_LEAD,
        CLOSE_FULL_SCREEN_LEAD,
        GIMAL_PARAMETER_CONFIG,
        PTZ_GAIN,
        QUERYDYNAMICDATA,
        DYNC4KBACKDATA,
        DYNC4KCHECKHANDLE,
        DYNC4KCHECKSENDHANDLE,
        DRAWSYNCFLYZONE,
        DRAWSYNCFLYZONEBYDB,
        CLEARSYNEFLYZONE,
        QUERYDYNAMICDATAGPS,
        UPDTECOMPLETECHECK,
        DISCONNECTVIDEO
    }

    /* renamed from: com.fimi.soul.drone.d$b */
    /* loaded from: classes.dex */
    public interface AbstractC2106b {
        void onDroneEvent(EnumC2105a enumC2105a, C2083a c2083a);
    }

    /* renamed from: com.fimi.soul.drone.d$c */
    /* loaded from: classes.dex */
    public interface AbstractC2107c {
        /* renamed from: a */
        void m32723a(EnumC2293g enumC2293g);

        /* renamed from: a */
        void m32722a(EnumC2293g enumC2293g, int i, int i2);

        /* renamed from: b */
        void m32721b(EnumC2293g enumC2293g);
    }
}