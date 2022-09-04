.class Lcom/google/android/gms/cast/framework/media/a$a;
.super Lcom/google/android/gms/cast/framework/media/e$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/cast/framework/media/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/cast/framework/media/a;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/cast/framework/media/a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/media/a$a;->a:Lcom/google/android/gms/cast/framework/media/a;

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/e$a;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/cast/framework/media/a;Lcom/google/android/gms/cast/framework/media/a$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/framework/media/a$a;-><init>(Lcom/google/android/gms/cast/framework/media/a;)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    const v0, 0x93c108

    return v0
.end method

.method public a(Lcom/google/android/gms/cast/MediaMetadata;I)Lcom/google/android/gms/common/images/WebImage;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/a$a;->a:Lcom/google/android/gms/cast/framework/media/a;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/cast/framework/media/a;->a(Lcom/google/android/gms/cast/MediaMetadata;I)Lcom/google/android/gms/common/images/WebImage;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/google/android/gms/c/e;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/a$a;->a:Lcom/google/android/gms/cast/framework/media/a;

    invoke-static {v0}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v0

    return-object v0
.end method
