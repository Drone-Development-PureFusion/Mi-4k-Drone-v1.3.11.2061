.class public Lcom/google/android/gms/fitness/request/ListClaimedBleDevicesRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/fitness/request/ListClaimedBleDevicesRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:Lcom/google/android/gms/internal/amd;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/fitness/request/ah;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/request/ah;-><init>()V

    sput-object v0, Lcom/google/android/gms/fitness/request/ListClaimedBleDevicesRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILandroid/os/IBinder;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/fitness/request/ListClaimedBleDevicesRequest;->a:I

    invoke-static {p2}, Lcom/google/android/gms/internal/amd$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/amd;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/ListClaimedBleDevicesRequest;->b:Lcom/google/android/gms/internal/amd;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/amd;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/fitness/request/ListClaimedBleDevicesRequest;->a:I

    iput-object p1, p0, Lcom/google/android/gms/fitness/request/ListClaimedBleDevicesRequest;->b:Lcom/google/android/gms/internal/amd;

    return-void
.end method


# virtual methods
.method a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/request/ListClaimedBleDevicesRequest;->a:I

    return v0
.end method

.method public b()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/ListClaimedBleDevicesRequest;->b:Lcom/google/android/gms/internal/amd;

    invoke-interface {v0}, Lcom/google/android/gms/internal/amd;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/request/ah;->a(Lcom/google/android/gms/fitness/request/ListClaimedBleDevicesRequest;Landroid/os/Parcel;I)V

    return-void
.end method
