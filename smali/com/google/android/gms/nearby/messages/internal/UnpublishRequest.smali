.class public final Lcom/google/android/gms/nearby/messages/internal/UnpublishRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/nearby/messages/internal/UnpublishRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:I

.field public final b:Lcom/google/android/gms/nearby/messages/internal/MessageWrapper;

.field public final c:Lcom/google/android/gms/nearby/messages/internal/k;

.field public final d:Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final e:Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final f:Z
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final g:Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/z;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/messages/internal/z;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/messages/internal/UnpublishRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/nearby/messages/internal/MessageWrapper;Landroid/os/IBinder;Ljava/lang/String;Ljava/lang/String;ZLcom/google/android/gms/nearby/messages/internal/ClientAppContext;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/nearby/messages/internal/UnpublishRequest;->a:I

    iput-object p2, p0, Lcom/google/android/gms/nearby/messages/internal/UnpublishRequest;->b:Lcom/google/android/gms/nearby/messages/internal/MessageWrapper;

    invoke-static {p3}, Lcom/google/android/gms/nearby/messages/internal/k$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/nearby/messages/internal/k;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/UnpublishRequest;->c:Lcom/google/android/gms/nearby/messages/internal/k;

    iput-object p4, p0, Lcom/google/android/gms/nearby/messages/internal/UnpublishRequest;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/nearby/messages/internal/UnpublishRequest;->e:Ljava/lang/String;

    iput-boolean p6, p0, Lcom/google/android/gms/nearby/messages/internal/UnpublishRequest;->f:Z

    invoke-static {p7, p5, p4, p6}, Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;->a(Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;Ljava/lang/String;Ljava/lang/String;Z)Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/UnpublishRequest;->g:Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/nearby/messages/internal/MessageWrapper;Landroid/os/IBinder;Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;)V
    .locals 8

    const/4 v4, 0x0

    const/4 v1, 0x1

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, v4

    move-object v7, p3

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/nearby/messages/internal/UnpublishRequest;-><init>(ILcom/google/android/gms/nearby/messages/internal/MessageWrapper;Landroid/os/IBinder;Ljava/lang/String;Ljava/lang/String;ZLcom/google/android/gms/nearby/messages/internal/ClientAppContext;)V

    return-void
.end method


# virtual methods
.method a()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/UnpublishRequest;->c:Lcom/google/android/gms/nearby/messages/internal/k;

    invoke-interface {v0}, Lcom/google/android/gms/nearby/messages/internal/k;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/nearby/messages/internal/z;->a(Lcom/google/android/gms/nearby/messages/internal/UnpublishRequest;Landroid/os/Parcel;I)V

    return-void
.end method
