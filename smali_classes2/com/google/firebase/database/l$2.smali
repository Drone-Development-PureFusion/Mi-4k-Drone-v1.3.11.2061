.class Lcom/google/firebase/database/l$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/database/l;->b(Ljava/util/Map;Lcom/google/firebase/database/e$a;)Lcom/google/android/gms/g/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Map;

.field final synthetic b:Lcom/google/android/gms/internal/mh;

.field final synthetic c:Ljava/util/Map;

.field final synthetic d:Lcom/google/firebase/database/l;


# direct methods
.method constructor <init>(Lcom/google/firebase/database/l;Ljava/util/Map;Lcom/google/android/gms/internal/mh;Ljava/util/Map;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/database/l$2;->d:Lcom/google/firebase/database/l;

    iput-object p2, p0, Lcom/google/firebase/database/l$2;->a:Ljava/util/Map;

    iput-object p3, p0, Lcom/google/firebase/database/l$2;->b:Lcom/google/android/gms/internal/mh;

    iput-object p4, p0, Lcom/google/firebase/database/l$2;->c:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lcom/google/firebase/database/l$2;->d:Lcom/google/firebase/database/l;

    invoke-static {v0}, Lcom/google/firebase/database/l;->b(Lcom/google/firebase/database/l;)Lcom/google/android/gms/internal/im;

    move-result-object v1

    iget-object v0, p0, Lcom/google/firebase/database/l$2;->d:Lcom/google/firebase/database/l;

    invoke-static {v0}, Lcom/google/firebase/database/l;->a(Lcom/google/firebase/database/l;)Lcom/google/android/gms/internal/ij;

    move-result-object v2

    iget-object v3, p0, Lcom/google/firebase/database/l$2;->a:Ljava/util/Map;

    iget-object v0, p0, Lcom/google/firebase/database/l$2;->b:Lcom/google/android/gms/internal/mh;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mh;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/database/e$a;

    iget-object v4, p0, Lcom/google/firebase/database/l$2;->c:Ljava/util/Map;

    invoke-virtual {v1, v2, v3, v0, v4}, Lcom/google/android/gms/internal/im;->a(Lcom/google/android/gms/internal/ij;Ljava/util/Map;Lcom/google/firebase/database/e$a;Ljava/util/Map;)V

    return-void
.end method
