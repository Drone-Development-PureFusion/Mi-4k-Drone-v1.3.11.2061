.class Lcom/google/firebase/database/b$1$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/database/b$1;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator",
        "<",
        "Lcom/google/firebase/database/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/firebase/database/b$1;


# direct methods
.method constructor <init>(Lcom/google/firebase/database/b$1;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/database/b$1$1;->a:Lcom/google/firebase/database/b$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/firebase/database/b;
    .locals 4

    iget-object v0, p0, Lcom/google/firebase/database/b$1$1;->a:Lcom/google/firebase/database/b$1;

    iget-object v0, v0, Lcom/google/firebase/database/b$1;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/lg;

    new-instance v1, Lcom/google/firebase/database/b;

    iget-object v2, p0, Lcom/google/firebase/database/b$1$1;->a:Lcom/google/firebase/database/b$1;

    iget-object v2, v2, Lcom/google/firebase/database/b$1;->b:Lcom/google/firebase/database/b;

    invoke-static {v2}, Lcom/google/firebase/database/b;->a(Lcom/google/firebase/database/b;)Lcom/google/firebase/database/e;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/lg;->c()Lcom/google/android/gms/internal/kv;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/kv;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/firebase/database/e;->a(Ljava/lang/String;)Lcom/google/firebase/database/e;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/lg;->d()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/lc;->a(Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lc;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/google/firebase/database/b;-><init>(Lcom/google/firebase/database/e;Lcom/google/android/gms/internal/lc;)V

    return-object v1
.end method

.method public hasNext()Z
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/database/b$1$1;->a:Lcom/google/firebase/database/b$1;

    iget-object v0, v0, Lcom/google/firebase/database/b$1;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/firebase/database/b$1$1;->a()Lcom/google/firebase/database/b;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "remove called on immutable collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
