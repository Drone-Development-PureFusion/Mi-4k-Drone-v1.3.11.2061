.class Lcom/google/android/gms/internal/agb$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/agb;-><init>(Landroid/widget/ImageView;Landroid/content/Context;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/view/View;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/agb;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/agb;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/agb$1;->a:Lcom/google/android/gms/internal/agb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/agb$1;->a:Lcom/google/android/gms/internal/agb;

    invoke-static {v0}, Lcom/google/android/gms/internal/agb;->a(Lcom/google/android/gms/internal/agb;)Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->t()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->s()V

    :cond_0
    return-void
.end method
