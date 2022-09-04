.class public Lcom/google/android/gms/cast/framework/media/a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/cast/framework/media/a$a;
    }
.end annotation


# static fields
.field public static final a:I = 0x0

.field public static final b:I = 0x1

.field public static final c:I = 0x2


# instance fields
.field private final d:Lcom/google/android/gms/cast/framework/media/e;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/cast/framework/media/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/cast/framework/media/a$a;-><init>(Lcom/google/android/gms/cast/framework/media/a;Lcom/google/android/gms/cast/framework/media/a$1;)V

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/media/a;->d:Lcom/google/android/gms/cast/framework/media/e;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/cast/framework/media/e;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/a;->d:Lcom/google/android/gms/cast/framework/media/e;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/cast/MediaMetadata;I)Lcom/google/android/gms/common/images/WebImage;
    .locals 2

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/cast/MediaMetadata;->g()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/cast/MediaMetadata;->f()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/images/WebImage;

    goto :goto_0
.end method
