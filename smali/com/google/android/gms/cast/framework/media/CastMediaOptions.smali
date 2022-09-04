.class public Lcom/google/android/gms/cast/framework/media/CastMediaOptions;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/cast/framework/media/CastMediaOptions$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/cast/framework/media/CastMediaOptions;",
            ">;"
        }
    .end annotation
.end field

.field private static final a:Lcom/google/android/gms/cast/internal/m;


# instance fields
.field private final b:I

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Lcom/google/android/gms/cast/framework/media/e;

.field private final f:Lcom/google/android/gms/cast/framework/media/NotificationOptions;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/cast/internal/m;

    const-string v1, "CastMediaOptions"

    invoke-direct {v0, v1}, Lcom/google/android/gms/cast/internal/m;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;->a:Lcom/google/android/gms/cast/internal/m;

    new-instance v0, Lcom/google/android/gms/cast/framework/media/d;

    invoke-direct {v0}, Lcom/google/android/gms/cast/framework/media/d;-><init>()V

    sput-object v0, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Ljava/lang/String;Landroid/os/IBinder;Lcom/google/android/gms/cast/framework/media/NotificationOptions;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;->b:I

    iput-object p2, p0, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;->c:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;->d:Ljava/lang/String;

    invoke-static {p4}, Lcom/google/android/gms/cast/framework/media/e$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/cast/framework/media/e;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;->e:Lcom/google/android/gms/cast/framework/media/e;

    iput-object p5, p0, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;->f:Lcom/google/android/gms/cast/framework/media/NotificationOptions;

    return-void
.end method


# virtual methods
.method a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;->b:I

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;->c:Ljava/lang/String;

    return-object v0
.end method

.method public c()Lcom/google/android/gms/cast/framework/media/NotificationOptions;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;->f:Lcom/google/android/gms/cast/framework/media/NotificationOptions;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;->d:Ljava/lang/String;

    return-object v0
.end method

.method public e()Lcom/google/android/gms/cast/framework/media/a;
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;->e:Lcom/google/android/gms/cast/framework/media/e;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;->e:Lcom/google/android/gms/cast/framework/media/e;

    invoke-interface {v0}, Lcom/google/android/gms/cast/framework/media/e;->b()Lcom/google/android/gms/c/e;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/c/f;->a(Lcom/google/android/gms/c/e;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/media/a;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v2, "Unable to call %s on %s."

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "getWrappedClientObject"

    aput-object v5, v3, v4

    const/4 v4, 0x1

    const-class v5, Lcom/google/android/gms/cast/framework/media/e;

    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/gms/cast/internal/m;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p1, p0, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;->c:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;->d:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;->d:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;->f:Lcom/google/android/gms/cast/framework/media/NotificationOptions;

    iget-object v3, p1, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;->f:Lcom/google/android/gms/cast/framework/media/NotificationOptions;

    invoke-static {v2, v3}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public f()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;->e:Lcom/google/android/gms/cast/framework/media/e;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;->e:Lcom/google/android/gms/cast/framework/media/e;

    invoke-interface {v0}, Lcom/google/android/gms/cast/framework/media/e;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;->c:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;->d:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;->f:Lcom/google/android/gms/cast/framework/media/NotificationOptions;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v1, "CastMediaOptions(mediaIntentReceiverClassName=%s, expandedControllerActivityClassName=%s, notificationOptions=%s)"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;->c:Ljava/lang/String;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    iget-object v4, p0, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;->d:Ljava/lang/String;

    aput-object v4, v2, v3

    const/4 v3, 0x2

    iget-object v4, p0, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;->f:Lcom/google/android/gms/cast/framework/media/NotificationOptions;

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/cast/framework/media/d;->a(Lcom/google/android/gms/cast/framework/media/CastMediaOptions;Landroid/os/Parcel;I)V

    return-void
.end method
