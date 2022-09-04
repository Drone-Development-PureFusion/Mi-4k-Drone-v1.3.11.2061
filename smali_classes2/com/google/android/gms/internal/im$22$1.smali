.class Lcom/google/android/gms/internal/im$22$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/im$22;->a(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/im$a;

.field final synthetic b:Lcom/google/firebase/database/b;

.field final synthetic c:Lcom/google/android/gms/internal/im$22;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/im$22;Lcom/google/android/gms/internal/im$a;Lcom/google/firebase/database/b;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/im$22$1;->c:Lcom/google/android/gms/internal/im$22;

    iput-object p2, p0, Lcom/google/android/gms/internal/im$22$1;->a:Lcom/google/android/gms/internal/im$a;

    iput-object p3, p0, Lcom/google/android/gms/internal/im$22$1;->b:Lcom/google/firebase/database/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/im$22$1;->a:Lcom/google/android/gms/internal/im$a;

    invoke-static {v0}, Lcom/google/android/gms/internal/im$a;->i(Lcom/google/android/gms/internal/im$a;)Lcom/google/firebase/database/q$a;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/google/android/gms/internal/im$22$1;->b:Lcom/google/firebase/database/b;

    invoke-interface {v0, v1, v2, v3}, Lcom/google/firebase/database/q$a;->a(Lcom/google/firebase/database/c;ZLcom/google/firebase/database/b;)V

    return-void
.end method
