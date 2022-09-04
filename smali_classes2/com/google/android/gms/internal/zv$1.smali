.class Lcom/google/android/gms/internal/zv$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zv;->a(Lorg/json/JSONObject;)Lcom/google/android/gms/internal/aco;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lorg/json/JSONObject;

.field final synthetic b:Lcom/google/android/gms/internal/acl;

.field final synthetic c:Lcom/google/android/gms/internal/zv;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zv;Lorg/json/JSONObject;Lcom/google/android/gms/internal/acl;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zv$1;->c:Lcom/google/android/gms/internal/zv;

    iput-object p2, p0, Lcom/google/android/gms/internal/zv$1;->a:Lorg/json/JSONObject;

    iput-object p3, p0, Lcom/google/android/gms/internal/zv$1;->b:Lcom/google/android/gms/internal/acl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zv$1;->c:Lcom/google/android/gms/internal/zv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zv;->a()Lcom/google/android/gms/internal/acy;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/internal/zv$1;->c:Lcom/google/android/gms/internal/zv;

    invoke-static {v0}, Lcom/google/android/gms/internal/zv;->a(Lcom/google/android/gms/internal/zv;)Lcom/google/android/gms/ads/internal/q;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/q;->a(Lcom/google/android/gms/internal/acy;)V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v1}, Lcom/google/android/gms/internal/acy;->l()Lcom/google/android/gms/internal/acz;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/zv$1;->c:Lcom/google/android/gms/internal/zv;

    invoke-static {v3, v0}, Lcom/google/android/gms/internal/zv;->a(Lcom/google/android/gms/internal/zv;Ljava/lang/ref/WeakReference;)Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/internal/zv$1;->c:Lcom/google/android/gms/internal/zv;

    invoke-static {v4, v0}, Lcom/google/android/gms/internal/zv;->b(Lcom/google/android/gms/internal/zv;Ljava/lang/ref/WeakReference;)Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/internal/acz;->a(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zv$1;->c:Lcom/google/android/gms/internal/zv;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zv;->a(Lcom/google/android/gms/internal/zv;Lcom/google/android/gms/internal/acy;)V

    invoke-interface {v1}, Lcom/google/android/gms/internal/acy;->l()Lcom/google/android/gms/internal/acz;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/internal/zv$1$1;

    invoke-direct {v2, p0, v1}, Lcom/google/android/gms/internal/zv$1$1;-><init>(Lcom/google/android/gms/internal/zv$1;Lcom/google/android/gms/internal/acy;)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/acz;->a(Lcom/google/android/gms/internal/acz$b;)V

    invoke-interface {v1}, Lcom/google/android/gms/internal/acy;->l()Lcom/google/android/gms/internal/acz;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/internal/zv$1$2;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/zv$1$2;-><init>(Lcom/google/android/gms/internal/zv$1;)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/acz;->a(Lcom/google/android/gms/internal/acz$a;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zv$1;->c:Lcom/google/android/gms/internal/zv;

    invoke-static {v0}, Lcom/google/android/gms/internal/zv;->b(Lcom/google/android/gms/internal/zv;)Lcom/google/android/gms/internal/abi$a;

    move-result-object v2

    sget-object v0, Lcom/google/android/gms/internal/uf;->bJ:Lcom/google/android/gms/internal/ub;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ub;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/zt;->a(Lcom/google/android/gms/internal/abi$a;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/acy;->loadUrl(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Exception occurred while getting video view"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zv$1;->b:Lcom/google/android/gms/internal/acl;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/acl;->b(Ljava/lang/Object;)V

    goto :goto_0
.end method
