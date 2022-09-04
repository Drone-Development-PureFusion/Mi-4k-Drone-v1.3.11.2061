.class public Lcom/google/android/gms/internal/ke;
.super Ljava/lang/Object;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ig;

.field private final b:Lcom/google/android/gms/internal/ks;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ic;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ic;->l()Lcom/google/android/gms/internal/ig;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ke;->a:Lcom/google/android/gms/internal/ig;

    const-string v0, "EventRaiser"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ic;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ks;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ke;->b:Lcom/google/android/gms/internal/ks;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ke;)Lcom/google/android/gms/internal/ks;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ke;->b:Lcom/google/android/gms/internal/ks;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/kc;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ke;->b:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ke;->b:Lcom/google/android/gms/internal/ks;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x1c

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Raising "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " event(s)"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ke;->a:Lcom/google/android/gms/internal/ig;

    new-instance v2, Lcom/google/android/gms/internal/ke$1;

    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/internal/ke$1;-><init>(Lcom/google/android/gms/internal/ke;Ljava/util/ArrayList;)V

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ig;->a(Ljava/lang/Runnable;)V

    return-void
.end method
