.class Lcom/google/android/gms/internal/wo$a;
.super Lcom/google/android/gms/ads/internal/client/ag$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/wo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/ads/internal/client/ag;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/client/ag;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/client/ag$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/wo$a;->a:Lcom/google/android/gms/ads/internal/client/ag;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/wo$a;->a:Lcom/google/android/gms/ads/internal/client/ag;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/ag;->a()V

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->t()Lcom/google/android/gms/internal/wp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/wp;->a()V

    return-void
.end method

.method public a(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/wo$a;->a:Lcom/google/android/gms/ads/internal/client/ag;

    invoke-interface {v0, p1}, Lcom/google/android/gms/ads/internal/client/ag;->a(I)V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/wo$a;->a:Lcom/google/android/gms/ads/internal/client/ag;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/ag;->b()V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/wo$a;->a:Lcom/google/android/gms/ads/internal/client/ag;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/ag;->c()V

    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/wo$a;->a:Lcom/google/android/gms/ads/internal/client/ag;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/ag;->d()V

    return-void
.end method
