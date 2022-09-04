.class Lcom/google/android/gms/internal/im$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/im;->b(Ljava/util/List;Lcom/google/android/gms/internal/ij;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/im$a;

.field final synthetic b:Lcom/google/firebase/database/c;

.field final synthetic c:Lcom/google/firebase/database/b;

.field final synthetic d:Lcom/google/android/gms/internal/im;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/im$a;Lcom/google/firebase/database/c;Lcom/google/firebase/database/b;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/im$3;->d:Lcom/google/android/gms/internal/im;

    iput-object p2, p0, Lcom/google/android/gms/internal/im$3;->a:Lcom/google/android/gms/internal/im$a;

    iput-object p3, p0, Lcom/google/android/gms/internal/im$3;->b:Lcom/google/firebase/database/c;

    iput-object p4, p0, Lcom/google/android/gms/internal/im$3;->c:Lcom/google/firebase/database/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/im$3;->a:Lcom/google/android/gms/internal/im$a;

    invoke-static {v0}, Lcom/google/android/gms/internal/im$a;->i(Lcom/google/android/gms/internal/im$a;)Lcom/google/firebase/database/q$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/im$3;->b:Lcom/google/firebase/database/c;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/google/android/gms/internal/im$3;->c:Lcom/google/firebase/database/b;

    invoke-interface {v0, v1, v2, v3}, Lcom/google/firebase/database/q$a;->a(Lcom/google/firebase/database/c;ZLcom/google/firebase/database/b;)V

    return-void
.end method
