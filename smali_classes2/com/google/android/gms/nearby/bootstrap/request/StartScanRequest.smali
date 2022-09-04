.class public Lcom/google/android/gms/nearby/bootstrap/request/StartScanRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/nearby/bootstrap/request/g;


# instance fields
.field final a:I

.field private final b:Lcom/google/android/gms/internal/and;

.field private final c:Lcom/google/android/gms/internal/anb;

.field private final d:B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/bootstrap/request/g;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/bootstrap/request/g;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/bootstrap/request/StartScanRequest;->CREATOR:Lcom/google/android/gms/nearby/bootstrap/request/g;

    return-void
.end method

.method constructor <init>(IBLandroid/os/IBinder;Landroid/os/IBinder;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/nearby/bootstrap/request/StartScanRequest;->a:I

    iput-byte p2, p0, Lcom/google/android/gms/nearby/bootstrap/request/StartScanRequest;->d:B

    invoke-static {p3}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lcom/google/android/gms/internal/and$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/and;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/StartScanRequest;->b:Lcom/google/android/gms/internal/and;

    invoke-static {p4}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p4}, Lcom/google/android/gms/internal/anb$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/anb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/StartScanRequest;->c:Lcom/google/android/gms/internal/anb;

    return-void
.end method


# virtual methods
.method public a()B
    .locals 1

    iget-byte v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/StartScanRequest;->d:B

    return v0
.end method

.method public b()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/StartScanRequest;->b:Lcom/google/android/gms/internal/and;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/StartScanRequest;->b:Lcom/google/android/gms/internal/and;

    invoke-interface {v0}, Lcom/google/android/gms/internal/and;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method public c()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/StartScanRequest;->c:Lcom/google/android/gms/internal/anb;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/StartScanRequest;->c:Lcom/google/android/gms/internal/anb;

    invoke-interface {v0}, Lcom/google/android/gms/internal/anb;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/nearby/bootstrap/request/StartScanRequest;->CREATOR:Lcom/google/android/gms/nearby/bootstrap/request/g;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/nearby/bootstrap/request/g;->a(Lcom/google/android/gms/nearby/bootstrap/request/StartScanRequest;Landroid/os/Parcel;I)V

    return-void
.end method
