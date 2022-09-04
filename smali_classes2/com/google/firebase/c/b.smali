.class public abstract Lcom/google/firebase/c/b;
.super Lcom/google/firebase/c/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TState:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/firebase/c/a",
        "<TTState;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/c/a;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(Landroid/app/Activity;Lcom/google/firebase/c/e;)Lcom/google/firebase/c/b;
    .param p1    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/firebase/c/e;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lcom/google/firebase/c/e",
            "<-TTState;>;)",
            "Lcom/google/firebase/c/b",
            "<TTState;>;"
        }
    .end annotation
.end method

.method public abstract a(Lcom/google/firebase/c/e;)Lcom/google/firebase/c/b;
    .param p1    # Lcom/google/firebase/c/e;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/c/e",
            "<-TTState;>;)",
            "Lcom/google/firebase/c/b",
            "<TTState;>;"
        }
    .end annotation
.end method

.method public abstract a(Ljava/util/concurrent/Executor;Lcom/google/firebase/c/e;)Lcom/google/firebase/c/b;
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/firebase/c/e;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lcom/google/firebase/c/e",
            "<-TTState;>;)",
            "Lcom/google/firebase/c/b",
            "<TTState;>;"
        }
    .end annotation
.end method

.method public abstract h()Z
.end method

.method public abstract i()Z
.end method

.method public abstract j()Z
.end method
