.class Lcom/google/android/gms/internal/wn$1;
.super Lcom/google/android/gms/ads/internal/client/ag$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/wn;->a(Lcom/google/android/gms/ads/internal/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/wn;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/wn;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/wn$1;->a:Lcom/google/android/gms/internal/wn;

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/client/ag$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/wn$1;->a:Lcom/google/android/gms/internal/wn;

    invoke-static {v0}, Lcom/google/android/gms/internal/wn;->a(Lcom/google/android/gms/internal/wn;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/wn$1$1;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/wn$1$1;-><init>(Lcom/google/android/gms/internal/wn$1;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public a(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/wn$1;->a:Lcom/google/android/gms/internal/wn;

    invoke-static {v0}, Lcom/google/android/gms/internal/wn;->a(Lcom/google/android/gms/internal/wn;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/wn$1$2;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/wn$1$2;-><init>(Lcom/google/android/gms/internal/wn$1;I)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v0, "Pooled interstitial failed to load."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->e(Ljava/lang/String;)V

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/wn$1;->a:Lcom/google/android/gms/internal/wn;

    invoke-static {v0}, Lcom/google/android/gms/internal/wn;->a(Lcom/google/android/gms/internal/wn;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/wn$1$3;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/wn$1$3;-><init>(Lcom/google/android/gms/internal/wn$1;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/wn$1;->a:Lcom/google/android/gms/internal/wn;

    invoke-static {v0}, Lcom/google/android/gms/internal/wn;->a(Lcom/google/android/gms/internal/wn;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/wn$1$4;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/wn$1$4;-><init>(Lcom/google/android/gms/internal/wn$1;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v0, "Pooled interstitial loaded."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->e(Ljava/lang/String;)V

    return-void
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/wn$1;->a:Lcom/google/android/gms/internal/wn;

    invoke-static {v0}, Lcom/google/android/gms/internal/wn;->a(Lcom/google/android/gms/internal/wn;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/wn$1$5;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/wn$1$5;-><init>(Lcom/google/android/gms/internal/wn$1;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method
