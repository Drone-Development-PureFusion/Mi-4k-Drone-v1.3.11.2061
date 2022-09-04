.class public final Lcom/google/android/gms/cast/framework/media/CastMediaOptions$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/cast/framework/media/CastMediaOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Lcom/google/android/gms/cast/framework/media/a;

.field private d:Lcom/google/android/gms/cast/framework/media/NotificationOptions;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Lcom/google/android/gms/cast/framework/media/MediaIntentReceiver;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/media/CastMediaOptions$a;->a:Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/cast/framework/media/NotificationOptions$a;

    invoke-direct {v0}, Lcom/google/android/gms/cast/framework/media/NotificationOptions$a;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/NotificationOptions$a;->a()Lcom/google/android/gms/cast/framework/media/NotificationOptions;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/media/CastMediaOptions$a;->d:Lcom/google/android/gms/cast/framework/media/NotificationOptions;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/cast/framework/media/NotificationOptions;)Lcom/google/android/gms/cast/framework/media/CastMediaOptions$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/media/CastMediaOptions$a;->d:Lcom/google/android/gms/cast/framework/media/NotificationOptions;

    return-object p0
.end method

.method public a(Lcom/google/android/gms/cast/framework/media/a;)Lcom/google/android/gms/cast/framework/media/CastMediaOptions$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/media/CastMediaOptions$a;->c:Lcom/google/android/gms/cast/framework/media/a;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/google/android/gms/cast/framework/media/CastMediaOptions$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/media/CastMediaOptions$a;->a:Ljava/lang/String;

    return-object p0
.end method

.method public a()Lcom/google/android/gms/cast/framework/media/CastMediaOptions;
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/CastMediaOptions$a;->c:Lcom/google/android/gms/cast/framework/media/a;

    if-nez v0, :cond_0

    const/4 v4, 0x0

    :goto_0
    new-instance v0, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/media/CastMediaOptions$a;->a:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/cast/framework/media/CastMediaOptions$a;->b:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/cast/framework/media/CastMediaOptions$a;->d:Lcom/google/android/gms/cast/framework/media/NotificationOptions;

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;-><init>(ILjava/lang/String;Ljava/lang/String;Landroid/os/IBinder;Lcom/google/android/gms/cast/framework/media/NotificationOptions;)V

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/CastMediaOptions$a;->c:Lcom/google/android/gms/cast/framework/media/a;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/a;->a()Lcom/google/android/gms/cast/framework/media/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/cast/framework/media/e;->asBinder()Landroid/os/IBinder;

    move-result-object v4

    goto :goto_0
.end method

.method public b(Ljava/lang/String;)Lcom/google/android/gms/cast/framework/media/CastMediaOptions$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/media/CastMediaOptions$a;->b:Ljava/lang/String;

    return-object p0
.end method
