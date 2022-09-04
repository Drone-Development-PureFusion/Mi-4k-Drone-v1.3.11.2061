.class Lcom/google/android/gms/internal/aez$1;
.super Lcom/google/android/gms/internal/aey;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/aez;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/auth/api/proxy/ProxyRequest;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/auth/api/proxy/ProxyRequest;

.field final synthetic b:Lcom/google/android/gms/internal/aez;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/aez;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/auth/api/proxy/ProxyRequest;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/aez$1;->b:Lcom/google/android/gms/internal/aez;

    iput-object p3, p0, Lcom/google/android/gms/internal/aez$1;->a:Lcom/google/android/gms/auth/api/proxy/ProxyRequest;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/aey;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected a(Landroid/content/Context;Lcom/google/android/gms/internal/aex;)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/aez$1$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/aez$1$1;-><init>(Lcom/google/android/gms/internal/aez$1;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/aez$1;->a:Lcom/google/android/gms/auth/api/proxy/ProxyRequest;

    invoke-interface {p2, v0, v1}, Lcom/google/android/gms/internal/aex;->a(Lcom/google/android/gms/internal/aew;Lcom/google/android/gms/auth/api/proxy/ProxyRequest;)V

    return-void
.end method
