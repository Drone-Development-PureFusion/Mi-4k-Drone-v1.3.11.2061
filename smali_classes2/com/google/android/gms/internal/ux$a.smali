.class Lcom/google/android/gms/internal/ux$a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ux;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ux;

.field private final b:Lcom/google/android/gms/internal/abd;

.field private final c:Lcom/google/android/gms/internal/adf;

.field private final d:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ux;Lcom/google/android/gms/internal/abd;Lcom/google/android/gms/internal/adf;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ux$a;->a:Lcom/google/android/gms/internal/ux;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ux$a;->b:Lcom/google/android/gms/internal/abd;

    iput-object p3, p0, Lcom/google/android/gms/internal/ux$a;->c:Lcom/google/android/gms/internal/adf;

    iput-object p4, p0, Lcom/google/android/gms/internal/ux$a;->d:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ux$a;->b:Lcom/google/android/gms/internal/abd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/abd;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ux$a;->b:Lcom/google/android/gms/internal/abd;

    const-string v1, "canceled-at-delivery"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/abd;->c(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ux$a;->c:Lcom/google/android/gms/internal/adf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/adf;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ux$a;->b:Lcom/google/android/gms/internal/abd;

    iget-object v1, p0, Lcom/google/android/gms/internal/ux$a;->c:Lcom/google/android/gms/internal/adf;

    iget-object v1, v1, Lcom/google/android/gms/internal/adf;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/abd;->a(Ljava/lang/Object;)V

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ux$a;->c:Lcom/google/android/gms/internal/adf;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/adf;->d:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ux$a;->b:Lcom/google/android/gms/internal/abd;

    const-string v1, "intermediate-response"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/abd;->b(Ljava/lang/String;)V

    :goto_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ux$a;->d:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ux$a;->d:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ux$a;->b:Lcom/google/android/gms/internal/abd;

    iget-object v1, p0, Lcom/google/android/gms/internal/ux$a;->c:Lcom/google/android/gms/internal/adf;

    iget-object v1, v1, Lcom/google/android/gms/internal/adf;->c:Lcom/google/android/gms/internal/aii;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/abd;->b(Lcom/google/android/gms/internal/aii;)V

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ux$a;->b:Lcom/google/android/gms/internal/abd;

    const-string v1, "done"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/abd;->c(Ljava/lang/String;)V

    goto :goto_2
.end method
