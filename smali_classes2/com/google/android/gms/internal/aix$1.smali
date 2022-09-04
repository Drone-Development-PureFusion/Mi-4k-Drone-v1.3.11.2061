.class Lcom/google/android/gms/internal/aix$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/aix$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/aix;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/aix;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/aix;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/aix$1;->a:Lcom/google/android/gms/internal/aix;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/ahn;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahn",
            "<*>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/aix$1;->a:Lcom/google/android/gms/internal/aix;

    iget-object v0, v0, Lcom/google/android/gms/internal/aix;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ahn;->f()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/aix$1;->a:Lcom/google/android/gms/internal/aix;

    invoke-static {v0}, Lcom/google/android/gms/internal/aix;->a(Lcom/google/android/gms/internal/aix;)Lcom/google/android/gms/common/api/w;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/aix$1;->a:Lcom/google/android/gms/internal/aix;

    invoke-static {v0}, Lcom/google/android/gms/internal/aix;->a(Lcom/google/android/gms/internal/aix;)Lcom/google/android/gms/common/api/w;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ahn;->f()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/w;->a(I)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/aix$1;->a:Lcom/google/android/gms/internal/aix;

    invoke-static {v0}, Lcom/google/android/gms/internal/aix;->b(Lcom/google/android/gms/internal/aix;)Lcom/google/android/gms/internal/aix$c;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/aix$1;->a:Lcom/google/android/gms/internal/aix;

    iget-object v0, v0, Lcom/google/android/gms/internal/aix;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/aix$1;->a:Lcom/google/android/gms/internal/aix;

    invoke-static {v0}, Lcom/google/android/gms/internal/aix;->b(Lcom/google/android/gms/internal/aix;)Lcom/google/android/gms/internal/aix$c;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/aix$c;->a()V

    :cond_1
    return-void
.end method
