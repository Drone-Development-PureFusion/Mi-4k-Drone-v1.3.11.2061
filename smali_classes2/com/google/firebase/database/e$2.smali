.class Lcom/google/firebase/database/e$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/database/e;->a(Lcom/google/android/gms/internal/lh;Lcom/google/firebase/database/e$a;)Lcom/google/android/gms/g/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/lh;

.field final synthetic b:Lcom/google/android/gms/internal/mh;

.field final synthetic c:Lcom/google/firebase/database/e;


# direct methods
.method constructor <init>(Lcom/google/firebase/database/e;Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/mh;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/database/e$2;->c:Lcom/google/firebase/database/e;

    iput-object p2, p0, Lcom/google/firebase/database/e$2;->a:Lcom/google/android/gms/internal/lh;

    iput-object p3, p0, Lcom/google/firebase/database/e$2;->b:Lcom/google/android/gms/internal/mh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/google/firebase/database/e$2;->c:Lcom/google/firebase/database/e;

    iget-object v1, v0, Lcom/google/firebase/database/e;->a:Lcom/google/android/gms/internal/im;

    iget-object v0, p0, Lcom/google/firebase/database/e$2;->c:Lcom/google/firebase/database/e;

    invoke-virtual {v0}, Lcom/google/firebase/database/e;->n()Lcom/google/android/gms/internal/ij;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/kv;->c()Lcom/google/android/gms/internal/kv;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ij;->a(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/ij;

    move-result-object v2

    iget-object v3, p0, Lcom/google/firebase/database/e$2;->a:Lcom/google/android/gms/internal/lh;

    iget-object v0, p0, Lcom/google/firebase/database/e$2;->b:Lcom/google/android/gms/internal/mh;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mh;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/database/e$a;

    invoke-virtual {v1, v2, v3, v0}, Lcom/google/android/gms/internal/im;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;Lcom/google/firebase/database/e$a;)V

    return-void
.end method
