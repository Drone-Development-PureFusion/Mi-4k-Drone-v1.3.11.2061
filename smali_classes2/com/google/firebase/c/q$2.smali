.class Lcom/google/firebase/c/q$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/c/q;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Object;

.field final synthetic b:Lcom/google/firebase/c/j$a;

.field final synthetic c:Lcom/google/firebase/c/q;


# direct methods
.method constructor <init>(Lcom/google/firebase/c/q;Ljava/lang/Object;Lcom/google/firebase/c/j$a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/c/q$2;->c:Lcom/google/firebase/c/q;

    iput-object p2, p0, Lcom/google/firebase/c/q$2;->a:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/firebase/c/q$2;->b:Lcom/google/firebase/c/j$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/c/q$2;->c:Lcom/google/firebase/c/q;

    invoke-static {v0}, Lcom/google/firebase/c/q;->a(Lcom/google/firebase/c/q;)Lcom/google/firebase/c/q$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/c/q$2;->a:Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/firebase/c/q$2;->b:Lcom/google/firebase/c/j$a;

    invoke-interface {v0, v1, v2}, Lcom/google/firebase/c/q$a;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
