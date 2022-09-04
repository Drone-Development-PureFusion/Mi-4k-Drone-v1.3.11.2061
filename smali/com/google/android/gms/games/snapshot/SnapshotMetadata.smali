.class public interface abstract Lcom/google/android/gms/games/snapshot/SnapshotMetadata;
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
        "Lcom/google/android/gms/games/snapshot/SnapshotMetadata;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:J = -0x1L

.field public static final b:J = -0x1L


# virtual methods
.method public abstract a(Landroid/database/CharArrayBuffer;)V
.end method

.method public abstract c()Lcom/google/android/gms/games/Game;
.end method

.method public abstract d()Lcom/google/android/gms/games/Player;
.end method

.method public abstract e()Ljava/lang/String;
.end method

.method public abstract f()Landroid/net/Uri;
.end method

.method public abstract g()F
.end method

.method public abstract getCoverImageUrl()Ljava/lang/String;
    .annotation build Lcom/google/android/gms/common/annotation/KeepName;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract h()Ljava/lang/String;
.end method

.method public abstract i()Ljava/lang/String;
.end method

.method public abstract j()Ljava/lang/String;
.end method

.method public abstract k()J
.end method

.method public abstract l()J
.end method

.method public abstract m()Z
.end method

.method public abstract n()J
.end method

.method public abstract o()Ljava/lang/String;
.end method
