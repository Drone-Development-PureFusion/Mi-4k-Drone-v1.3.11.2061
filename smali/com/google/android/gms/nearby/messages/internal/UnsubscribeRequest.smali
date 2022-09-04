.class public final Lcom/google/android/gms/nearby/messages/internal/UnsubscribeRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/nearby/messages/internal/UnsubscribeRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:I

.field public final b:Lcom/google/android/gms/nearby/messages/internal/j;

.field public final c:Lcom/google/android/gms/nearby/messages/internal/k;

.field public final d:Landroid/app/PendingIntent;

.field public final e:I

.field public final f:Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final g:Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final h:Z
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final i:Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/aa;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/messages/internal/aa;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/messages/internal/UnsubscribeRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILandroid/os/IBinder;Landroid/os/IBinder;Landroid/app/PendingIntent;ILjava/lang/String;Ljava/lang/String;ZLcom/google/android/gms/nearby/messages/internal/ClientAppContext;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/nearby/messages/internal/UnsubscribeRequest;->a:I

    invoke-static {p2}, Lcom/google/android/gms/nearby/messages/internal/j$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/nearby/messages/internal/j;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/UnsubscribeRequest;->b:Lcom/google/android/gms/nearby/messages/internal/j;

    invoke-static {p3}, Lcom/google/android/gms/nearby/messages/internal/k$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/nearby/messages/internal/k;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/UnsubscribeRequest;->c:Lcom/google/android/gms/nearby/messages/internal/k;

    iput-object p4, p0, Lcom/google/android/gms/nearby/messages/internal/UnsubscribeRequest;->d:Landroid/app/PendingIntent;

    iput p5, p0, Lcom/google/android/gms/nearby/messages/internal/UnsubscribeRequest;->e:I

    iput-object p6, p0, Lcom/google/android/gms/nearby/messages/internal/UnsubscribeRequest;->f:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/nearby/messages/internal/UnsubscribeRequest;->g:Ljava/lang/String;

    iput-boolean p8, p0, Lcom/google/android/gms/nearby/messages/internal/UnsubscribeRequest;->h:Z

    invoke-static {p9, p7, p6, p8}, Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;->a(Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;Ljava/lang/String;Ljava/lang/String;Z)Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/UnsubscribeRequest;->i:Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;

    return-void
.end method

.method public constructor <init>(Landroid/os/IBinder;Landroid/os/IBinder;Landroid/app/PendingIntent;I)V
    .locals 10
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    const/4 v6, 0x0

    const/4 v1, 0x1

    const/4 v8, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move-object v7, v6

    move-object v9, v6

    invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/nearby/messages/internal/UnsubscribeRequest;-><init>(ILandroid/os/IBinder;Landroid/os/IBinder;Landroid/app/PendingIntent;ILjava/lang/String;Ljava/lang/String;ZLcom/google/android/gms/nearby/messages/internal/ClientAppContext;)V

    return-void
.end method


# virtual methods
.method a()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/UnsubscribeRequest;->c:Lcom/google/android/gms/nearby/messages/internal/k;

    invoke-interface {v0}, Lcom/google/android/gms/nearby/messages/internal/k;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

.method b()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/UnsubscribeRequest;->b:Lcom/google/android/gms/nearby/messages/internal/j;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/UnsubscribeRequest;->b:Lcom/google/android/gms/nearby/messages/internal/j;

    invoke-interface {v0}, Lcom/google/android/gms/nearby/messages/internal/j;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/nearby/messages/internal/aa;->a(Lcom/google/android/gms/nearby/messages/internal/UnsubscribeRequest;Landroid/os/Parcel;I)V

    return-void
.end method
