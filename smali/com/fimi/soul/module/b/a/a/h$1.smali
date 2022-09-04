.class Lcom/fimi/soul/module/b/a/a/h$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/b/a/a/h;->onGlobalLayout()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/b/a/a/h;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/b/a/a/h;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/b/a/a/h$1;->a:Lcom/fimi/soul/module/b/a/a/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/h$1;->a:Lcom/fimi/soul/module/b/a/a/h;

    invoke-static {v0}, Lcom/fimi/soul/module/b/a/a/h;->b(Lcom/fimi/soul/module/b/a/a/h;)Lcom/mob/tools/gui/ScaledImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/h$1;->a:Lcom/fimi/soul/module/b/a/a/h;

    invoke-static {v1}, Lcom/fimi/soul/module/b/a/a/h;->a(Lcom/fimi/soul/module/b/a/a/h;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mob/tools/gui/ScaledImageView;->setBitmap(Landroid/graphics/Bitmap;)V

    return-void
.end method
