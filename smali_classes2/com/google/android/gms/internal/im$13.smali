.class Lcom/google/android/gms/internal/im$13;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/im;->a(Lcom/google/firebase/database/e$a;Lcom/google/firebase/database/c;Lcom/google/android/gms/internal/ij;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/firebase/database/e$a;

.field final synthetic b:Lcom/google/firebase/database/c;

.field final synthetic c:Lcom/google/firebase/database/e;

.field final synthetic d:Lcom/google/android/gms/internal/im;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/im;Lcom/google/firebase/database/e$a;Lcom/google/firebase/database/c;Lcom/google/firebase/database/e;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/im$13;->d:Lcom/google/android/gms/internal/im;

    iput-object p2, p0, Lcom/google/android/gms/internal/im$13;->a:Lcom/google/firebase/database/e$a;

    iput-object p3, p0, Lcom/google/android/gms/internal/im$13;->b:Lcom/google/firebase/database/c;

    iput-object p4, p0, Lcom/google/android/gms/internal/im$13;->c:Lcom/google/firebase/database/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/im$13;->a:Lcom/google/firebase/database/e$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/im$13;->b:Lcom/google/firebase/database/c;

    iget-object v2, p0, Lcom/google/android/gms/internal/im$13;->c:Lcom/google/firebase/database/e;

    invoke-interface {v0, v1, v2}, Lcom/google/firebase/database/e$a;->a(Lcom/google/firebase/database/c;Lcom/google/firebase/database/e;)V

    return-void
.end method
