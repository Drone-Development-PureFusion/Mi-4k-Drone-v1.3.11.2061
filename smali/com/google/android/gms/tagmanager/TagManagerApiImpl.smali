.class public Lcom/google/android/gms/tagmanager/TagManagerApiImpl;
.super Lcom/google/android/gms/tagmanager/ak$a;


# annotations
.annotation build Lcom/google/android/gms/common/util/DynamiteApi;
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/internal/apx;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/ak$a;-><init>()V

    return-void
.end method


# virtual methods
.method public initialize(Lcom/google/android/gms/c/e;Lcom/google/android/gms/tagmanager/aj;Lcom/google/android/gms/tagmanager/af;)V
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/c/f;->a(Lcom/google/android/gms/c/e;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0, p2, p3}, Lcom/google/android/gms/internal/apx;->a(Landroid/content/Context;Lcom/google/android/gms/tagmanager/aj;Lcom/google/android/gms/tagmanager/af;)Lcom/google/android/gms/internal/apx;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/TagManagerApiImpl;->a:Lcom/google/android/gms/internal/apx;

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/TagManagerApiImpl;->a:Lcom/google/android/gms/internal/apx;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/apx;->a()V

    return-void
.end method

.method public preview(Landroid/content/Intent;Lcom/google/android/gms/c/e;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "Deprecated. Please use previewIntent instead."

    invoke-static {v0}, Lcom/google/android/gms/internal/aph;->b(Ljava/lang/String;)V

    return-void
.end method

.method public previewIntent(Landroid/content/Intent;Lcom/google/android/gms/c/e;Lcom/google/android/gms/c/e;Lcom/google/android/gms/tagmanager/aj;Lcom/google/android/gms/tagmanager/af;)V
    .locals 4

    invoke-static {p2}, Lcom/google/android/gms/c/f;->a(Lcom/google/android/gms/c/e;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {p3}, Lcom/google/android/gms/c/f;->a(Lcom/google/android/gms/c/e;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-static {v0, p4, p5}, Lcom/google/android/gms/internal/apx;->a(Landroid/content/Context;Lcom/google/android/gms/tagmanager/aj;Lcom/google/android/gms/tagmanager/af;)Lcom/google/android/gms/internal/apx;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/tagmanager/TagManagerApiImpl;->a:Lcom/google/android/gms/internal/apx;

    new-instance v2, Lcom/google/android/gms/internal/apl;

    iget-object v3, p0, Lcom/google/android/gms/tagmanager/TagManagerApiImpl;->a:Lcom/google/android/gms/internal/apx;

    invoke-direct {v2, p1, v0, v1, v3}, Lcom/google/android/gms/internal/apl;-><init>(Landroid/content/Intent;Landroid/content/Context;Landroid/content/Context;Lcom/google/android/gms/internal/apx;)V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/apl;->a()V

    return-void
.end method
