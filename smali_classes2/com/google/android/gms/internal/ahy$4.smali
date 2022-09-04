.class Lcom/google/android/gms/internal/ahy$4;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ahy;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/internal/aiu;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/common/api/n",
        "<",
        "Lcom/google/android/gms/common/api/Status;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/aiu;

.field final synthetic b:Z

.field final synthetic c:Lcom/google/android/gms/common/api/g;

.field final synthetic d:Lcom/google/android/gms/internal/ahy;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ahy;Lcom/google/android/gms/internal/aiu;ZLcom/google/android/gms/common/api/g;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ahy$4;->d:Lcom/google/android/gms/internal/ahy;

    iput-object p2, p0, Lcom/google/android/gms/internal/ahy$4;->a:Lcom/google/android/gms/internal/aiu;

    iput-boolean p3, p0, Lcom/google/android/gms/internal/ahy$4;->b:Z

    iput-object p4, p0, Lcom/google/android/gms/internal/ahy$4;->c:Lcom/google/android/gms/common/api/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;)V
    .locals 1
    .param p1    # Lcom/google/android/gms/common/api/Status;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy$4;->d:Lcom/google/android/gms/internal/ahy;

    invoke-static {v0}, Lcom/google/android/gms/internal/ahy;->c(Lcom/google/android/gms/internal/ahy;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/auth/api/signin/internal/j;->a(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/internal/j;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/signin/internal/j;->c()V

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy$4;->d:Lcom/google/android/gms/internal/ahy;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ahy;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy$4;->d:Lcom/google/android/gms/internal/ahy;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ahy;->h()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ahy$4;->a:Lcom/google/android/gms/internal/aiu;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/aiu;->b(Lcom/google/android/gms/common/api/m;)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ahy$4;->b:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy$4;->c:Lcom/google/android/gms/common/api/g;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/g;->g()V

    :cond_1
    return-void
.end method

.method public synthetic a(Lcom/google/android/gms/common/api/m;)V
    .locals 0
    .param p1    # Lcom/google/android/gms/common/api/m;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ahy$4;->a(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method
