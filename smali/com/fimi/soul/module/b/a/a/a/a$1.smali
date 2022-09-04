.class Lcom/fimi/soul/module/b/a/a/a/a$1;
.super Lcom/mob/tools/gui/AsyncImageView;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/b/a/a/a/a;->b(Landroid/widget/RelativeLayout;F)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/b/a/a/a/a;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/b/a/a/a/a;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/b/a/a/a/a$1;->a:Lcom/fimi/soul/module/b/a/a/a/a;

    invoke-direct {p0, p2}, Lcom/mob/tools/gui/AsyncImageView;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public onImageGot(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/a/a$1;->a:Lcom/fimi/soul/module/b/a/a/a/a;

    invoke-static {v0, p2}, Lcom/fimi/soul/module/b/a/a/a/a;->a(Lcom/fimi/soul/module/b/a/a/a/a;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    invoke-super {p0, p1, p2}, Lcom/mob/tools/gui/AsyncImageView;->onImageGot(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    return-void
.end method
