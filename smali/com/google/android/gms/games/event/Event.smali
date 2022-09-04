.class public interface abstract Lcom/google/android/gms/games/event/Event;
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
        "Lcom/google/android/gms/games/event/Event;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract a(Landroid/database/CharArrayBuffer;)V
.end method

.method public abstract b(Landroid/database/CharArrayBuffer;)V
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public abstract c(Landroid/database/CharArrayBuffer;)V
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e()Ljava/lang/String;
.end method

.method public abstract f()Landroid/net/Uri;
.end method

.method public abstract g()Lcom/google/android/gms/games/Player;
.end method

.method public abstract getIconImageUrl()Ljava/lang/String;
    .annotation build Lcom/google/android/gms/common/annotation/KeepName;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract h()J
.end method

.method public abstract i()Ljava/lang/String;
.end method

.method public abstract j()Z
.end method
