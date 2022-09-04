.class public final Lcom/google/android/gms/nearby/messages/internal/RegisterStatusCallbackRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/nearby/messages/internal/RegisterStatusCallbackRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:I

.field public final b:Lcom/google/android/gms/nearby/messages/internal/k;

.field public final c:Lcom/google/android/gms/nearby/messages/internal/n;

.field public d:Z

.field public e:Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final f:Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/x;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/messages/internal/x;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/messages/internal/RegisterStatusCallbackRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILandroid/os/IBinder;Landroid/os/IBinder;ZLjava/lang/String;Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/nearby/messages/internal/RegisterStatusCallbackRequest;->a:I

    invoke-static {p2}, Lcom/google/android/gms/nearby/messages/internal/k$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/nearby/messages/internal/k;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/RegisterStatusCallbackRequest;->b:Lcom/google/android/gms/nearby/messages/internal/k;

    invoke-static {p3}, Lcom/google/android/gms/nearby/messages/internal/n$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/nearby/messages/internal/n;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/RegisterStatusCallbackRequest;->c:Lcom/google/android/gms/nearby/messages/internal/n;

    iput-boolean p4, p0, Lcom/google/android/gms/nearby/messages/internal/RegisterStatusCallbackRequest;->d:Z

    iput-object p5, p0, Lcom/google/android/gms/nearby/messages/internal/RegisterStatusCallbackRequest;->e:Ljava/lang/String;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p6, v0, p5, v1}, Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;->a(Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;Ljava/lang/String;Ljava/lang/String;Z)Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/RegisterStatusCallbackRequest;->f:Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;

    return-void
.end method

.method constructor <init>(Landroid/os/IBinder;Landroid/os/IBinder;)V
    .locals 7

    const/4 v5, 0x0

    const/4 v1, 0x1

    const/4 v4, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v6, v5

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/nearby/messages/internal/RegisterStatusCallbackRequest;-><init>(ILandroid/os/IBinder;Landroid/os/IBinder;ZLjava/lang/String;Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;)V

    return-void
.end method


# virtual methods
.method a()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/RegisterStatusCallbackRequest;->b:Lcom/google/android/gms/nearby/messages/internal/k;

    invoke-interface {v0}, Lcom/google/android/gms/nearby/messages/internal/k;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

.method b()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/RegisterStatusCallbackRequest;->c:Lcom/google/android/gms/nearby/messages/internal/n;

    invoke-interface {v0}, Lcom/google/android/gms/nearby/messages/internal/n;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/nearby/messages/internal/x;->a(Lcom/google/android/gms/nearby/messages/internal/RegisterStatusCallbackRequest;Landroid/os/Parcel;I)V

    return-void
.end method
