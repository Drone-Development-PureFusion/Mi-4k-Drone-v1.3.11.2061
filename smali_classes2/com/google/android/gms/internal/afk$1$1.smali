.class Lcom/google/android/gms/internal/afk$1$1;
.super Landroid/animation/AnimatorListenerAdapter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/afk$1;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/afk$1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/afk$1;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/afk$1$1;->a:Lcom/google/android/gms/internal/afk$1;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/afk$1$1;->a:Lcom/google/android/gms/internal/afk$1;

    iget-object v0, v0, Lcom/google/android/gms/internal/afk$1;->a:Lcom/google/android/gms/internal/afk;

    invoke-static {v0}, Lcom/google/android/gms/internal/afk;->a(Lcom/google/android/gms/internal/afk;)V

    return-void
.end method
