.class final Lcom/google/android/gms/games/internal/d$bi;
.super Lcom/google/android/gms/games/internal/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "bi"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ail;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/games/multiplayer/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ail;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/games/multiplayer/e;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/games/internal/a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/games/internal/d$bi;->a:Lcom/google/android/gms/internal/ail;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$bi;->a:Lcom/google/android/gms/internal/ail;

    new-instance v1, Lcom/google/android/gms/games/internal/d$bk;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/internal/d$bk;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ail;->a(Lcom/google/android/gms/internal/ail$c;)V

    return-void
.end method

.method public l(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 3

    new-instance v1, Lcom/google/android/gms/games/multiplayer/a;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/multiplayer/a;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {v1}, Lcom/google/android/gms/games/multiplayer/a;->c()I

    move-result v2

    if-lez v2, :cond_0

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/games/multiplayer/a;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/multiplayer/Invitation;

    invoke-interface {v0}, Lcom/google/android/gms/games/multiplayer/Invitation;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/multiplayer/Invitation;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    invoke-virtual {v1}, Lcom/google/android/gms/games/multiplayer/a;->b()V

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/games/internal/d$bi;->a:Lcom/google/android/gms/internal/ail;

    new-instance v2, Lcom/google/android/gms/games/internal/d$bj;

    invoke-direct {v2, v0}, Lcom/google/android/gms/games/internal/d$bj;-><init>(Lcom/google/android/gms/games/multiplayer/Invitation;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ail;->a(Lcom/google/android/gms/internal/ail$c;)V

    :cond_1
    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Lcom/google/android/gms/games/multiplayer/a;->b()V

    throw v0
.end method
