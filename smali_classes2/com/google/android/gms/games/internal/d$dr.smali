.class final Lcom/google/android/gms/games/internal/d$dr;
.super Lcom/google/android/gms/games/internal/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "dr"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ail;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/games/quest/e;",
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
            "Lcom/google/android/gms/games/quest/e;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/games/internal/a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/games/internal/d$dr;->a:Lcom/google/android/gms/internal/ail;

    return-void
.end method

.method private ab(Lcom/google/android/gms/common/data/DataHolder;)Lcom/google/android/gms/games/quest/Quest;
    .locals 3

    new-instance v1, Lcom/google/android/gms/games/quest/c;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/quest/c;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {v1}, Lcom/google/android/gms/games/quest/c;->c()I

    move-result v2

    if-lez v2, :cond_0

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/games/quest/c;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/quest/Quest;

    invoke-interface {v0}, Lcom/google/android/gms/games/quest/Quest;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/quest/Quest;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    invoke-virtual {v1}, Lcom/google/android/gms/games/quest/c;->b()V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Lcom/google/android/gms/games/quest/c;->b()V

    throw v0
.end method


# virtual methods
.method public K(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 3

    invoke-direct {p0, p1}, Lcom/google/android/gms/games/internal/d$dr;->ab(Lcom/google/android/gms/common/data/DataHolder;)Lcom/google/android/gms/games/quest/Quest;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/games/internal/d$dr;->a:Lcom/google/android/gms/internal/ail;

    new-instance v2, Lcom/google/android/gms/games/internal/d$dp;

    invoke-direct {v2, v0}, Lcom/google/android/gms/games/internal/d$dp;-><init>(Lcom/google/android/gms/games/quest/Quest;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ail;->a(Lcom/google/android/gms/internal/ail$c;)V

    :cond_0
    return-void
.end method
