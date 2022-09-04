.class Lcom/google/android/gms/cast/framework/media/c$h;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/cast/framework/media/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "h"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/cast/framework/media/c;

.field private final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$d;",
            ">;"
        }
    .end annotation
.end field

.field private final c:J

.field private final d:Ljava/lang/Runnable;

.field private e:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/cast/framework/media/c;J)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/media/c$h;->a:Lcom/google/android/gms/cast/framework/media/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/media/c$h;->b:Ljava/util/Set;

    iput-wide p2, p0, Lcom/google/android/gms/cast/framework/media/c$h;->c:J

    new-instance v0, Lcom/google/android/gms/cast/framework/media/c$h$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/cast/framework/media/c$h$1;-><init>(Lcom/google/android/gms/cast/framework/media/c$h;Lcom/google/android/gms/cast/framework/media/c;)V

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/media/c$h;->d:Ljava/lang/Runnable;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/cast/framework/media/c$h;)Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c$h;->b:Ljava/util/Set;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/cast/framework/media/c$h;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/cast/framework/media/c$h;->c:J

    return-wide v0
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/cast/framework/media/c$h;->c:J

    return-wide v0
.end method

.method public a(Lcom/google/android/gms/cast/framework/media/c$d;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c$h;->b:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public b(Lcom/google/android/gms/cast/framework/media/c$d;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c$h;->b:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c$h;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c$h;->a:Lcom/google/android/gms/cast/framework/media/c;

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/media/c;->g(Lcom/google/android/gms/cast/framework/media/c;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/c$h;->d:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/cast/framework/media/c$h;->e:Z

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c$h;->a:Lcom/google/android/gms/cast/framework/media/c;

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/media/c;->g(Lcom/google/android/gms/cast/framework/media/c;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/c$h;->d:Ljava/lang/Runnable;

    iget-wide v2, p0, Lcom/google/android/gms/cast/framework/media/c$h;->c:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c$h;->a:Lcom/google/android/gms/cast/framework/media/c;

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/media/c;->g(Lcom/google/android/gms/cast/framework/media/c;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/c$h;->d:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/cast/framework/media/c$h;->e:Z

    return-void
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/cast/framework/media/c$h;->e:Z

    return v0
.end method
