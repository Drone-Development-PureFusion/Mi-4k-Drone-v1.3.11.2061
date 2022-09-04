.class public interface abstract Lcom/google/android/gms/games/Player;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable;
.implements Lcom/google/android/gms/common/data/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable;",
        "Lcom/google/android/gms/common/data/f",
        "<",
        "Lcom/google/android/gms/games/Player;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:J = -0x1L

.field public static final b:J = -0x1L


# virtual methods
.method public abstract a(Landroid/database/CharArrayBuffer;)V
.end method

.method public abstract b(Landroid/database/CharArrayBuffer;)V
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e()Ljava/lang/String;
.end method

.method public abstract f()Ljava/lang/String;
.end method

.method public abstract g()Z
.end method

.method public abstract getBannerImageLandscapeUrl()Ljava/lang/String;
    .annotation build Lcom/google/android/gms/common/annotation/KeepName;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract getBannerImagePortraitUrl()Ljava/lang/String;
    .annotation build Lcom/google/android/gms/common/annotation/KeepName;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract getHiResImageUrl()Ljava/lang/String;
    .annotation build Lcom/google/android/gms/common/annotation/KeepName;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract getIconImageUrl()Ljava/lang/String;
    .annotation build Lcom/google/android/gms/common/annotation/KeepName;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract h()Z
.end method

.method public abstract i()Landroid/net/Uri;
.end method

.method public abstract j()Z
.end method

.method public abstract k()Landroid/net/Uri;
.end method

.method public abstract l()J
.end method

.method public abstract m()J
.end method

.method public abstract n()I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract o()Z
.end method

.method public abstract p()Ljava/lang/String;
.end method

.method public abstract q()Lcom/google/android/gms/games/PlayerLevelInfo;
.end method

.method public abstract r()Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;
.end method

.method public abstract s()Landroid/net/Uri;
.end method

.method public abstract t()Landroid/net/Uri;
.end method

.method public abstract u()I
.end method

.method public abstract v()J
.end method

.method public abstract w()Z
.end method
