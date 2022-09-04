.class Lcom/google/android/gms/fitness/service/c;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/fitness/service/a;


# instance fields
.field private final a:Lcom/google/android/gms/fitness/data/y;


# direct methods
.method constructor <init>(Lcom/google/android/gms/fitness/data/y;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/fitness/data/y;

    iput-object v0, p0, Lcom/google/android/gms/fitness/service/c;->a:Lcom/google/android/gms/fitness/data/y;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/fitness/data/DataPoint;)V
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/fitness/data/DataPoint;->h()V

    iget-object v0, p0, Lcom/google/android/gms/fitness/service/c;->a:Lcom/google/android/gms/fitness/data/y;

    invoke-interface {v0, p1}, Lcom/google/android/gms/fitness/data/y;->a(Lcom/google/android/gms/fitness/data/DataPoint;)V

    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataPoint;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/fitness/data/DataPoint;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/fitness/service/c;->a(Lcom/google/android/gms/fitness/data/DataPoint;)V

    goto :goto_0

    :cond_0
    return-void
.end method
