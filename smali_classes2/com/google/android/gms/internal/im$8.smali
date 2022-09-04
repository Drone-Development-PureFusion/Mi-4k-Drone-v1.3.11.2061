.class Lcom/google/android/gms/internal/im$8;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/im;->a(Lcom/google/android/gms/internal/jw;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/im$a;

.field final synthetic b:Lcom/google/firebase/database/c;

.field final synthetic c:Lcom/google/android/gms/internal/im;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/im$a;Lcom/google/firebase/database/c;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/im$8;->c:Lcom/google/android/gms/internal/im;

    iput-object p2, p0, Lcom/google/android/gms/internal/im$8;->a:Lcom/google/android/gms/internal/im$a;

    iput-object p3, p0, Lcom/google/android/gms/internal/im$8;->b:Lcom/google/firebase/database/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/im$8;->a:Lcom/google/android/gms/internal/im$a;

    invoke-static {v0}, Lcom/google/android/gms/internal/im$a;->i(Lcom/google/android/gms/internal/im$a;)Lcom/google/firebase/database/q$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/im$8;->b:Lcom/google/firebase/database/c;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lcom/google/firebase/database/q$a;->a(Lcom/google/firebase/database/c;ZLcom/google/firebase/database/b;)V

    return-void
.end method
