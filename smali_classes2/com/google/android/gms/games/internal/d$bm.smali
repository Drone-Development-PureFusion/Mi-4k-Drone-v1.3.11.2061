.class final Lcom/google/android/gms/games/internal/d$bm;
.super Lcom/google/android/gms/games/internal/d$ax;

# interfaces
.implements Lcom/google/android/gms/games/social/b$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "bm"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/games/social/SocialInvite;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 3

    invoke-direct {p0, p1}, Lcom/google/android/gms/games/internal/d$ax;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    new-instance v1, Lcom/google/android/gms/games/social/c;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/social/c;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    :try_start_0
    invoke-virtual {v1}, Lcom/google/android/gms/games/social/c;->c()I

    move-result v0

    if-lez v0, :cond_0

    new-instance v2, Lcom/google/android/gms/games/social/SocialInviteEntity;

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/games/social/c;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/social/SocialInvite;

    invoke-direct {v2, v0}, Lcom/google/android/gms/games/social/SocialInviteEntity;-><init>(Lcom/google/android/gms/games/social/SocialInvite;)V

    iput-object v2, p0, Lcom/google/android/gms/games/internal/d$bm;->a:Lcom/google/android/gms/games/social/SocialInvite;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-virtual {v1}, Lcom/google/android/gms/games/social/c;->b()V

    return-void

    :cond_0
    const/4 v0, 0x0

    :try_start_1
    iput-object v0, p0, Lcom/google/android/gms/games/internal/d$bm;->a:Lcom/google/android/gms/games/social/SocialInvite;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Lcom/google/android/gms/games/social/c;->b()V

    throw v0
.end method
