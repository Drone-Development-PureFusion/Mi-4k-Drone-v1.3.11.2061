.class public Lcom/google/android/gms/g/g;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/g/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/g/q",
            "<TTResult;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/g/q;

    invoke-direct {v0}, Lcom/google/android/gms/g/q;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/g/g;->a:Lcom/google/android/gms/g/q;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/g/f;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/g/f",
            "<TTResult;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/g/g;->a:Lcom/google/android/gms/g/q;

    return-object v0
.end method

.method public a(Ljava/lang/Exception;)V
    .locals 1
    .param p1    # Ljava/lang/Exception;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/gms/g/g;->a:Lcom/google/android/gms/g/q;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/g/q;->a(Ljava/lang/Exception;)V

    return-void
.end method

.method public a(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTResult;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/g/g;->a:Lcom/google/android/gms/g/q;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/g/q;->a(Ljava/lang/Object;)V

    return-void
.end method
