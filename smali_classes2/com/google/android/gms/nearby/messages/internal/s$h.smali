.class abstract Lcom/google/android/gms/nearby/messages/internal/s$h;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/nearby/messages/internal/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<C:",
        "Ljava/lang/Object;",
        "W::",
        "Lcom/google/android/gms/nearby/messages/internal/s$a",
        "<TC;>;>",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Landroid/support/v4/util/SimpleArrayMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/util/SimpleArrayMap",
            "<TC;TW;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/support/v4/util/SimpleArrayMap;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/support/v4/util/SimpleArrayMap;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/s$h;->a:Landroid/support/v4/util/SimpleArrayMap;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/nearby/messages/internal/s$1;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/nearby/messages/internal/s$h;-><init>()V

    return-void
.end method


# virtual methods
.method a(Lcom/google/android/gms/internal/ail;Ljava/lang/Object;)Lcom/google/android/gms/nearby/messages/internal/s$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ail",
            "<TC;>;TC;)TW;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/s$h;->a:Landroid/support/v4/util/SimpleArrayMap;

    invoke-virtual {v0, p2}, Landroid/support/v4/util/SimpleArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/nearby/messages/internal/s$a;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ail;->a()V

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/gms/nearby/messages/internal/s$h;->b(Lcom/google/android/gms/internal/ail;)Lcom/google/android/gms/nearby/messages/internal/s$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/nearby/messages/internal/s$h;->a:Landroid/support/v4/util/SimpleArrayMap;

    invoke-virtual {v1, p2, v0}, Landroid/support/v4/util/SimpleArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method a(Ljava/lang/Object;)Lcom/google/android/gms/nearby/messages/internal/s$a;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;)TW;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/s$h;->a:Landroid/support/v4/util/SimpleArrayMap;

    invoke-virtual {v0, p1}, Landroid/support/v4/util/SimpleArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/nearby/messages/internal/s$a;

    return-object v0
.end method

.method protected abstract b(Lcom/google/android/gms/internal/ail;)Lcom/google/android/gms/nearby/messages/internal/s$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ail",
            "<TC;>;)TW;"
        }
    .end annotation
.end method

.method b(Ljava/lang/Object;)Lcom/google/android/gms/nearby/messages/internal/s$a;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;)TW;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/s$h;->a:Landroid/support/v4/util/SimpleArrayMap;

    invoke-virtual {v0, p1}, Landroid/support/v4/util/SimpleArrayMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/nearby/messages/internal/s$a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/nearby/messages/internal/s$a;->a()Lcom/google/android/gms/internal/ail;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ail;->a()V

    :cond_0
    return-object v0
.end method
