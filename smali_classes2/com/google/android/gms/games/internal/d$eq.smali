.class final Lcom/google/android/gms/games/internal/d$eq;
.super Lcom/google/android/gms/games/internal/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "eq"
.end annotation


# virtual methods
.method public U(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 3

    const/4 v1, 0x0

    new-instance v2, Lcom/google/android/gms/games/social/c;

    invoke-direct {v2, p1}, Lcom/google/android/gms/games/social/c;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    :try_start_0
    invoke-virtual {v2}, Lcom/google/android/gms/games/social/c;->c()I

    move-result v0

    if-lez v0, :cond_1

    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/google/android/gms/games/social/c;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/social/SocialInvite;

    invoke-interface {v0}, Lcom/google/android/gms/games/social/SocialInvite;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/social/SocialInvite;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-virtual {v2}, Lcom/google/android/gms/games/social/c;->b()V

    if-eqz v0, :cond_0

    new-instance v2, Lcom/google/android/gms/games/internal/d$er;

    invoke-direct {v2, v0}, Lcom/google/android/gms/games/internal/d$er;-><init>(Lcom/google/android/gms/games/social/SocialInvite;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ail;->a(Lcom/google/android/gms/internal/ail$c;)V

    :cond_0
    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Lcom/google/android/gms/games/social/c;->b()V

    throw v0

    :cond_1
    move-object v0, v1

    goto :goto_0
.end method

.method public V(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 3

    const/4 v1, 0x0

    new-instance v2, Lcom/google/android/gms/games/social/c;

    invoke-direct {v2, p1}, Lcom/google/android/gms/games/social/c;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    :try_start_0
    invoke-virtual {v2}, Lcom/google/android/gms/games/social/c;->c()I

    move-result v0

    if-lez v0, :cond_1

    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/google/android/gms/games/social/c;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/social/SocialInvite;

    invoke-interface {v0}, Lcom/google/android/gms/games/social/SocialInvite;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/social/SocialInvite;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-virtual {v2}, Lcom/google/android/gms/games/social/c;->b()V

    if-eqz v0, :cond_0

    new-instance v2, Lcom/google/android/gms/games/internal/d$ep;

    invoke-direct {v2, v0}, Lcom/google/android/gms/games/internal/d$ep;-><init>(Lcom/google/android/gms/games/social/SocialInvite;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ail;->a(Lcom/google/android/gms/internal/ail$c;)V

    :cond_0
    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Lcom/google/android/gms/games/social/c;->b()V

    throw v0

    :cond_1
    move-object v0, v1

    goto :goto_0
.end method
