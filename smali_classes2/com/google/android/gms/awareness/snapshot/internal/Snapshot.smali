.class public final Lcom/google/android/gms/awareness/snapshot/internal/Snapshot;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/awareness/snapshot/internal/Snapshot;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:Lcom/google/android/gms/location/ActivityRecognitionResult;

.field private final c:Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl;

.field private final d:Lcom/google/android/gms/awareness/snapshot/internal/HeadphoneStateImpl;

.field private final e:Landroid/location/Location;

.field private final f:Lcom/google/android/gms/awareness/snapshot/internal/NetworkStateImpl;

.field private final g:Lcom/google/android/gms/common/data/DataHolder;

.field private final h:Lcom/google/android/gms/awareness/snapshot/internal/PowerStateImpl;

.field private final i:Lcom/google/android/gms/awareness/snapshot/internal/ScreenStateImpl;

.field private final j:Lcom/google/android/gms/awareness/snapshot/internal/WeatherImpl;

.field private final k:Lcom/google/android/gms/awareness/snapshot/internal/DayAttributesImpl;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/awareness/snapshot/internal/k;

    invoke-direct {v0}, Lcom/google/android/gms/awareness/snapshot/internal/k;-><init>()V

    sput-object v0, Lcom/google/android/gms/awareness/snapshot/internal/Snapshot;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/location/ActivityRecognitionResult;Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl;Lcom/google/android/gms/awareness/snapshot/internal/HeadphoneStateImpl;Landroid/location/Location;Lcom/google/android/gms/awareness/snapshot/internal/NetworkStateImpl;Lcom/google/android/gms/common/data/DataHolder;Lcom/google/android/gms/awareness/snapshot/internal/PowerStateImpl;Lcom/google/android/gms/awareness/snapshot/internal/ScreenStateImpl;Lcom/google/android/gms/awareness/snapshot/internal/WeatherImpl;Lcom/google/android/gms/awareness/snapshot/internal/DayAttributesImpl;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/awareness/snapshot/internal/Snapshot;->a:I

    iput-object p2, p0, Lcom/google/android/gms/awareness/snapshot/internal/Snapshot;->b:Lcom/google/android/gms/location/ActivityRecognitionResult;

    iput-object p3, p0, Lcom/google/android/gms/awareness/snapshot/internal/Snapshot;->c:Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl;

    iput-object p4, p0, Lcom/google/android/gms/awareness/snapshot/internal/Snapshot;->d:Lcom/google/android/gms/awareness/snapshot/internal/HeadphoneStateImpl;

    iput-object p5, p0, Lcom/google/android/gms/awareness/snapshot/internal/Snapshot;->e:Landroid/location/Location;

    iput-object p6, p0, Lcom/google/android/gms/awareness/snapshot/internal/Snapshot;->f:Lcom/google/android/gms/awareness/snapshot/internal/NetworkStateImpl;

    iput-object p7, p0, Lcom/google/android/gms/awareness/snapshot/internal/Snapshot;->g:Lcom/google/android/gms/common/data/DataHolder;

    iput-object p8, p0, Lcom/google/android/gms/awareness/snapshot/internal/Snapshot;->h:Lcom/google/android/gms/awareness/snapshot/internal/PowerStateImpl;

    iput-object p9, p0, Lcom/google/android/gms/awareness/snapshot/internal/Snapshot;->i:Lcom/google/android/gms/awareness/snapshot/internal/ScreenStateImpl;

    iput-object p10, p0, Lcom/google/android/gms/awareness/snapshot/internal/Snapshot;->j:Lcom/google/android/gms/awareness/snapshot/internal/WeatherImpl;

    iput-object p11, p0, Lcom/google/android/gms/awareness/snapshot/internal/Snapshot;->k:Lcom/google/android/gms/awareness/snapshot/internal/DayAttributesImpl;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/location/ActivityRecognitionResult;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/Snapshot;->b:Lcom/google/android/gms/location/ActivityRecognitionResult;

    return-object v0
.end method

.method public b()Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/Snapshot;->c:Lcom/google/android/gms/awareness/snapshot/internal/BeaconStateImpl;

    return-object v0
.end method

.method public c()Lcom/google/android/gms/awareness/snapshot/internal/HeadphoneStateImpl;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/Snapshot;->d:Lcom/google/android/gms/awareness/snapshot/internal/HeadphoneStateImpl;

    return-object v0
.end method

.method public d()Landroid/location/Location;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/Snapshot;->e:Landroid/location/Location;

    return-object v0
.end method

.method public e()Lcom/google/android/gms/awareness/snapshot/internal/NetworkStateImpl;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/Snapshot;->f:Lcom/google/android/gms/awareness/snapshot/internal/NetworkStateImpl;

    return-object v0
.end method

.method public f()Lcom/google/android/gms/common/data/DataHolder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/Snapshot;->g:Lcom/google/android/gms/common/data/DataHolder;

    return-object v0
.end method

.method public g()Lcom/google/android/gms/awareness/snapshot/internal/PowerStateImpl;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/Snapshot;->h:Lcom/google/android/gms/awareness/snapshot/internal/PowerStateImpl;

    return-object v0
.end method

.method public h()Lcom/google/android/gms/awareness/snapshot/internal/ScreenStateImpl;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/Snapshot;->i:Lcom/google/android/gms/awareness/snapshot/internal/ScreenStateImpl;

    return-object v0
.end method

.method public i()Lcom/google/android/gms/awareness/snapshot/internal/WeatherImpl;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/Snapshot;->j:Lcom/google/android/gms/awareness/snapshot/internal/WeatherImpl;

    return-object v0
.end method

.method public j()Lcom/google/android/gms/awareness/snapshot/internal/DayAttributesImpl;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/Snapshot;->k:Lcom/google/android/gms/awareness/snapshot/internal/DayAttributesImpl;

    return-object v0
.end method

.method k()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/awareness/snapshot/internal/Snapshot;->a:I

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/awareness/snapshot/internal/k;->a(Lcom/google/android/gms/awareness/snapshot/internal/Snapshot;Landroid/os/Parcel;I)V

    return-void
.end method
