.class public Lcom/google/android/gms/nearby/messages/internal/GetPermissionStatusRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/nearby/messages/internal/GetPermissionStatusRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:I

.field public final b:Lcom/google/android/gms/nearby/messages/internal/k;

.field public final c:Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final d:Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/g;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/messages/internal/g;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/messages/internal/GetPermissionStatusRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILandroid/os/IBinder;Ljava/lang/String;Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/nearby/messages/internal/GetPermissionStatusRequest;->a:I

    invoke-static {p2}, Lcom/google/android/gms/nearby/messages/internal/k$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/nearby/messages/internal/k;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/GetPermissionStatusRequest;->b:Lcom/google/android/gms/nearby/messages/internal/k;

    iput-object p3, p0, Lcom/google/android/gms/nearby/messages/internal/GetPermissionStatusRequest;->c:Ljava/lang/String;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p4, v0, p3, v1}, Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;->a(Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;Ljava/lang/String;Ljava/lang/String;Z)Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/GetPermissionStatusRequest;->d:Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;

    return-void
.end method

.method constructor <init>(Landroid/os/IBinder;)V
    .locals 2

    const/4 v1, 0x0

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1, v1, v1}, Lcom/google/android/gms/nearby/messages/internal/GetPermissionStatusRequest;-><init>(ILandroid/os/IBinder;Ljava/lang/String;Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;)V

    return-void
.end method


# virtual methods
.method a()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/GetPermissionStatusRequest;->b:Lcom/google/android/gms/nearby/messages/internal/k;

    invoke-interface {v0}, Lcom/google/android/gms/nearby/messages/internal/k;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/nearby/messages/internal/g;->a(Lcom/google/android/gms/nearby/messages/internal/GetPermissionStatusRequest;Landroid/os/Parcel;I)V

    return-void
.end method
