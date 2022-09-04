.class public final Lcom/google/android/gms/ads/internal/request/d$a;
.super Lcom/google/android/gms/ads/internal/request/d;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/ads/internal/request/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/acr;Lcom/google/android/gms/ads/internal/request/c$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/gms/internal/acr",
            "<",
            "Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;",
            ">;",
            "Lcom/google/android/gms/ads/internal/request/c$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/ads/internal/request/d;-><init>(Lcom/google/android/gms/internal/acr;Lcom/google/android/gms/ads/internal/request/c$a;)V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/request/d$a;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b()Lcom/google/android/gms/ads/internal/request/k;
    .locals 3

    new-instance v1, Lcom/google/android/gms/internal/ty;

    sget-object v0, Lcom/google/android/gms/internal/uf;->b:Lcom/google/android/gms/internal/ub;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ub;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ty;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/request/d$a;->a:Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/internal/aad;->a()Lcom/google/android/gms/internal/aad;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/aae;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ty;Lcom/google/android/gms/internal/aad;)Lcom/google/android/gms/internal/aae;

    move-result-object v0

    return-object v0
.end method

.method public synthetic e()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/ads/internal/request/d;->c()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
