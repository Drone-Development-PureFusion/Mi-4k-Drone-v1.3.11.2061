.class final Lcom/google/android/gms/games/internal/d$cl;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/games/request/g$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "cl"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/common/api/Status;

.field private final b:Landroid/os/Bundle;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/Status;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/games/internal/d$cl;->a:Lcom/google/android/gms/common/api/Status;

    iput-object p2, p0, Lcom/google/android/gms/games/internal/d$cl;->b:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$cl;->a:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public a(I)Lcom/google/android/gms/games/request/a;
    .locals 2

    invoke-static {p1}, Lcom/google/android/gms/games/internal/b/r;->a(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/games/internal/d$cl;->b:Landroid/os/Bundle;

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/games/internal/d$cl;->b:Landroid/os/Bundle;

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/data/DataHolder;

    new-instance v1, Lcom/google/android/gms/games/request/a;

    invoke-direct {v1, v0}, Lcom/google/android/gms/games/request/a;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    move-object v0, v1

    goto :goto_0
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$cl;->b:Landroid/os/Bundle;

    invoke-virtual {v0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/games/internal/d$cl;->b:Landroid/os/Bundle;

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/data/DataHolder;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/common/data/DataHolder;->close()V

    goto :goto_0

    :cond_1
    return-void
.end method
