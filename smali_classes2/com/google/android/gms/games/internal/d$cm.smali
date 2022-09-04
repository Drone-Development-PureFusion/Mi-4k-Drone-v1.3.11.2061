.class final Lcom/google/android/gms/games/internal/d$cm;
.super Lcom/google/android/gms/games/internal/d$ax;

# interfaces
.implements Lcom/google/android/gms/games/a/m$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "cm"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/games/a/c;

.field private final d:Lcom/google/android/gms/games/a/f;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/data/DataHolder;Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 2

    invoke-direct {p0, p2}, Lcom/google/android/gms/games/internal/d$ax;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    new-instance v1, Lcom/google/android/gms/games/a/b;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/a/b;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    :try_start_0
    invoke-virtual {v1}, Lcom/google/android/gms/games/a/b;->c()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/games/a/b;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/a/a;

    invoke-interface {v0}, Lcom/google/android/gms/games/a/a;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/a/c;

    iput-object v0, p0, Lcom/google/android/gms/games/internal/d$cm;->a:Lcom/google/android/gms/games/a/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-virtual {v1}, Lcom/google/android/gms/games/a/b;->b()V

    new-instance v0, Lcom/google/android/gms/games/a/f;

    invoke-direct {v0, p2}, Lcom/google/android/gms/games/a/f;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    iput-object v0, p0, Lcom/google/android/gms/games/internal/d$cm;->d:Lcom/google/android/gms/games/a/f;

    return-void

    :cond_0
    const/4 v0, 0x0

    :try_start_1
    iput-object v0, p0, Lcom/google/android/gms/games/internal/d$cm;->a:Lcom/google/android/gms/games/a/c;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Lcom/google/android/gms/games/a/b;->b()V

    throw v0
.end method


# virtual methods
.method public c()Lcom/google/android/gms/games/a/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$cm;->a:Lcom/google/android/gms/games/a/c;

    return-object v0
.end method

.method public d()Lcom/google/android/gms/games/a/f;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$cm;->d:Lcom/google/android/gms/games/a/f;

    return-object v0
.end method
