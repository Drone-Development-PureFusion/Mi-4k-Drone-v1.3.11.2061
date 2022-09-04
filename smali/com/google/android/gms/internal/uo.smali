.class public final Lcom/google/android/gms/internal/uo;
.super Lcom/google/android/gms/internal/uq$a;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/ads/internal/h;

.field private final b:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/internal/h;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Lcom/google/android/gms/internal/uq$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/uo;->a:Lcom/google/android/gms/ads/internal/h;

    iput-object p2, p0, Lcom/google/android/gms/internal/uo;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/uo;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/uo;->b:Ljava/lang/String;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/c/e;)V
    .locals 2
    .param p1    # Lcom/google/android/gms/c/e;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/uo;->a:Lcom/google/android/gms/ads/internal/h;

    invoke-static {p1}, Lcom/google/android/gms/c/f;->a(Lcom/google/android/gms/c/e;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-interface {v1, v0}, Lcom/google/android/gms/ads/internal/h;->b(Landroid/view/View;)V

    goto :goto_0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/uo;->c:Ljava/lang/String;

    return-object v0
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/uo;->a:Lcom/google/android/gms/ads/internal/h;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/h;->E()V

    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/uo;->a:Lcom/google/android/gms/ads/internal/h;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/h;->F()V

    return-void
.end method
