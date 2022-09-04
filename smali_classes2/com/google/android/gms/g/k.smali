.class Lcom/google/android/gms/g/k;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/g/c;
.implements Lcom/google/android/gms/g/d;
.implements Lcom/google/android/gms/g/o;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        "TContinuationResult:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/g/c;",
        "Lcom/google/android/gms/g/d",
        "<TTContinuationResult;>;",
        "Lcom/google/android/gms/g/o",
        "<TTResult;>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Lcom/google/android/gms/g/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/g/a",
            "<TTResult;",
            "Lcom/google/android/gms/g/f",
            "<TTContinuationResult;>;>;"
        }
    .end annotation
.end field

.field private final c:Lcom/google/android/gms/g/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/g/q",
            "<TTContinuationResult;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lcom/google/android/gms/g/a;Lcom/google/android/gms/g/q;)V
    .locals 0
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/gms/g/a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/google/android/gms/g/q;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lcom/google/android/gms/g/a",
            "<TTResult;",
            "Lcom/google/android/gms/g/f",
            "<TTContinuationResult;>;>;",
            "Lcom/google/android/gms/g/q",
            "<TTContinuationResult;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/g/k;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lcom/google/android/gms/g/k;->b:Lcom/google/android/gms/g/a;

    iput-object p3, p0, Lcom/google/android/gms/g/k;->c:Lcom/google/android/gms/g/q;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/g/k;)Lcom/google/android/gms/g/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/g/k;->b:Lcom/google/android/gms/g/a;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/g/k;)Lcom/google/android/gms/g/q;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/g/k;->c:Lcom/google/android/gms/g/q;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public a(Lcom/google/android/gms/g/f;)V
    .locals 2
    .param p1    # Lcom/google/android/gms/g/f;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/g/f",
            "<TTResult;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/g/k;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/google/android/gms/g/k$1;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/g/k$1;-><init>(Lcom/google/android/gms/g/k;Lcom/google/android/gms/g/f;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Ljava/lang/Exception;)V
    .locals 1
    .param p1    # Ljava/lang/Exception;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/gms/g/k;->c:Lcom/google/android/gms/g/q;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/g/q;->a(Ljava/lang/Exception;)V

    return-void
.end method

.method public a(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTContinuationResult;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/g/k;->c:Lcom/google/android/gms/g/q;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/g/q;->a(Ljava/lang/Object;)V

    return-void
.end method
