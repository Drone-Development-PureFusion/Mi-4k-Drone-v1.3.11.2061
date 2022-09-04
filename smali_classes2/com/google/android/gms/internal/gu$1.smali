.class Lcom/google/android/gms/internal/gu$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/g/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/gu;->a(ZLcom/google/android/gms/internal/hy$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/hy$a;

.field final synthetic b:Lcom/google/android/gms/internal/gu;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/gu;Lcom/google/android/gms/internal/hy$a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/gu$1;->b:Lcom/google/android/gms/internal/gu;

    iput-object p2, p0, Lcom/google/android/gms/internal/gu$1;->a:Lcom/google/android/gms/internal/hy$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private b(Ljava/lang/Exception;)Z
    .locals 1

    instance-of v0, p1, Lcom/google/firebase/a;

    if-nez v0, :cond_0

    instance-of v0, p1, Lcom/google/android/gms/internal/ms;

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(Ljava/lang/Exception;)V
    .locals 2
    .param p1    # Ljava/lang/Exception;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/gu$1;->b(Ljava/lang/Exception;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/gu$1;->a:Lcom/google/android/gms/internal/hy$a;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/hy$a;->a(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/gu$1;->a:Lcom/google/android/gms/internal/hy$a;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/hy$a;->b(Ljava/lang/String;)V

    goto :goto_0
.end method
