.class Lcom/google/firebase/c/q$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/c/q;->a(Landroid/app/Activity;Ljava/util/concurrent/Executor;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Object;

.field final synthetic b:Lcom/google/firebase/c/q;


# direct methods
.method constructor <init>(Lcom/google/firebase/c/q;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/c/q$1;->b:Lcom/google/firebase/c/q;

    iput-object p2, p0, Lcom/google/firebase/c/q$1;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/c/q$1;->b:Lcom/google/firebase/c/q;

    iget-object v1, p0, Lcom/google/firebase/c/q$1;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/google/firebase/c/q;->a(Ljava/lang/Object;)V

    return-void
.end method
