.class Lcom/b/c/c$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/b/c/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/b/c/c;


# direct methods
.method constructor <init>(Lcom/b/c/c;)V
    .locals 0

    iput-object p1, p0, Lcom/b/c/c$1;->a:Lcom/b/c/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/b/c/c$1;->a:Lcom/b/c/c;

    invoke-static {v0}, Lcom/b/c/c;->a(Lcom/b/c/c;)V

    return-void
.end method
