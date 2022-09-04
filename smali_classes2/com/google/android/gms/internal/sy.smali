.class public final Lcom/google/android/gms/internal/sy;
.super Ljava/lang/Object;


# instance fields
.field private final a:Lcom/google/android/gms/internal/tc;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/content/Context;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/tb;->a(Ljava/lang/String;Landroid/content/Context;Z)Lcom/google/android/gms/internal/tc;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/sy;->a:Lcom/google/android/gms/internal/tc;

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;Landroid/content/Context;)Landroid/net/Uri;
    .locals 3

    invoke-static {p1}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v0

    invoke-static {p2}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/sy;->a:Lcom/google/android/gms/internal/tc;

    invoke-interface {v2, v0, v1}, Lcom/google/android/gms/internal/tc;->a(Lcom/google/android/gms/c/e;Lcom/google/android/gms/c/e;)Lcom/google/android/gms/c/e;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/sz;

    invoke-direct {v0}, Lcom/google/android/gms/internal/sz;-><init>()V

    throw v0

    :cond_0
    invoke-static {v0}, Lcom/google/android/gms/c/f;->a(Lcom/google/android/gms/c/e;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    return-object v0
.end method

.method public a(Landroid/view/MotionEvent;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/sy;->a:Lcom/google/android/gms/internal/tc;

    invoke-static {p1}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/tc;->d(Lcom/google/android/gms/c/e;)V

    return-void
.end method

.method public b(Landroid/net/Uri;Landroid/content/Context;)Landroid/net/Uri;
    .locals 3

    invoke-static {p1}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v0

    invoke-static {p2}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/sy;->a:Lcom/google/android/gms/internal/tc;

    invoke-interface {v2, v0, v1}, Lcom/google/android/gms/internal/tc;->b(Lcom/google/android/gms/c/e;Lcom/google/android/gms/c/e;)Lcom/google/android/gms/c/e;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/sz;

    invoke-direct {v0}, Lcom/google/android/gms/internal/sz;-><init>()V

    throw v0

    :cond_0
    invoke-static {v0}, Lcom/google/android/gms/c/f;->a(Lcom/google/android/gms/c/e;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    return-object v0
.end method
