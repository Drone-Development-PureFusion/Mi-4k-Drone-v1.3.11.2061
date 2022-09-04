.class Lcom/google/android/gms/g/j$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/g/j;->a(Lcom/google/android/gms/g/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/g/f;

.field final synthetic b:Lcom/google/android/gms/g/j;


# direct methods
.method constructor <init>(Lcom/google/android/gms/g/j;Lcom/google/android/gms/g/f;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/g/j$1;->b:Lcom/google/android/gms/g/j;

    iput-object p2, p0, Lcom/google/android/gms/g/j$1;->a:Lcom/google/android/gms/g/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/g/j$1;->b:Lcom/google/android/gms/g/j;

    invoke-static {v0}, Lcom/google/android/gms/g/j;->a(Lcom/google/android/gms/g/j;)Lcom/google/android/gms/g/a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/g/j$1;->a:Lcom/google/android/gms/g/f;

    invoke-interface {v0, v1}, Lcom/google/android/gms/g/a;->a(Lcom/google/android/gms/g/f;)Ljava/lang/Object;
    :try_end_0
    .catch Lcom/google/android/gms/g/e; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/g/j$1;->b:Lcom/google/android/gms/g/j;

    invoke-static {v1}, Lcom/google/android/gms/g/j;->b(Lcom/google/android/gms/g/j;)Lcom/google/android/gms/g/q;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/g/q;->a(Ljava/lang/Object;)V

    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lcom/google/android/gms/g/e;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/Exception;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/g/j$1;->b:Lcom/google/android/gms/g/j;

    invoke-static {v1}, Lcom/google/android/gms/g/j;->b(Lcom/google/android/gms/g/j;)Lcom/google/android/gms/g/q;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/g/e;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/g/q;->a(Ljava/lang/Exception;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/g/j$1;->b:Lcom/google/android/gms/g/j;

    invoke-static {v1}, Lcom/google/android/gms/g/j;->b(Lcom/google/android/gms/g/j;)Lcom/google/android/gms/g/q;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/g/q;->a(Ljava/lang/Exception;)V

    goto :goto_0

    :catch_1
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/g/j$1;->b:Lcom/google/android/gms/g/j;

    invoke-static {v1}, Lcom/google/android/gms/g/j;->b(Lcom/google/android/gms/g/j;)Lcom/google/android/gms/g/q;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/g/q;->a(Ljava/lang/Exception;)V

    goto :goto_0
.end method
