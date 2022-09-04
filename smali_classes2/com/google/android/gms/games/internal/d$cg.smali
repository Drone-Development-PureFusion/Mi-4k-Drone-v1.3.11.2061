.class final Lcom/google/android/gms/games/internal/d$cg;
.super Lcom/google/android/gms/games/internal/d$ax;

# interfaces
.implements Lcom/google/android/gms/games/a/m$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "cg"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/games/a/h;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/games/internal/d$ax;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    new-instance v1, Lcom/google/android/gms/games/a/f;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/a/f;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    :try_start_0
    invoke-virtual {v1}, Lcom/google/android/gms/games/a/f;->c()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/games/a/f;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/a/e;

    invoke-interface {v0}, Lcom/google/android/gms/games/a/e;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/a/h;

    iput-object v0, p0, Lcom/google/android/gms/games/internal/d$cg;->a:Lcom/google/android/gms/games/a/h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-virtual {v1}, Lcom/google/android/gms/games/a/f;->b()V

    return-void

    :cond_0
    const/4 v0, 0x0

    :try_start_1
    iput-object v0, p0, Lcom/google/android/gms/games/internal/d$cg;->a:Lcom/google/android/gms/games/a/h;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Lcom/google/android/gms/games/a/f;->b()V

    throw v0
.end method


# virtual methods
.method public c()Lcom/google/android/gms/games/a/e;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$cg;->a:Lcom/google/android/gms/games/a/h;

    return-object v0
.end method
