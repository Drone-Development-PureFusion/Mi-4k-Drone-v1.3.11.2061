.class Lcom/google/firebase/database/e$4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/database/e;->a(Lcom/google/firebase/database/q$a;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/firebase/database/q$a;

.field final synthetic b:Z

.field final synthetic c:Lcom/google/firebase/database/e;


# direct methods
.method constructor <init>(Lcom/google/firebase/database/e;Lcom/google/firebase/database/q$a;Z)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/database/e$4;->c:Lcom/google/firebase/database/e;

    iput-object p2, p0, Lcom/google/firebase/database/e$4;->a:Lcom/google/firebase/database/q$a;

    iput-boolean p3, p0, Lcom/google/firebase/database/e$4;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/google/firebase/database/e$4;->c:Lcom/google/firebase/database/e;

    iget-object v0, v0, Lcom/google/firebase/database/e;->a:Lcom/google/android/gms/internal/im;

    iget-object v1, p0, Lcom/google/firebase/database/e$4;->c:Lcom/google/firebase/database/e;

    invoke-virtual {v1}, Lcom/google/firebase/database/e;->n()Lcom/google/android/gms/internal/ij;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/database/e$4;->a:Lcom/google/firebase/database/q$a;

    iget-boolean v3, p0, Lcom/google/firebase/database/e$4;->b:Z

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/im;->a(Lcom/google/android/gms/internal/ij;Lcom/google/firebase/database/q$a;Z)V

    return-void
.end method
