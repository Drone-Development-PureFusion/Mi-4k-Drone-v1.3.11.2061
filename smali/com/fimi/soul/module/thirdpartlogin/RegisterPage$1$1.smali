.class Lcom/fimi/soul/module/thirdpartlogin/RegisterPage$1$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/thirdpartlogin/RegisterPage$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/thirdpartlogin/RegisterPage$1;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/thirdpartlogin/RegisterPage$1;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage$1$1;->a:Lcom/fimi/soul/module/thirdpartlogin/RegisterPage$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage$1$1;->a:Lcom/fimi/soul/module/thirdpartlogin/RegisterPage$1;

    iget-object v0, v0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage$1;->b:Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;

    invoke-static {v0}, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->c(Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage$1$1;->a:Lcom/fimi/soul/module/thirdpartlogin/RegisterPage$1;

    iget-object v1, v1, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage$1;->b:Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;

    invoke-static {v1}, Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;->a(Lcom/fimi/soul/module/thirdpartlogin/RegisterPage;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageURI(Landroid/net/Uri;)V

    return-void
.end method
