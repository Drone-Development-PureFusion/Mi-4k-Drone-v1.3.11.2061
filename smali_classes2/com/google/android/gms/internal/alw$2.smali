.class Lcom/google/android/gms/internal/alw$2;
.super Lcom/google/android/gms/internal/akr$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/alw;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/request/DataDeleteRequest;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/fitness/request/DataDeleteRequest;

.field final synthetic b:Lcom/google/android/gms/internal/alw;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/alw;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/request/DataDeleteRequest;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/alw$2;->b:Lcom/google/android/gms/internal/alw;

    iput-object p3, p0, Lcom/google/android/gms/internal/alw$2;->a:Lcom/google/android/gms/fitness/request/DataDeleteRequest;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/akr$c;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/akr;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/alw$2;->a(Lcom/google/android/gms/internal/akr;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/akr;)V
    .locals 4

    new-instance v1, Lcom/google/android/gms/internal/amb;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/amb;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/akr;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/alf;

    new-instance v2, Lcom/google/android/gms/fitness/request/DataDeleteRequest;

    iget-object v3, p0, Lcom/google/android/gms/internal/alw$2;->a:Lcom/google/android/gms/fitness/request/DataDeleteRequest;

    invoke-direct {v2, v3, v1}, Lcom/google/android/gms/fitness/request/DataDeleteRequest;-><init>(Lcom/google/android/gms/fitness/request/DataDeleteRequest;Lcom/google/android/gms/internal/alq;)V

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/alf;->a(Lcom/google/android/gms/fitness/request/DataDeleteRequest;)V

    return-void
.end method
