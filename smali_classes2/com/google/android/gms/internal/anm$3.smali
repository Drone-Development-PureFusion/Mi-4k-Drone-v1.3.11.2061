.class final Lcom/google/android/gms/internal/anm$3;
.super Lcom/google/android/gms/internal/anj$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/anm;->b(Landroid/content/Context;Lcom/google/android/gms/internal/anl;Lcom/google/android/gms/internal/anj;Landroid/net/Uri;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Landroid/net/Uri;

.field final synthetic c:Lcom/google/android/gms/internal/anj;


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/net/Uri;Lcom/google/android/gms/internal/anj;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/anm$3;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/anm$3;->b:Landroid/net/Uri;

    iput-object p3, p0, Lcom/google/android/gms/internal/anm$3;->c:Lcom/google/android/gms/internal/anj;

    invoke-direct {p0}, Lcom/google/android/gms/internal/anj$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILandroid/os/Bundle;ILandroid/content/Intent;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/anm$3;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/anm$3;->b:Landroid/net/Uri;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/anm;->a(Landroid/content/Context;Landroid/net/Uri;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/anm$3;->c:Lcom/google/android/gms/internal/anj;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/anj;->a(ILandroid/os/Bundle;ILandroid/content/Intent;)V

    return-void
.end method
