.class Lcom/fimi/soul/module/b/a/a/i$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/b/a/a/i;->a(Landroid/view/View;Lcom/fimi/soul/module/b/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/b/a;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:Lcom/fimi/soul/module/b/a/a/i;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/b/a/a/i;Lcom/fimi/soul/module/b/a;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/b/a/a/i$3;->c:Lcom/fimi/soul/module/b/a/a/i;

    iput-object p2, p0, Lcom/fimi/soul/module/b/a/a/i$3;->a:Lcom/fimi/soul/module/b/a;

    iput-object p3, p0, Lcom/fimi/soul/module/b/a/a/i$3;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/i$3;->a:Lcom/fimi/soul/module/b/a;

    iget-object v0, v0, Lcom/fimi/soul/module/b/a;->c:Landroid/view/View$OnClickListener;

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/i$3;->b:Landroid/view/View;

    invoke-interface {v0, v1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    return-void
.end method
