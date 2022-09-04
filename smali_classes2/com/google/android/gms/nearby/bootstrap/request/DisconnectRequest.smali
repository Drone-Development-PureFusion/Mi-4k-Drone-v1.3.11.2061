.class public Lcom/google/android/gms/nearby/bootstrap/request/DisconnectRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/nearby/bootstrap/request/d;


# instance fields
.field final a:I

.field private final b:Lcom/google/android/gms/nearby/bootstrap/Device;

.field private final c:Lcom/google/android/gms/internal/anb;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/bootstrap/request/d;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/bootstrap/request/d;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/bootstrap/request/DisconnectRequest;->CREATOR:Lcom/google/android/gms/nearby/bootstrap/request/d;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/nearby/bootstrap/Device;Landroid/os/IBinder;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/nearby/bootstrap/request/DisconnectRequest;->a:I

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/nearby/bootstrap/Device;

    iput-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/DisconnectRequest;->b:Lcom/google/android/gms/nearby/bootstrap/Device;

    invoke-static {p3}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lcom/google/android/gms/internal/anb$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/anb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/DisconnectRequest;->c:Lcom/google/android/gms/internal/anb;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/nearby/bootstrap/Device;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/DisconnectRequest;->b:Lcom/google/android/gms/nearby/bootstrap/Device;

    return-object v0
.end method

.method public b()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/DisconnectRequest;->c:Lcom/google/android/gms/internal/anb;

    invoke-interface {v0}, Lcom/google/android/gms/internal/anb;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/nearby/bootstrap/request/DisconnectRequest;->CREATOR:Lcom/google/android/gms/nearby/bootstrap/request/d;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/nearby/bootstrap/request/d;->a(Lcom/google/android/gms/nearby/bootstrap/request/DisconnectRequest;Landroid/os/Parcel;I)V

    return-void
.end method
