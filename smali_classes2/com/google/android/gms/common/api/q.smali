.class public abstract Lcom/google/android/gms/common/api/q;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R::",
        "Lcom/google/android/gms/common/api/m;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(Lcom/google/android/gms/common/api/p;)Lcom/google/android/gms/common/api/q;
    .param p1    # Lcom/google/android/gms/common/api/p;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S::",
            "Lcom/google/android/gms/common/api/m;",
            ">(",
            "Lcom/google/android/gms/common/api/p",
            "<-TR;+TS;>;)",
            "Lcom/google/android/gms/common/api/q",
            "<TS;>;"
        }
    .end annotation
.end method

.method public abstract a(Lcom/google/android/gms/common/api/o;)V
    .param p1    # Lcom/google/android/gms/common/api/o;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/o",
            "<-TR;>;)V"
        }
    .end annotation
.end method
