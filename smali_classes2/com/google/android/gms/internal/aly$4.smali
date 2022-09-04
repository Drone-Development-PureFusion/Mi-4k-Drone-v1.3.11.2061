.class Lcom/google/android/gms/internal/aly$4;
.super Lcom/google/android/gms/internal/akt$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/aly;->b(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/fitness/data/DataType;

.field final synthetic b:Lcom/google/android/gms/internal/aly;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/aly;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/data/DataType;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/aly$4;->b:Lcom/google/android/gms/internal/aly;

    iput-object p3, p0, Lcom/google/android/gms/internal/aly$4;->a:Lcom/google/android/gms/fitness/data/DataType;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/akt$c;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/akt;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/aly$4;->a(Lcom/google/android/gms/internal/akt;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/akt;)V
    .locals 5

    new-instance v1, Lcom/google/android/gms/internal/amb;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/amb;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/akt;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/alh;

    new-instance v2, Lcom/google/android/gms/fitness/request/UnsubscribeRequest;

    iget-object v3, p0, Lcom/google/android/gms/internal/aly$4;->a:Lcom/google/android/gms/fitness/data/DataType;

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4, v1}, Lcom/google/android/gms/fitness/request/UnsubscribeRequest;-><init>(Lcom/google/android/gms/fitness/data/DataType;Lcom/google/android/gms/fitness/data/DataSource;Lcom/google/android/gms/internal/alq;)V

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/alh;->a(Lcom/google/android/gms/fitness/request/UnsubscribeRequest;)V

    return-void
.end method
