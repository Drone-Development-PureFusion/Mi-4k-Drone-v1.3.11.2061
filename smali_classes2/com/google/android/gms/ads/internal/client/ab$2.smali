.class Lcom/google/android/gms/ads/internal/client/ab$2;
.super Lcom/google/android/gms/ads/internal/client/ab$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/ads/internal/client/ab;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;)Lcom/google/android/gms/ads/internal/client/ak;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/ads/internal/client/ab$a",
        "<",
        "Lcom/google/android/gms/ads/internal/client/ak;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/google/android/gms/ads/internal/client/ab;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/client/ab;Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/ab$2;->d:Lcom/google/android/gms/ads/internal/client/ab;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/client/ab$2;->a:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/client/ab$2;->b:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iput-object p4, p0, Lcom/google/android/gms/ads/internal/client/ab$2;->c:Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/google/android/gms/ads/internal/client/ab$a;-><init>(Lcom/google/android/gms/ads/internal/client/ab;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/ads/internal/client/ak;
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/ab$2;->d:Lcom/google/android/gms/ads/internal/client/ab;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/client/ab;->b(Lcom/google/android/gms/ads/internal/client/ab;)Lcom/google/android/gms/ads/internal/client/v;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/ab$2;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/ab$2;->b:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/client/ab$2;->c:Ljava/lang/String;

    const/4 v4, 0x0

    const/4 v5, 0x3

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/ads/internal/client/v;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;Lcom/google/android/gms/internal/xq;I)Lcom/google/android/gms/ads/internal/client/ak;

    move-result-object v0

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/ab$2;->d:Lcom/google/android/gms/ads/internal/client/ab;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/ab$2;->a:Landroid/content/Context;

    const-string v2, "search"

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/ads/internal/client/ab;->a(Lcom/google/android/gms/ads/internal/client/ab;Landroid/content/Context;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/ads/internal/client/l;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/client/l;-><init>()V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/ads/internal/client/an;)Lcom/google/android/gms/ads/internal/client/ak;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/ab$2;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/ab$2;->b:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/ab$2;->c:Ljava/lang/String;

    const v3, 0x93c038

    invoke-interface {p1, v0, v1, v2, v3}, Lcom/google/android/gms/ads/internal/client/an;->createSearchAdManager(Lcom/google/android/gms/c/e;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;I)Lcom/google/android/gms/ads/internal/client/ak;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/client/ab$2;->a()Lcom/google/android/gms/ads/internal/client/ak;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b(Lcom/google/android/gms/ads/internal/client/an;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/ads/internal/client/ab$2;->a(Lcom/google/android/gms/ads/internal/client/an;)Lcom/google/android/gms/ads/internal/client/ak;

    move-result-object v0

    return-object v0
.end method
