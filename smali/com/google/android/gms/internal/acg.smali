.class public final Lcom/google/android/gms/internal/acg;
.super Lcom/google/android/gms/internal/abq;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/ads/internal/util/client/c;

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->e()Lcom/google/android/gms/internal/abv;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/abv;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p3, v0}, Lcom/google/android/gms/internal/acg;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/abq;-><init>()V

    new-instance v0, Lcom/google/android/gms/ads/internal/util/client/c;

    invoke-direct {v0, p2}, Lcom/google/android/gms/ads/internal/util/client/c;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/acg;->a:Lcom/google/android/gms/ads/internal/util/client/c;

    iput-object p1, p0, Lcom/google/android/gms/internal/acg;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/acg;->a:Lcom/google/android/gms/ads/internal/util/client/c;

    iget-object v1, p0, Lcom/google/android/gms/internal/acg;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/util/client/c;->a(Ljava/lang/String;)V

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method
