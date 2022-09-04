.class Lcom/google/android/gms/internal/aga$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/aga;-><init>(Landroid/widget/ImageView;Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/aga;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/aga;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/aga$2;->a:Lcom/google/android/gms/internal/aga;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    const/4 v3, 0x1

    const/4 v4, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/aga$2;->a:Lcom/google/android/gms/internal/aga;

    invoke-static {v0}, Lcom/google/android/gms/internal/aga;->b(Lcom/google/android/gms/internal/aga;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/c;->a(Landroid/content/Context;)Lcom/google/android/gms/cast/framework/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/c;->b()Lcom/google/android/gms/cast/framework/k;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/k;->b()Lcom/google/android/gms/cast/framework/d;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/d;->o()Z

    move-result v1

    if-eqz v1, :cond_0

    :try_start_0
    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/d;->i()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/framework/d;->b(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/aga$2;->a:Lcom/google/android/gms/internal/aga;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/aga;->a(Lcom/google/android/gms/internal/aga;Z)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/framework/d;->b(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/aga$2;->a:Lcom/google/android/gms/internal/aga;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/aga;->a(Lcom/google/android/gms/internal/aga;Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :catch_0
    move-exception v0

    :goto_1
    invoke-static {}, Lcom/google/android/gms/internal/aga;->e()Lcom/google/android/gms/cast/internal/m;

    move-result-object v1

    const-string v2, "Unable to call CastSession.setMute(boolean)."

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v0, v3, v4

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/cast/internal/m;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1
.end method
