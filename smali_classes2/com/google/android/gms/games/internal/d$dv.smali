.class final Lcom/google/android/gms/games/internal/d$dv;
.super Lcom/google/android/gms/games/internal/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "dv"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ail;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/games/request/f;",
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
            "Lcom/google/android/gms/games/request/f;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/games/internal/a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/games/internal/d$dv;->a:Lcom/google/android/gms/internal/ail;

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$dv;->a:Lcom/google/android/gms/internal/ail;

    new-instance v1, Lcom/google/android/gms/games/internal/d$dx;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/internal/d$dx;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ail;->a(Lcom/google/android/gms/internal/ail$c;)V

    return-void
.end method

.method public m(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 3

    new-instance v1, Lcom/google/android/gms/games/request/a;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/request/a;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {v1}, Lcom/google/android/gms/games/request/a;->c()I

    move-result v2

    if-lez v2, :cond_0

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/games/request/a;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/request/GameRequest;

    invoke-interface {v0}, Lcom/google/android/gms/games/request/GameRequest;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/request/GameRequest;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    invoke-virtual {v1}, Lcom/google/android/gms/games/request/a;->b()V

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/games/internal/d$dv;->a:Lcom/google/android/gms/internal/ail;

    new-instance v2, Lcom/google/android/gms/games/internal/d$dw;

    invoke-direct {v2, v0}, Lcom/google/android/gms/games/internal/d$dw;-><init>(Lcom/google/android/gms/games/request/GameRequest;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ail;->a(Lcom/google/android/gms/internal/ail$c;)V

    :cond_1
    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Lcom/google/android/gms/games/request/a;->b()V

    throw v0
.end method
