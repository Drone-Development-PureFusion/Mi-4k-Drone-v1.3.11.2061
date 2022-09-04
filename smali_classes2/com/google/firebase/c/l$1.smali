.class Lcom/google/firebase/c/l$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/c/l;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/nk;

.field final synthetic b:Lcom/google/firebase/c/l;


# direct methods
.method constructor <init>(Lcom/google/firebase/c/l;Lcom/google/android/gms/internal/nk;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/c/l$1;->b:Lcom/google/firebase/c/l;

    iput-object p2, p0, Lcom/google/firebase/c/l$1;->a:Lcom/google/android/gms/internal/nk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/c/l$1;->a:Lcom/google/android/gms/internal/nk;

    iget-object v1, p0, Lcom/google/firebase/c/l$1;->b:Lcom/google/firebase/c/l;

    invoke-static {v1}, Lcom/google/firebase/c/l;->a(Lcom/google/firebase/c/l;)Lcom/google/firebase/c/i;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/firebase/c/i;->g()Lcom/google/firebase/b;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/ng;->a(Lcom/google/firebase/b;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/c/l$1;->b:Lcom/google/firebase/c/l;

    invoke-static {v2}, Lcom/google/firebase/c/l;->a(Lcom/google/firebase/c/l;)Lcom/google/firebase/c/i;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/firebase/c/i;->g()Lcom/google/firebase/b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/firebase/b;->a()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/nk;->a(Ljava/lang/String;Landroid/content/Context;)V

    return-void
.end method
