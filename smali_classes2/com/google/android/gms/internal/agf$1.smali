.class Lcom/google/android/gms/internal/agf$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/agf;-><init>(Landroid/view/View;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/agf;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/agf;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/agf$1;->a:Lcom/google/android/gms/internal/agf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/agf$1;->a:Lcom/google/android/gms/internal/agf;

    invoke-static {v0}, Lcom/google/android/gms/internal/agf;->a(Lcom/google/android/gms/internal/agf;)Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->t()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/framework/media/c;->e(Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    :cond_0
    return-void
.end method
