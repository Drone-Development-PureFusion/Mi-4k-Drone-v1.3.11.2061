.class public Lcom/google/android/gms/internal/acm;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/aco;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/aco",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private final b:Lcom/google/android/gms/internal/acp;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/acm;->a:Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/acp;

    invoke-direct {v0}, Lcom/google/android/gms/internal/acp;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/acm;->b:Lcom/google/android/gms/internal/acp;

    iget-object v0, p0, Lcom/google/android/gms/internal/acm;->b:Lcom/google/android/gms/internal/acp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/acp;->a()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/acm;->b:Lcom/google/android/gms/internal/acp;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/acp;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public cancel(Z)Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/acm;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/acm;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public isCancelled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isDone()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
