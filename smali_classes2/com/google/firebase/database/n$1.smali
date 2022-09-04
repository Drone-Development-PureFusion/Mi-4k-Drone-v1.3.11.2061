.class Lcom/google/firebase/database/n$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/database/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/database/n;->b(Lcom/google/firebase/database/r;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/firebase/database/r;

.field final synthetic b:Lcom/google/firebase/database/n;


# direct methods
.method constructor <init>(Lcom/google/firebase/database/n;Lcom/google/firebase/database/r;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/database/n$1;->b:Lcom/google/firebase/database/n;

    iput-object p2, p0, Lcom/google/firebase/database/n$1;->a:Lcom/google/firebase/database/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/firebase/database/b;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/database/n$1;->b:Lcom/google/firebase/database/n;

    invoke-virtual {v0, p0}, Lcom/google/firebase/database/n;->c(Lcom/google/firebase/database/r;)V

    iget-object v0, p0, Lcom/google/firebase/database/n$1;->a:Lcom/google/firebase/database/r;

    invoke-interface {v0, p1}, Lcom/google/firebase/database/r;->a(Lcom/google/firebase/database/b;)V

    return-void
.end method

.method public a(Lcom/google/firebase/database/c;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/database/n$1;->a:Lcom/google/firebase/database/r;

    invoke-interface {v0, p1}, Lcom/google/firebase/database/r;->a(Lcom/google/firebase/database/c;)V

    return-void
.end method
