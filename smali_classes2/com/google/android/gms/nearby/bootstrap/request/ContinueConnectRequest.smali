.class public Lcom/google/android/gms/nearby/bootstrap/request/ContinueConnectRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/nearby/bootstrap/request/b;


# instance fields
.field final a:I

.field private final b:Ljava/lang/String;

.field private final c:Lcom/google/android/gms/internal/anb;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/bootstrap/request/b;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/bootstrap/request/b;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/bootstrap/request/ContinueConnectRequest;->CREATOR:Lcom/google/android/gms/nearby/bootstrap/request/b;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Landroid/os/IBinder;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/nearby/bootstrap/request/ContinueConnectRequest;->a:I

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ContinueConnectRequest;->b:Ljava/lang/String;

    invoke-static {p3}, Lcom/google/android/gms/internal/anb$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/anb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ContinueConnectRequest;->c:Lcom/google/android/gms/internal/anb;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ContinueConnectRequest;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ContinueConnectRequest;->c:Lcom/google/android/gms/internal/anb;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/ContinueConnectRequest;->c:Lcom/google/android/gms/internal/anb;

    invoke-interface {v0}, Lcom/google/android/gms/internal/anb;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/nearby/bootstrap/request/ContinueConnectRequest;->CREATOR:Lcom/google/android/gms/nearby/bootstrap/request/b;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/nearby/bootstrap/request/b;->a(Lcom/google/android/gms/nearby/bootstrap/request/ContinueConnectRequest;Landroid/os/Parcel;I)V

    return-void
.end method
