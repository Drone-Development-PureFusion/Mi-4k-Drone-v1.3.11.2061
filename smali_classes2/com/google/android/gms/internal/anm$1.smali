.class Lcom/google/android/gms/internal/anm$1;
.super Lcom/google/android/gms/internal/anm$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/anm;->a(Lcom/google/android/gms/common/api/g;Landroid/net/Uri;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/net/Uri;

.field final synthetic b:Lcom/google/android/gms/internal/anm;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/anm;Lcom/google/android/gms/common/api/g;Landroid/net/Uri;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/anm$1;->b:Lcom/google/android/gms/internal/anm;

    iput-object p3, p0, Lcom/google/android/gms/internal/anm$1;->a:Landroid/net/Uri;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/anm$a;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected a(Landroid/content/Context;Lcom/google/android/gms/internal/anl;)V
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/anm$b;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/anm$b;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/anm$1;->a:Landroid/net/Uri;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {p2, v0, v1, v2, v3}, Lcom/google/android/gms/internal/anl;->a(Lcom/google/android/gms/internal/anj;Landroid/net/Uri;Landroid/os/Bundle;Z)V

    return-void
.end method
