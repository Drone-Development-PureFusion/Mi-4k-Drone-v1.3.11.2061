.class public Lcom/google/android/gms/fitness/request/StopBleScanRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/fitness/request/StopBleScanRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:Lcom/google/android/gms/fitness/request/ag;

.field private final c:Lcom/google/android/gms/internal/alq;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/fitness/request/l;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/request/l;-><init>()V

    sput-object v0, Lcom/google/android/gms/fitness/request/StopBleScanRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILandroid/os/IBinder;Landroid/os/IBinder;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/fitness/request/StopBleScanRequest;->a:I

    invoke-static {p2}, Lcom/google/android/gms/fitness/request/ag$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/fitness/request/ag;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/StopBleScanRequest;->b:Lcom/google/android/gms/fitness/request/ag;

    invoke-static {p3}, Lcom/google/android/gms/internal/alq$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/alq;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/StopBleScanRequest;->c:Lcom/google/android/gms/internal/alq;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/fitness/request/a;Lcom/google/android/gms/internal/alq;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/fitness/request/d$a;->a()Lcom/google/android/gms/fitness/request/d$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/fitness/request/d$a;->b(Lcom/google/android/gms/fitness/request/a;)Lcom/google/android/gms/fitness/request/d;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lcom/google/android/gms/fitness/request/StopBleScanRequest;-><init>(Lcom/google/android/gms/fitness/request/ag;Lcom/google/android/gms/internal/alq;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/fitness/request/ag;Lcom/google/android/gms/internal/alq;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/fitness/request/StopBleScanRequest;->a:I

    iput-object p1, p0, Lcom/google/android/gms/fitness/request/StopBleScanRequest;->b:Lcom/google/android/gms/fitness/request/ag;

    iput-object p2, p0, Lcom/google/android/gms/fitness/request/StopBleScanRequest;->c:Lcom/google/android/gms/internal/alq;

    return-void
.end method


# virtual methods
.method a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/request/StopBleScanRequest;->a:I

    return v0
.end method

.method public b()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/StopBleScanRequest;->b:Lcom/google/android/gms/fitness/request/ag;

    invoke-interface {v0}, Lcom/google/android/gms/fitness/request/ag;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

.method public c()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/StopBleScanRequest;->c:Lcom/google/android/gms/internal/alq;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/fitness/request/StopBleScanRequest;->c:Lcom/google/android/gms/internal/alq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/alq;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/request/l;->a(Lcom/google/android/gms/fitness/request/StopBleScanRequest;Landroid/os/Parcel;I)V

    return-void
.end method
