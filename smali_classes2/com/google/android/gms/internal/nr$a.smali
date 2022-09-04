.class Lcom/google/android/gms/internal/nr$a;
.super Lcom/google/android/gms/internal/oj;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/nr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/internal/oj",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/internal/oj;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/oj",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/oj;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/oj;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/oj",
            "<TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/nr$a;->a:Lcom/google/android/gms/internal/oj;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/nr$a;->a:Lcom/google/android/gms/internal/oj;

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ps;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ps;",
            "TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/nr$a;->a:Lcom/google/android/gms/internal/oj;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/nr$a;->a:Lcom/google/android/gms/internal/oj;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/oj;->a(Lcom/google/android/gms/internal/ps;Ljava/lang/Object;)V

    return-void
.end method

.method public b(Lcom/google/android/gms/internal/pp;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/pp;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/nr$a;->a:Lcom/google/android/gms/internal/oj;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/nr$a;->a:Lcom/google/android/gms/internal/oj;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/oj;->b(Lcom/google/android/gms/internal/pp;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
