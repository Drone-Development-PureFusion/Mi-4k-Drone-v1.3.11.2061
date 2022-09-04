.class final Lcom/google/android/gms/internal/acn$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/acn;->a(Lcom/google/android/gms/internal/aco;Lcom/google/android/gms/internal/acn$a;)Lcom/google/android/gms/internal/aco;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/acl;

.field final synthetic b:Lcom/google/android/gms/internal/acn$a;

.field final synthetic c:Lcom/google/android/gms/internal/aco;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/acl;Lcom/google/android/gms/internal/acn$a;Lcom/google/android/gms/internal/aco;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/acn$1;->a:Lcom/google/android/gms/internal/acl;

    iput-object p2, p0, Lcom/google/android/gms/internal/acn$1;->b:Lcom/google/android/gms/internal/acn$a;

    iput-object p3, p0, Lcom/google/android/gms/internal/acn$1;->c:Lcom/google/android/gms/internal/aco;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/acn$1;->a:Lcom/google/android/gms/internal/acl;

    iget-object v1, p0, Lcom/google/android/gms/internal/acn$1;->b:Lcom/google/android/gms/internal/acn$a;

    iget-object v2, p0, Lcom/google/android/gms/internal/acn$1;->c:Lcom/google/android/gms/internal/aco;

    invoke-interface {v2}, Lcom/google/android/gms/internal/aco;->get()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/acn$a;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/acl;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/acn$1;->a:Lcom/google/android/gms/internal/acl;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/acl;->cancel(Z)Z

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1

    :catch_2
    move-exception v0

    goto :goto_1
.end method
